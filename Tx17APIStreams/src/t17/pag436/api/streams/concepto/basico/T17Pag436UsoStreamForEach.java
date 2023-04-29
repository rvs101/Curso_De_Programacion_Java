package t17.pag436.api.streams.concepto.basico;

import java.util.Arrays;

/**
 * Ejemplo pagina 436
 * 
 * @author Roboto
 *
 */
public class T17Pag436UsoStreamForEach {

	public static void main(String[] args) {
//		
		System.out.println("Parametros Recibido");
// Recibe desde la terminal los parametros para recogerlos uno a uno 
// Mostrarlo por pantalla
		Arrays.stream(args).forEach(arg -> System.out.print(arg + " "));
	}
}
