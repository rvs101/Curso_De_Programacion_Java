package sooper;

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
	 * @return Devuelve una referencia en formato String
	 */
	String getReferencia();

	/**
	 * Obtenemos los productos de la Interfaz Set<IProducto>
	 * 
	 * @return Devuelve una Interface Set de <IProducto>
	 */
	Set<IProducto> getProductos();

	/**
	 * Obtenemos los productos de la Interfaz Set<IContenedor>
	 * 
	 * @return Devuelve una Interface Set de <IContenedor>
	 */
	Set<IContenedor> getContenedores();

	/**
	 * Añade/Establece a la Interface IPedido un objeto de tipo IContenedor
	 * 
	 * @param contenedor
	 */
	void addContenedor(IContenedor contenedor);

	/**
	 * Devuelve un objeto del tipo Interface IContenedor después de pasarle por
	 * parametros un objeto de la Interface IProducto
	 * 
	 * @param producto
	 * @return IContenedor
	 */
	IContenedor addProducto(IProducto producto);
}
