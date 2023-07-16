
package rvs.libro.pag22.ejemplos.trycatch.basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * 30 jun 2023 - 19:35:08
 *
 * @author RVS
 *
 */
public class TryCatchEjemplo {

	public static void main(String[] args) {

		System.out.println("Inserta una letra : ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			br.readLine();
		} catch (IOException ex) {
			System.out.println(" Mensaje : " + ex.getMessage());
			ex.printStackTrace();
		}

	}
}
