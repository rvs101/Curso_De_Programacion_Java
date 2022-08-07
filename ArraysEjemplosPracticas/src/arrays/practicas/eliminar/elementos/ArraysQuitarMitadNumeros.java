package arrays.practicas.eliminar.elementos;

/**
 * Funciona porque los numeros no se repiten
 *
 * @author RVS
 *
 * @date 2 ago 2022 - 14:26:45 
 *
 */
public class ArraysQuitarMitadNumeros {

	/**
	 * Array con los valores
	 */
	public static char[] c1 = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	/**
	 * Array para almacenar los elementos menos 1
	 */
	public static char[] c2 = new char[getArray1().length - 1];

	/**
	 * Devuelve un array de char enumerados
	 *
	 * @return c1
	 */
	public static char[] getArray1() {
		return c1;
	}
	
	public static char[] getArray2() {
		return c2;
	}

	/**
	 *
	 * @param c1
	 * @return
	 */
	public static char[] getChar(char[] c1) {
		
		int mitad = (c1.length / 2);

		for (int i = 0; i < c2.length; i++) {
			c2[i] = c1[i];
			if (c2[i] == c1[mitad]) {
				c2[i] = c1[i + 1];
			}

			if ((c1[i + 1] > (c1[mitad])) && (i < c2.length)) {
				c2[i] = c1[i + 1];
			}
		}
		return c2;
	}

	public static void showElementsArrays1(char [] caracteres) {
		System.out.println("Ver Arrays 1");
		for(int i = 0 ; i < caracteres.length; i++) {
			System.out.print(caracteres[i] + " ");
		}
	}
	
	public static void showElementsArrays2() {
		char [] caracter = getChar(getArray1());
		for(int i = 0 ; i < caracter.length; i++) {
			System.out.print(caracter[i] + " ");
		}
	}
	
	
	/**
	 * Ver contenido del array
	 */
	public static void showArray() {
		showElementsArrays1(getArray1());
		System.out.println("\nVer Arrays 2");
		showElementsArrays2();
	}

	public static void main(String[] args) {
		showArray();
	}
}
