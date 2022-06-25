package Tx14.GestionRecords;

/**
 * 
 * @author Robot
 * @date 22 jun 2022 22:41:04
 */
public class ScoreTooLowException extends Exception {

	/**
	 * Atributo de clase - Identificador
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia : String - almacena el nombre
	 */
	private String name = null;

	/**
	 * Atributo de instancia : int - almacena un valor
	 */
	private int score = 0;

	/**
	 * Constructor por defecto
	 * 
	 * Inicializa los valores
	 * 
	 */
	public ScoreTooLowException() {
		this.name = null;
		this.score = 0;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * Inicializa los valores
	 * 
	 * @param name  - String : almacena una cadena
	 * @param score - int : almacena un numero
	 */
	public ScoreTooLowException(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
