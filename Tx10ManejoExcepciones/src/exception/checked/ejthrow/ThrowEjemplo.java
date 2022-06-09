package exception.checked.ejthrow;

/**
 * 
 * @author RVS
 * @time 19 may 2022 - 14:56:22
 *
 */
public class ThrowEjemplo {

	private static int a;
	private static int b;

	public ThrowEjemplo() {
		ThrowEjemplo.a = 0;
		ThrowEjemplo.b = 0;
	}

	public static boolean obtenerValor(int a, int b) {
		boolean v = (a / b == 0);
		return v;
	}

	public static void main(String[] args) {

		if (obtenerValor(0, 3)) {
//			Runtime Exception
			throw new ArithmeticException("\n○ No puedes dividir " + a + " " + b);
		} else {
			System.out.println("• Si puedes");
		}
	}
}
