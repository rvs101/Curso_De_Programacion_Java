package t17.pag436.api.streams.metodos.api;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 
 * @author Roboto
 *
 */
public class T17Pag436MetodoArray_a_Stream {

	public static void main(String[] args) {

//		Array
		int[] array = { 1, 2, 3, 4, 5, 6 };

//		Convertimos el array en el metodo estatico 'stream' usando la clase Array
		IntStream entrada = Arrays.stream(array);

//		Recorremos el array y le ejecutamos por cada elemento el metodo println
		entrada.forEach(System.out::print);

	}
}
