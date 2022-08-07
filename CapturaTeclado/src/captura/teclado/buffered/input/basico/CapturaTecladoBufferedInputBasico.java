package captura.teclado.buffered.input.basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 *
 * @author RVS
 *
 * @date 27 jul 2022 - 19:00:12
 *
 */
public class CapturaTecladoBufferedInputBasico {

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static char getKeysChar() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Añade una letra: ");
		return (char) br.read();
	}

	/**
	 * 
	 * @return
	 */
	public static char showLetters() {
		char character = ' ';
		try {
			System.out.println("Lanzar caracteres");
			character = getKeysChar();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return character;
	}

	public static void main(String[] args) {
		System.out.println("Caracter: " + showLetters());
	}

}
