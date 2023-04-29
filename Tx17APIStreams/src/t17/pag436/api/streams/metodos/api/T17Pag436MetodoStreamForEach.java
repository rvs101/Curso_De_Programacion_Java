package t17.pag436.api.streams.metodos.api;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Roboto
 *
 */
public class T17Pag436MetodoStreamForEach {

	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Juan", "Ana" , "Pedro");
		names.forEach(System.out::println);
		
	}
}
