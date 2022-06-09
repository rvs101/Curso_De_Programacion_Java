package exception.checked.tratar;

/**
 * 
 * 
 * @author RVS
 * @time 24 may 2022 - 22:28:19
 *
 */
public class Pag263TryCatch {

	public final static void main(String[] args) throws Exception {
		noQuieroParesNiNegativos(Integer.parseInt(args[0]));
	}

	/**
	 * Procedimiento de clase
	 * 
	 * @param a
	 * @throws ParException
	 * @throws NegativoException
	 */
	private static void noQuieroParesNiNegativos(int a) throws ParException, NegativoException {
// Si es un numero par
		if (esPar(a)) {
//			Lanzo la excepción par
			throw new ParException(a + " es par!");
		}
// Si es un numero negativo
		if (a < 0) {
//			Lanzo la excepción negativo
			throw new NegativoException(a + " es negativo :(");
		}
	}

	/**
	 * Función de clase - calcula si un numero es par
	 * 
	 * @param num
	 * @return boolean - dice si un numero es par o no
	 */
	private static boolean esPar(int num) {
		return num % 2 == 0;
	}
}

/**
 * Clase Exception para gestionar las Excepciones
 * 
 * @author RVS
 * @time 24 may 2022 - 22:28:13
 *
 */
class ParException extends Exception {

	/**
	 * Atributo de instancia - Identificador
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - Almacena un mensaje
	 */
	public ParException(String message) {
// Constructor de la clase padre Exception para almacenar el mensaje
		super(message);
	}
}

/**
 * Clase Exception para gestionar las Excepciones
 * 
 * @author RVS
 * @time 24 may 2022 - 22:28:40
 *
 */
class NegativoException extends Exception {

	/**
	 * Atributo de instancia - Identificador
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - Almacena un mensaje
	 */
	public NegativoException(String message) {
		super(message);
	}
}