package ejemplo.practico.pag272.solucion.libro;

/**
 * 
 * @author RVS
 * @time 31 may 2022 - 13:31:00
 *
 */
public class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private ErrorCode errorCode;

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
	 * @time 31 may 2022 - 13:30:39
	 *
	 */
	enum ErrorCode {
		NEGATIVE("El número recibido es negativo"), EVEN("El número recibido es par");

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

		/**
		 * 
		 */
		@Override
		public String toString() {
			return "ERROR: " + message + ". Detalle: ";
		}
	}
}