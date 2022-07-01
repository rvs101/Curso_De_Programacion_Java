package string.message.format;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author RVS
 * 
 *         1 jul 2022 19:08:19
 *
 */
public class Tx14MessageFormatExample {

	/**
	 * 
	 */
	public static void showMensajes() {
		ResourceBundle bundle = ResourceBundle.getBundle("estructuras.txt", Locale.UK);
//		ResourceBundle bundle = ResourceBundle.getBundle("estructuras");
		String mensaje = bundle.getString("mensaje");
		String objeto = bundle.getString("objeto");
		String color = bundle.getString("color");
		
		System.out.println(MessageFormat.format(mensaje, objeto, color));
	}

	public static void main(String[] args) {

	}
}
