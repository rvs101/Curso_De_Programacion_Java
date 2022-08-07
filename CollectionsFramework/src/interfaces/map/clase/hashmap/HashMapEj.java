package interfaces.map.clase.hashmap;

import java.util.HashMap;

/**
 * Clase HashMap
 *
 * @author RVS
 *
 * @date 15 jul 2022 - 19:09:12
 *
 */
public class HashMapEj {

	public static void main(String[] args) {

		HashMap<String, Object> map1 = new HashMap<String, Object>();
		
		map1.put("Nombre", "Suzuki");
		map1.put("Potencia", "220");
		map1.put("Tipo", "2-wheeler");
		map1.put("Precio", "85000");
		System.out.println("Elementos del mapa: HashMap");
		System.out.println(map1);

		HashMap<Integer, Object> map2 = new HashMap<Integer, Object>();
		
		map2.put(1, "Java");
		map2.put(2, "Python");
		map2.put(3, "PHP");
		map2.put(4, "SQL");
		map2.put(5, "C++");
		System.out.println("Elementos del mapa: HashMap");
		System.out.println(map2);
		
		map2.remove(3);
		System.out.println("Elementos del mapa: HashMap");
		System.out.println(map2);
		

	}
}
