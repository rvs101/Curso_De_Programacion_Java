package ejemplo.practico.pag270.enunciado;

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
 * @author RVS
 * @time 29 may 2022 - 20:36:11
 *
 */
public class Pag270Enunciado {

	public static void main(String[] args) {
		try {
			System.out.println("Resultado : " + Main.trataNumero(args));
		} catch (TechnicalException e) {
			System.out.println("• Mensaje : " + e.getMessage() + " Causa : " + e.getCause() + " Localized Message "
					+ e.getLocalizedMessage());
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
	 * Recibe un parametro del tipo numerico desde la terminal para mostrar el cuadrado
	 * 
	 * @param args - String : Recibe por parametro un elemento de tipo texto
	 * @return - int : Devuelve un elemento del tipo entero
	 * @throws TechnicalException - Arroja una excepción personalizada y para el flujo de ejecución de mi programa
	 */
	public static int trataNumero(String[] args) throws TechnicalException {
		int valor = Integer.valueOf(args[0]);
		if (args.length == 0) {
			throw new TechnicalException("○ No hay parametros desde consola : " + args.length);
		}
		return (int) Math.pow(valor, 2);
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
