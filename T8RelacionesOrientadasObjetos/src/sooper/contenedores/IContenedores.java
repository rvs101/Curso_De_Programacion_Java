package sooper.contenedores;

import java.util.Set;

import sooper.alimentacion.IProductos;
import sooper.enums.TipoContenedores;

/**
 * Interface : Define todos los metodos que implementarán las clases que lo
 * invocen
 * 
 * Clases concretas : Contenedores
 * 
 * Clases hijas : Bolsa y Cajas
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:19:53
 *
 */
public interface IContenedores {

	/**
	 * Devuelve referencia
	 * 
	 * @return String - Referencia del contenedor
	 */
	String getReferencias();

	/**
	 * Devuelve volumen
	 * 
	 * @return int - Volumen del contenedor
	 */
	int getVolumenes();

	/**
	 * Devuelve volumen disponible del objeto Contenedor
	 * 
	 * @return int - Volumen disponible del objeto Contenedor
	 */
	int volumenDisponibles();

	/**
	 * Devuelve la resistencia de un objeto Contenedor
	 * 
	 * @return int - Resistencia del objeto Contenedor
	 */
	int getResistencias();

	/**
	 * "Preparo el metodo para recibir objetos del tipo Productos y almacenarlo
	 * dentro de una colección de objetos"
	 * 
	 * Devuelve una colección de objetos de tipo Productos que este implementada por
	 * la Interface Set<IProducto>
	 * 
	 * @return - Conjunto de objetos Productos - Productos del contenedor
	 */
	Set<IProductos> getProductos();

	/**
	 * Devuelve un objeto del 'tipo enum'
	 * 
	 * @return enum - Tipo enumerado de Contenedores
	 */
	TipoContenedores getTipos();

	/**
	 * Devuelve si una colección de objetos del tipo Productos e indican si se
	 * pueden meter o no
	 * 
	 * @param productos - Conjunto de objetos del tipo productos
	 * @return boolean - Si cabe o no cabe el conjunto de productos dentro del
	 *         contenedor
	 */
	boolean meters(IProductos productos);

	/**
	 * Devuelve una colección de objetos Productos y muestran si son resistentes o
	 * no
	 * 
	 * @param productos - Conjunto de objetos del tipo productos
	 * @return boolean - Si resiste o no resisten los objetos dentro
	 */
	boolean resistes(IProductos productos);

	/**
	 * Devuelve la superficie de un objeto Contenedor
	 * 
	 * @return int - La superficie total de un objeto Contenedor
	 */
	int getSuperficies();

}
