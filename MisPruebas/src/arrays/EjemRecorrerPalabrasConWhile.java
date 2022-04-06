package arrays;

public class EjemRecorrerPalabrasConWhile {

	public static void main(String[] args) {

		getPalabrasIncorrectas(args);
 
	}

	public static void getPalabrasIncorrectas(String[] palabras) {
		int i = 0;
		while (i < palabras.length) {
			if (palabras[i].length() > 9) {
				System.out.println("La " + i + "º palabra " + palabras[i] + " es demasiada larga");
			} else {
				System.out.println("Todas las palabras son correctas");
			}
			i++;
		}
	}
}
