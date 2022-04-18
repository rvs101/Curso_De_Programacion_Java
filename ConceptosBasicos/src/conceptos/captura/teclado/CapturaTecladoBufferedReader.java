package conceptos.captura.teclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapturaTecladoBufferedReader {

	private static BufferedReader br = null;
	private static String x;
	
	public static void main (String[] args) {

		System.out.println("Introduce un valor : ");
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			x = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Mensaje de error : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Valor : " + x);
	}
}
