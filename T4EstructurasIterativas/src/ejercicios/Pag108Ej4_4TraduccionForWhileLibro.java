package ejercicios;

public class Pag108Ej4_4TraduccionForWhileLibro {

	public static void main(String[] args) {

		if (args.length == 1) {
			int num = Integer.valueOf(args[0]);
			int res = 1;
			while (num > 0) {
				res *= num;
				num--;
			}
			System.out.println("Resultado: " + res);
		} else {
			System.err.println("Necesito un argumentos , ni más ni menos");
		}

	}
}
