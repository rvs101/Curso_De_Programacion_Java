package com.ejemplo.abstractas;

/**
 * Clase Especial Abstracta
 * 
 * @author RVS
 *
 */
public class ClaseAbstractaEjemplo implements InterfazEjemplo {

	/**
	 * Constante del nombre de la clase especial
	 * 
	 * Establece el nombre de la constante
	 */
	private static final String NOMBRE_ABSTRACTO = "Soy una clase especial abstracta";

	/**
	 * Obtenemos el nombre de la clase abstracta
	 * 
	 * @return devuelve la constante de la clase abstracta
	 */
	public String getNombreAbstracto() {
		return NOMBRE_ABSTRACTO;
	}

	/**
	 * Heredado de la Interface "InterfazEjemplo" se usa para establece un nuevo
	 * nombre a la clase
	 */
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub

	}

	/**
	 * Heredado de la Interface "InterfazEjemplo" se utilzia para obtener el nombre
	 * de la clase
	 * 
	 */
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

}
