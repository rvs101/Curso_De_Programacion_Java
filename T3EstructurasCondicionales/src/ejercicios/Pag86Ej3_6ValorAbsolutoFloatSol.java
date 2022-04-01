package ejercicios;

public class Pag86Ej3_6ValorAbsolutoFloatSol {

	public static void main(String[] args) {

		float num = Float.valueOf(args[0]);
		float abs = num > 0 ? num : -num;
		System.out.println("El valor absoluto de " + num + " es " + abs);
	}

	private static void getAbsolute(String[] arg) {

	}
}
