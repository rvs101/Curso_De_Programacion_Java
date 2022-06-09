package ejemplo.checked.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Object → Throwable → Exception → IOExceptions -> FileNotFoundException
 * 
 * @author RVS
 * @time 19 may 2022 - 12:08:33
 *
 */
public class T10CheckedExceptionsIOExceptions {

	public static void main(String[] args) {
//		Señala que se ha producido una excepción de E/S de algún tipo. 
//		Esta clase es la clase general de excepciones producidas por operaciones de E/S fallidas o interrumpidas.
		IOException ioe = new IOException();
//		Señala que ha fallado el intento de abrir el archivo indicado por la ruta especificada. 
		FileNotFoundException fnfe = new FileNotFoundException();
//		Se lanza para indicar que se ha producido una URL malformada. 
//		O bien no se ha podido encontrar un protocolo legal 
//		en una cadena de especificación o no se ha podido analizar la cadena.
		MalformedURLException mfue = new MalformedURLException();
	}
}
