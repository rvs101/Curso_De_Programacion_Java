package rvs.libro.pag24.ejercicios2_3.puntuaciones.examenes.solucion;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

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
 * @author Gustavo Guillermo Pérez
 * @version 2006.01.01
 */
public class Cap2Ej3 {

	public static void main(String[] args) {
		// Definimos el objeto br para leer líneas de la entrada
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Definimos variables nombre, error y acumulador dándole valores por defecto
		String nombre = "";
		float acumulator = 0;
		boolean error;
		// Iniciamos el bloque que podrá producir errores, sólo para el nombre
		try {
			System.out.println("Nombre:?");
//		 Leer una linea de código			
			nombre = br.readLine();
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
		}
//		Iniciamos una iteración entre 0 y 9
		for (int i = 0; i < 10; i++) {
			error = false;
//		Iniciamos el bloque do{} while(); que se repetirá en caso de error
			do {
				error = false;
//		Iniciamos el bloque try que podra dar error de conversion numérica		
				try {
//		Ponemos i+1 entre () , caso contrario se concatenarán como texto
					System.out.println("Examen " + (i + 1) + "? ");
					acumulator += Float.parseFloat(br.readLine());
// 🛑 Se utiliza la clase "NumberFormatException" para controlar el error
//    cuando que no mete un numero sino una letra o un espacio vacio					
				} catch (NumberFormatException ex) {
//	    En caso de introducir mal un valor del tipo que sea me lo vuelve a pedir
					System.out.println("Error , ingresar de nuevo");
//	    Se vuelve a ejecutar el metodo
					error = true;
				} catch (IOException ex) {
					ex.printStackTrace();
					System.exit(-1); // indicar el programa terminó con error
				}
			} while (error); // true - continua | false - finaliza
		}
//		Tenemos	 lista la suma parcial y calculamos su promedio
		acumulator /= 10;
//		Redondeamos el resultado a dos digitos
		acumulator = (float) (Math.round(acumulator * 100) / 100);
		System.out.println(nombre + ", tu promedio es de: " + acumulator);
		System.exit(0); // indicar el programa terminó sin error
	}
}
