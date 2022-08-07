package t15.pag383.ejercicio1;

/**
 * Cuenta el numero de comas en el texto
 *
 * @author RVS
 *
 * @date 18 jul 2022 - 19:21:44
 *
 */
public class T151ContandoComasStatic {

	/**
	 * 
	 */
	private static String cadena = "Con diez cañones por banda, viento en popa a toda vela, no corta el mar, sino vuela un velero bergantín";

	/**
	 * 
	 */
	private static int contador = 0;

	/**
	 * 
	 * @return
	 */
	public static String getCadena() {
		return cadena;
	}

	/**
	 * 
	 * @return
	 */
	public static int getContador() {
		return ++contador;
	}

	/**
	 * 
	 * @return
	 */
	public static int getTotalComa() {
		int contador = 0;
		for (int i = 0; i < getCadena().length(); i++) {
			if (cadena.charAt(i) == ',') {
				contador = getContador();
			}
		}
		return contador;
	}

	/**
	 * 
	 */
	public static void showComa() {
		System.out.println("Texto : " + getCadena());
		System.out.println("Total de comas del texto : " + getTotalComa());
	}

	public static void main(String[] args) {
		showComa();
	}
}
