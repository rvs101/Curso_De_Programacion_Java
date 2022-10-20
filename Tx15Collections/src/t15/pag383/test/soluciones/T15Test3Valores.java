package t15.pag383.test.soluciones;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @date 13 oct 2022 17:25:12
 * 
 * @author RVS
 *
 */
public class T15Test3Valores {

	public static void main(String[] args) {

		int num = 8;
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(num);
		lista.add((int) (Math.random() * (1 + 100) + 1));
		lista.add((int) (Math.random() * (1 + 100) + 1));
		lista.add((int) (Math.random() * (1 + 100) + 1));
		lista.add((int) (Math.random() * (1 + 100) + 1));
		lista.add((int) (Math.random() * (1 + 100) + 1));

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

	}
}
