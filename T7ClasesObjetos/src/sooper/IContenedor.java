package sooper;

import java.util.Set;
import sooper.enums.TipoContenedor;

/**
 * Interface de Contenedores
 * 
 * @author RVS
 *
 */
public interface IContenedor {

	/**
	 * Obtener referencia
	 * 
	 * @return Devuelve una referencia
	 */
	String getReferencia();

	/**
	 * Obtener volumen
	 * 
	 * @return Devuelve un volumen
	 */
	int getVolumen();

	/**
	 * Obtener volumen disponible
	 * 
	 * @return numero del volumen disponible
	 */
	int volumenDisponible();

	/**
	 * Obtener resistencia
	 * 
	 * @return numero de la resistencia
	 */
	int getResistencia();

	/**
	 * Obtener un conjunto de productos
	 * 
	 * @return Interface de productos
	 */
	Set<IProducto> getProductos();

	/**
	 * Devuelve un objeto de 'tipo enum'
	 * 
	 * • Antes era :
	 * 
	 * String getTipo(); ha pasado a TipoContenedor getTipo()
	 * 
	 * @return TipoContenedor - Enumerado para mostrar 'bolsa' o 'caja'
	 */
	TipoContenedor getTipo();

	/**
	 * Comprueba si metio un objeto dentro
	 * 
	 * @param producto
	 * @return Si esta dentro no el objeto
	 */
	boolean meter(IProducto producto);

	/**
	 * Comprueba si el objeto introducido resiste el peso
	 * 
	 * @param producto
	 * @return Si resiste el peso o no
	 */
	boolean resiste(IProducto producto);

	/**
	 * Desde la Interface
	 * 
	 * Devuelve la superficie de un contenedor
	 * 
	 * @return obtener la superficie
	 */
	int getSuperficie();

}
