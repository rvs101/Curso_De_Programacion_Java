package exception.checked.business;

/**
 * Exception - Checked Exceptions - Se pueden controlar
 * 
 * Es una excepción que ocurre en el momento de la compilación, también se
 * denominan excepciones de tiempo de compilación.
 * 
 * Estas excepciones no pueden simplemente ignorarse en el momento de la
 * compilación; el programador debe manejar estas excepciones.
 * 
 * @author RVS
 * @time 19 may 2022 - 14:30:08
 *
 */
public class BusinessException extends Exception {

	/**
	 * CONSTANTE identificador
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instancia del tipo enum
	 */
	private ErrorCode errorCode;

	/**
	 * Constructor parametrizado
	 * 
	 * @param errorCode     - Enum - codigo de error
	 * @param detailMessage - String - detalle del mensaje
	 */
	public BusinessException(ErrorCode errorCode, String detailMessage) {
//		Constructor que invoca el constructor BusinessException con 3 argumentos ↓
//		                                 Argumento 'null' porque sólo tenemos 2 parametros en el Constructor
//		                                 ↓
		this(errorCode, detailMessage, null);
	}

	/**
	 * Constructor parametrizado
	 * https://ciberninjas.com/mejores-sistemas-operativos-para-hackear/
	 * 
	 * @param errorCode - Tipo Enum - mensaje de error
	 * @param detalle   - String - detalle del error
	 * @param throwable - Throwable - la causa del error
	 */
	public BusinessException(ErrorCode errorCode, String detailMessage, Throwable cause) {
// Constructor invoca al metodo generateMessage() para añadirle 2 parametros desde el constructor de la clase BusinessException
		super(generateMessage(errorCode, detailMessage), cause);
		this.errorCode = errorCode;
	}

	/**
	 * Devuelve un elemento del tipo String con los errores
	 * 
	 * @param errorCode     - Tipo Enum - mensaje de error
	 * @param detailMessage - String - detalle del error
	 * @return String - mensaje de error
	 */
	private static String generateMessage(ErrorCode errorCode, String detailMessage) {
		return errorCode + detailMessage;
	}

	/**
	 * Devuelve un elemento del tipo enum
	 * 
	 * @return enum - Elemento
	 */
	private ErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * Enum - Como clase Interior
	 * 
	 * @author RVS
	 * @time 19 may 2022 - 12:42:37
	 *
	 */
	enum ErrorCode {

		/**
		 * Constructor NEGATIVE() , Constructor EVEN()
		 */
		NEGATIVE("El numero recibido es negativo"), EVEN("El numero recibido es par");

		/**
		 * Atributo de instancia
		 */
		private String message;

		/**
		 * Enumerado con CONSTRUCTOR
		 * 
		 * @param message - String - mensaje de error
		 */
		ErrorCode(String message) {
			this.message = message;
		}

		/**
		 * Anulamos el metodo toString
		 */
		@Override
		public String toString() {
			return "ERROR: " + message + ". Detalle: ";
		}
	}
}