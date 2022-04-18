/**
 * Paquete principal de la app 
 */
package com.ejemplo.sooper.abstractas;

/**
 * Clase Set 
 */
import java.util.Set;

import com.ejemplo.interfaces.IContenedor;

/**
 * Crear pedidos inteligentes que podamos añadir Productos y Contenedores
 * 
 * @author RVS
 *
 */
public interface IPedido {

	/**
	 * Metodo que obtiene la referencia del Pedido
	 * 
	 * @return una referencia
	 */
	String getReferencia();

	/**
	 * Metodo que devuelve un conjunto de Productos
	 * 
	 * @return un conjunto de Productos
	 */
	Set<IProducto> getProductos();

	/**
	 * Metodo que devuelve un conjunto de Contenedores
	 * 
	 * @return
	 */
	Set<IContenedor> getContenedor();

	/**
	 * Añadir Contenedores para almacenar Productos
	 * 
	 * @param contenedor Parametro Interface IContenedor
	 */
	void addContenedor(IContenedor contenedor);

	/**
	 * Añadir Producto que vayan a Contenedor desde un Pedido realizado
	 * 
	 * @param producto Interface IProducto
	 * @return Un producto con el pedido y el contendor en el que se encuentra
	 */
	IContenedor addProducto(IProducto producto);
}
