package ejercicios;

/**
 * 
 * @author Robot
 *
 */
public class Pag109Ej4_5EncontrarPalabrasLargasEntreArgsLibro {

	private static final int LIM = 10;

	public static void main(String[] args) {

		int i = 0;
		boolean encontrada = false;
		while (i < args.length && !encontrada) {
			encontrada = args[i].length() > LIM;
			i++;
		}
		if (encontrada) {
			System.out.println("La " + i + "º palabra es demasiada larga");
		} else {
			System.out.println("Toda las palabras son correctas.");
		}
	}
}
