package rvs.libro.pag29.ejemplos.pc.e5;

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
 * @version 2006.01.01
 */
public class Comp0Ej5 {

	/**
	 * Ejercicio5: Se conocen dos números distintos.
	 * 
	 * Determinar si el primero de ellos es el mayor
	 * 
	 */

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introduce 1º numero ");
		try {
			numero1 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Tipo de Error : " + ioe.getMessage());
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Tipo de Error : " + e.getMessage());
			System.exit(-1);
		}

		System.out.println("Introduce 2º numero ");
		try {
			numero2 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Tipo de Error : " + ioe.getMessage());
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Tipo de Error : " + e.getMessage());
			System.exit(-1);
		}

		if (numero1 > numero2) {
			System.out.println("1º numero : " + numero1 + " es mayor que el 2º numero: " + numero2);
		} else if (numero2 > numero1) {
			System.out.println("2º numero : " + numero2 + " es mayor que el 1º numero: " + numero1);
		}

	}

}
