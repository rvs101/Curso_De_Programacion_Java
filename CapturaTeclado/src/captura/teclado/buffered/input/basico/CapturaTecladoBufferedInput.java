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
public class CapturaTecladoBufferedInput {

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static char getKeysChar() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return (char) br.read();
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static char getAnswer() throws IOException {
		char respuesta;
		System.out.println("• Deseas añadir una letra - pulsa 's' para continuar ");
		respuesta = getKeysChar();
		if (respuesta == 's') {
		} else {
			respuesta = 'n';
		}
		return respuesta;
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<Character> getLetters() throws IOException {
		int contador = 0;
		char respuesta;
		ArrayList<Character> lista = new ArrayList<Character>();
		do {
			if (contador == 0) {
				System.out.println("Introduce un caracter");
				lista.add(getKeysChar());
				respuesta = getAnswer();
			} else {
				System.out.println("Introduce un nuevo caracter");
				lista.add(getKeysChar());
				respuesta = getAnswer();
			}
			contador++;
		} while (respuesta == 's');
		return lista;
	}

	/**
	 * 
	 * @param lista
	 * @throws IOException
	 */
	public static void showLetters(ArrayList<Character> lista) throws IOException {
		int i = 0;
		for (Character c1 : lista) {
			System.out.println((i++) + " - Elementos añadidos : " + c1);
		}

	}

	public static void main(String[] args) throws IOException {
		showLetters(getLetters());
	}
}
