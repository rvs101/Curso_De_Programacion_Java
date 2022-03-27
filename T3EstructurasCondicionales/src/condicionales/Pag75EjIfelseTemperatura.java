package condicionales;

/**
 * 
 * @author Robot
 *
 */
public class Pag75EjIfelseTemperatura {

	public static void main(String[] args) {
		setTemperatura(getTemperatura());
	}

	/**
	 * 
	 * @return
	 */
	private static double getTemperatura() {
		return (double) (Math.random() * 28 + 1 + -12);
	}

	/**
	 * 
	 * @param temperatura
	 */
	private static void setTemperatura(double temperatura) {
		if (temperatura > 0.0) {
			System.out.printf("• La temperatura actual es de : %.2f", temperatura);
			System.out.print(" ℃ - ☀");
		} else {
			System.out.printf("• La temperatura actual es de : %.2f", temperatura);
			System.out.print(" ℃ - ❄");
			if (temperatura == 0.0) {
				System.out.printf("• La temperatura actual es de : %.2f", temperatura);
				System.out.print(" ℃ - Cero Absoluto ");
			}
		}
	}
}
