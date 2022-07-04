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
public class Tx14MessageFormatExample2 {

	public static void showMensajePrincipal() {
		System.out.println("Este coche es rojo");
	}

	/**
	 * 
	 */
	public static void showMensajes_US() {
//		Muestro el idioma 
		System.out.println("-- Establecemos un nuevo idioma --");
//		Leer el fichero de propiedades
		Locale.setDefault(new Locale("en", "US"));
		System.out.println("• Current Locale: " + Locale.getDefault());
		ResourceBundle bundle = ResourceBundle.getBundle("structures");
//		Obtengo los objetos los mensajes
		String message = bundle.getString("mensaje");
		String object = bundle.getString("objeto");
		String colour = bundle.getString("color");
//		Muestro los mensajes
		System.out.println(MessageFormat.format(message, object, colour));
	}

	/**
	 * 
	 */
	public static void showMensajes_GER() {
//		Muestro el idioma 
		System.out.println("-- We establish a new language --");
//		Leer el fichero de propiedades
		Locale.setDefault(new Locale.Builder().setLanguage("de").setRegion("DE").build());
		System.out.println("• Current Locale: " + Locale.getDefault());
		ResourceBundle bundle = ResourceBundle.getBundle("structures");
//		Obtengo los objetos los mensajes
		String message = bundle.getString("message");
		String object = bundle.getString("object");
		String colour = bundle.getString("colour");
//		Muestro los mensajes
		System.out.println(MessageFormat.format(message, object, colour));
	}
	
	/**
	 * 
	 */
	public static void showMensajes_ES() {
		System.out.println("-- We establish a new language --");
//		Leer el fichero de propiedades
		ResourceBundle bundle = ResourceBundle.getBundle("estructuras", new Locale("es", "ES"));
//		Cambio al español
		Locale.setDefault(new Locale("es", "ES"));
		System.out.println("• Current Locale: " + Locale.getDefault());
		String message = bundle.getString("message");
		String object = bundle.getString("object");
		String colour = bundle.getString("colour");
		System.out.println(MessageFormat.format(message, object, colour));
	}

	/**
	 * 
	 */
	public static void showMensajes_CH() {
//		Muestro el idioma 
		System.out.println("-- We establish a new language --");
//		Leer el fichero de propiedades
		Locale.setDefault(new Locale("cn", "CHN"));
		System.out.println("• Current Locale: " + Locale.getDefault());
		ResourceBundle bundle = ResourceBundle.getBundle("structures");
//		Obtengo los objetos los mensajes
		String message = bundle.getString("message");
		String object = bundle.getString("object");
		String colour = bundle.getString("colour");
//		Muestro los mensajes
		System.out.println(MessageFormat.format(message, object, colour));
	}

	public static void main(String[] args) {
		showMensajePrincipal();
		showMensajes_US();
		showMensajes_GER();
		showMensajes_CH();
		showMensajes_ES();

	}
}
