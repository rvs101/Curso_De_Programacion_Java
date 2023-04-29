package t17.api.streams.metodo.maptoint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase Concreta
 *
 */
public class T17Pag437MetodoMapToInt {

	public static void main(String[] args) {
		EjemploMapToInt.showMapToInt();
		
	}
}


/**
 * SubClase Concreta
 *
 */
class EjemploMapToInt {

//	Atributo de clase
	private static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	/**
	 * Metodo estático
	 * 
	 * Devuelve un array de entero
	 * 
	 * @return - int [] - array
	 */
	public static int[] getArray() {
		return array;
	}

	/**
	 * Creamos un Stream de int a partir del array devuelto por el método getArray()
	 * 
	 * Usamos el método boxed() para convertirlo en un Stream de Integer y
	 * finalmente usamos el método collect() con un colector toList() para crear una
	 * lista de objetos Integer
	 * 
	 * .boxed().collect(Collectors.toList()) estamos usando dos métodos de la interfaz Stream: boxed() y collect().
	 * 
	 * El método boxed() se usa para convertir un Stream de valores primitivos en un
	 * Stream de objetos
	 * 
	 * Convirtiendo un IntStream en un Stream de objetos Integer.
	 * 
	 * Este método es necesario porque el método collect() solo se puede usar en un
	 * Stream de objetos, no en un Stream de valores primitivos.
	 * 
	 * El método collect() se usa para realizar una operación de reducción mutable
	 * en los elementos del Stream
	 * 
	 * El método collect() con un colector toList()
	 * para crear una lista de objetos Integer a partir del Stream de objetos
	 * Integer 
	 * 
	 * El colector toList() se obtiene del método estático Collectors.toList().
	 * 
	 */
	public static void showMapToInt() {
		System.out.println("Ejecuto el metodo");
		List<Integer> sum = Arrays.stream(getArray())
//									El método boxed() se usa para convertir 
//									un Stream de valores primitivos en un
//				 					Stream de objetos
								   .boxed()
//								   El método collect() se usa para realizar una 
//								   operación de reducción mutable
//								   en los elementos del Stream.
								   .collect(Collectors.toList());
		sum.forEach(System.out::print);
	}

}

