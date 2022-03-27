
public class Pag74EjIf {

	public static void main(String[] args) {

		if (estaLloviendo()) {
			cogeElParaguas();
			ponteElChubasquero();
		}
	}

	private static void cogeElParaguas() {
		
		System.out.println("Cojo el paraguas ☂");
	}

	private static void ponteElChubasquero() {
		System.out.println("Me pongo el Chubasquero 🧥");
	}

	private static boolean estaLloviendo() {
		System.out.println("Esta Lluviendo 💧");
		return true;
	}

}
