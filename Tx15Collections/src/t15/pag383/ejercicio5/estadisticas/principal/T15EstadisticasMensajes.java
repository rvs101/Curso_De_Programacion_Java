package t15.pag383.ejercicio5.estadisticas.principal;

/**
 * Internacionaliza el programa del ejercicio 15.4 de forma que funcione por
 * defecto en ingles
 * 
 * Pero que tengas versiones distintas para China y Taiwan
 * 
 * @author RVS
 *
 * @date 31 ago 2022 - 20:27:01
 */
public class T15EstadisticasMensajes {

	/**
	 * Cambia el idioma por defecto del sistema
	 */
//	public static void setFormatEnglish() {
//		String m = "";
////	    Ruta donde se encuentra los archivos para traducir las palabras
//		String ruta = "t15/pag383/ejercicio5/estadisticas/chinas/resource/ejercicio15_06";
////Establecer Idiomas para la tradución
//		Locale.setDefault(Locale.ENGLISH);
//		Locale localizacion = Locale.getDefault();
//// Localización del idioma		
//		System.out.println("\n Pais : " + localizacion);
////Ruta donde esta el archivo con las traducciones y los acronimos que los identifica
//		ResourceBundle bundle = ResourceBundle.getBundle(ruta,
//				new Locale(localizacion.toString().concat("_".concat(localizacion.toString().toUpperCase()))));
//// Obtengo los objetos de los mensajes
//// Nombre de la referencia dentro del archivo de traducciones para mostrar el mensaje
//		String mensaje = bundle.getString("mensaje");
////		Cadena para almacenar mensajes 
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < T15EstadisticasLatinasConsonantesVocales.getSilabasLatinasCompletas().length; i++) {
//			m = (MessageFormat.format(mensaje, T15EstadisticasLetrasLatinas.getPalabrasLatinas()[i].toString()));
//			sb.append(m);
//		}
//		System.out.println(sb.toString());
//	}

	/**
	 * Cambia el idioma por defecto del sistema
	 */
//	public static void setFormatChina() {
//		String m = "";
////	    Ruta donde se encuentra los archivos para traducir las palabras
//		String ruta = "t15/pag383/ejercicio5/estadisticas/chinas/resource/ejercicio15_06";
////Establecer Idiomas para la tradución
//		Locale.setDefault(Locale.CHINA);
//		Locale localizacion = Locale.getDefault();
//// Localización del idioma
//		System.out.println("\n Pais : " + localizacion);
////Ruta donde esta el archivo con las traducciones y los acronimos que los identifica
//		ResourceBundle bundle = ResourceBundle.getBundle(ruta,
//				new Locale(localizacion.toString().concat("_".concat(localizacion.toString().toUpperCase()))));
//// Obtengo los objetos de los mensajes
//// Nombre de la referencia dentro del archivo de traducciones para mostrar el mensaje
//		String mensaje = bundle.getString("mensaje");
////		Cadena para almacenar mensajes 
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < T15EstadisticasVocalesConsonantesChinas.getSilabasCompletasChinas().length; i++) {
//			m = (MessageFormat.format(mensaje, getPalabrasChinas()[i].toString()));
//			sb.append(m);
//		}
//		System.out.println(sb.toString());
//	}

//	/**
//	 * Cambia el idioma por defecto del sistema
//	 */
//	public static void setFormatTaiwan() {
//		showAvaliableLocales();
//		String m = "";
////	    Ruta donde se encuentra los archivos para traducir las palabras
//		String ruta = "t15/pag383/ejercicio5/estadisticas/chinas/resource/ejercicio15_06";
////Establecer Idiomas para la tradución
//		Locale.setDefault(Locale.TAIWAN);
//		Locale localizacion = Locale.getDefault();
//// Localización del idioma
//		System.out.println("\n Pais : " + localizacion);
////Ruta donde esta el archivo con las traducciones y los acronimos que los identifica
//		ResourceBundle bundle = ResourceBundle.getBundle(ruta,
//				new Locale(localizacion.toString().concat("_".concat(localizacion.toString().toUpperCase()))));
//// Obtengo los objetos de los mensajes
//// Nombre de la referencia dentro del archivo de traducciones para mostrar el mensaje
//		String mensaje = bundle.getString("mensaje");
////		Cadena para almacenar mensajes 
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < SilabasLatinas.getSilabasLatinasCompletas().length; i++) {
//			m = (MessageFormat.format(mensaje, getPalabrasLatinas()[i].toString()));
//			sb.append(m);
//		}
//		System.out.println(sb.toString());
//	}

}
