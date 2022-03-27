package condicionales;

public class Pag76EjIfelseUnaLinea {

	public static void main(String[] args) {
		if (haceFrio())
			ponerCalefaccion();
		abrigarse();

	}

	private static boolean haceFrio() {
		return ((int) (Math.random() * 11 + 1)) >= 5 ? true : false;
	}

	private static void ponerCalefaccion() {
		boolean haceFrio = haceFrio();
		if (haceFrio) {
			System.out.println(" ♨ Calefacción encendida");
		} else {
			System.out.println(" ❄ Calefacción apagada");
		}
	}

	private static void abrigarse() {
		System.out.println("🧥 Abrigates");
	}

}
