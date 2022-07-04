package number.unboxing.autoboxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Number - Clase Abstracta
 * 
 * @author RVS
 * 
 * @date 3 jul 2022 23:00:59
 *
 */
public class Tx14Autoboxing {

	public static void main(String[] args) {

//List → Interface (Collections) - Colección ordenada
		List<Integer> lista = new ArrayList<Integer>();
	
		for (int i = 0; i < 5; i++) {
			lista.add(Integer.valueOf(i));
		}

	}
}
