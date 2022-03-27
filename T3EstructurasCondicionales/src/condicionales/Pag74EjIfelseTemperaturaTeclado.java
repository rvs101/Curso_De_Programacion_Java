package condicionales;

/**
 * 
 * @author Robot
 *
 */
public class Pag74EjIfelseTemperaturaTeclado {

	public static void main(String[] args) {
		setTemperatura(args[0]);
	}

	/**
	 * 
	 * @param temperatura
	 */
	private static void setTemperatura(String cadena) {
		double valor = Double.valueOf(cadena);
		if (valor >= 0) {
			System.out.printf("• La temperatura actual es de : %.2f", valor);
			System.out.print("º Centigrados  - ☀");
		} else {
			System.out.printf("• La temperatura actual es de : %.2f", valor);
			System.out.print("º Centigrados - ❄");
		}
	}
}
