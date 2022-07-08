package interfaces.collections.view.operations;

import java.util.Set;
import java.util.Map;

/**
 * Ejemplo de Collection-view
 *
 * Una view de otro objeto no contiene sus propios datos de ningún tipo.
 * 
 * Todas sus operaciones son realizadas en términos de operaciones sobre el otro
 * objeto.
 * 
 * La view KeySet() de una Interfaces Map<K, V> podría tener una implementación
 * similar a esta
 * 
 * <hr>
 * 
 * En particular, cada vez que modifica el "objeto de respaldo-backing object"
 * de su view
 * 
 * El Map<K,V> respalda el keySet() → la view refleja los mismos cambios.
 * 
 * Si llama a map.remove(key), keySet.contains(key) devolverá "false" sin que
 * tenga que hacer nada más
 * 
 * [Como alternativa Arrays.asList(array) proporciona una "view" de List de esa
 * array.]
 * 
 * 
 * @author Robot
 * @date 7 jul 2022 12:26:20
 */
public class CollectionsViewOperations {

	public static void main(String[] args) {

	}
}

/**
 * La clase KeySet<V, K> "Establecer Clave" es abstracta porque implementa solo
 * un metodo concreto de la clase <b>Interface Set<E></b>
 * 
 * @author Robot
 * @date 7 jul 2022 12:26:15
 * @param <K> - Clave (Identificador)
 * @param <V> - Valor (Elemento que contiene)
 */
abstract class KeySet<V, K> implements Set<K> {

	/**
	 * Atributo de instancia
	 * 
	 * Elemento del tipo Interface Map<K,V>
	 */
	private final Map<K, V> map = null;

	/**
	 * Metodo de instancia de la interface Set<K>
	 * 
	 * @param Object - objeto de cualquier tipo
	 * @return Devuelve true si este conjunto contiene el elemento especificado.
	 */
	public boolean contains(Object o) {
//• Utiliza la "variable de referencia" de 'map' para invocar el metodo de la interface 'Set<K>'
// → containsKey - si este conjunto contiene el elemento especificado.
// → Object o - elemento cuya presencia en este conjunto debe ser probada
		return map.containsKey(o);
	}
}