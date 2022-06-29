package Tx14.ProyectoGestionRecords;

/**
 * T14 Gestion de Proyectos
 *
 * @author Robot
 * @date 26 jun 2022 23:44:29
 */
public class PlayerNameTooShortException extends Exception {

	/**
	 * Constante - Identificador num
	 *
	 * El atributo serialVersionUID es un identificador que se utiliza para
	 * serializar/deserializar un objeto de una clase Serializable.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia
	 *
	 * Almacena un nombre
	 */
	private String name;

	/**
	 * Constructor por defecto
	 */
	public PlayerNameTooShortException() {
		this.name = null;
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param name : String - Recibe una cadena de texto para establecer un nombre
	 */
	public PlayerNameTooShortException(String name) {
		this.name = name;
	}

	/**
	 * Metodo de instancia
	 *
	 * @return : String - Devuelve una cadena de texto con el nombre
	 */
	public String getNombre() {
		return name;
	}

	/**
	 * Metodo de instancia
	 */
	@Override
	public String getMessage() {
		return "El nombre del jugador (" + getNombre() + ") es demasiado corto.";
	}

}
