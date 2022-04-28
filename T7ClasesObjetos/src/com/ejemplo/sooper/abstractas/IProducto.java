package com.ejemplo.sooper.abstractas;

/**
 * 
 * Invoca la clase enum Categorias
 * 
 * @author RVS
 *
 */
public interface IProducto {

	/**
	 * Obtener Referencia del Producto
	 * 
	 * @return Número de referencia
	 */
	String getReferencia();

	/**
	 * Obtener el peso de un producto
	 * 
	 * @return peso total del producto
	 */
	int getPeso();

	/**
	 * Obtener el volumen
	 * 
	 * @return volumen total del producto
	 */
	int getVolumen();

	/**
	 * Obtener la categoria
	 * 
	 * @return categoría del producto
	 */
	String getCategoria();

	/**
	 * Comprueba si el producto que tenemos en Pedido es compatible con el que le
	 * añadamos
	 * 
	 * @param p El tipo de producto de todos los productos
	 * @return Si es compatible
	 */
	boolean esCompatible(IProducto p);

	/**
	 * Comprueba si tenemos espacio suficiente en el Contenedor del Pedido
	 * 
	 * @param contenedor Para almacenar los Productos del Pedido
	 * @return Si hay suficiente espacio
	 */
	boolean tengoEspacio(IContenedor contenedor);

	/**
	 * Metemos los productos dentro del Contenedor
	 * 
	 * @param contenedor
	 */
	void meter(IContenedor contenedor);
}
