package sooper.contenedores;

import java.util.Set;

import sooper.alimentacion.IProductos;
import sooper.enums.TipoContenedores;

/**
 * Clase Abstracta que implementa metodos de la Interface IContenedor
 * 
 * Implementan los métodos de la propia clase Contenedores
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
	 * @param referencia - String - Define la referencia que tendra el objeto
	 *                   Contenedor
	 * @param alto       - int - Define el alto que tenga los objetos de tipo
	 *                   Contenedor
	 */
	public Contenedores(String referencias, int altos) {
		this.referencias = referencias;
		this.altos = altos;
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
		return 0;
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
	public boolean meters(IProductos productos) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * ♦ Metodo de instancia heredado de la interface IContenedores
	 * 
	 * @return boolean - Devuelve si el contenedor aguanta
	 * 
	 */
	@Override
	public boolean resistes(IProductos productos) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Metodo de instancia heredado de la interface IContenedores
	 * 
	 * Las subclase 'Caja' y 'Bolsa' implmentarán el metodo
	 * 
	 */
	@Override
	public TipoContenedores getTipos() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Añadido de la Interface
	 * 
	 * Metodo de instancia heredado de la interface IContenedores
	 * 
	 */
	@Override
	public int getSuperficies() {
		// TODO Auto-generated method stub
		return 0;
	}

}
