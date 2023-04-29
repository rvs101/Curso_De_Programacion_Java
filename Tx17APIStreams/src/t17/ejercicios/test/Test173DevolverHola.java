package t17.ejercicios.test;

import java.util.Arrays;

/**
 * 
 * @author Roboto
 *
 */
public class Test173DevolverHola {

	public static void main(String[] args) {

		String[] texto = { "hola", "adios", "ver", "casa", "cosa", "lata", "loto" };

		System.out.println("Longitud del texto: " + texto.length);

		Arrays.stream(texto).limit(3).filter(s -> s.length() % 2 == 0)
							.map(n -> n.toUpperCase())
							.forEach(e -> System.out.print(e));
	}
}
