package ejercicios;

public class Pag108Ej4_3ListarArgsVariasVeces {

	public static void main(String[] args) {

//		setVerPalabras(args);
		setVerPalabrasMejorado(args);
	}

	/**
	 * 
	 * @param args
	 */
	public static void setVerPalabras(String[] args) {
		System.out.println(" ⚠ Metodo estandar");
		System.out.println("----------------");
		for (int j = 0; j < args.length; j++) {
			if (args[j].length() < 5) {
				for (int x = 0; x < 5; x++) {
					System.out.print(args[j] + " ");
				}
				System.out.println("");
			}
		}

		System.out.println("----------------");
		for (int i = 0; i < args.length; i++) {
			if (args[i].length() >= 5) {
				for (int xx = 0; xx < 2; xx++) {
					System.out.print(args[i] + " ");
				}
				System.out.println("");
			}
		}
		System.out.println("----------------");
	}

	/**
	 * 
	 * @param args
	 */
	public static void setVerPalabrasMejorado(String[] args) {
		System.out.println(" ✅ Metodo mejorado ");
		System.out.println("----------------");
		for (String v : args) {
			if (v.length() < 5) {
				for (int i = 0; i < 5; i++) {
					System.out.println(v + " ");
				}
			} else {
				for (int i = 0; i < 2; i++) {
					System.out.println(v + " ");
				}
			}
		}
		System.out.println("----------------");
	}
}
