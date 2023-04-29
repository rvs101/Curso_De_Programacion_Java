package t17.pag436.api.streams.metodos.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * API Stream invoca el metodo 'filter'
 * 
 * @author Roboto
 *
 */
public class T17Pag436MetodoStreamFilter {

	/**
	 * Ejemplo
	 * 
	 * Se crea una lista de números del 1 al 10 y se convierte en una Stream
	 * utilizando el método stream().
	 * 
	 * Luego, se aplica el método filter() para obtener los números pares, que se
	 * guardan en una nueva Stream llamada numerosPares.
	 * 
	 * Finalmente, se recorre la Stream resultante utilizando el método forEach()
	 * para imprimir cada número par.
	 * 
	 * 
	 */
	public void usoFilterStream() {
// Interfaz List<Integer> recibe un método estático 'asList' de la clase Arrays
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Interfaz<T> declara un objeto llamado 'numerosPares' que almacena un elemento llamado 'numeros' de tipo List<Integer>
// el cual invoca el metodo 'stream()' de la Interfaz Collection.stream()
// y a la vez invoca el método filter() de la Interfaz Stream
		Stream<Integer> numerosPares = numeros.stream().filter(num -> num % 2 == 0);
// El metodo forEach() se usa para recorrer todos los elemento y 
// el cual almacena entre parentesis una referencia 
// al metodo el cual es System.out::println
		numerosPares.forEach(System.out::println);
	}

	public static void main(String[] args) {

		new T17Pag436MetodoStreamFilter().usoFilterStream();

	}

}
