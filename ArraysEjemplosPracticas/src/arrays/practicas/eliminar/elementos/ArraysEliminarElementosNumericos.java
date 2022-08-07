package arrays.practicas.eliminar.elementos;

/**	
 * 
 *
 * @author RVS
 *
 * @date 25 jul 2022 - 12:12:19
 *
 */
public class ArraysEliminarElementosNumericos {

	public static char[] showArray() {
		char[] c1 = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		char[] c2 = new char[c1.length - 1];

		for (int i = 0; i < c1.length; i++) {
			if (i < c2.length) {
				c2[i] = c1[i];
				if (c2[i] == '5') {
					c2[i] = c1[i + 1];
					if (c2[i] == c1[i + 1]) {
						c2[i] = c1[i + 1];
					}
				}
				if (c1[i] > '5') {
					c2[i] = c1[i + 1];
				}
			}
		}
		return c2;
	}

	public static void showArray2() {
		char[] c2 = showArray();
		for (int i = 0; i < c2.length; i++) {
			System.out.print(c2[i] + " ");
		}
	}

	public static void main(String[] args) {
		showArray2();
	}
}
