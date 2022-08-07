package captura.teclado.buffered.input.basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 
 *
 * @author RVS
 *
 * @date 27 jul 2022 - 13:54:04
 *
 */
public class CapturaTecladoBufferedInputLetras {

	/**
	 * 
	 */
	public static void getKeysNumber() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			System.out.print("Sumando 1 : ");
			int s1 = Integer.parseInt(br.readLine());
			System.out.print("Sumando 2 : ");
			int s2 = Integer.parseInt(br.readLine());
			int suma = s1 + s2;
			System.out.println("La suma es " + s1 + "+" + s2 + "=" + suma);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) throws IOException {
		getKeysNumber();
	}
}
