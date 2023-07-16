package rvs.libro.pag24.ejercicios2_4.switchbasico.frases.solucion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * <p>
 * Título: Aprendiendo Java
 * </p>
 * <p>
 * Descripción: Ejemplos del Libro Aprendiendo Java de Compunauta
 * </p>
 * <p>
 * Copyright: Copyright (c) 2006 www.compunauta.com
 * </p>
 * <p>
 * Empresa: julioduarte@gmail.com
 * </p>
 * 
 * @author Julio César Duarte
 * 
 *         16 jul 2023 - 20:06:18
 *
 * @author RVS
 *
 */
public class Comp0Ej1 {

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 0;

		int resultado;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese el primero numero: ");
		try {
			numero1 = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.out.println("el programa se debe finalizar");
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
		
		resultado = numero1 + numero2;
		
		System.out.println("El resultado es : " + resultado);
	}

}
