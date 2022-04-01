package ejercicios;

public class Pag84Ej3_2ComprobarNumArgsRecibeProgramaSol {

	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("😱 No se han recibido argumentos " + args.length);
		} else {
			if (args.length <= 4) {
				System.out.println(
						"👍 Se han recibido " + args.length + " \n ○ Longitud total de argumentos es inferores a 4 : ");
			} else {
				System.out.println("✌ Se han recibido " + args.length
						+ " \n • Son más de 4 argumentos los que has introducido : " + args.length);
			}
		}
		
		Pag84Ej3_2ComprobarNumArgsRecibeProgramaSol.getSol(args);
		
	}

	/**
	 * Muestra la longitud de los parametros pasados por consola
	 * 
	 * @param args
	 */
	private static void getSol(String[] args) {
		int numArgs = args.length;
		if (numArgs == 0) {
			System.err.println("No se han recibido argumento");
		} else if (numArgs <= 4) {
			System.out.println("Se han recibido " + numArgs + " argumentos");
		} else {
			System.err.println("Se han recibido demasiados argumentos");
		}
	}
}
