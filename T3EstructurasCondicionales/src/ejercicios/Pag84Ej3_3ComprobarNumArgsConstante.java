package ejercicios;

public class Pag84Ej3_3ComprobarNumArgsConstante {

	public static final int MAXIMO = 4;

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("• Longitud total de los argumentos : " + args.length);
		} else {
			if (args.length == MAXIMO) {
				System.out.println("○ Maximo numero total de argumentos es : " + MAXIMO);
			} else if (args.length >= MAXIMO) {
				System.out.println("🔼 Numero total de argumentos : " + args.length);
			}else {
				System.out.println("🔽 Numero total de argumentos : " + args.length);
			}
		}
	}
}
