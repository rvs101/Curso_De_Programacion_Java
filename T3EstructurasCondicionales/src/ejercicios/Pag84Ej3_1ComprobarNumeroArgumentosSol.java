package ejercicios;

public class Pag84Ej3_1ComprobarNumeroArgumentosSol {

	public static void main(String[] args) {

		int numArgs = args.length;
		if (numArgs == 0) {
			System.err.println("No se han recibido argumento");
		} else {
			System.err.println("Se han recibido demasiados " + numArgs + " argumentos");
		}
	}
}
