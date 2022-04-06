package ejercicios;

import java.util.Scanner;

/**
 * 
 * @author Robot
 *
 */
public class Pag117Ej4_6EjConseguirRespuestaUsuarioLibro {

	private static final String CLAVE = "fin";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String palabra;
		do {
			System.out.println("!Hola!, por favor , escribe '" + CLAVE + "':");
			palabra = scanner.nextLine();
		} while (!palabra.equals(CLAVE));

		System.out.println("TU: " + palabra);
		System.out.println("YO: pata de cabra !");
	}
}
