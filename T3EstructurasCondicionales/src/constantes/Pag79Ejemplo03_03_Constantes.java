package constantes;

public class Pag79Ejemplo03_03_Constantes {

	private static final int TEMP_FRIO = 15;

	public static void main(String[] args) {
		int temp = Integer.valueOf(args[0]);
		if (haceFrio(temp)) {
			ponerCalefaccion();
			abrigarse();
		}
	}

	private static boolean haceFrio(int temp) {
		return temp <= TEMP_FRIO;
	}

	private static void ponerCalefaccion() {
		System.out.println("Calefaccion a tope !!");
	}

	private static void abrigarse() {
		System.out.println("¿ Donde esta la batamanta ? ");
	}
}
