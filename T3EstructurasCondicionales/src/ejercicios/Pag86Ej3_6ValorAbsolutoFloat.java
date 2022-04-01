package ejercicios;

public class Pag86Ej3_6ValorAbsolutoFloat {

	public static void main(String[] args) {
		Pag86Ej3_6ValorAbsolutoFloat.getAbsolute(args);
		Pag86Ej3_6ValorAbsolutoFloat.getAbsolute2(args);

	}

	/**
	 * Solución 1º - Condicional if
	 * 
	 * @param arg
	 */
	private static void getAbsolute(String[] arg) {
		float value = Float.valueOf(arg[0]);
		if (value < 0) {
			value = -value;
		}
		System.out.println("Valor Absoluto : " + value);
	}

	/**
	 * Solución 2º - Operador Ternario
	 * 
	 * @param args
	 */
	private static void getAbsolute2(String[] args) {
		float value = Float.valueOf(args[0]);
		System.out.println("Valor Absoluto : " + (value < 0 ? -value : value));
	}
}
