package t17.pag436.api.streams.metodos.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Metodo map() <br>
 * Operación intermedia que transforma los elementos de un Stream en otro Stream
 * aplicando una función a cada elemento <br>
 * Se puede usar para convertir o transformar datos de un tipo a otro.
 * 
 * 
 * @aut	hor Roboto
 *
 */
public class T17Pag436MetodoStreamMap {
	
	
	/**
	 * 
	 */
	public void usoMapStreamBing() {
		
	}
	

	/**
	 * Metodo map()
	 * 
	 * El método map de la interfaz Stream en Java se utiliza para transformar los
	 * elementos de un Stream en otro tipo de elementos <br>
	 * <br>
	 * Convierte cada elemento de la secuencia en otro objeto de la función dada
	 * 
	 */
	public void usoMapStream() {
		List<String> memberNames = new ArrayList<>();

		memberNames.add("Alvaro");
		memberNames.add("Sergio");
		memberNames.add("Ana");
		memberNames.add("Raul");
		memberNames.add("Sebastian");
		memberNames.add("Sonia");
		memberNames.add("Yoel");
		memberNames.add("Lazaro");

//		Colección de objetos                                     
//		      ↓
//		      ↓             Metodo : Recibe un "predicado" y elimina del Stream todo esos elementos que no cumplen el predicado
//		      ↓                          Predicado
//		      ↓                              ↓
		memberNames.stream().filter((s) -> s.startsWith("A"))
//		                    Metodo : Cambiar cada objeto a otro valor 
				.map(String::toUpperCase)
//						    Metodo : Aplica la acción pasada por parametros
				.forEach(System.out::println);
	}

	/**
	 * 
	 */
	public void usoMapStreamPrimitivos() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

		List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());

		squares.forEach(System.out::println);
	}

	public static void main(String[] args) {

		new T17Pag436MetodoStreamMap().usoMapStream();

		new T17Pag436MetodoStreamMap().usoMapStreamPrimitivos();
	}

}
