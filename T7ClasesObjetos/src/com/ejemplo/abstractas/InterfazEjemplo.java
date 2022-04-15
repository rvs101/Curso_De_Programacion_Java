package com.ejemplo.abstractas;

/**
 * 
 * @author RVS
 *
 */
public interface InterfazEjemplo {

	/**
	 * 
	 */
	static final String NOMBRE = "Soy una Interfaz de Prueba";

	/**
	 * Establece el nombre de la interface
	 * 
	 * @param nombre Establece nuevo nombre la interface
	 */
	void setNombre(String nombre);

	/**
	 * Obtenemos el nombre de la interface
	 * 
	 * @return Nombre de la interface
	 */
	String getNombre();

}
