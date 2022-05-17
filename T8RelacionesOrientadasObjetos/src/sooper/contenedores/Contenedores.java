package sooper.contenedores;

import java.util.HashSet;
import java.util.Set;

import sooper.alimentacion.IProductos;

/**
 * Clase Abstracta que implementa metodos de la Interface IContenedor
 * 
 * Implementan los métodos de la propia clase Contenedores
 * 
 * @author RVS
 * @time 30 abr 2022 - 23:56:34
 *
 */
public abstract class Contenedores implements IContenedores {

	/**
	 * Atributos de instancia
	 * 
	 * Se usa para : Almacena la referencia de un objeto Contenedor
	 */
	private String referencias;

	/**
	 * Atributos de instancia
	 * 
	 * Se usa para : Almacena el alto de un objeto Contenedor
	 */
	private int altos;

	/**
	 * Atributos de instancia
	 * 
	 * Se usa para : Almacena el alto de un objeto Contenedor
	 */
	private int resistencias;

	/**
	 * "Preparo este atributo para almacenar los objetos del tipo productos"
	 * 
	 * Atributos de instancia
	 * 
	 * Se usa para : Almacenar la colección de objetos del tipo productos de la
	 * interface Set<IProductos>
	 */
	private Set<IProductos> productos;

	/**
	 * Constructor parametrizado
	 * 
	 * Se usa para : Inicializar los objetos que creemos del tipo Contenedor
	 * 
	 * @param referencia  String - Define la referencia que tendra el objeto
	 *                    Contenedor
	 * @param alto        int - Define el alto que tenga los objetos de tipo
	 *                    Contenedor
	 * @param resistencia int - Define la resistencia de los Contenedores y sus
	 *                    descendientes como Bolsa y Caja
	 */
	public Contenedores(String referencias, int altos, int resistencia) {
		this.referencias = referencias;
		this.altos = altos;
		this.resistencias = resistencia;
//		Instanciamos e inicializamos "productos" para que no de error por "NullPointerException"
		productos = new HashSet<>();
//		productos = new HashSet<IProductos>();
	}

	/**
	 * Metodo de instancia
	 * 
	 * Implementando desde la interface IContenedores
	 * 
	 * @return String - Devuelve la referencia del objeto Contenedor que lo invoque
	 */
	@Override
	public String getReferencias() {
		return referencias;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Implementado de la interface IContenedores
	 * 
	 * @return String - Devuelve el volumen del objeto Contenedor
	 * 
	 */
	@Override
	public int getVolumenes() {
		return altos * getSuperficies();
	}

	/**
	 * Metodo de instancia
	 * 
	 * Implementado de la interface IContenedores
	 * 
	 * @return int - Devuelve el volumen del objeto Contenedor
	 * 
	 */
	@Override
	public int volumenDisponibles() {
//		Volumen disponible sera el volumen del Contenedor menos el volumen ocupado
		return getVolumenes() - volumenOcupado();
	}

	/**
	 * Al Contenedor le preguntamos por su volumen disponible
	 * 
	 * No le estamos preguntando su volumen total ni el de los Productos que ya
	 * contiene
	 * 
	 * @return int - la cantidad de volumen ocupado dentro de Contenedor
	 */
	private int volumenOcupado() {
		int res = 0;
		for (IProductos p : productos) {
//			Sumamos el volumen del contenedor menos el volumen ocupado
			res += p.getVolumenes();
		}
		return res;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Implementado de la interface IContenedores
	 * 
	 * ¿ No debería de estar implementando en la clase hija porque cada Bolsa y Caja
	 * tiene una resistencia distinta ?
	 * 
	 * @return int - Devuelve la resistencia del objeto Contenedor
	 */
	@Override
	public int getResistencias() {
		return resistencias;
	}

	/**
	 * ♦ Metodo de instancia
	 * 
	 * Devuelve un objeto de la colección Productos del tipo productos
	 * 
	 * Devuelve una colección de Productos de la interface Set<>() y que implementa
	 * la clase HashSet<>();
	 * 
	 * @return Set<IProductos> - Devuelve una colección de objetos del tipo Producto
	 * 
	 */
	@Override
	public Set<IProductos> getProductos() {
		return productos;
	}

	/**
	 * ♦ Metodo de instancia heredado de la "Interface IContenedores"
	 * 
	 * @return boolean - Devuelve si se introdujo un conjunto de productos
	 */
	@Override
	public boolean meters(IProductos producto) {
//1º Declaramos las variables locales para almacenar los productos que vayamos creando
		boolean resistenciaOk = resistes(producto);
		boolean volumenOk = producto.tengoEspacios(this);
		boolean compatibilidadOk = true;
//2º Recorremos todos los productos para almacenar los que cumplen la condición
//Cada 1 de los Productos que hay en el comprueba si ese Producto 'p' es 
//compatible con la colección de Productos 'productos' recibido como parametros
//ejem:papel
		for (IProductos p : productos) {
//Metodo 'esCompatibles' de Higiene 'Implementando en las clases hijas de Productos'			
			boolean compatibleOk = producto.esCompatibles(p);
			compatibilidadOk &= compatibleOk;
		}
// Comprobamos los valores para almacenar los que cumplan
		boolean acepta = (resistenciaOk && volumenOk && compatibilidadOk);
// Cumple la condición 
		if (acepta) {
//			Añadimos el que lo cumple
			productos.add(producto);
//			informa al producto que ha sido metido en un contenedor
//							this - propio objeto → producto que ha sido metido en un contenedor
			producto.meters(this);
		}
		return acepta;
	}

	/**
	 * Se aplica Polimorfismo para escoger que método "resiste" se debe ejecutar se
	 * debe ejecutar dentro del Contenedor : Bolsa o Caja
	 * 
	 * Metodo de instancia heredado de la interface IContenedores
	 * 
	 * @return boolean - Devuelve si el contenedor aguanta
	 * 
	 */
	@Override
	public boolean resistes(IProductos productos) {
//		resistencia mayor que el peso del producto
		return resistencias > productos.getPesos();
	}

	/**
	 * Metodo heredado de la Super Clase Object
	 * 
	 * Contiene objetos del tipo Contenedor y Productos
	 * 
	 * @return String - Devuelve un objeto con todos los Productos y más
	 *         informaciones de los Contenedores
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(
				"• Contenedor " + referencias + " [" + getTipos() + "] (sup " + getSuperficies() + "cm2 - vol "
						+ getVolumenes() + "cm3 - resistencia " + getResistencias() + " g).\n");
		if (productos.isEmpty()) {
			sb.append("\t\tvacío\n");
		}
//		Recorre toda la colección de objetos del tipo Productos
		for (IProductos p : productos) {
//			Añade los objetos del tipo Producto dentro del objeto del tipo StringBuilder para mostrarlos por pantalla
			sb.append("\t\t " + p + "\n");
		}
		sb.append("\t\t>> Disponible vol " + volumenDisponibles() + "cm3");
		return sb.toString();
	}

}
