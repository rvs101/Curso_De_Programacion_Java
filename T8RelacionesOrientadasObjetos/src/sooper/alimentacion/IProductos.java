package sooper.alimentacion;

/**
 * Invoca la clase enum Categorias
 */
import sooper.enums.Categorias;
import sooper.contenedores.IContenedores;

/**
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:20:34
 *
 */
public interface IProductos {

	/**
	 * Obtener una referencia del producto
	 * 
	 * @return String - Devuelve la referencia de un objeto Producto
	 */
	String getReferencias();

	/**
	 * Obtener el peso del producto
	 * 
	 * @return String - Devuelve el peso de un objeto Producto
	 */
	int getPesos();

	/**
	 * Obtener el peso del producto
	 * 
	 * @return String - Devuelve el volumen de un objeto Producto
	 */
	int getVolumenes();

	/**
	 * Obtener objeto enumerado del tipo Categorias
	 * 
	 * @return Categoria - Devuelve un objeto tipo enum Categorias
	 */
	Categorias getCategorias();

	/**
	 * Nos indica si el producto es compatible con los otros productos del
	 * Contenedor
	 * 
	 * @param p - Objeto del tipo Producto
	 * @return boolean - Si cabe 'true' si no cabe 'false'
	 */
	boolean esCompatibles(IProductos p);

	/**
	 * Nos indica si el contenedor tiene espacio para el conjunto de objetos de tipo
	 * Contenedor
	 * 
	 * @param contenedores - conjunto de objetos de tipo contenedores
	 * @return boolean - Si hay espacio 'true' si no hay espacio 'false'
	 */
	boolean tengoEspacios(IContenedores contenedores);

	/**
	 * Establece un conjunto de contenedores dentro de los Productos
	 * 
	 * @param contenedores - conjunto de objetos de tipo Productos
	 */
	void meters(IContenedores contenedores);
}
