package string.message.format;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 
 * @author RVS
 * 
 * @date 1 jul 2022 19:08:19
 *
 */
public class Tx14MessageFormatExample {

	/**
	 * Almacenamos el 1º acronimo
	 */
	private static String cadena1 = null;

	/**
	 * Almacenamos el 2º acronimo
	 */
	private static String cadena2 = null;

	/**
	 * Constante
	 * 
	 * Almacenamos la ruta del archivo de traducción
	 * 
	 */
	private static final String ruta = "string//message//format//messages";

	/**
	 * Obtenemos una cadena de texto desde teclado
	 * 
	 * @return String Acronimo del país que queremos traducir el texto
	 */
	public static String getMessage1() {
		System.out.println("Introduce las 1º siglas del idioma del pais");
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			cadena1 = sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cadena1;
	}

	/**
	 * Obtenemos una cadena de texto desde teclado
	 * 
	 * @return String Acronimo del país que queremos traducir el texto
	 */
	public static String getMessage2() {
		System.out.println("Introduce las 2º siglas del idioma del pais");
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			cadena2 = sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cadena2;
	}

	/**
	 * Muestra un texto según el acronimo que le hayamos pasado por parametros
	 * 
	 * @param cadena1 String 1º acronimo
	 * @param cadena2 String 2º acronimo
	 */
	public static void showMensajes(String cadena1, String cadena2) {
		System.out.println("Empieza la traduccion");
//		Establece el idioma
		Locale.setDefault(new Locale(cadena1.toLowerCase(), cadena2.toUpperCase()));
//		Muestro el idioma 
		System.out.println("• Localización Actual : " + Locale.getDefault());
//		Leer el fichero de propiedades
		Locale.setDefault(
				new Locale.Builder().setLanguage(cadena1.toLowerCase()).setRegion(cadena2.toUpperCase()).build());
//		Ruta donde esta el archivo con las traducciones y los acronimos que los identifica
		ResourceBundle bundle = ResourceBundle.getBundle(ruta,
				new Locale(cadena1.toLowerCase(), cadena2.toUpperCase()));
//		Obtengo los objetos los mensajes
		String m1 = bundle.getString("m1");
		String m2 = bundle.getString("m2");
		String m3 = bundle.getString("m3");
		String m4 = bundle.getString("m4");
		String m5 = bundle.getString("m5");
		String m6 = bundle.getString("m6");
		String m7 = bundle.getString("m7");
//		Muestro los mensajes formateados
		System.out.println(MessageFormat.format(m1, m2, m3, m4, m5, m6, m7));
	}

	public static void main(String[] args) {
		showMensajes(getMessage1(), getMessage2());

	}
}
