package elementos.tipo.genericos.ejemplo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase Genericas
 * 
 * Almacena Objetos del Clases Concretas
 *
 * @author RVS
 *
 * @date 16 jul 2022 - 0:27:05
 *
 */
public class ElementosTipoGenericos {

	public static void main(String[] args) {

//		List<Integer> numeros = (List<Integer>) new ArrayList();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(7);
		numeros.add(11);
		numeros.add(5);
		numeros.add(3);
		numeros.add(1);

		System.out.println(numeros);

//		Map<Character , String> abc = (Map<Character, String>) new HashMap();
		HashMap<Character, String> abc = new HashMap<Character, String>();
		abc.put('b', "2");
		abc.put('d', "4");
		abc.put('f', "6");
		abc.put('a', "1");
		abc.put('e', "5");
		abc.put('c', "3");

		System.out.println(abc);
	}
}
