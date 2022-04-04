package programa;

import java.util.Scanner;

/**
 * 
 * @author RVS
 *
 */
public class T5CapturaTeclado {

	/**
	 * 
	 * @return
	 */
	public static String getRespuesta() {
		Scanner sc = null;
		String respuesta = null;
		try {
			sc = new Scanner(System.in);
			respuesta = sc.nextLine();
		} catch (Exception e) {
			System.out.println(" ⛔ Mensaje de error : " + e.getMessage());
		}
		return respuesta;
	}

	/**
	 * 
	 * @return
	 */
	public static int getNumero() {
		Scanner sc = null;
		int numero = 0;
		try {
			sc = new Scanner(System.in);
			numero = sc.nextInt();
		} catch (Exception e) {
			System.out.println(" ⛔ Mensaje de error : " + e.getMessage());
		}
		return numero;
	}

}
