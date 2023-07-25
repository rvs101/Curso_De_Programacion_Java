package rvs.libro.pag41.teoria.array.solucion;

import java.io.BufferedReader;
import java.io.IOException;
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
 * Clase Arreglos
 * 
 * 22 jul 2023 - 19:58:00
 *
 * @author RVS
 *
 */
public class Arreglos {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] examenes = new int[3];

		System.out.println("La longitud de datos de mi arreglo : " + examenes.length);
		for (int i = 0; i < examenes.length; i++) {
			System.out.println("Ingrese el valor para el examen : " + (i + 1) + " de " + examenes.length);
			examenes[i] = leerInt(br);
		}
		System.out.println("El resultado del primer examen es : " + examenes[0]);
		System.out.println("El resultado del primer examen es : " + examenes[examenes.length - 1]);
	}

	/**
	 * Instancia de clase <br>
	 * <br>
	 * Captura por teclado un valor entero
	 * 
	 * @param buff
	 * @return
	 */
	public static int leerInt(BufferedReader buff) {
		int lee = 0;
		boolean error;
		do {
			error = false;
			try {
				lee = Integer.parseInt(buff.readLine());
			} catch (NumberFormatException nte) {
				System.out.println("Entrada erronea , repetir:? ");
//				nte.printStackTrace(System.err);
				error = true;
//			} catch (IOException ioe) {
//				System.out.println("Error IO : " + ioe.getMessage());
//				ioe.printStackTrace(System.err);
//				System.exit(-1);
			} catch (Exception e) {
				System.out.println("Excepcion : " + e.getMessage());
//				e.printStackTrace(System.err);
//				System.exit(-1);
			}
		} while (error);
		return lee;
	}

}
