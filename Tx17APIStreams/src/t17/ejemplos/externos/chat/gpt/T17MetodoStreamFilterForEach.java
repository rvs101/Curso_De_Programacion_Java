package t17.ejemplos.externos.chat.gpt;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API Interfaz Stream <br>
 * Metodo 'filter()'<br>
 * Devuelve el flujo secuencial con esta colección como fuente<br>
 * 
 * Metodo 'collect()'<br>
 * Realiza una operación de reducción mutable en los elementos de este flujo
 * utilizando un colector. A Collectorencapsula las funciones utilizadas como
 * argumentos para recopilar (Proveedor, BiConsumer, BiConsumer), lo que permite
 * reutilizar las estrategias de recolección y la composición de las operaciones
 * de recolección, como la agrupación a nivel de múltiples o la partición. <br>
 * Si el flujo es paralelo, y el Collectoris concurrente, andeither el flujo es
 * desordenado o el colector es desordenado,a continuación, se realizará una
 * reducción concurrente (ver Collector fordetails on concurrent reduction.)
 * 
 * @author Roboto
 *
 */
public class T17MetodoStreamFilterForEach {

	/**
	 * Crear una List<> generica de elementos de tipo Product
	 * 
	 * @return - product - Lista de objetos Productos
	 */
	public static List<Product> getProducts() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("A", 10.0));
		products.add(new Product("B", 20.0));
		products.add(new Product("B", 15.0));
		products.add(new Product("C", 30.0));
		return products;
	}

	/**
	 * Ejemplo de los metodos filter() , collect() , forEach()<br>
	 * 
	 * collect() → Realiza una operación de reducción mutable en los elementos de
	 * este flujo utilizando un collection<br>
	 * 
	 * Un Collector encapsula las funciones utilizadas como argumentos para
	 * recopilar (Proveedor, BiConsumer, BiConsumer), lo que permite reutilizar las
	 * estrategias de recolección y la composición de las operaciones de
	 * recolección, como la agrupación a nivel de múltiples o la partición. <br>
	 * Si el flujo es paralelo, y el Collectoris concurrente, andeither el flujo es
	 * desordenado o el colector es desordenado,a continuación, se realizará una
	 * reducción concurrente <br>
	 * Recibe una listas de numeros , las convierte en un 'flujo-stream' , lo filtra
	 * y devuelve los valores resultantes<br>
	 * <br>
	 * Un `Collector` es una operación de reducción mutable que acumula elementos de
	 * entrada en un contenedor de resultados mutable y opcionalmente transforma el
	 * resultado acumulado en una representación final después de que se hayan
	 * procesado todos los elementos de entrada <br>
	 * La clase `Collectors` proporciona implementaciones de muchas reducciones
	 * mutables comunes ¹. <br>
	 * Por ejemplo, puedes usar un `Collector` para acumular elementos en una
	 * colección, concatenar cadenas usando un `StringBuilder`, calcular información
	 * resumida sobre elementos como suma, mínimo, máximo o promedio, etc.
	 * 
	 */
	public static void showFilterCollectNumber() {
		System.out.println(" * showFilterCollectNumber");
//		Lista de elementos 1
		List<Integer> numeros1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		                                             Predicado
//		                                                 ↓
		List<Integer> numerosPares = numeros1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.print(numerosPares + " \n");

//		Lista de elementos 2 
		List<Integer> numeros2 = new ArrayList<>();
//		Añadir elementos
		numeros2.add(1);
		numeros2.add(2);
		numeros2.add(3);
		numeros2.add(4);
		numeros2.add(5);
		numeros2.add(6);
		numeros2.add(7);
		numeros2.add(8);
		numeros2.add(9);
		numeros2.add(10);
//		                            Predicado    Iteración  Acción a ejecutar en cada Iteración    
//		                                ↓            ↓        ↓
		numeros2.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

	/**
	 * Usamos el <b>método toList()</b> de la <b>clase Collectors</b> para crear un
	 * <b>Collector</b> que acumula los elementos del <b>Stream</b> en una nueva
	 * lista <br>
	 * Pasamos este <b>Collector</b> como argumento al <b>método collect()</b> del
	 * <b>Stream</b> para recolectar los elementos filtrados en una nueva lista
	 * 
	 */
	public static void showFilterCollectString() {
		System.out.println(" * showFilterCollectString");

		List<String> colourCars = Arrays.asList("blue", "red", "green");

		List<String> colourBlue = colourCars.stream().filter(color -> "blue".equals(color))
				.collect(Collectors.toList());

		colourBlue.forEach(System.out::print);
	}

	/**
	 * Código filtra una lista de productos por tipo “B” <br>
	 * los ordena por precio <br>
	 * luego imprime cada producto en la consola
	 * 
	 */
	public static void showUsarStream() {
		System.out.println(" * showUsarStream");
//		List<Generica>
//		        ↓
		List<Product> products = getProducts();
//		    Creamos el flujo
//		            ↓
//		            ↓     Filtramos
//		            ↓         ↓
		products.stream().filter(p -> "B".equals(p.getType()))
//		                  Ordenamos
//							  ↓
//							  ↓  Comparamos
//							  ↓	  	 ↓
				.sorted(comparing(Product::getPrice))
//		                  Recorremos
//						      ↓
				.forEach(System.out::println);
	}

	/**
	 * Filtra una lista de nombres que comienzan con la letra “J”
	 * 
	 * Los convierte a mayúsculas y luego los recopila en una nueva lista.
	 * 
	 */
	public static void showFilterMapCollect() {
		System.out.println(" * showFilterMapCollect");
//		
		List<String> names = Arrays.asList("John", "Jane", "Jill");
//								    Creamos el stream()
//		                               ↓
		List<String> result = names.stream()
//				Filtramos
//				    ↓         
//				    ↓     Predicado (Condición booleana)
//				    ↓         ↓
				.filter(name -> name.startsWith("J"))
//				Convertimos los String en Mayusculas
				.map(String::toUpperCase)
//				Creamos una colección de tipo List<String>
				.collect(Collectors.toList());
//		Mostrar resultado
		result.forEach(System.out::println);
	}

	/**
	 * Convierte una lista de números enteros en un Stream de enteros y luego
	 * calcula la suma de todos los elementos
	 * 
	 */
	public static void showMapToIntSumList() {
		System.out.println(" * showMapToIntSumList");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("suma : " + sum);
	}

	/**
	 * Convierte un Map<String,Integer>  
	 * 
	 */
	public static void showMapToIntSumMap() {
		System.out.println(" * showMapToIntSumMap");
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		int sum = map.values().stream().mapToInt(Integer::intValue).sum();
		System.out.println("suma : " + sum);
	}

	public static void main(String[] args) {
		showFilterCollectNumber();
		showFilterCollectString();
		showUsarStream();
		showMapToIntSumList();
		showMapToIntSumMap();
		showFilterMapCollect();
	}

}
