package ejercicios;

public class Pag108Ej4_4TraduccionForWhile {

	public static void main(String[] args) {

		getNumeroFor(args);
		System.out.println("-----------");
		getNumeroWhile(args);

	}

	/**
	 * 
	 * @param args
	 */
	private static void getNumeroFor(String[] args) {
		if (args.length == 1) {
			int res = 1;
			for (int num = Integer.valueOf(args[0]); num > 0; num--) {
				res *= num;
			}
			System.out.println("Resultado: " + res);
		} else {
			System.err.println("Necesito un argumento, ni más ni menos");
		}
	}

	/**
	 * 
	 * @param args
	 */
	private static void getNumeroWhile(String[] args) {
		if (args.length == 1) {
			int res = 1;
			int num = Integer.valueOf(args[0]);
			while (num > 0) {
				res *= num;
				num--;
			}
			System.out.println("Resultado: " + res);
		} else {
			System.err.println("Necesito un argumento, ni más ni menos");
		}
	}
}
