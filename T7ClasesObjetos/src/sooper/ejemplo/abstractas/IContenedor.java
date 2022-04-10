package sooper.ejemplo.abstractas;

import java.util.Set;

/**
 * Interface Contenedor para obtener información
 * 
 * 
 * @author RVS
 *
 */
public interface IContenedor {

	/**
	 * Obtener la referencia del Contenedor
	 * 
	 * @return Referencia del Contenedor
	 */
	String getReferencia();
	
	/**
	 * Obtener el volumen del Contenedor
	 * 
	 * @return Volumen del Contenedor
	 */
	int getVolumen();
	
	/**
	 * Obtener el volumen para sabersi es posible introducir dentro el producto
	 * 
	 * @return Volumen del Contenedor
	 */
	int volumenDisponible();
	
	/**
	 * Obtener la resistencia máxima del Contenedor para evitar roturas
	 * 
	 * @return Resistencia máxima del Contenedor
	 */
	int getResistencia();

	/**
	 * Obtener todos los productos del Contenedor
	 * 
	 * @return Conjuntos de Productos del Contenedor
	 */
	Set<IProducto> getProductos();

	/**
	 * Devuelve el tipo de Contenedor
	 * 
	 * @return Tipo de Contenedor
	 */
	String getTipo();

	/**
	 * Recibe un producto y lo mete dentro del contenedor
	 * 
	 * @param producto
	 * @return Productos dentro del contenedor
	 */
	boolean meter(IProducto producto);

	/**
	 * Recibe un producto y comprueba si el Contenedor lo resiste
	 * 
	 * @param producto
	 * @return Devuelve true o false Si el Contenedor aguanta el peso
	 */
	boolean resiste(IProducto producto);
	
	/**
	 * Obtener superficie del Contenedor
	 */
	int getSuperficie();
	
}
