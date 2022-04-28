package sooper;

/**
 * Invocamos la interface Set
 */
import java.util.Set;

/**
 * Interface para definir Pedidos
 * 
 * @author RVS
 *
 */
public interface IPedido {

	/**
	 * Obtener referencia
	 * 
	 * @return String - Obtenemos una referencia del pedido
	 */
	String getReferencia();

	/**
	 * Interface IPedidos
	 * 
	 * Obtenemos los productos de la Interfaz Set<IProducto>
	 * 
	 * @return Objeto Producto - Obtenemos un conjunto de objetos
	 */
	Set<IProducto> getProductos();

	/**
	 * Obtenemos los productos de la Interfaz Set<IContenedor>
	 * 
	 * @return Devuelve una <Interface Set> de <IContenedor>
	 */
	Set<IContenedor> getContenedores();

	/**
	 * Interface IPedidos
	 * 
	 * Establece a la <Interface IPedido> un objeto de tipo IContenedor
	 * 
	 * @param contenedor - Establece un conjunto de objetos del tipo contenedor
	 * 
	 */
	void addContenedor(IContenedor contenedor);

	/**
	 * Devuelve un objeto del tipo <Interface IProducto> después de pasarle por
	 * parametros un objeto de la Interface IProducto
	 * 
	 * @param productos - Conjunto de objetos del tipo productos
	 * @return objetos tipo contendores - Devuelve un conjunto de contenedores

	 */
	IContenedor addProducto(IProducto producto);
}
