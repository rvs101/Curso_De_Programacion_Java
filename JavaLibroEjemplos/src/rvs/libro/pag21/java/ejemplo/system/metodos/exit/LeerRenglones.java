package rvs.libro.pag21.java.ejemplo.system.metodos.exit;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * 
 * 31 may 2023 - 20:11:36
 * 
 * @BufferedReader - Se utiliza para leer texto de una fuente de entrada de
 *                 caracteres, como un archivo o un flujo de entrada.
 *                 BufferedReader lee el texto en un búfer para reducir el
 *                 número de operaciones de lectura y mejorar el rendimiento.
 * 
 * @author RVS
 * 
 * 
 *
 */
public class LeerRenglones {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Hola, ingresa tu nombre");

		String nombre = null;

		try {
			nombre = br.readLine();
		} catch (IOException ioe) {
			ioe.printStackTrace();
// En caso de existir problemas 'Sale del programa con un 0'
			System.exit(-1);
		}
		System.out.println("Hola " + nombre + " ten un buen día");
// En caso de no existir problemas 'Sale del programa con un 0'
		System.exit(0);
	}
}
