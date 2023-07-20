package rvs.libro.pag26.ejemplos.pc.e2;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * <p>Título: Aprendiendo Java</p>
 * <p>Descripción: Ejemplos del Libro Aprendiendo Java de Compunauta</p>
 * <p>Copyright: Copyright (c) 2006 www.compunauta.com</p>
 * <p>Empresa: julioduarte@gmail.com</p>
 * @author Julio César Duarte
 * @version 2006.01.01
 */

/**
 * 
 * @date 17 jul 2023 - 18:25:02
 *
 * @author RVS
 *
 */
public class Comp0Ej2 {
	/**
	 * Ejercicio 2 : Un programa que carga por teclado el nombre de una persona y le
	 * muestra un saludo
	 * 
	 */

	public static void main(String[] args) {

		String nombre = new String();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese su nombre: ");

		try {
			nombre = br.readLine();
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.out.println("el programa se debe finalizar");
			System.exit(-1);
		}
		System.out.println("Hola " + nombre);
	}
}
