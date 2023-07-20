package rvs.libro.pag39.metodo.estatico.ejemplo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
* <p>Título: Aprendiendo Java</p>
* <p>Descripción: Ejemplos del Libro Aprendiendo Java de Compunauta</p>
* <p>Copyright: Copyright (c) 2006 www.compunauta.com</p>
* <p>Empresa: julioduarte@gmail.com</p>
* 
* @author Julio César Duarte
* @version 2006.01.01
*/

/**
 * Clase Leer desde Teclado
 * 
 * Captura por teclado para ingresar los datos de 3 valores y calcular su
 * promedio <br>
 * <br>
 * Preguntar el nombre del usuario e imprimir de manera personalizada
 * “Usuario<br>
 * <br>
 * El promedio de tus tres valores es: XXX”, es un problema muy similar a los
 * anteriores, pero utilizaremos una función llamada leer que fabricaremos para
 * no repetir el código de lectura del teclado.
 * 
 * 20 jul 2023 - 14:19:18
 *
 * @author RVS
 *
 */
public class MetodoLeer {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int acumulador = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese el valor " + (i + 1) + " de 3?");
			acumulador = acumulador += Integer.parseInt(leer(br));
		}
		acumulador /= 3;
		System.out.println("Ingrese su nombre?");
		String nombre = leer(br);
		System.out.println("Usuario: " + nombre + " tu promedio es: " + acumulador);
	}

	/**
	 * Función estática<br>
	 * <br>
	 * Captura por teclado una cadena de texto
	 * 
	 * @param buff - Objeto de tipo de BufferedReader
	 * @return - String - una cadena de texto desde teclado
	 */
	public static String leer(BufferedReader buff) {
		String lee = "";
		try {
			lee = buff.readLine();
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
		}
		return lee;
	}
}
