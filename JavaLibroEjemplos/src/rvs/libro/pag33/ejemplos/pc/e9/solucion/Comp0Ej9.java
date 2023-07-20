package rvs.libro.pag33.ejemplos.pc.e9.solucion;

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
 * Clase Completo
 * 
 * 19 jul 2023 - 20:00:32
 *
 * @author RVS
 *
 */
public class Comp0Ej9 {

	/**
	 * Ejercicio9: <br>
	 * <br>
	 * Un comerciante tiene la venta de 4 tipos de productos principales <br>
	 * <br>
	 * Conociendo la cantidad vendida de cada artículo, y el precio unitario de cada
	 * artículo, hacer un programa que determine cuál fue el producto que realizó el
	 * mayor aporte en los ingresos. <br>
	 * <br>
	 * Calcular además, el porcentaje que dicho aporte significa en el ingreso
	 * absoluto por los cuatro artículos sumados.
	 */

	public static void main(String[] args) {

		String buf = new String("");
		
		float precio1 = 0;
		float precio2 = 0;
		float precio3 = 0;
		float precio4 = 0;
		
		int cantidad1 = 0;
		int cantidad2 = 0;
		int cantidad3 = 0;
		int cantidad4 = 0;
		
		float aporte1 = 0;
		float aporte2 = 0;
		float aporte3 = 0;
		float aporte4 = 0;
		
		float aportetotal = 0;
		float mayor = 0;
		int id = 0;
		float porcentaje = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese el precio producto 1: ");
		try {
			precio1 = Float.valueOf(br.readLine()).floatValue();
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		}

		System.out.println("Ingrese el precio producto 2: ");
		try {
			precio2 = Float.valueOf(br.readLine()).floatValue();
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		}

		System.out.println("Ingrese el precio producto 3: ");
		try {
			precio3 = Float.valueOf(br.readLine()).floatValue();
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		}

		System.out.println("Ingrese el precio producto 4: ");
		try {
			precio4 = Float.valueOf(br.readLine()).floatValue();
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.out.println("El programa se debe finalizar");
			System.exit(-1);
		}

		aporte1 = precio1 * cantidad1;
		aporte2 = precio2 * cantidad2;
		aporte3 = precio3 * cantidad3;
		aporte4 = precio4 * cantidad4;

		aportetotal = (aporte1 + aporte2 + aporte3 + aporte4);

		if (aporte1 > aporte2) {
			mayor = aporte1;
			id = 1;
		} else {
			mayor = aporte2;
			id = 2;
		}

		if (mayor < aporte3) {
			mayor = aporte3;
			id = 3;
		}

		if (mayor < aporte4) {
			mayor = aporte4;
			id = 4;
		}

		porcentaje = ((mayor / aportetotal) * 100);

		System.out.println("El producto " + id + " fue el que más aporto con : " + mayor);

		System.out.println("El porcentaje de aporte sobre el total es de : " + porcentaje + "%");

	}

}
