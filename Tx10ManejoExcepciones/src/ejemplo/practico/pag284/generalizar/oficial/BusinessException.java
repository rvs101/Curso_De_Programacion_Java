package ejemplo.practico.pag284.generalizar.oficial;

/**
 * 
 * @author RVS
 * @time 8 jun 2022 - 13:43:55
 *
 */
public class BusinessException extends Exception {

	/**
	 * 
	 */
	private ErrorCode errorCode;

	/**
	 * Atributo de clase : Identificador númerico
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param errorCode
	 * @param detailMessage
	 */
	public BusinessException(ErrorCode errorCode, String detailMessage) {
		this(errorCode, detailMessage, null);
	}

	/**
	 * 
	 * @param errorCode
	 * @param detailMessage
	 * @param cause
	 */
	public BusinessException(ErrorCode errorCode, String detailMessage, Throwable cause) {
		super(generateMessage(errorCode, detailMessage), cause);
		this.errorCode = errorCode;
	}

	/**
	 * 
	 * @param errorCode
	 * @param detailMessage
	 * @return
	 */
	private static String generateMessage(ErrorCode errorCode, String detailMessage) {
		return errorCode + detailMessage;
	}

	/**
	 * 
	 * @return
	 */
	public ErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * 
	 * @author RVS
	 * @time 8 jun 2022 - 13:13:27
	 *
	 */
	enum ErrorCode {
		NEGATIVE("El número recibido es negativo"), EVEN("El número recibido es par"), ZERO("El número recibido es 0");

		/**
		 * 
		 */
		private String message;

		/**
		 * 
		 * @param message
		 */
		ErrorCode(String message) {
			this.message = message;
		}

		@Override
		public String toString() {
			return "♦ Error: " + message + " . Details: ";
		}
	}

 }
