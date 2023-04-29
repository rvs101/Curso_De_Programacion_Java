package t17.pag436.api.streams.concepto.basico;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Clase Stream
 * 
 * @author Roboto
 *
 */
public class T17Pag436UsoStream {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		
		Stream<Integer> numerosPares = numeros.stream()
											  .filter(num -> num % 2 == 0);
		numerosPares.forEach(System.out::println);

	}

}
