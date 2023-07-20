package rvs.libro.pag33.ejemplos.pc.e8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* <p>Título: Aprendiendo Java</p>
* <p>Descripción: Ejemplos del Libro Aprendiendo Java de Compunauta</p>
* <p>Copyright: Copyright (c) 2006 www.compunauta.com</p>
* <p>Empresa: julioduarte@gmail.com</p>
* @author Julio César Duarte
* @version 2006.01.01
*/

/**
 * 18 jul 2023 - 13:55:41
 *
 * @author RVS
 *
 */
public class Comp0Ej8 {

	/**
	 * Ejercicio8: Se ingresan por teclado las notas obtenidas por tres alumnos en
	 * un parcial de ciertas materia. <br>
	 * <br>
	 * Se desea saber cuáles de estos alumnos resultaron aplazados, y además se pide
	 * determinar cuál fue la mayor nota, y cuál fue el alumno que la obtuvo.
	 */

	public static void main(String[] args) {

		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		int mejor;
		int alumno;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese la nota del primer alumno: ");

		try {
			nota1 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("Error imprevisto : " + ioe.getMessage());
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("Error imprevisto : " + e.getMessage());
			System.exit(-1);
		}

		System.out.println("Ingrese la nota del segundo alumno: ");

		try {
			nota2 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("Error imprevisto : " + ioe.getMessage());
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("Error imprevisto : " + e.getMessage());
			System.exit(-1);
		}

		System.out.println("Ingrese la nota del tercer alumno: ");

		try {
			nota3 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("Error imprevisto : " + ioe.getMessage());
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("Error imprevisto : " + e.getMessage());
			System.exit(-1);
		}

		System.out.println("Alumno Aplazados");

		if (nota1 < 4) {
			System.out.println("- Primer alumno aplazado");
		}

		if (nota2 < 4) {
			System.out.println("- Segundo alumno aplazado");
		}

		if (nota3 < 4) {
			System.out.println("- Tercero alumno aplazado");
		}

// Si la nota1 es nota2	
		if (nota1 > nota2) {
// Entonces nota1 es mejor
			mejor = nota1;
// Alumno 1 mejor			
			alumno = 1;
		} else {
// Sino la nota2 es mejor			
			mejor = nota2;
// Alumno 2 mejor			
			alumno = 2;
		}
// Si la nota3 es mayor que mejor
		if (mejor < nota3) {
// Entonces nota3 es mejor
			mejor = nota3;
// Alumno 3 mejor			
			alumno = 3;
		}

		System.out.println("El alumno " + alumno + " fue quien obtuvo un : " + mejor);

	}
}
