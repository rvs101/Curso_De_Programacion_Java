package ejercicios;

public class Pag108Ej4_3ListarArgsVariasVeces {

	public static void main(String[] args) {

		setVerPalabras(args);
	}

	public static void setVerPalabras(String[] args) {
		
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
}
