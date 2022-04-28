package sooper;

/**
 * Clase implementa la interface Set
 */
import java.util.HashSet;

/**
 * Interface Set implementa la clase HashSet
 */
import java.util.Set;

/**
 * Clase Pedido implementada por interface IPedido
 * 
 * @author RVS
 *
 */
public class Pedido implements IPedido {

	/**
	 * Atributo de instancia
	 * 
	 * Almacena String de referencia
	 */
	private String referencia;

	/**
	 * Atributo de instancia - Permite llamar metodos de la Interface <IContenedor>
	 * 
	 * Interface ↓ Interface Referencia ↓ ↓ ↓ ↓ ↓ ↓
	 */
	private Set<IContenedor> contenedores;

	/**
	 * Constructor por defecto
	 */
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de la clase Pedido
	 * 
	 * this.contenedores → Objeto intermediario para almacenar todos los
	 * contenedores que reciba el Pedido
	 * 
	 * @param referencia Recibe una referencia
	 */
	public Pedido(String referencia) {
//		Almacena en el objeto la referecia que le pasemos
		this.referencia = referencia;
//		Creamos un conjunto de Contenedores vacio y generico para implimentar los metodos de la Interface Set
//		                        Implementación de la Interface
//		                             ↓
		this.contenedores = new HashSet<>();
	}

	/**
	 * Obtener una referencia
	 * 
	 * @return Devuelve la referencia como Cadenas
	 */
	@Override
	public String getReferencia() {
		return referencia;
	}

	/**
	 * Devuelve un conjuntos de productos
	 * 
	 * @return Un producto del tipo Interface Producto null
	 */
	@Override
	public Set<IProducto> getProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Devuelve un conjuntos de contenedores
	 * 
	 * Metodo heredado por la Interfaz IPedido el cual utiliza la Interfaz Set para
	 * definir un conjunto de Contenedores que serán implementados por la clase
	 * HashSet
	 * 
	 * @return Un conjunto de contenedores del tipo Interface Contenedor creado en
	 *         la Intefaz IPedido e implementado por Pedido
	 */
	@Override
	public Set<IContenedor> getContenedores() {
		return contenedores;
	}

	/**
	 * Añadir un objeto de tipo contenedor dentro de un objeto Pedido
	 * 
	 * Añadir un objeto de tipo contenedor dentro del objeto pedido el cual recibido
	 * al conjunto de contenedores generado por la Interfaces IPedido e implementada
	 * dentro del constructor de Pedidos mediante la clase HashSet
	 * 
	 * 1º <Interface Set> permite que la "Clase HashSet" pueda invocar el metodo
	 * 'add'
	 * 
	 * 2º Utiliza un objeto de la "Clase HashSet" para invocar el metodo add
	 * 
	 * 3º Añade un objeto de la Interface IContenedor
	 * 
	 * @param IContenedor - Recibe como tipo de dato una Interface IContenedor
	 */
	@Override
	public void addContenedor(IContenedor contenedor) {
// "contenedores" utiliza el metodo 'add' heredado por la interface Set
		contenedores.add(contenedor);
	}

	/**
	 * Interface Contenedor establece un objeto Interface Producto
	 * 
	 * @return No devuelve nada
	 */
	@Override
	public IContenedor addProducto(IProducto producto) {
		// TODO Auto-generated method stub
		return null;
	}

}
