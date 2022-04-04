package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Robot
 *
 */
public class Pag109Ej4_6EjConseguirRespuestaUsuario {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			String palabra = null;
			do {
				System.out.println("!Hola! , por favor , escribe 'abracadabra': ");
				palabra = scan.nextLine();
			} while (!palabra.equals("abracadabra"));
		} catch (InputMismatchException ime) {
			System.out.println("El valor no coincide con el tipo de dato que recoge Scanner : " + ime.getMessage());
		} catch (Exception e) {
			System.out.println("Excepcion de caracter general : " + e.getMessage());
		}
		System.out.println("⚠ Fin de la ejecución");
	}
}
