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
		// TODO Auto-generated method stub
		return null;
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
	 * Metodo de Instancia
	 * 
	 * @return
	 */
	@Override
	public IContenedores addProductos(IProductos productos) {
		// TODO Auto-generated method stub
		return null;
	}

}
