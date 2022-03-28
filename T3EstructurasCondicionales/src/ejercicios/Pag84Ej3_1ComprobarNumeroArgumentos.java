package ejercicios;

public class Pag84Ej3_1ComprobarNumeroArgumentos {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("○ No se han recibido argumentos 😱 " + args.length);
		} else {
			System.out.println("• Longitud total de argumentos son 👍 : " + args.length);
		}

		System.out.println(args.length == 0 ? "○ No se han recibido argumentos 😱  : " + args.length
				: "• Longitud total de argumentos son 👍 : " + args.length);
	}


}
