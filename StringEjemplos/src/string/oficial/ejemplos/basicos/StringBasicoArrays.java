package string.oficial.ejemplos.basicos;

/**
 * 
 *
 * @author RVS
 *
 * @date 24 jul 2022 - 22:23:36
 *
 */
public class StringBasicoArrays {

	/**
	 * 
	 */
	public static void getCharToString() {
		char data[] = { 'a', '\n', 'c', 'd', 'e' };
//		Convierte un array de char en una unidad completa de String
		String str = new String(data);
		System.out.println(str);
	}

	public static void getSubString() {
		System.out.println("-----------");
		String cde = "cde";
//	                        012    234	
		System.out.println("abc" + cde);
		String c = "abc".substring(2, 3);
		System.out.println("abc → " + c);
//                 012
		String d = cde.substring(1, 2);
		System.out.println(d);
	}

	public static void main(String[] args) {
		getCharToString();
		getSubString();
	}
}
