package rvs.libro.pag24.ejercicios2_4.switchbasico.frases.solucion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Logger;

/**
 * Clase Concreta : Captura de Teclado <br>
 * <br>
 * Clase que captura por teclado todos los elementos que le pasemos
 * 
 * 15 jul 2023 - 22:24:01
 *
 * @author RVS
 *
 */
public class FrasesCapturaTeclado {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Atributo de Instancia
	 * 
	 */
	private int numero = 0;

	public String getCaptura() {
		String cadena = null;
		try {
			cadena = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cadena;
	}

	/**
	 * Metodo de Instancia <br>
	 * <br>
	 * Captura por teclado un numero entre 1 y 10
	 * 
	 * @return - int - Numero entre 1 y 10
	 */
	public int getCapturaNumero() throws IOException {

		boolean correcto = false;

		do {
			try {
				System.out.println("Introduce un valor entre 1 y 10");
				numero = Integer.parseInt(getCaptura());
				if ((numero < 0) || (numero > 10)) {
					correcto = true;
				} else {
					correcto = false;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Error : " + nfe.getMessage());
				correcto = true;
			}
		} while (correcto);
		System.out.println("Numero Introducido : " + numero);
		return numero;
	}

}
