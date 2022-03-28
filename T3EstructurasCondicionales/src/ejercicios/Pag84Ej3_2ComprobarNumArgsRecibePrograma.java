package ejercicios;

public class Pag84Ej3_2ComprobarNumArgsRecibePrograma {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("😱 No se han recibido argumentos " + args.length);
		} else {
			if (args.length <= 4) {
				System.out.println(
						"👍 Se han recibido " + args.length + " Longitud total de argumentos son inferores a 4 : ");
			} else {
				System.out.println("✌ Se han recibido " + args.length
						+ " Son más de 4 argumentos los que has introducido : " + args.length);
			}
		}
	}
}
