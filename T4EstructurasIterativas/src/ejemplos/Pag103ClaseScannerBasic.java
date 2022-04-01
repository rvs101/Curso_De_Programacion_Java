package ejemplos;

import java.util.Scanner;

public class Pag103ClaseScannerBasic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		System.out.println("!Hola, " + nombre + "! ¿Qué tal?");
	}
}

