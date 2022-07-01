package string.basico.stringbuffer.stringbuilder;

/**
 * T14 -
 * 
 * <b>Clase StringBuilder</b> - Sin garant�a de sincronizaci�n
 * 
 * <b>Clase StringBuffer</b> - Existe sincronizaci�n entre multi-thread
 * 
 * 
 * @author RVS
 * 
 *         30 jun 2022 14:17:35
 *
 */
public class Tx14ClaseStringBuilderBasica {

	private static Object nombre = " Pepe";
	private static Object apellidos = " Sainz";

	/**
	 * Muestra un mensaje creado por la clase StringBuilder el cual genera un objeto
	 * String mutable pero sincroniza con los multi-thread
	 */
	public static void showStringBuilder() {
		StringBuilder sb = new StringBuilder("!Hola");
		sb.append("").append(nombre);
		sb.append("").append(apellidos);
		System.out.println(sb.toString());
	}

	/**
	 * Muestra un mensaje creado por la clase StringBuffer el cual genera un objeto
	 * String mutable pero sincroniza con los multi-thread
	 */
	public static void showStringBuffer() {
		StringBuffer sb = new StringBuffer("!Adios");
		sb.append("").append(nombre);
		sb.append("").append(apellidos);
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		showStringBuilder();
		Tx14ClaseStringBuilderBasica.showStringBuffer();

	}
}
