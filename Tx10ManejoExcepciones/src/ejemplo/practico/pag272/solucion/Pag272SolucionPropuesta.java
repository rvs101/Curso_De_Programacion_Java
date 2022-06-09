package ejemplo.practico.pag272.solucion;

/**
 * Excepciones : Business Exception
 * 
 * Checked exception → hay que tratarlas "Si o Si" ( orientamos al usuario para
 * solucionar el error)
 * 
 * Excepciones : Technical Exception
 * 
 * Runtime exception → podemos dejarla sin tratarla hasta el último momento
 * (excepciones tecnicas)
 * 
 * @author RVS
 * @time 30 may 2022 - 20:51:36
 *
 */
public class Pag272SolucionPropuesta {

	public static void main(String[] args) {
		int x = 0;
		try {
			x = TestExceptional.trataNumero(args);
			System.out.println("Solución : " + x);
		} catch (BusinessException be) {
			System.out.println("===== ERROR FUNCIONAL =====");
			System.out.println("Se ha producido un error funcional : " + be);
			switch (be.getErrorCode()) {
			case EVEN:
				System.out.println("Prefiero número impares ( 1 , 3 , 5 ...)");
				break;
			case NEGATIVE:
				System.out.println("Prefiero número positivos");
				break;
			default:
				System.err.println("Error General");
				break;
			}
		} catch (TechnicalException te) {
			System.err.println("***** ERROR TECNICO *****");
			System.err.println("Se ha producido un error tecnico: " + te);
		} finally {
			System.out.println("!Gracias por usar este programa! ");
		}
	}

}

/**
 * Clase Concreta para probar los errores
 * 
 * @author RVS
 * @time 30 may 2022 - 20:54:50
 *
 */
class TestExceptional {

	/**
	 * Atributo de instancia
	 */
	public static final String TECH_SIN_ARGUMENTOS = "Se esperaba al menos un argumento";

	public static final String TECH_MAL_FORMATO = "El primer argumento debe ser un numero entero";

	/**
	 * Función de clase
	 * 
	 * Recibe una lista de argumentos por terminal
	 * 
	 * Si la longitud es menor de cero lanza la excepción TechnicalException
	 * 
	 * @param args - Array de String : Recibe una lista de argumentos
	 * @return - int : Devuelve el doble del número pasado por argumentos
	 * @throws BusinessException
	 */
	public static int trataNumero(String[] args) throws BusinessException {
		if (args.length == 0) {
			throw new TechnicalException(TECH_SIN_ARGUMENTOS);
		}
		try {
// Recibe un argumento de tipo entero		
			int num = Integer.parseInt(args[0]); // NumberFormatException es Runtime Exception
//		Compruebo los datos
			noQuieroPares(num);
			noQuieroNegativos(num);
// Multiplica el valor recibido desde consola por el mismo		
			return num * num;
		} catch (NumberFormatException nfe) {
// Excepción para controlar los NumberFormatException que son del tipo Runtime Exception
			throw new TechnicalException(TECH_MAL_FORMATO, nfe);
		}
	}

	/**
	 * Función de clase
	 * 
	 * Lanza una excepción en caso de recibir un número par
	 * 
	 * @param n - int : Recibe un numero como argumento
	 * @throws BusinessException : Clase creada para lanzar excepciones
	 */
	public static void noQuieroPares(int n) throws BusinessException {
		if (n % 2 == 0) {
			throw new BusinessException(BusinessException.ErrorCode.EVEN, "Valor " + n);
		}
	}

	/**
	 * Función de clase
	 * 
	 * Lanza una excepción en caso de recibir un número negativo
	 * 
	 * @param n - int : Recibe un numero como argumento
	 * @throws BusinessException : Clase creada para lanzar excepciones
	 */
	public static void noQuieroNegativos(int n) throws BusinessException {
		if (n < 0) {
			throw new BusinessException(BusinessException.ErrorCode.NEGATIVE, "Valor " + n);
		}
	}
}

/**
 * Clase Concreta para gestionar los errores del tipo Checked Exception
 * 
 * @author RVS
 * @time 29 may 2022 - 20:49:36
 *
 */
class BusinessException extends Exception {

	/**
	 * Atributo de instancia - añade un ID
	 */
	public static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena un elemento del tipo element
	 */
	public ErrorCode errorCode;

	/**
	 * Constructor parametrizado
	 * 
	 * @param message : String - Recibe un objeto del tipo cadena de texto
	 */
	public BusinessException(ErrorCode errorCode, String detailMessage) {
		this(errorCode, detailMessage, null);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param errorCode     - Tipo enum : Recibe un elemento del tipo enum
	 * @param detailMessage - String : Recibe un objeto del tipo cadena de texto
	 * @param cause         - Throwable : Recibe un objeto del tipo cause
	 */
	public BusinessException(ErrorCode errorCode, String detailMessage, Throwable cause) {
		super(generateMessage(errorCode, detailMessage), cause);
		this.errorCode = errorCode;
	}

	/**
	 * Funcion de clase
	 * 
	 * Devuelve una cadena de texto con el error y el detalle
	 * 
	 * @param errorCode
	 * @param detailMessage
	 * @return
	 */
	public static String generateMessage(ErrorCode errorCode, String detailMessage) {
		return errorCode + detailMessage;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Se utiliza para obtener el error y evitar que se vean las trazas "track" del
	 * error
	 * 
	 * @return - Devuelve un elemento del tipo enum
	 */
	public ErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * Elemento del tipo Enum
	 * 
	 * @author RVS
	 * @time 30 may 2022 - 14:40:41
	 *
	 */
	public enum ErrorCode {

		/**
		 * Constructores de tipo Enum
		 */
		NEGATIVE(" → Numero Recibido Negativo"), EVEN(" → Numero Recibido es Par");

		/**
		 * Atributos de instancia
		 */
		private String message;

		/**
		 * Constructor parametrizado
		 * 
		 * @param message - String : Almacena una cadena de texto
		 */
		ErrorCode(String message) {
			this.message = message;
		}

		/**
		 * Metodo Overload de String
		 */
		@Override
		public String toString() {
			return " § ERROR : " + message + " → Detalle : ";
		}
	}
}

/**
 * Excepción del tipo Runtime Exception -
 * 
 * Se produce cuando hay problemas tecnicos y se crean en cualquier parte del
 * codigo , no queremos que nos afecte demasiado , no queremos tener capturas en
 * todas las lineas y lanzar excepciones tecnicas
 * 
 * @author RVS
 * @time 31 may 2022 - 13:57:14
 *
 */
class TechnicalException extends RuntimeException {

	/**
	 * Atributo de clase - ID unico
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - String : Almacena una cadena de texto utilizando el
	 *                constructor padre mediante la palabra super
	 */
	public TechnicalException(String message) {
		super(message);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - String : Almacena una cadena de texto utilizando el
	 *                constructor padre mediante la palabra super
	 * @param cause   - Throwable :
	 */
	public TechnicalException(String message, Throwable cause) {
		super(message, cause);
	}
}
