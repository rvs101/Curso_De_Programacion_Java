package sooper.pedidos;

import java.util.HashSet;
import java.util.Set;
import sooper.contenedores.IContenedores;
import sooper.alimentacion.IProductos;

/**
 * "Clase Pedido" implementada por "interface IPedido"
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:21:13
 *
 */
public class Pedidos implements IPedidos {

	/**
	 * Atributos de instancia
	 * 
	 * Almacena la referencia de un objeto del tipo Pedidos
	 */
	private String referencias;

	/**
	 * Atributos de instancia
	 * 
	 * Almacena una colección de objetos del "tipo Contenedor"
	 * 
	 * "CREO QUE NOS SIRVE PARA REFERENCIAS OBJETOS DEL TIPO IContenedor y
	 * Descendientes
	 * 
	 */
	private Set<IContenedores> contenedores;

	/**
	 * Constructor por defecto
	 * 
	 */
	public Pedidos() {
	}

	/**
	 * Constructor parametrizado
	 * 
	 * Cuando se instancia un "objeto del tipo Pedidos" reserva memoria para los
	 * "objetos del tipo Contenedor" y asi almacenarlos dentro del "objeto Pedido"
	 * instanciado mediante la "clase HashSet<>()" la cual implementa el metodo de
	 * la "Interface Set<>()";
	 * 
	 * @param referencia - String - Almacena la referencia de un "objeto Pedidos"
	 * 
	 */
	public Pedidos(String referencia) {
		this.referencias = referencia;
//		Objeto de tipo Interface Set<>() que se implementa con la clase HashSet y la cual almacenará todos los objetos de tipo Contenedor 
//		que instancia un objeto Pedido a traves de los metodos de la propia clase 
		this.contenedores = new HashSet<>();
	}

	/**
	 * Metodo de Instancia
	 * 
	 * @return String - Obtener una referencias del objeto Pedidos
	 * 
	 */
	@Override
	public String getReferencias() {
		return referencias;
	}

	/**
	 * Metodo de Instancia
	 * 
	 * @return objeto Productos - colección de objetos tipo productos
	 */
	@Override
	public Set<IProductos> getProductos() {
// Creamos una colección de objetos del tipo productos mediante la interface Set<IProductos>		
		Set<IProductos> productos = null;
// Recorremos todos los objetos de la colección del tipo 'contenedores'		
		for (IContenedores c : contenedores) {
// ○ Si el objeto producto no contiene 'productos' 			
			if (productos == null) {
// Se lo añadimos con el metodo getProductos a la colección 'productos'
				productos = c.getProductos();
// • Sino				
			} else {
// Añadimos todos los objetos de la colección si no esta presente si el valor que lo almacena también es una colección 				
				productos.addAll(c.getProductos());
			}
		}
// Devuelve una colección de objetos de tipo producto que tenía los contenedores		
		return productos;
	}

	/**
	 * Devuelve una colección de objetos Contenedores
	 * 
	 * Metodo heredado por la Interfaz IPedido el cual utiliza la Interfaz Set para
	 * definir un conjunto de Contenedores que serán implementados por la clase
	 * HashSet
	 * 
	 * @return Un conjunto de contenedores del tipo Interface Contenedor creado en
	 *         la Intefaz IPedido e implementado por Pedido
	 */
	@Override
	public Set<IContenedores> getContenedores() {
		return contenedores;
	}

	/**
	 * Metodo de Instancia
	 *
	 * Añade una colección de objetos 'mediante la implementación de la interface
	 * Set con la clase HashSet'
	 * 
	 * El atributo Set<IContenedores> contenedores de Pedidos almacena cada vez que
	 * instancia un objeto de tipo Pedidos todos los contenedores que le vayamos
	 * añadiendo
	 * 
	 * @param IContenedor - Recibe como tipo de dato una Interface IContenedor
	 */
	@Override
	public void addContenedores(IContenedores contenedor) {
//            • Objeto declarado como atributo de la clase Pedidos e instanciado por el Constructor Pedido        
//		      ↓       • Metodo de la interface Set     
//		      ↓       ↓   
		contenedores.add(contenedor);
	}

	/**
	 * Añadir Producto del Pedido dentro de un Contenedor recorriendo objetos del
	 * tipo contenedores y en caso de no existir devolver 'null'
	 * 
	 * @param - Le pasamos manzanas como parametro
	 * 
	 * @return Colección de objetos del tipo Contenedor en el caso de encontrar un
	 *         "contenedor" donde meter el "producto" o "null" en caso de no
	 *         encontrar un "contenedor" donde meter el objeto
	 */
	@Override
	public IContenedores addProductos(IProductos productos) {
//		Recorremos contenedores
		for (IContenedores contenedor : contenedores) {
// Comprobamos si admite o no el producto que queremos añadir
//			Llamamos al método meter del contenedor , que nos devolverá un booleano indicando si lo ha metido o no
			if (contenedor.meters(productos)) {
//				hemos encontrado el contenedor , devuelve el contenedor en el que colocamos el producto
				return contenedor;
			}
//False : Continua el bucle con el siguiente contenedor
		}
//Si terminamos todos los contenedores sin haber localizado sitio para el producto devolvemos 'null'
		return null;
	}

	/**
	 * Metodo heredado de la Clase Object modificado para mostrar referencias y
	 * contenedores
	 * 
	 * @return StringBuilder
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pedido: " + referencias + "\n");
		for (IContenedores contenedor : contenedores) {
			sb.append("\t" + contenedor + "\n");
		}
		return sb.toString();
	}

}
