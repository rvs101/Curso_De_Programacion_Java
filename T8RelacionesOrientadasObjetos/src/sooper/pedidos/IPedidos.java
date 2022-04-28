package sooper.pedidos;

/**
 * • Invocamos la interface Set
 * 
 * • Interface Set<IPedidos> → No permite duplicados
 * 
 * • Clase HashSet<>() implementa la Interface Set<IPedidos>
 * 
 * • HashSet<>() → No Ordenado , No Sincronizado , Permite Null
 */
import java.util.Set;
import sooper.contenedores.IContenedores;
import sooper.alimentacion.IProductos;

/**
 * Interface para definir Pedidos
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:20:16
 *
 */
public interface IPedidos {

	/**
	 * Interface IPedidos
	 * 
	 * @return String - Obtenemos una referencia del pedido
	 */
	String getReferencias();

	/**
	 * ♦ Interface Set<IPedidos> → No permite duplicados
	 * 
	 * • Clase HashSet<>() implementa la Interface Set<IPedidos>
	 * 
	 * • HashSet<>() → No ordenado , No Sincronizado , Permite Null
	 * 
	 * @return Objeto Producto - Obtenemos un conjunto de objetos
	 */
	Set<IProductos> getProductos();

	/**
	 * Obtenemos la colección de contenedores de la Interfaz Set<IContenedor>
	 * 
	 * @return Devuelve una colección de objetos contenedores que descendienta de la Interface Set<IContenedores>
	 */
	Set<IContenedores> getContenedores();

	/**
	 * Interface IPedidos
	 * 
	 * @param contenedor - Establece un conjunto de objetos del tipo contenedor
	 */
	void addContenedores(IContenedores contenedores);

	/**
	 * Devuelve un objeto del tipo <Interface IProducto> después de pasarle por
	 * parametros un objeto de la Interface IProducto
	 * 
	 * @param productos - Conjunto de objetos del tipo productos
	 * @return objetos tipo contendores - Devuelve un conjunto de contenedores
	 */
	IContenedores addProductos(IProductos productos);

}
