package interfaces.list.clase.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * java.lang.Object
 * 
 * java.util.AbstractCollection<E>
 * 
 * java.util.AbstractList<E>
 * 
 * java.util.ArrayList<E>
 * 
 * Desciende de la interface List<E>
 * 
 * Permite nulos
 * 
 * Array que se extiende
 * 
 * No esta sincronizado como Vector
 *
 * @author RVS
 *
 * @date 16 jul 2022 - 19:55:22
 *
 */
public class ArrayListEjemplo {

	public static void main(String[] args) {

		String cadena1 = "01";
		String cadena3 = "35";
		String cadena2 = "23";
		String cadena4 = "42";
		String cadena5 = "52";
		String cadena6 = "65";
		String cadena7 = null;

		List<String> lista = new ArrayList<String>();
		lista.add(cadena1);
		lista.add(cadena2);
		lista.add(cadena3);
		lista.add(cadena4);
		lista.add(cadena5);
		lista.add(cadena6);
		lista.add(cadena7);

		for (String cadena : lista) {
			System.out.println(cadena);
		}

	}
}
