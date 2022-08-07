package arrays.practicas.eliminar.elementos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * PENDIENTE - arreglar metodo eliminaLetra
 *
 * @author RVS
 *
 * @date 27 jul 2022 - 11:44:21
 *
 */
public class ArrayElementoDelCentroRepasar {

	/**
	 * Array con los valores
	 */
//	public static char[] c1 = { 'd', 'a', 'd', 'd', 'o', 's' };
	public static char[] c1 = { 'c', 'a', 'c', 'h', 'a', 'r', 'r', 'o', 's' };
//	public static char[] c1 = { 'c', 'a', 'r', 'a', 'm', 'e', 'l', 'o', 's' };
//	public static char[] c1 = { 's', 'a', 'b', 'a', 'd', 'o' };

	/**
	 * Array para almacenar los elementos menos 1
	 */
	public static char[] c2 = new char[(c1.length - 1)];

	/**
	 * Devuelve un array de char enumerados
	 *
	 * @return c1
	 */
	public static char[] getArray() {
		return c1;
	}

	/**
	 * Captura un solo caracter de teclado
	 * 
	 * @return
	 * @throws IOException
	 */
	public static char getKeys() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return (char) br.read();
	}

	/**
	 * Devuelve un caracter para continuar o no
	 * 
	 * @return
	 * @throws IOException
	 */
	public static char getAnswer() throws IOException {
		char respuesta;
		System.out.println("• Deseas añadir una letra - pulsa 's' para continuar o 'n' para salir ");
		respuesta = getKeys();
		return respuesta;
	}

	/**
	 * Añade un caracter al array de char
	 * 
	 * @return
	 * @throws IOException
	 */
	public static char[] getListCharacter() throws IOException {
		int contador = 0;
		char answer;
		do {
			System.out.println("Introduce una letra : ");
			char c = getKeys();
			answer = getAnswer();
			c1[contador++] = c;
		} while (answer == 's');
		return c1;
	}

	/**
	 * Quita el char que se encuentre en la mitad del array
	 *
	 * @param c1
	 * @return
	 */
	public static char[] eliminaLetra(char[] c1) {
//		      3   =      6      / 2
		int mitad = (c1.length / 2);
//                               5
		for (int i = 0; i < c2.length; i++) {
			c2[i] = c1[i];
//c1    	 0    1    2    3    4    5
//			's', 'a', 'b', 'a', 'd', 'o' 
//c2		 0    1    2    3    4    
//			's', 'a', 'b', 'a', 'd' 
//	                4         3
			if ((c1[i] >= c1[mitad]) && (i < c2.length)) {
				if (c1[mitad - 1] == c2[mitad - 1]) {
					c2[i] = c1[i + 1];
				}
			}
		}

		for (int i = 0; i < c1.length; i++) {
			System.out.print(c1[i] + " ");
		}

		System.out.println("");

		for (int i = 0; i < c2.length; i++) {
			System.out.print(c2[i] + " ");
		}

		return c2;
	}

	/**
	 * 
	 * @throws IOException
	 */
	public static char[] obtieneArraySinUnaLetra() throws IOException {
		return eliminaLetra(c1);
	}

	/**
	 * 
	 * @throws IOException
	 */
	public static void verTodosLosArrays() throws IOException {

		System.out.println("Valores Modificados");
		for (Character caracter : eliminaLetra(getArray())) {
			System.out.print(caracter + " ");
		}
	}

	public static void main(String[] args) throws IOException {
//		verTodosLosArrays();

		eliminaLetra(getArray());
	}
}
