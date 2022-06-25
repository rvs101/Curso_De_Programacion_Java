package cap14.recordsManager;

/**
 * 
 * @author Robot
 * @date 25 jun 2022 23:39:53
 */
public class ScoreTooLowException extends Exception {

	/**
	 * Atributo de instancia - Identificador
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia - Almacena el nombre
	 */
	private String name;

	/**
	 * Atributo de instancia - Almacena los puntos
	 */
	private int score;

	/**
	 * Constructor por defecto - Inicializa el objeto
	 * 
	 */
	public ScoreTooLowException() {
		this.name = null;
		this.score = 0;
	}

	/**
	 * Constructor parametrizado - Inicializa los objetos de la clase
	 * 
	 * @param name  : String - Nombre del usuario
	 * @param score : int - Puntuacion del usuario
	 */
	public ScoreTooLowException(String name, int score) {
		this.name = name;
		this.score = score;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return : String - Devuelve el nombre
	 */
	public String getName() {
		return name;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return : int - Devuelve los puntos
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Metodo de instancia anulado
	 * 
	 * Devuelve el nombre y los puntos del usuario
	 */
	@Override
	public String getMessage() {
		return "El usuario " + getName() + " tiene menos puntos (" + getScore() + ") de los requeridos.";
	}
}
