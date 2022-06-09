package exception.checked.ejthrows;

/**
 * Lanzamos una excepcion desde Checked Exception - la cual podemos controlar
 * desde los metodos mediante throw y throws
 * 
 * @author RVS
 * @time 19 may 2022 - 17:55:51
 *
 */
public class T10EjemploThrows {

	/**
	 * Captura la excepción del anterior método
	 * 
	 * @throws ArithmeticException - Ejemplo de lanzamiento de excepción 
	 */
	private static void yoNoSe() throws ArithmeticException {
		yoLanzoExcepcion();
	}

	/**
	 * Lanza la excepción directamente
	 * 
	 * @throws ArithmeticException - Ejemplo de lanzamiento de excepción 
	 */
	private static void yoLanzoExcepcion() throws ArithmeticException {
		throw new ArithmeticException("• No se puede calcular");
	}

	public static void main(String[] args) {
		yoLanzoExcepcion();
	}
}
