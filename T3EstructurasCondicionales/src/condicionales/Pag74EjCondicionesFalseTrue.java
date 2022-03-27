package condicionales;

public class Pag74EjCondicionesFalseTrue {

	public static void main(String[] args) {

		int a = Pag74EjCondicionesFalseTrue.getA();
		int b = getB();
		int c = Pag74EjCondicionesFalseTrue.getC();
		int d = getD();

		boolean mytrue = true;
		boolean condicion1 = a > 0;
		System.out.println("• Variable normal : " + mytrue);
		System.out.println("• Valor condición 1 : " + condicion1);
		boolean condicion2 = b < a && (c * d > b || c + d < a);
		System.out.println("• Valor condición 2 : " + condicion2);
	}

	private static int getA() {
		int numA = (int) (Math.random() * 10 + 1);
		System.out.println(" 🎲 " + numA);
		return numA;
	}

	private static int getB() {
		int numB = (int) (Math.random() * 10 + 1);
		System.out.println(" 🎲 " + numB);
		return numB;
	}

	private static int getC() {
		int numC = (int) (Math.random() * 10 + 1);
		System.out.println(" 🎲 " + numC);
		return numC;
	}

	private static int getD() {
		int numD = (int) (Math.random() * 10 + 1);
		System.out.println(" 🎲 " + numD);
		return numD;
	}

}
