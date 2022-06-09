package ejemplo.practico.pag270.enunciado2;

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
 * 6º- Lanza excepciones BusinessException en caso de par y negativos
 * 
 * @author RVS
 * @time 29 may 2022 - 20:36:11
 *
 */
public class Pag270Enunciado2Metodos {

	public static void main(String[] args) {
		try {
			System.out.println("☻ Resultado : " + Main.trataNumero(args));
		} catch (TechnicalException te) {
			System.out.println("▲ Mensaje Business Exception : " + te.getMessage() + " ▼ ▲ Causa : " + te.getCause()
					+ "▼ ▲ Localized Message : " + te.getLocalizedMessage() + " ▼");
		} catch (BusinessException be) {
			System.out.println("▲ Mensaje Business Exception : " + be.getMessage() + " ▼ ▲ Causa : " + be.getCause()
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
	public static int trataNumero(String[] args) throws TechnicalException, BusinessException {
		int valor = Integer.valueOf(args[0]);
		Main.noQuieroNegativos(valor);
		Main.noQuieroPares(valor);
		if (args.length == 0) {
			throw new TechnicalException("○ No hay parametros desde consola : " + args.length);
		}
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
			throw new BusinessException(" ‼ Error : No acepta numeros pares : " + ErrorCode.EVEN + " ");
		}
		System.out.println("♦ No es par : " + x);
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
			throw new BusinessException("‼ Error : No acepta numeros negativos : " + ErrorCode.NEGATIVO + " ");
		}
		System.out.println("♦ No es negativo : " + x);
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
	 * @author RVS
	 * @time 30 may 2022 - 14:40:41
	 *
	 */
	public enum ErrorCode {

		/**
		 * 
		 */
		NEGATIVE("→ Numero Recibido Negativo"), EVEN("→ Numero Recibido es Par");

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
			return "§ ERROR : " + message + " → Detalle : ";
		}

	}

	/**
	 * Constructor por defecto : Hereda de la clase padre Exception
	 * 
	 */
	public BusinessException() {
// Constructor por defecto de la clase Padre 
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message : String - Almacena una cadena de texto con un mensaje
	 */
	public BusinessException(String message) {
// Constructor por defecto de la clase Padre 
		super(message);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message : String - Almacena una cadena de texto con un mensaje
	 * @param cause   : Throwable - Almacena un objeto con la causa del error
	 */
	public BusinessException(String message, Throwable cause) {
// Constructor por defecto de la clase Padre 
		super(message, cause);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param cause : Throwable - Almacena un objeto con la causa del error
	 */
	public BusinessException(Throwable cause) {
// Constructor por defecto de la clase Padre 
		super(cause);
	}
}
