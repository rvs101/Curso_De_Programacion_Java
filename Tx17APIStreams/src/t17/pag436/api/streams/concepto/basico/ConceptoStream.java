package t17.pag436.api.streams.concepto.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * {@link https://www.geeksforgeeks.org/java-8-stream-tutorial/} <br>
 * Stream API → Procesar Collections de objetos <br>
 * stream → secuencia de objetos que admite métodos se pueden canalizar para
 * producir un resultado <br>
 * <ul>
 * <li>Si queremos representar un grupo de objetos como una sola entidad →
 * Colecciones</li>
 * <li>Si queremos procesar objetos de la colección, deberíamos buscar flujos →
 * Clase Stream</li>
 * <li>Si queremos usar el concepto de flujos → stream()<br>
 * </li>
 * </ul>
 * <code>default Stream&lt;E&gt; stream() → Interface Collection&lt;E&gt;</code>
 * 
 * @author Roboto
 *
 */
public class ConceptoStream {

	/**
	 * Atributo de instancia
	 * 
	 * CONSTANTE de tipo entero
	 */
	public int ALEATORIO = (int) (Math.random() * (1 + 19) + 1);

	/**
	 * Atributo de clase
	 * 
	 * Crea una colección de Integer
	 * 
	 */
	public static ArrayList<Integer> al = new ArrayList<>();

	/**
	 * Metodo de instancia
	 * 
	 * @return - int : Devuelve un numero aleatorio de tipo entero
	 */
	public int getALEATORIO() {
		return ALEATORIO;
	}

	/**
	 * Metodo estático
	 * 
	 * Devuelve un objeto distinto de la clase con un numero aleatorio distinto
	 * 
	 * @return - int : Devuelve un objeto que contiene una constante que genera un
	 *         numero entero
	 */
	public static int getInt() {
		return new ConceptoStream().getALEATORIO();
	}

	public static void main(String[] args) {

		al.add(ConceptoStream.getInt());
		al.add(ConceptoStream.getInt());
		al.add(ConceptoStream.getInt());
		al.add(ConceptoStream.getInt());
		al.add(ConceptoStream.getInt());
		al.add(ConceptoStream.getInt());
		al.add(ConceptoStream.getInt());
		al.add(ConceptoStream.getInt());

		System.out.println("Imprimiendo toda la coleccion : " + al);

// Metodo de la Interface Collection<E> : stream() → default Stream<E> stream() 
//		                      stream() - Obtener el flujo de esta colección
		List<Integer> ls = al.stream()
// 				.filter() → Filtrar solo elementos pares
//				            Predicado - Operación booleana
//				               ↓
				.filter(i -> i % 2 == 0)
//				 .collect() → Recopilación de los elementos necesarios para la Lista
				.collect(Collectors.toList());

		System.out.println("Imprimiendo la lista despues de la operacion de 'stream' : " + ls);
	}

}
