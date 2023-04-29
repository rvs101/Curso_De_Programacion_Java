package t17.varargs.conceptos.ejemplos.chat.gtp;

/**
 * 
 * @author Roboto
 *
 */
public class VarargsEjemplo {

	/**
	 * Procedimiento de clase o estático <br>
	 * 
	 * Muestra una lista de elementos
	 * 
	 * @param numbers - int [] - Recibe una lista de numeros entero
	 */
	public static void printNumbers(int... numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		VarargsEjemplo.printNumbers(1, 2, 3);
		VarargsEjemplo.printNumbers(4, 5);
		VarargsEjemplo.printNumbers(6);

	}
}
