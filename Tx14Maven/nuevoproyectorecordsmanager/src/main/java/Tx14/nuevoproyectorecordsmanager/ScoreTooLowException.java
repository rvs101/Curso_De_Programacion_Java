package Tx14.nuevoproyectorecordsmanager;

/**
 * 
 * @author Robot
 * @date 27 jun 2022 18:40:46
 */
public class ScoreTooLowException extends Exception {

	/**
	 * CONSTANTE
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia - String Almacena el nombre del usuario
	 */
	private String name;

	/**
	 * Atributo de instancia - int Almacena la puntuacion del marcador
	 */
	private int score;

	/**
	 * Constructor por defecto
	 *
	 */
	public ScoreTooLowException() {
		this.name = null;
		this.score = 0;
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param name  String Cadena de caracteres con el nombre del usuario
	 * @param score int Valor entero que representa la puntuación del juego
	 */
	public ScoreTooLowException(String name, int score) {
		this.name = name;
		this.score = score;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return
	 */
	public int getScore() {
		return score;
	}

	@Override
	public String getMessage() {
		return "El usuario " + name + " tiene menos puntos (" + getScore() + ") de los requeridos.";
	}

}
