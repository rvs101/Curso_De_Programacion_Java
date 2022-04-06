package ejercicios;

public class Pag108Ej4_2ImprimirTodosArgsPosicionLibro {

	public static void main(String[] args) {

		setMiSolucion(args);
		System.out.println("");
		setSolucionLibro(args);

	}

	/**
	 * 
	 * @param args
	 */
	private static void setMiSolucion(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args.length < i) {
				String s = args[i];
				System.out.print("|" + i + " → " + s);
			} else {
				String s = args[i];
				System.out.print(i + " → " + s + "|");

			}
		}

		System.out.println("");

		int i = 0;
		for (String s : args) {
			if (args.length < i) {
				System.out.print("|" + i++ + " → " + s);
			} else {
				System.out.print(i++ + " → " + s + "|");
			}

		}
		System.out.println("");
	}

	private static void setSolucionLibro(String[] args) {
		int i = 0;
		for (String s : args) {
			System.out.println(i + ") " + s);
		}
	}
}
