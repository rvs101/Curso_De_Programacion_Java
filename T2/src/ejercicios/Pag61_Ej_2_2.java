package ejercicios;

/**
 * Programa para mostrar cuantos argumentos se le pasa a la linea de comandos
 * 
 * @author Robot
 *
 */
public class Pag61_Ej_2_2 {

	public static void main(String[] args) {
		int longitud = Integer.valueOf(args.length);
		System.out.println("He recibido " + args.length + " argumentos.");
		System.out.println("Longitud total de elementos introducidos por la linea de comandos : " + longitud);
	}
}
