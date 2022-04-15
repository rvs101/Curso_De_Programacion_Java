package sooper;

import sooper.enums.Categoria;

/**
 * Interface IProducto
 * 
 * @author RVS
 *
 */
public interface IProducto {

	/**
	 * Obtener una referencia del producto
	 * 
	 * @return La Referencia de formato String del producto
	 */
	String getReferencia();

	/**
	 * Obtener peso
	 * 
	 * @return El peso del producto
	 */
	int getPeso();

	/**
	 * Obtener el volumen
	 * 
	 * @return El volumen del producto
	 */
	int getVolumen();

	/**
	 * 
	 * @return
	 */
//	String getCategoria();

	/**
	 * Obtenemos un elemento 'enum' de la categoria
	 * 
	 * @return El elemento de una categoria
	 */
	Categoria getCategoria();

	/**
	 * Recibe por parametros una Interface IProducto y nos indica si es compatible
	 * 
	 * @param p Recibe un objeto del tipo Interface IProducto para indicar si es
	 *          compatible
	 * @return Devuelve si el objeto pasado por parametros es compatible o no
	 */
	boolean esCompatible(IProducto p);

	/**
	 * Recibe por parametros una Interface IContenedor y nos indica si es compatible
	 * 
	 * @param contenedor Recibe un objeto del tipo Interface IContenedor
	 * @return Si hay espacio suficiente en el contenedor o no
	 */
	boolean tengoEspacio(IContenedor contenedor);

	/**
	 * Recibe por parametros una Interface IContenedor y lo establece dentro de los
	 * Producto para que herede los hijos de la Interface IProducto
	 * 
	 * @param contenedor
	 */
	void meter(IContenedor contenedor);
}
