package condicionales;

public class Pag74EjIfelse {

	public static void main(String[] args) {

		if (estaLloviendo()) {
			cogeElParaguas();
			ponteElChubasquero();
		} else {
			noEstaLloviendo();
		}

	}

	private static boolean estaLloviendo() {
		int lluvia = (int) (Math.random() * 10 + 1);
		boolean lloviendo = lluvia >= 5 ? true : false;
		String clima = lloviendo != false ? "si " : "no";
		System.out.println("○ Esta Lloviendo 💧 " + clima);
		System.out.println("----------------------------");
		return lloviendo;
	}

	private static void cogeElParaguas() {
		System.out.println("• Cojo el paraguas ☂ ");
	}

	private static void ponteElChubasquero() {
		System.out.println("• Me pongo el Chubasquero 🧥 ");
	}

	private static void noEstaLloviendo() {
		System.out.println("○ No esta Lloviendo ☀ ");
	}

}
