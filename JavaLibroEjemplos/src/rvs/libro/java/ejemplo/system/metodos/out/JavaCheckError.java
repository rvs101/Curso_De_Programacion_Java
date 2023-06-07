package rvs.libro.java.ejemplo.system.metodos.out;

import java.io.PrintStream;

/**
 * En este ejemplo
 * 
 * Redirigimos la salida estándar a un nuevo PrintStream utilizando
 * System.setOut() para que los mensajes de salida se envíen a System.err en
 * lugar de System.out.
 * 
 * Luego, imprimimos un mensaje de error utilizando System.out.println().
 * 
 * Después, utilizamos el método checkError() para verificar si se ha producido
 * algún error en la salida estándar.
 * 
 * Dependiendo de si checkError() devuelve true o false, imprimimos un mensaje
 * indicando si se ha producido un error o no.
 * 
 * Luego, restauramos la salida estándar original utilizando System.setOut() y
 * continuamos imprimiendo un mensaje después de restaurarla.
 * 
 * Es importante tener en cuenta que checkError() solo verifica si se ha
 * producido un error en la salida estándar, no proporciona información
 * detallada sobre el tipo de error.
 * 
 * 
 * @author Robot
 *
 */
public class JavaCheckError {

	public static void main(String[] args) {

// Redirigir la salida estandar a un nuevo PrintStream	
		PrintStream originalOut = System.out;

// Salida captura el error
		PrintStream errorStream = new PrintStream(System.err);

// Asignar el nuevo PrintStream a la salida estandar
		System.setOut(errorStream);

// Imprimir un mensaje de error
		System.out.println("Este es un mensaje de error");

// Verificar si se ha producido un error en la salida estandar
		boolean hasError = System.out.checkError();

		if (hasError) {
			System.out.println("Se ha producido un error en la salida estandar");
		} else {
			System.out.println("No se ha producido un error en la salida estandar");
		}

//		Restaurar la salida estandar original
		System.setOut(originalOut);

//		Imprimir un mensaje después de restaurar la salida estandar
		System.out.println("Mensaje después de restaurar la salida estandar");

	}
}
