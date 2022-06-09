package exception.runtime.technical;

/**
 * Runtime Exception - No se pueden controlar - Errores Tecnicos
 * 
 * • RuntimeException es la superclase de aquellas excepciones que pueden ser
 * lanzadas durante el funcionamiento normal de la máquina virtual de Java.
 * 
 * • RuntimeException y sus subclases son excepciones no verificadas. Las
 * excepciones no verificadas no necesitan declararse en la cláusula throws de
 * un método o constructor si pueden generarse mediante la ejecución del método
 * o constructor y propagarse fuera del límite del método o constructor.
 * 
 * @author RVS
 * @time 19 may 2022 - 11:52:23
 *
 */
public class TechnicalException extends RuntimeException {

	/**
	 * CONSTANTE
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor parametrizado hereda del constructor Padre 
	 * 
	 * @param mensaje - String - Mensaje del error
	 */
	public TechnicalException(String mensaje) {
// Invoca al constructor de la clase Padre de RuntimeException
		super(mensaje);
	}

	/**
	 * Constructor parametrizado hereda del constructor Padre 
	 * 
	 * @param mensaje - String - Mensaje del error
	 * @param causa   - String - Mensaje del Throwable
	 */
	public TechnicalException(String mensaje, Throwable causa) {
// Invoca al constructor de la clase Padre de RuntimeException
		super(mensaje, causa);
	}
}
