package rvs.libro.pag41.teoria.array.ejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* <p>Título: Aprendiendo Java</p>
* <p>Descripción: Ejemplos del Libro Aprendiendo Java de Compunauta</p>
* <p>Copyright: Copyright (c) 2006 www.compunauta.com</p>
* <p>Empresa: COMPUNAUTA</p>
* @author Gustavo Guillermo Pérez
* @version 2006.01.01
*/

/**
 * Clase representa un array que contiene las notas en valores decimales
 * 
 * 21 jul 2023 - 17:37:28
 *
 * @author RVS
 *
 */
public class Arreglos {

	/**
	 * Atributos de instancia <br>
	 * <br>
	 * Array de notas para almacenar numeros decimales
	 */
	private double[] notas = new double[3];

	/**
	 * Atributos de instancia <br>
	 * <br>
	 * Objeto de tipo BufferedReader para gestionar el metodo para capturar por
	 * teclado
	 */
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Atributo de instancia
	 * 
	 * @return br - Devuelve un objeto de tipo BufferedReader
	 */
	public BufferedReader getBr() {
		return br;
	}

	/**
	 * Procedimiento de instancia <br>
	 * <br>
	 * Recorre un array de 10 elementos para introducirle 10 valores decimales por
	 * teclado
	 * 
	 * @param double - array de notas
	 */
	public void setNotas() {
		for (int i = 0; i < getNotas().length; i++) {
			System.out.println("Introduce la nota " + (i + 1));
			getNotas()[i] = getValores();
		}
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - double - Devuelve el array de notas en decimal
	 */
	public double[] getNotas() {
		return notas;
	}

	/**
	 * Procedimiento de instancia <br>
	 * <br>
	 * Muestra todas las notas introducidas
	 */
	public void showNotas() {

		for (int i = 0; i < getNotas().length; i++) {
			System.out.println((i + 1) + " Notas : " + getNotas()[i]);
		}
		System.out.println("1º Nota : " + getNotas()[0] + " - Ultima Nota : " + getNotas()[1]);
	}

	/**
	 * Metodo de instancia <br>
	 * <br>
	 * Captura por teclado
	 * 
	 * @return - double - devuelve un valor decimal
	 */
	public double getValores() {
		double nota = 0;
		boolean activar = false;
		do {
			try {
				System.out.println("Introduce una nota entre 1 y 10 ");
				nota = Double.valueOf(getBr().readLine());

				if (nota < 0 || nota > 10) {
					System.out.println("Error - Introduce un valor entre 1 y 10");
					activar = true;
				} else {
					activar = false;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Error :  " + nfe.getMessage());
				activar = true;
			} catch (IOException ioe) {
				ioe.printStackTrace(System.err);
				System.out.println("Error : " + ioe.getMessage());
				System.exit(-1);
			} catch (Exception e) {
				e.printStackTrace(System.err);
				System.out.println("Error :  " + e.getMessage());
				System.exit(-1);
			}
		} while (activar);
		return nota;
	}

}
