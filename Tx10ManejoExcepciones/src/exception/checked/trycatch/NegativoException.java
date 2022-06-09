package exception.checked.trycatch;

/**
 * Clase Concreta para gestionar la excepciones
 * 
 * @author RVS
 * @time 24 may 2022 - 23:27:59
 *
 */
public class NegativoException extends Exception {

	/**
	 * Atributo de instancia - ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto
	 */
	public NegativoException() {
// Este constructor 'super' heredado de la clase Exception
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - String : Almacena los mensajes de error
	 */
	public NegativoException(String message) {
// Este constructor 'super' heredado de la clase Exception
		super(message);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - String : Almacena los mensajes de error
	 * @param cause   - Throwable : objetos para gestionar los errores
	 */
	public NegativoException(String message, Throwable cause) {
// Este constructor 'super' heredado de la clase Exception
		super(message, cause);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param cause - Throwable : objetos para gestionar los errores
	 */
	public NegativoException(Throwable cause) {
// Este constructor 'super' heredado de la clase Exception
		super(cause);
	}

}
