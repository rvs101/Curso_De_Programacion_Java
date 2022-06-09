package ejercicios;

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
		System.out.println("hola");
		try {
			Main.trataNumero(args);
		} catch (TechnicalException e) {
			System.out.println("Mensaje : " + e.getMessage() + " Causa : " + e.getCause() + " Localized Message "
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
	 * 
	 * @param args
	 * @return
	 * @throws TechnicalException
	 */
	public static int trataNumero(String[] args) throws TechnicalException {
		int valor = Integer.valueOf(args[0]);
		if (args.length < 0) {
			throw new TechnicalException();
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
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public TechnicalException() {
		super();
	}

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

	/**
	 * 
	 * @param cause
	 */
	public TechnicalException(Throwable cause) {
		super(cause);
	}

}