package t15.pag383.test.soluciones;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @date 13 oct 2022 19:45:38
 * 
 * @author RVS
 *
 */
public class T15Test7Valores {

	public static void main(String[] args) {

		List<BigDecimal> decimalBig1 = Arrays.asList(new BigDecimal(1.000), new BigDecimal(2.000));
		List<BigDecimal> decimalBig2 = Arrays.asList(new BigDecimal(2.000), new BigDecimal(3.000));
		List<BigDecimal> decimalBig3 = Arrays.asList(new BigDecimal(3.000), new BigDecimal(4.000));
			List<BigDecimal> decimalBig4 = Arrays.asList(new BigDecimal(4.000), new BigDecimal(5.000));

		Set<String> cadena1 = new HashSet<String>();
		cadena1.add("ca1");
		cadena1.add("cb2");
		cadena1.add("cc3");
		cadena1.add("cd4");

		Set<String> cadena2 = new HashSet<String>();
		cadena2.add("aa1");
		cadena2.add("ba2");
		cadena2.add("ca3");
		cadena2.add("da4");

		Set<String> cadena3 = new HashSet<String>();
		cadena3.add("ab1");
		cadena3.add("bb2");
		cadena3.add("cb3");
		cadena3.add("db4");

		Set<String> cadena4 = new HashSet<String>();
		cadena4.add("ac1");
		cadena4.add("bc2");
		cadena4.add("cc3");
		cadena4.add("dc4");

		Map<List<BigDecimal>, Set<String>> map = new HashMap<>();
		map.put(decimalBig1, cadena1);
		map.put(decimalBig2, cadena2);
		map.put(decimalBig3, cadena3);
		map.put(decimalBig4, cadena4);

		for (Map.Entry<List<BigDecimal>, Set<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
