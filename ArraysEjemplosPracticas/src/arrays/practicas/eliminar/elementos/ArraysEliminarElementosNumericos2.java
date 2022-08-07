package arrays.practicas.eliminar.elementos;

/**
 * 
 *
 * @author RVS
 *
 * @date 25 jul 2022 - 12:12:19
 *
 */
public class ArraysEliminarElementosNumericos2 {

	public static char[] c1 = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	public static char[] c2 = new char[getArray().length - 1];

	/**
	 *
	 * @return
	 */
	public static char[] getArray() {
		return c1;
	}

	/**
	 *
	 * @param c1
	 * @return
	 */
	public static char[] getChar(char[] c1) {
		for (int i = 0; i < c2.length; i++) {
			c2[i] = c1[i];
			if (c2[i] == '5') {
				c2[i] = c1[i + 1];
			}
			if ((c1[i + 1] > '5') && (i < c2.length)) {
				c2[i] = c1[i + 1];
			}
		}
		return c2;
	}

	/**
	 *
	 */
	public static void showArray() {
		for (int i = 0; i < getChar(getArray()).length; i++) {
			System.out.print(c2[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		showArray();
	}
}
