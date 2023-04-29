package t17.metodos_desde_consola;

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

// Convertimos en stream todos los parametros recibidos desde la consola / terminal
		long contador = Arrays.stream(args)
// Mapeamos a entero todos los valores recibidos desde la terminal
							  .mapToInt(e -> Integer.valueOf(e))
// Filtramos con la expresión lambda que comprueba si son pares 
// y contamos con 'count' la cantidad							  
							  .filter(n -> n % 2 == 0).count();
		
		System.out.println("Total de pares recibidos : " + contador);

	}
}
