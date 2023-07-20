package rvs.libro.pag31.ejemplos.pc.e6;

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
 * jul 2023-20:00:35
 * 
 * @author RVS
 *
 */
public class Comp0Ej6b {

	/**
	 * Ejercicio6: Se conocen dos números distintos. <br>
	 * <br>
	 * Calcular la superficie de un cuadrado, suponiendo como lado del mismo al
	 * mayor de los números dados <br>
	 * <br>
	 * La superficie de "n" círculo suponiendo como radio del mismo al menor de los
	 * números dados.
	 */

	public static void main(String[] args) {

		int lado1 = 0;
		int lado2 = 0;
		
		int mayor = 0;
		int menor = 0;
		
		int cuadrado = 0;
		double circulo = 0;

		System.out.println("⬜ Superficie del cuadrado");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese el primero numero: ");
		try {
			lado1 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("Error : " + ioe.getMessage());
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("Error : " + e.getMessage());
			System.exit(-1);
		}

		System.out.println("Ingrese el segundo numero: ");
		try {
			lado2 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("Error : " + ioe.getMessage());
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("Error : " + e.getMessage());
			System.exit(-1);
		}

		if (lado1 > lado2) {
			mayor = lado1;
			menor = lado2;
		} else {
			mayor = lado2;
			menor = lado1;
		}
		
		cuadrado = (mayor * menor);
		circulo = Math.PI * menor * menor;
		
		System.out.println("La superficie del cuadrado es : " + cuadrado);
		System.out.println("La superficie del circulo es : " + circulo);
	}

}
