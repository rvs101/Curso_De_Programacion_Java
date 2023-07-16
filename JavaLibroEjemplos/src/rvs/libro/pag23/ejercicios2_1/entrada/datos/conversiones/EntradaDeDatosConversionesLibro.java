package rvs.libro.pag23.ejercicios2_1.entrada.datos.conversiones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
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
 * Empresa: COMPUNAUTA
 * </p>
 * 
 * @version 2006.01.01 10.
 *
 * @version 1 - 30 jun 2023 - 20:38:19
 *
 * @author Gustavo Guillermo Pérez 9.
 * 
 * @author RVS
 *
 */
public class EntradaDeDatosConversionesLibro {

	public static void main(String[] args) {
		Cap2Ej1.execProgram();
	}
}

class Cap2Ej1 {

	public static void execProgram() {
// Definimos el objeto 'br' para leer lineas de la entrada
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// Definimos variables nombre , edad y categoria dandole valores por defecto
		String nombre = "";
		int edad = 0;
		char categoria = 'A';
// Iniciamos el bloque que podrá producir errores
		try {
			System.out.println("Nombre:?");
			nombre = br.readLine();

			System.out.println("Edad:?");
			edad = Integer.parseInt(br.readLine());
// Capturamos calquier excepción que se pueda producir y la reportamos
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
			System.exit(-1);
		}
// Como por defecto la categoría es 'A' , revisamos si aumentamos a B o C
		if (edad > 25) {
			categoria = 'B';
		}
		if (edad > 50) {
			categoria = 'C';
		}
// Imprimimos en pantalla la respuesta solicitada
		edad += 10;
		System.out.println(
				"El usuario " + nombre + " de categoria " + categoria + " en una década tendrá " + edad + " años");
		System.exit(0);
	} // final de main
}
