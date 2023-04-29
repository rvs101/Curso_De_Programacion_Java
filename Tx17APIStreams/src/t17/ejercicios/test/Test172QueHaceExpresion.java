package t17.ejercicios.test;

import java.util.Arrays;

/**
 * 
 * @author Roboto
 *
 */
public class Test172QueHaceExpresion {

	public static void main(String[] args) {

		String[] texto = { "hola", "adios", "ver", "casa", "cosa", "lata", "loto" };

		System.out.println("Longitud del texto: " + texto.length);
//		                       Cada elemento del Array de String
//		                            ↓
//		                            ↓    Longitud total de cada palabra 
//		                            ↓
		Arrays.stream(texto).filter(s -> s.length() % 2 == 0)
//		Devuelve un flujo que consiste en los elementos de este flujo, 
//		truncado para que no sea más largo que maxSize en longitud.
							.limit(3)
							.map(n -> n.toUpperCase())
							.forEach(e -> System.out.print(e));
	}
}
