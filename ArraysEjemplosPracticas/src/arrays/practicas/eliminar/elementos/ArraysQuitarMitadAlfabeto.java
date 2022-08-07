package arrays.practicas.eliminar.elementos;

/**
 * Funciona porque las palabras no se repiten
 *
 * @author RVS
 *
 * @date 2 ago 2022 - 14:26:30 
 *
 */
public class ArraysQuitarMitadAlfabeto {

	/**
	 * Array con los valores
	 */
	public static char[] caracteres1 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

	/**
	 * Array para almacenar los elementos menos 1
	 */
	public static char[] caracteres2 = new char[getCaracteres1().length - 1];

	/**
	 * Devuelve un array de char enumerados
	 *
	 * @return c1
	 */
	public static char[] getCaracteres1() {
		return caracteres1;
	}

	/**
	 * Devuelve un array de char enumerados
	 * 
	 * @return
	 */
	public static char[] getCaracteres2() {
		return caracteres2;
	}

	/**
	 *
	 * @param c1
	 * @return
	 */
	public static char[] getChar(char[] c1) {

		int mitad = (c1.length / 2);

		for (int i = 0; i < caracteres2.length; i++) {
			caracteres2[i] = c1[i];
			if (caracteres2[i] == c1[mitad]) {
				caracteres2[i] = c1[i + 1];
			}

			if ((c1[i + 1] > (c1[mitad])) && (i < caracteres2.length)) {
				caracteres2[i] = c1[i + 1];
			}
		}
		return caracteres2;
	}

	/**
	 * 
	 * @param array
	 */
	public static void showArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Ver contenido del array
	 */
	public static void showArrayModified() {
		System.out.println("Array Original : ");
		showArray(getCaracteres1());
		System.out.println("Array Modificado : ");
		showArray(getChar(caracteres1));
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		showArrayModified();
	}
}
