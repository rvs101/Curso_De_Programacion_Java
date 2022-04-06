package ejemplos.metodos;

/**
 * 
 * @author Robot
 *
 */
public class Pag53EjemploSumaMas5 {

	public static void main(String[] args) {
		System.out.println("Suma total : " + sumaMas5(5, 10));
	}

	/**
	 * Metodo de clase 'static' que devuelve un numero entero
	 * 
	 * @param a
	 * @param b
	 * @return La suma de 2 parametros y una variable local
	 */
	private static int sumaMas5(int a, int b) {
		int c = 5; // variable local
		return a + b + c;
	}

}
