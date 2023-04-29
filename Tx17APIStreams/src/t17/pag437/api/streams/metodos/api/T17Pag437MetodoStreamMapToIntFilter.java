package t17.pag437.api.streams.metodos.api;

import java.util.Arrays;

/**
 * Contamos cuantos parametros pares recibimos <br>
 * Convertimos el stream <br>
 * Mapeamos a entero , llamando al Integer.valueOf para cada elemento <br>
 * 
 * @author Roboto
 *
 */
public class T17Pag437MetodoStreamMapToIntFilter {

	public static void main(String... args) {

		long contador = Arrays.stream(args)
//				Devuelve un IntStream que consiste en los resultados
//				de aplicar la función dada a los elementos de esta secuencia.
//				               Devuelve un objeto
//				                      ↓
				.mapToInt(e -> Integer.valueOf(e))
//				Devuelve una corriente que consiste en los elementos 
//				de esta stream que coinciden the predicado dado.
//				        Expresión Lambda
//				               ↓
				.filter(n -> n % 2 == 0).count();
		
		System.out.println("Total de pares recibidos : " + contador);

	}
}
