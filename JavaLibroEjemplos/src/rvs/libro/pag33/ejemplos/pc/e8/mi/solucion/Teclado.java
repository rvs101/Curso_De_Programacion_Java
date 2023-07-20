package rvs.libro.pag33.ejemplos.pc.e8.mi.solucion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase Concreta : Teclado <br>
 * <br>
 * Captura por teclado
 * 
 * 18 jul 2023 - 22:57:46
 *
 * @author RVS
 *
 */
public class Teclado {

	/**
	 * Atributo de Instancia
	 */
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Atributo de clase
	 */
	private static int veces = 0;

	/**
	 * Metodo de Clase
	 * 
	 * @return - int - obtenemos el numero de veces
	 */
	public static int getVeces() {
		return ++veces;
	}

	/**
	 * Atributo de instancia <br>
	 * <br>
	 * Obtenemos el nombre del alumno <br>
	 * <br>
	 * 
	 * @return - String - nombre del alumno
	 */
	public String getNombre() {
		String nombre = null;
		try {
			System.out.println("Nombre del alumno " + getVeces() + " : ");
			nombre = br.readLine();
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.exit(-1);
		}
		return nombre;
	}

	/**
	 * Metodo de Instancia <br>
	 * <br>
	 * 
	 * Obtengo un decimal entre 1 y 10<br>
	 * <br>
	 * En caso de valor incorrecto me vuelve a pedir que introduzca un valor entre 1
	 * y 10
	 * 
	 * @return - int - valor entero
	 */
	public double getNota() {

		double numeroDecimal = 0;

		boolean aceptar = false;
		do {
			try {
				System.out.println("Introduce una nota de clase entre 1 y 10");
				
				numeroDecimal = Double.parseDouble(br.readLine());
				
				if (numeroDecimal < 0 || numeroDecimal > 10) {
					System.out.println("Error - Introduce un valor entre 1 y 10");
					aceptar = true;
				} else {
					aceptar = false;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Error : " + nfe.getMessage());
				aceptar = true;
			} catch (IOException ioe) {
				ioe.printStackTrace(System.err);
				System.out.println("Error : " + ioe.getMessage());
				System.exit(-1);
			} catch (Exception e) {
				e.printStackTrace(System.err);
				System.out.println("Error : " + e.getMessage());
				System.exit(-1);
			}
		} while (aceptar);
		return numeroDecimal;
	}
}
