package sooper;

/**
 * Clase implementa la interface Set
 */
import java.util.HashSet;

/**
 * Interface
 */
import java.util.Set;

/**
 * Clase Pedido implementada por interface IPedido
 * 
 * @author RVS
 *
 */
public class Pedido implements IPedido {

//	Atributo de instancia
	private String referencia;
//	Atributo de instancia
//	       Interface          referencia
//           ↓	                  ↓
	private Set<IContenedor> contenedores;

	/**
	 * Constructor de la clase Pedido
	 * 
	 * this.contenedores → Objeto intermediario para almacenar todos los contenedor
	 * que reciba el Pedido
	 * 
	 * @param referencia Recibe una referencia
	 */
	public Pedido(String referencia) {
//		Almacena en el objeto la referecia que le pasemos
		this.referencia = referencia;
//		                         Clase implementa el Set
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
	 * 
	 * 
	 * @return Devuelve un producto del tipo Interface Producto null
	 */
	@Override
	public Set<IProducto> getProductos() {
		return null;
	}

	/**
	 * @return Devuelve un contenedor del tipo Interface Contenedor 
	 */
	@Override
	public Set<IContenedor> getContenedores() {
		// TODO Auto-generated method stub
		return contenedores;
	}

	/**
	 * Añadir el contenedor recibido al conjunto de contenedores
	 * 
	 * @param Recibe una Interface Contenedor 
	 */
	@Override
	public void addContenedor(IContenedor contenedor) {
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
