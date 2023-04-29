package t17.pag438;
import java.util.Arrays;

/**
 * Recibimos parametros desde la terminal 
 * 
 * La lista de elementos la convertimos en un stream de Array
 * 	
 * 	Por cada elemento 'forEach' lo mostramos por pantalla mediante el metodo 'System.out.print()'
 * 	
 * @author Roboto
 *
 */
public class T17Pag436UsoStreamForEach {

	public static void main(String[] args) {
		
		System.out.println("Parametros Recibido");
		Arrays.stream(args)
		.forEach(arg -> System.out.print(arg + " "));
		System.out.println();
	}
}
