package interfaces.collections.view.operations;

import java.util.Arrays;
import java.util.List;

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
public class CollectionsViewOperationsList {
	
	public static void main(String[] args) {
		String[] strings = { "a", "b", "c" };
		List<String> list = Arrays.asList(strings);
		System.out.println(list.get(0));
		strings[0] = "d";
		System.out.println(list.get(0));
		list.set(0, "e");
		System.out.println(strings[0]);
	
		
	}
}
