package t15.pag383.test.soluciones;

/**
 * 
 * @date 13 oct 2022 17:25:12
 * 
 * @author RVS
 *
 */
public class T15Test1Valores {

	public static void main(String[] args) {

		int x = 7;
		int y = 12;
		System.out.println("012456789012345678");
		System.out.println("independientemente".toUpperCase());
		System.out.println("Valores : 7 y 12 " + "independientemente".substring(x, y));
		System.out.println("Valores : 7 y 13 " + "independientemente".substring(x, ++y));
		System.out.println("Valores : 8 y 12 " + "independientemente".substring(++x, y));
		System.out.println("Valores : 8 y 13 " + "independientemente".substring(++x, ++y));

	}
}	
