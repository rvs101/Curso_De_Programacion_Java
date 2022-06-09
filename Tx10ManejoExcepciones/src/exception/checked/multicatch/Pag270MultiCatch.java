package exception.checked.multicatch;

/**
 * 
 * @author RVS
 * @time 27 may 2022 - 14:10:00
 *
 */
public class Pag270MultiCatch {

//	public static void lanzarMultiCatch() {
//		try {
//			algoConMuchosFallos();
//		} catch (AException ae) {
//			AException.tratamientoA(ae);
//		} catch (BException ae) {
//			BException.tratamientoB(ae);
//		} catch (CException ae) {
//			CException.tratamientoC(ae);
//		}
//	}

//	public static void lanzarMultiCatchConPipe() {
//		try {
//			algoConMuchosFallos();
//		} catch (AException ae) {
//			AException.tratamientoA(ae);
//		} catch (BException ae) {
//			BException.tratamientoB(ae);
//		} catch (CException ae) {
//			CException.tratamientoC(ae);
//		}
//	}

	/**
	 * 
	 */
	public static void algoConMuchosFallos() {
		int x = 2 / 0;
		System.out.println("Falla mucho : " + x);

	}

}

/**
 * Clase Excepción A hereda de Exception
 * 
 * @author RVS
 * @time 27 may 2022 - 14:09:49
 *
 */
class AException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto
	 */
	public AException() {
// Hereda el constructor de la clase Exceptión		
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - String : Almacena una cadena de texto
	 */
	public AException(String message) {
// Hereda el constructor de la clase Exception		
		super(message);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - String : Almacena una cadena de texto
	 * @param cause   - Throwable : Almacena el tipo de error producido
	 */
	public AException(String message, Throwable cause) {
// Hereda el constructor de la clase Exception con 2 parametros distintos
		super(message, cause);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param cause - Throwable : Almacena el tipo de error producido
	 */
	public AException(Throwable cause) {
// Hereda el constructor de la clase Exception 
		super(cause);
	}

	/**
	 * 
	 * @param ae
	 */
	public static void tratamientoA(AException ae) {
		System.out.println("Tratamiento A " + ae.toString());
	}

}

/**
 * Clase Excepción A hereda de Exception
 * 
 * @author RVS
 * @time 27 may 2022 - 14:09:55
 *
 */
class BException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto
	 */
	public BException() {
		super();
	}

	/**
	 * Constructor por defecto
	 * 
	 * @param message - String : Almacena una cadena de texto como mensaje
	 */
	public BException(String message) {
		super(message);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - String : Almacena una cadena de texto como mensaje
	 * @param cause   - Throwable : Almacena el tipo de error producido
	 */
	public BException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param cause - Throwable : Almacena el tipo de error producido
	 */
	public BException(Throwable cause) {
		super(cause);
	}

	public static void tratamientoB(Throwable cause) {
		System.out.println("Tratamiento B " + cause);
	}

	/**
	 * 
	 * @param ae
	 */
	public static void tratamientoB(AException ae) {
		System.out.println("Tratamiento A " + ae.toString());
	}

}

/**
 * Clase Excepción C hereda de Exception
 * 
 * @author RVS
 * @time 27 may 2022 - 14:12:20
 *
 */
class CException extends Exception {

	/**
	 * Atributo de Instancia le añade un identificador
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto
	 */
	public CException() {
// Hereda el constructor de la clase Exception
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - String : Almacena un mensaje del tipo String
	 */
	public CException(String message) {
// Hereda el constructor de la clase Exception		
		super(message);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - String : Almacena un mensaje del tipo String
	 * @param cause   - Throwable : Almacena el tipo de error producido
	 */
	public CException(String message, Throwable cause) {
// Hereda el constructor de la clase Exception
		super(message, cause);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param cause - Throwable : Almacena el tipo de error producido
	 */
	public CException(Throwable cause) {
// Hereda el constructor de la clase Exception		
		super(cause);
	}

	public static void tratamientoC(Throwable cause) {
		System.out.println("Tratamiento C " + cause);
	}

	/**
	 * 
	 * @param ae
	 */
	public static void tratamientoC(AException ae) {
		System.out.println("Tratamiento A " + ae.toString());
	}

}
