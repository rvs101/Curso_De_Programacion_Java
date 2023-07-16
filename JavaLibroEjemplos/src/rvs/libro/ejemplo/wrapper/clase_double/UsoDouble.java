package rvs.libro.ejemplo.wrapper.clase_double;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase Concreta <br>
 * <br>
 * Comprobar si un valor es decimal o String y repetir hasta conseguir el
 * decimal
 * 
 * 9 jul 2023 - 21:01:24
 *
 * @author RVS
 *
 */
public class UsoDouble {

	/**
	 * 
	 * @return
	 */
	public static String getCadena() {
		String cadena = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce una cadena: ");
		try {
			cadena = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cadena;
	}

	/**
	 * Metodo de clase<br>
	 * <br>
	 * Comprobar si un valor es decimal o String y repetir hasta conseguir el
	 * decimal
	 * 
	 * @param valor
	 */
	public static void showDouble(String valor) {
		double decimal = 0;
		try {
// Esta sentencia de asignación produce la excepción : NumberFormatException
			decimal = Double.parseDouble(valor);
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			do {
				valor = getCadena();
				try {
					decimal = Double.parseDouble(valor);
					break; // Rompe el bucle
// Esta sentencia produce la excepción : NumberFormatException
				} catch (NumberFormatException e) {
					System.out.println(nfe.getMessage());
				}
			} while (true);
		}
		System.out.println("Decimal es : " + decimal);
	}

	public static void main(String[] args) {
		showDouble(getCadena());
	}
}
