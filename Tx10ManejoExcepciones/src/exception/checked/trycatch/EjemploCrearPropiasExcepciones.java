package exception.checked.trycatch;

import java.io.IOException;

/**
 * Clase Estandar para ejecutar código
 * 
 * @author RVS
 * @time 24 may 2022 - 13:48:05
 * @see https://stackoverflow.com/questions/1754315/how-to-create-custom-exceptions-in-java
 *
 */
public class EjemploCrearPropiasExcepciones {

	/**
	 * 
	 */
	private EjemploCrearPropiasExcepciones myObject = null;

	/**
	 * Procedimiento de instancia
	 * 
	 * @param i
	 * @throws FooException
	 */
	public void calculate(int i) throws FooException {
		if (i < 0) {
			throw new FooException("Error en la entrada del dato");
		}
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param i
	 * @throws FooException
	 * @throws IOException
	 */
	public void calculate2(int i) throws FooException, IOException {
		myObject = new EjemploCrearPropiasExcepciones();
		try {
			myObject.calculate(i);
		} catch (FooException ex) {
			// Print error and terminate application.
			ex.printStackTrace();
			System.exit(1);
		}
	}
}
