package rvs.libro.java.ejemplo.system.metodos.in;

import java.io.IOException;
import java.io.InputStream;

/**
 * Método available() del System.in
 * 
 * Es importante tener en cuenta que el método available() solo devuelve una
 * estimación del número de bytes disponibles para leer, por lo que podría no
 * ser exacto en todos los casos
 * 
 * Además System.in utiliza un flujo de entrada de bytes (InputStream)
 * 
 * Por lo que los datos ingresados se leerán como bytes y se deben convertir a
 * caracteres si se desea trabajar con ellos como texto
 * 
 */
public class JavaAvailable2 {

	public static void main(String[] args) throws IOException {

		System.out.print("Escribe algo y presiona Enter: ");
// Solicitamos al usuario que ingrese algunos datos por la entrada estándar
// Utilizamos el método available() de System.in para obtener la cantidad de bytes disponibles para leer
		while (System.in.available() == 0) {

		}
		
		try {
			
			InputStream inputStream = System.in;
			int availableBytes = inputStream.available();
			
			System.out.println("Bytes disponibles para leer: " + availableBytes);
// Leer los datos ingresados por el usuario
			byte[] inputBytes = new byte[availableBytes];
			
// Después de obtener la cantidad de bytes disponibles, creamos un arreglo de
// bytes del tamaño correspondiente y utilizamos System.in.read()
// para leer los datos ingresados por el usuario en el arreglo.
			System.in.read(inputBytes);

// Convertimos los bytes leídos en una cadena de 
// caracteres utilizando new String() y la mostramos en la salida estándar.
			String inputData = new String(inputBytes);
			System.out.println("\u001B[32mDatos ingresados: " + inputData);

		} catch (IOException e) {

			System.out.println("\u001B[31mOcurrió un error al leer los datos de entrada: " + e.getMessage());
		}
	}
}
