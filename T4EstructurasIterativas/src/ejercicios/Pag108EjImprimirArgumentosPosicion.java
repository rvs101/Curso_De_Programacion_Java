package ejercicios;

/**
 * Imprimir todos los argumentos en mayuscula o minuscula Si son -5 caracteres
 * en MASYUSCULA Si son +5 caracteres en MINUSCULA
 * 
 * @author Robot
 *
 */
public class Pag108EjImprimirArgumentosPosicion {

	public static void main(String[] args) {

		String caracteres = String.valueOf(args[0]);
		
		if(caracteres.length() >= 5) {
			System.out.println("• " + caracteres.toLowerCase());
		}else {
			System.out.println("○ " + caracteres.toUpperCase());
		}
	}
}
