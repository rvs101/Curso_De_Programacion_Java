package ejemplo.practico.pag280.manejo.excepcion.nullpointerexception;

/**
 * Clase Concreta
 * 
 * @author RVS
 * @time 1 jun 2022 - 11:55:25
 * 
 */
public class Pag280EjNullPointerException {

	public static void main(String[] args) {
		new Nulo().lanzaExcepcionNullPointer();
//		new Nulo2().lanzaExcepcionNullPointer2();
	}
}

/**
 * Clase Concreta
 * 
 * @author RVS
 * @time 1 jun 2022 - 23:33:24
 *
 */
class Nulo {

	/**
	 * Atributo de instancia
	 */
	private Nulo nulo;

	/**
	 * Constructor por defecto
	 */
	public Nulo() {
		nulo = null;
	}

	/**
	 * Procedimiento de instancia
	 */
	public void loQueSea() {
		System.out.println("Lanzar loQueSea");
	}

	/**
	 * Procedimiento de instancia
	 */
	public void otraCosa() {
		System.out.println("Lanzar otraCosa");
	}

	/**
	 * Procedimiento de instancia
	 */
	public void lanzaExcepcionNullPointer() {
// Objeto no apunta a ninguna referencia
		Nulo nulo = null;
		try {
// El objeto que no apuntan a ningún sitio
			nulo.loQueSea();
		} catch (java.lang.NullPointerException npe) {
			System.err.println("***** ERROR TECNICO *****");
			System.err.println(" • Se ha producido un error técnico : " + npe.getMessage());
		}
		try {
			nulo.otraCosa();
		} catch (java.lang.NullPointerException npe) {
			System.err.println("***** ERROR TECNICO *****");
			System.err.println(" • Se ha producido un error técnico : " + npe.getMessage());
		} finally {
			System.out.println("Fin de la ejecución");
		}
	}
}

/**
 * Clase Concreta
 * 
 * @author RVS
 * @time 1 jun 2022 - 23:45:27
 *
 */
class Nulo2 {

	/**
	 * Atributo de instancia : Objeto de la clase Empleado
	 */
	private Empleado empleado;

	/**
	 * Constructor por defecto
	 */
	public Nulo2() {
		empleado = null;
	}

	/**
	 * Produce un error : NumberFormatException del tipo Runtime Exception ( El
	 * programador no tiene obligación de tratarlo )
	 */
	public void lanzaExcepcionNullPointer2() {
		int num = 0;
		String s = "123..45";
		try {
			num = Integer.parseInt(s);
		} catch (java.lang.NullPointerException npe) {
			System.out.println("• Causa: " + npe.getCause() + " • Mensaje Localización: " + npe.getLocalizedMessage()
					+ " • Mensaje: " + npe.getMessage());
		}
		empleado.setSalario(num);
	}

}

/**
 * Clase Concreta
 * 
 * @author RVS
 * @time 1 jun 2022 - 23:45:50
 *
 */
class Empleado {

	/**
	 * Atributo de instancia
	 */
	private int salario = 0;

	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		salario = 0;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param salario
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
}

/**
 * 
 * @author RVS
 * @time 2 jun 2022 - 11:53:44
 *
 */
class BusinessException extends Exception {

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

/**
 * 
 * @author RVS
 * @time 2 jun 2022 - 11:53:40
 *
 */
class TechnicalException extends RuntimeException {

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
