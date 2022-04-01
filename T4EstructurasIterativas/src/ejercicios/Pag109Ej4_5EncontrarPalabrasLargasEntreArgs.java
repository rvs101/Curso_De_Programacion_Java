package ejercicios;

/**
 * 
 * @author Robot
 *
 */
public class Pag109Ej4_5EncontrarPalabrasLargasEntreArgs {

	public static void main(String[] args) {
		getPalabrasIncorrectas(args);

	}

	/**
	 * Obtener las palabras
	 *  
	 * @param palabras
	 */
	public static void getPalabrasIncorrectas(String[] palabras) {
		int i = 0;
		while (i < palabras.length) {
			if (9 < palabras[i].length()) {
				int j = i;
				System.out.println("La " + (++j) + "º palabra " + palabras[i] + " es demasiada larga");
			} else {
				System.out.println("Todas las palabras son correctas");
			}
			i++;
		}
	}
}
