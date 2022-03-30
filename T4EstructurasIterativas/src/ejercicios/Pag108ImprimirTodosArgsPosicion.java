package ejercicios;

public class Pag108ImprimirTodosArgsPosicion {

	private static final String FIN = "fin";

	public static void main(String[] args) {

		String palabra = "";

		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(i + ") " + args[i]);
				if (args[i] == "fin") {
					palabra = args[i];
				}
			}
		} else {
			System.out.println("No hay argumentos enviados : " + args.length);
		}

	}
}
