package rvs.libro.pag28.ejemplos.pc.e4;

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
 * @author Julio César Duarte
 * 
 * @version 2006.01.01
 */
public class Comp0Ej4 {

	/**
	 * Ejercicio 4 : Se conocen dos numeros. Determinar y mostrar el mayor
	 */

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese el primer numero: ");
		try {
			numero1 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("Error imprevisto");
			System.exit(-1);
		}

		System.out.println("Ingrese el segundo numero: ");
		try {
			numero2 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("Error imprevisto");
			System.exit(-1);
		}

		if (numero1 > numero2) {
			System.out.println(numero1 + " es mayor " + numero2);
		} else if (numero1 < numero2) {
			System.out.println(numero2 + " es mayor " + numero1);
		} else if (numero1 == numero2) {
			System.out.println(numero1 + " es igual " + numero2);
		}

	}

}
