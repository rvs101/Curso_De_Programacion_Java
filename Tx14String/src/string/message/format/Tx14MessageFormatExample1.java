package string.message.format;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author RVS
 * 
 * @date 1 jul 2022 19:08:19
 *
 */
public class Tx14MessageFormatExample1 {

	/**
	 * 
	 */
	public static void showMensajes_US() {
//		Cambio al ingles
		Locale.setDefault(new Locale("en", "US"));
//		Muestro el idioma 
		System.out.println("• Localización Actual : " + Locale.getDefault());
//		Leer el fichero de propiedades
		ResourceBundle bundle = ResourceBundle.getBundle("estructuras", Locale.US);
//		Obtengo los objetos los mensajes
		String mensaje = bundle.getString("mensaje");
		String objeto = bundle.getString("objeto");
		String color = bundle.getString("color");
//		Muestro los mensajes
		System.out.println(MessageFormat.format(mensaje, objeto, color));
	}

	/**
	 * 
	 */
	public static void showMensajes_ES() {
//		Leer el fichero de propiedades
		ResourceBundle bundle = ResourceBundle.getBundle("estructuras", new Locale("es", "ES"));
//		Cambio al español
		Locale.setDefault(new Locale("es", "ES"));
		System.out.println("•• Current Locale: " + Locale.getDefault());
		String message = bundle.getString("message");
		String object = bundle.getString("object");
		String colour = bundle.getString("colour");
		System.out.println(MessageFormat.format(message, object, colour));
	}

	public static void main(String[] args) {
		showMensajes_US();
		showMensajes_ES();
	}
}
