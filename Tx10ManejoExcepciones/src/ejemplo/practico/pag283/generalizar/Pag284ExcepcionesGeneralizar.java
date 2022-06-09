package ejemplo.practico.pag283.generalizar;

/**
 * 
 * @author RVS
 * @time 7 jun 2022 - 14:58:37
 * 
 */
public class Pag284ExcepcionesGeneralizar {

	public static void main(String[] args) throws BusinessException {
		Empleado e = new Empleado();
//		e.lanzarExcepcionParaTodoError();
		e.lanzarExcepcionParaTodoCorrecto();

	}
}

/**
 * Clase Concreta
 * 
 * @author RVS
 * @time 8 jun 2022 - 11:53:28
 *
 */
class Empleado {

	/**
	 * Atributo de instancia
	 */
	private double salario;

	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		this.salario = 0;
	}

	/**
	 * Constructor parametrizado
	 */
	public Empleado(int salario) {
		this.salario = salario;
	}

	/**
	 * Lanzar una excepción al intentar convertir un String a int
	 */
	public void lanzarExcepcionParaTodoError() {
		String s = "123..456";
		int num = 0;
		try {
			num = Integer.parseInt(s.trim());
		} catch (Exception e) {
//		 Aquí se arreglaría todo
			e.printStackTrace();
			System.out.println("• Message: |" + e.getMessage() + "| • Localized Message: |" + e.getLocalizedMessage()
					+ "| • Cause: |" + e.getCause() + "|");
		}
	}

	/**
	 * Lanzar una excepción al intentar convertir un String a int
	 */
	public void lanzarExcepcionParaTodoCorrecto() throws BusinessException {
		String s = "123..456";
		int num = 0;
		try {
//			trim - Elimina espacio por la derecha e izquierda
			num = Integer.parseInt(s.trim());
		} catch (NumberFormatException nfe) {
			System.out.println("• Number Format Exception: " + nfe.getMessage() + " • Localized Message: "
					+ nfe.getLocalizedMessage() + " • Cause: " + nfe.getCause());
		} catch (NullPointerException npe) {
			System.out.println("○ Null Pointer Exception: " + npe.getMessage() + " ○ Localized Message: "
					+ npe.getLocalizedMessage() + " ○ Cause: " + npe.getCause());
		} finally {
			System.out.println("♠ Numero final: " + num);
		}
	}
}

/**
 * 
 * @author RVS
 * @time 8 jun 2022 - 12:54:50
 *
 */
class BusinessException extends Exception {

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

// java.lang.NumberFormatException: For input string: "123..456"
// Message: For input string: "123..456" Localized Message: For input string: "123..456" Cause: null
//	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//	at java.base/java.lang.Integer.parseInt(Integer.java:668)
//	at java.base/java.lang.Integer.parseInt(Integer.java:786)
//	at ejemplo.practico.pag283.generalizar.Pag284ExcepcionesGeneralizar.main(Pag284ExcepcionesGeneralizar.java:16)
