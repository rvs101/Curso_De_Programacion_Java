package rvs.libro.pag32.ejemplos.pc.e7;

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
 * 
 * 18 jul 2023 - 0:07:16
 *
 * @author RVS
 *
 */
public class Comp0Ej7 {

	/**
	 * Ejercicio 7 : Se conocen tres números distintos. <br>
	 * Determinar el menor de ellos y calcular el cuadrado y el cubo del mismo
	 * 
	 */

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int menor = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese el primer numero: ");
		try {
			numero1 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error imprevisto");
			System.exit(-1);
		}

		System.out.println("Ingrese el segundo numero");
		try {
			numero2 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error imprevisto");
			System.exit(-1);
		}

		System.out.println("Ingrese el tercer numero: ");
		try {
			numero3 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error imprevisto");
			System.exit(-1);
		}

// Si "numero1" es menor que "numero2"
		if (numero1 < numero2) {
// Entonces "menor" es "numero1"
			menor = numero1;
// Sino 			
		} else {
// Entonces "menor" es "numero2"			
			menor = numero2;
		}
// Si "menor" es mayor que "numero3"		
		if (menor > numero3) {
// Entonces "menor" es "numero3"			
			menor = numero3;
		}

		System.out.println("El numero menor es : " + menor);
		
		System.out.println("El cuadrado es : " + menor * menor);
		
		System.out.println("El cubo es : " + menor * menor * menor);

	}
}
