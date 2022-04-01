package ejercicios;

public class Pag84Ej3_3ComprobarNumArgsConstanteSol {

	public static final int MAXIMO = 4;
	public static final int MAX_ARGS = 4;

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("• Longitud total de los argumentos : " + args.length);
		} else {
			if (args.length == MAXIMO) {
				System.out.println("○ Maximo numero total de argumentos es : " + MAXIMO);
			} else if (args.length > MAXIMO) {
				System.out.println("🔼 Superamos el total de argumentos : " + args.length);
			} else {
				System.out.println("🔽 Numero total de argumentos por debajo de su máxima cantidad : " + args.length);
			}
		}
	}

	/**
	 * Obtener el numero de argumentos desde la consola 
	 * 
	 * @param args
	 */
	private static void getSol(String[] args) {
		int numArgs = args.length;
		if (numArgs == 0) {
			System.err.println("No se han recibido argumentos");
		} else if (numArgs <= MAX_ARGS) {
			System.out.println("Se han recibido " + numArgs + " argumentos");
		} else {
			System.err.println("Se han recibido demasiados argumentos");
		}
	}
}
