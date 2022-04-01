package ejercicios;

/**
 * Imprimir todos los argumentos en mayuscula o minuscula Si son -5 caracteres
 * en MASYUSCULA Si son +5 caracteres en MINUSCULA
 * 
 * @author Robot
 *
 */
public class Pag108Ej4_1ImprimirArgumentosPosicionLibro {

	private static final int LIM = 5;

	public static void main(String[] args) {

		for (String s : args) {
			if (s.length() < LIM) {
				System.out.println(s.toUpperCase());
			} else {
				System.out.println(s.toLowerCase());
			}
		}

	}
}
