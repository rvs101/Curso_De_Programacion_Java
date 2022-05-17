package ejemplo.runtime.exceptions;

/**
 * Esta Excepción se va a producir cada vez que intentemos convertir un objeto
 * de un tipo en un objeto de otro tipo no compatible
 * 
 * @author RVS
 * @time 17 may 2022 - 22:58:30
 *
 */
public class T10RuntimeExcepcionesClassCastException {

	public static void main(String[] args) {

		Object x = new Integer(0); // Forma incorrecta
//		Object x = Integer.valueOf(0); // Forma correcta
		// Lanza la excepcion → java.lang.ClassCastException
		System.out.println((String) x);

	}
}
