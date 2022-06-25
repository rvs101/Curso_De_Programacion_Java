package Tx14.GestionRecords;

/**
 * 
 * @author Robot
 * @date 23 jun 2022 14:56:17
 */
public class PlayerNameTooShortException extends Exception {

	/**
	 * Atributo de clase - Identificador
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia - Almacena el valor de la cadena de texto
	 * 
	 */
	private String name;

	/**
	 * Constructor por defecto
	 */
	public PlayerNameTooShortException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param name - String - Recibe una cadena de texto y la almacena
	 */
	public PlayerNameTooShortException(String name) {
		super(name);
		this.name = name;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return String - Devuelve una cadena de texto
	 */
	public String getNombre() {
		return name;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Devuelve una cadena de texto concatenando el nombre del jugador con un mensaje
	 * 
	 */
	@Override
	public String getMessage() {
		return "El nombre del jugador ".concat(getNombre().concat(" es demasiado corto"));
	}
}
