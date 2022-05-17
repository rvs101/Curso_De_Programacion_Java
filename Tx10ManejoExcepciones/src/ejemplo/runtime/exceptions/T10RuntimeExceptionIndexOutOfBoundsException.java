package ejemplo.runtime.exceptions;

/**
 * Indice fuera del limites de 'Exceptions'
 * 
 * Si no los esta diciendo : esta se produce cuando , una serie de elementes ,
 * intentamos acceder a una posición que no existe
 * 
 * @author RVS
 * @time 17 may 2022 - 20:58:30
 *
 */
public class T10RuntimeExceptionIndexOutOfBoundsException {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
//		int num = a[7]; // java.lang.ArrayIndexOutOfBoundsException:
//		System.out.println(num); 
		
		
		String s = "Hola!";
//		char c = s.charAt(9); // java.lang.StringIndexOutOfBoundsException:
//		System.out.println(c);
		

	}
}
