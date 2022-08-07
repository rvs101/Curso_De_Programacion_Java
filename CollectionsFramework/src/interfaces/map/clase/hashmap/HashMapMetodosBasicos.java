package interfaces.map.clase.hashmap;

import java.util.HashMap;

/**
 * Clase HashMap - Incluye ordenación
 *
 * @author RVS
 *
 * @date 15 jul 2022 - 19:09:12
 *
 */
public class HashMapMetodosBasicos {

	public static void main(String[] args) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("5", "Cinco");
		map.put("2", "Dos");
		map.put("3", "Tres");
		map.put("1", "Uno");
		map.put("4", "Cuatro");

		System.out.println("• Todos los elementos : ");
		System.out.println(map);

		System.out.println("• Obtener un elemento concreto : ");
		System.out.println(map.get("4"));

		
		System.out.println("• Añadir nuevo elemento");
		map.put("6", "Seis");
		System.out.println(map);

		System.out.println("• Añadir nuevo elemento");
		System.out.println("Devuelve todas las claves <key> : " + map.keySet());
		System.out.println("Devuelve todos los valores <value> : " + map.values());
		System.out.println("Tamaño : " + map.size());

	}
}
