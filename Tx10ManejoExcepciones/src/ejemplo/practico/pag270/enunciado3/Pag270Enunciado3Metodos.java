package ejemplo.practico.pag270.enunciado3;

import exception.checked.business.ErrorCode;

/**
 * 1º - Coge el primer argumento que le pasamos
 * 
 * 2º - Lo convierte en un número entero y haga calculos ( calcular cuadrado )
 * si no es par o negativo
 *
 * 3º - Sacar el resultado por la salida de la pantalla mostrando un mensaje
 * "mostrar mensaje "El resultado es " + " el valor calculado"
 * 
 * 4º - Controlar cualquier tipo de excepción que se pueda producir y garantizar
 * la mejor experiencia de usuario
 * 
 * 5º - Añadimos los metodos noQuieroPares , noQuieroNegativos
 * 
 * 6º - Lanza excepciones BusinessException en caso de par y negativos
 * 
 * 7º - Añadir trazas "System.out.println" a las salidas de error
 * 
 * @author RVS
 * @time 30 may 2022 - 20:36:11
 *
 */
public class Pag270Enunciado3Metodos {

	public static void main(String[] args) {
		try {
			System.out.println(" ☻ Resultado : " + Main.trataNumero(args));
		} catch (TechnicalException te) {
			System.out.println(" ▲ Mensaje : Business Exception : " + te.getMessage() + " ▼ ▲ Causa : " + te.getCause()
					+ "▼ ▲ Localized Message : " + te.getLocalizedMessage() + " ▼");
		} catch (BusinessException be) {
			System.out.println(" ▲ Mensaje : Business Exception : " + be.getMessage() + " ▼ ▲ Causa : " + be.getCause()
					+ " ▼ ▲ Localized Message : " + be.getLocalizedMessage() + " ▼");
			be.printStackTrace();
		}
	}

}

/**
 * 
 * @author RVS
 * @time 29 may 2022 - 20:49:52
 *
 */
class Main {

	/**
	 * Función de Clase
	 * 
	 * Recibe un parametro del tipo numerico desde la terminal para mostrar el
	 * cuadrado
	 * 
	 * @param args String : Recibe por parametro un elemento de tipo texto
	 * @return int : Devuelve un elemento del tipo entero
	 * @throws TechnicalException : Arroja una excepción personalizada y para el
	 *                            flujo de ejecución de mi programa
	 * @throws BusinessException
	 */
	public static int trataNumero(String[] args)
			throws TechnicalException, BusinessException, ArrayIndexOutOfBoundsException {
		if (args.length == 0) {
			throw new ArrayIndexOutOfBoundsException(
					" ○ No hay Argumentos recibidos desde la consola : " + args.length);
//			throw new TechnicalException(" ○ No hay parametros desde consola : " + args.length);
		}
		int valor = Integer.valueOf(args[0]);
		Main.noQuieroNegativos(valor);
		Main.noQuieroPares(valor);
		return (int) Math.pow(valor, 2);
	}

	/**
	 * Metodo de Clase : Lanza excepción en caso de recibir un número positivo
	 * 
	 * @param int : numero entero
	 * @throws BusinessException - Hereda de la clase Exception para lanzar una
	 *                           excepción
	 */
	public static void noQuieroPares(int x) throws BusinessException {
		if (x % 2 == 0) {
			System.out.println(" ♦ Es par : " + x);
			throw new BusinessException(BusinessException.ErrorCode.EVEN, "Valor " + x);
		}
	}

	/**
	 * Metodo de Clase : Lanza excepción en caso de recibir un número negativo
	 * 
	 * @param x - int : numero entero
	 * @throws BusinessException - Hereda de la clase Exception para lanzar una
	 *                           excepción
	 */
	public static void noQuieroNegativos(int x) throws BusinessException {
		if (x < 0) {
			System.out.println(" ♦ Es negativo : " + x);
			throw new BusinessException(BusinessException.ErrorCode.NEGATIVE, "Valor " + x);
		}
	}

}

/**
 * 
 * @author RVS
 * @time 29 may 2022 - 20:49:36
 *
 */
class TechnicalException extends Exception {
	/**
	 * Atributo de instancia - añade un ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto : Hereda de la clase padre Exception
	 * 
	 */
	public TechnicalException() {
// Constructor por defecto de la clase Padre 
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message : String - Almacena una cadena de texto con un mensaje
	 */
	public TechnicalException(String message) {
// Constructor por defecto de la clase Padre 
		super(message);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message : String - Almacena una cadena de texto con un mensaje
	 * @param cause   : Throwable - Almacena un objeto con la causa del error
	 */
	public TechnicalException(String message, Throwable cause) {
// Constructor por defecto de la clase Padre 
		super(message, cause);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param cause : Throwable - Almacena un objeto con la causa del error
	 */
	public TechnicalException(Throwable cause) {
// Constructor por defecto de la clase Padre 
		super(cause);
	}
}

/**
 * 
 * @author RVS
 * @time 29 may 2022 - 20:49:36
 *
 */
class BusinessException extends Exception {

	/**
	 * Atributo de instancia - añade un ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private ErrorCode errorCode;

	/**
	 * Constructor parametrizado
	 * 
	 * @param message : String - Almacena una cadena de texto con un mensaje
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
