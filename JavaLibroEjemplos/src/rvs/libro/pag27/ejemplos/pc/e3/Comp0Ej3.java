package rvs.libro.pag27.ejemplos.pc.e3;

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
 * @author Julio César Duarte 12.
 * 
 * @version 2006.01.01 13.
 */
public class Comp0Ej3 {

	/**
	 * Ejercicio 3 : Dado el valor de los tres lados de un triangulo , calcular el
	 * perimetro
	 * 
	 */

	public static void main(String[] args) {

		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		int perimetro;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el primer lado del triangulo: ");
		
		try {
			lado1 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("Error imprevisto");
			System.exit(-1);
		}

		System.out.println("Ingrese el segundo lado del triangulo");

		try {
			lado2 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("el programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("Error imprevisto");
			System.exit(-1);
		}
		
		System.out.println("Ingrese el tercer lado del triangulo: ");
		
		try {
			lado3 = Integer.parseInt(br.readLine());
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("el programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("Error imprevisto");
			System.exit(-1);
		}
		
		perimetro = (lado1 + lado2 + lado3);
		
		System.out.println("El perimetro del triangulo es: " + perimetro);

	}
}
