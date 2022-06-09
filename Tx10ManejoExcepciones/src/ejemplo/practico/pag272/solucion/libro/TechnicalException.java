package ejemplo.practico.pag272.solucion.libro;

/**
 * Excepciones que no se pueden controlar ( salvos ciertos casos )
 * 
 * @author RVS
 * @time 31 may 2022 - 13:27:09
 *
 */
public class TechnicalException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param message
	 */
	public TechnicalException(String message) {
		super(message);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public TechnicalException(String message, Throwable cause) {
		super(message, cause);
	}
}