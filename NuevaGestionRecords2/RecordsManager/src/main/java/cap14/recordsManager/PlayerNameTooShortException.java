package cap14.recordsManager;

/**
 * 
 * @author Robot
 * @date 25 jun 2022 23:20:55
 */
public class PlayerNameTooShortException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia : String - Almacena un nombre
	 */
	private String name;

	/**
	 * Constructor parametrizado
	 * 
	 * @param name : String - Inicializa el objeto
	 */
	public PlayerNameTooShortException(String name) {
		super(name);
		this.name = name;
	}

	/**
	 * Metodo de instancia - Devuelve el nombre
	 * 
	 * @return : String - Devuelve el nombre del usuario asociado al objeto
	 */
	public String getName() {
		return name;
	}

	/**
	 * Metodo de instancia - Devuelve el nombre
	 * 
	 * @return : String - Devuelve el nombre del usuario asociado al objeto
	 */
	@Override
	public String getMessage() {
		return "El nombre del jugador (" + getName() + ") es demasiado corto.";
	}
}
