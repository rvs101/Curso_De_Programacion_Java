package t15.pag383.ejercicio5.estadisticas.taiwanes;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

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
public class T15EstadisticasLetrasTaiwan {

	public static ArrayList<String> almacenarLetras;

//  Atributos de Clase - Vocales
	public static int a = 0;
	public static int e = 0;
	public static int i = 0;
	public static int o = 0;
	public static int u = 0;
//  Atributos de Clase - Consonantes
	public static int b = 0;
	public static int c = 0;
	public static int d = 0;
	public static int f = 0;
	public static int g = 0;
	public static int h = 0;
	public static int j = 0;
	public static int k = 0;
	public static int l = 0;
	public static int m = 0;
	public static int n = 0;
	public static int ñ = 0;
	public static int p = 0;
	public static int q = 0;
	public static int r = 0;
	public static int s = 0;
	public static int t = 0;
	public static int v = 0;
	public static int w = 0;
	public static int x = 0;
	public static int y = 0;
	public static int z = 0;

	/**
	 * Procedimiento de clase
	 * 
	 * Recibe un array de String con 2 letras unidas formando 2 silabas
	 * 
	 * Recorre todo el array de String de elementos seleccionado la 1º letra de la
	 * silaba y contabilizando cuantas veces se repite esa letra
	 * 
	 * @param letras - Array de String
	 */
	public static void setVocalConsonantesTaiwan(String[] letras) {
		for (int i = 0; i < letras.length; i++) {
			if (letras[i].equals("ㄚ")) {
				T15EstadisticasLetrasTaiwan.a++;
			}
			if (letras[i].equals("ㄜ")) {
				T15EstadisticasLetrasTaiwan.e++;
			}
			if (letras[i].equals("ㄟ")) {
				T15EstadisticasLetrasTaiwan.i++;
			}
			if (letras[i].equals("ㄛ")) {
				T15EstadisticasLetrasTaiwan.o++;
			}
			if (letras[i].equals("ㄡ")) {
				T15EstadisticasLetrasTaiwan.u++;
			}
			if (letras[i].equals("ㄅ")) {
				T15EstadisticasLetrasTaiwan.b++;
			}
			if (letras[i].equals("ㄘ")) {
				T15EstadisticasLetrasTaiwan.c++;
			}
			if (letras[i].equals("ㄉ")) {
				T15EstadisticasLetrasTaiwan.d++;
			}
			if (letras[i].equals("ㄈ")) {
				T15EstadisticasLetrasTaiwan.f++;
			}
			if (letras[i].equals("ㄍ")) {
				T15EstadisticasLetrasTaiwan.g++;
			}
			if (letras[i].equals("ㄟ")) {
				T15EstadisticasLetrasTaiwan.i++;
			}
			if (letras[i].equals("ㄏ")) {
				T15EstadisticasLetrasTaiwan.h++;
			}
			if (letras[i].equals("ㄐ")) {
				T15EstadisticasLetrasTaiwan.j++;
			}
			if (letras[i].equals("ㄎ")) {
				T15EstadisticasLetrasTaiwan.k++;
			}
			if (letras[i].equals("ㄌ")) {
				T15EstadisticasLetrasTaiwan.l++;
			}
			if (letras[i].equals("ㄇ")) {
				T15EstadisticasLetrasTaiwan.m++;
			}
			if (letras[i].equals("ㄋ")) {
				T15EstadisticasLetrasTaiwan.n++;
			}
			if (letras[i].equals("ㄆ")) {
				T15EstadisticasLetrasTaiwan.p++;
			}
			if (letras[i].equals("ㄑ")) {
				T15EstadisticasLetrasTaiwan.q++;
			}
			if (letras[i].equals("ㄖ")) {
				T15EstadisticasLetrasTaiwan.r++;
			}
			if (letras[i].equals("ㄙ")) {
				T15EstadisticasLetrasTaiwan.s++;
			}
			if (letras[i].equals("ㄊ")) {
				T15EstadisticasLetrasTaiwan.t++;
			}
			if (letras[i].equals("ㄩ")) {
				T15EstadisticasLetrasTaiwan.v++;
			}
			if (letras[i].equals("ㄨ")) {
				T15EstadisticasLetrasTaiwan.w++;
			}
			if (letras[i].equals("ㄒ")) {
				T15EstadisticasLetrasTaiwan.x++;
			}
			if (letras[i].equals("牙")) {
				T15EstadisticasLetrasTaiwan.y++;
			}
			if (letras[i].equals("ㄗ")) {
				T15EstadisticasLetrasTaiwan.z++;
			}
		}
	}

	/**
	 * 
	 */
	public static void setLetrasVocalesConsonantesTaiwan() {
		almacenarLetras = new ArrayList<>();
		if (T15EstadisticasLetrasTaiwan.a > 0) {
			almacenarLetras.add("ㄚ : " + T15EstadisticasLetrasTaiwan.a + " a ");
		}
		if (T15EstadisticasLetrasTaiwan.b > 0) {
			almacenarLetras.add("ㄅ : " + T15EstadisticasLetrasTaiwan.b + " b ");
		}
		if (T15EstadisticasLetrasTaiwan.c > 0) {
			almacenarLetras.add("ㄘ : " + T15EstadisticasLetrasTaiwan.c + " c ");
		}
		if (T15EstadisticasLetrasTaiwan.d > 0) {
			almacenarLetras.add("ㄉ : " + T15EstadisticasLetrasTaiwan.d + " d ");
		}
		if (T15EstadisticasLetrasTaiwan.e > 0) {
			almacenarLetras.add("ㄜ : " + T15EstadisticasLetrasTaiwan.e + " e ");
		}
		if (T15EstadisticasLetrasTaiwan.f > 0) {
			almacenarLetras.add("ㄈ : " + T15EstadisticasLetrasTaiwan.f + " f ");
		}
		if (T15EstadisticasLetrasTaiwan.g > 0) {
			almacenarLetras.add("ㄍ : " + T15EstadisticasLetrasTaiwan.g + " g ");
		}
		if (T15EstadisticasLetrasTaiwan.h > 0) {
			almacenarLetras.add("ㄏ : " + T15EstadisticasLetrasTaiwan.h + " h ");
		}
		if (T15EstadisticasLetrasTaiwan.i > 0) {
			almacenarLetras.add("ㄟ : " + T15EstadisticasLetrasTaiwan.i + " i ");
		}
		if (T15EstadisticasLetrasTaiwan.j > 0) {
			almacenarLetras.add("ㄐ : " + T15EstadisticasLetrasTaiwan.j + " j ");
		}
		if (T15EstadisticasLetrasTaiwan.k > 0) {
			almacenarLetras.add("ㄎ : " + T15EstadisticasLetrasTaiwan.k + " k ");
		}
		if (T15EstadisticasLetrasTaiwan.l > 0) {
			almacenarLetras.add("ㄌ : " + T15EstadisticasLetrasTaiwan.l + " l ");
		}
		if (T15EstadisticasLetrasTaiwan.m > 0) {
			almacenarLetras.add("ㄇ : " + T15EstadisticasLetrasTaiwan.m + " m ");
		}
		if (T15EstadisticasLetrasTaiwan.n > 0) {
			almacenarLetras.add("ㄋ : " + T15EstadisticasLetrasTaiwan.n + " n ");
		}
		if (T15EstadisticasLetrasTaiwan.o > 0) {
			almacenarLetras.add("ㄛ : " + T15EstadisticasLetrasTaiwan.o + " o ");
		}
		if (T15EstadisticasLetrasTaiwan.p > 0) {
			almacenarLetras.add("ㄆ : " + T15EstadisticasLetrasTaiwan.p + " p ");
		}
		if (T15EstadisticasLetrasTaiwan.q > 0) {
			almacenarLetras.add("ㄑ : " + T15EstadisticasLetrasTaiwan.q + " q ");
		}
		if (T15EstadisticasLetrasTaiwan.r > 0) {
			almacenarLetras.add("ㄖ : " + T15EstadisticasLetrasTaiwan.r + " r ");
		}
		if (T15EstadisticasLetrasTaiwan.s > 0) {
			almacenarLetras.add("ㄙ : " + T15EstadisticasLetrasTaiwan.s + " s ");
		}
		if (T15EstadisticasLetrasTaiwan.t > 0) {
			almacenarLetras.add("ㄊ : " + T15EstadisticasLetrasTaiwan.t + " t ");
		}
		if (T15EstadisticasLetrasTaiwan.u > 0) {
			almacenarLetras.add("ㄡ : " + T15EstadisticasLetrasTaiwan.u + " u ");
		}
		if (T15EstadisticasLetrasTaiwan.v > 0) {
			almacenarLetras.add("ㄩ : " + T15EstadisticasLetrasTaiwan.v + " v ");
		}
		if (T15EstadisticasLetrasTaiwan.w > 0) {
			almacenarLetras.add("ㄨ : " + T15EstadisticasLetrasTaiwan.w + " w ");
		}
		if (T15EstadisticasLetrasTaiwan.x > 0) {
			almacenarLetras.add("ㄒ: " + T15EstadisticasLetrasTaiwan.x + " x ");
		}
		if (T15EstadisticasLetrasTaiwan.y > 0) {
			almacenarLetras.add("牙 : " + T15EstadisticasLetrasTaiwan.y + " y ");
		}
		if (T15EstadisticasLetrasTaiwan.z > 0) {
			almacenarLetras.add("ㄗ : " + T15EstadisticasLetrasTaiwan.z + " z ");
		}
	}

	/**
	 * Cambia el idioma por defecto del sistema
	 */
	public static void setFormatTaiwan() {
		setLetrasVocalesConsonantesTaiwan();
// Ruta donde se encuentra los archivos para traducir las palabras
		String ruta = "t15/pag383/ejercicio5/estadisticas/chinas/resource/ejercicio15_06";
//Establecer Idiomas para la tradución
		Locale.setDefault(Locale.TAIWAN);
// print ISO3 country name for locale
		Locale localizacion = Locale.getDefault();
// Localización del idioma
		System.out.println("\nPais : " + localizacion);
//Ruta donde esta el archivo con las traducciones y los acronimos que los identifica
		ResourceBundle bundle = ResourceBundle.getBundle(ruta,
				new Locale(localizacion.toString().concat("_".concat(localizacion.toString().toUpperCase()))));
// Obtengo los objetos de los mensajes
// Nombre de la referencia dentro del archivo de traducciones para mostrar el mensaje
		String mensaje = bundle.getString("mensaje");
//		Cadena para almacenar mensajes 
		StringBuilder sb = new StringBuilder();
// Añade todas las palabras 
		String acumulador = "";
		for (int i = 0; i < almacenarLetras.size(); i++) {
			T15EstadisticasTaiwanVocalesConsonantes.getSilabasTaiwanCompletas();
			acumulador = (MessageFormat.format(mensaje, almacenarLetras.get(i)));
			sb.append(acumulador);
		}
		System.out.println(sb.toString());
	}

	/**
	 * Procedimiento de clase
	 * 
	 * Invoca el metodo setVocalConsonants para recibir un array de String para
	 * separar las silabas y hace el conteno de letras
	 * 
	 * Ejecuta el metodo showTotalLetras para ver cuantas letras contiene cada
	 * comienzo de silaba
	 * 
	 * 
	 */
	public static void showLetrasTaiwan() {
		setVocalConsonantesTaiwan(T15EstadisticasTaiwanVocalesConsonantes.getSilabasTaiwanCompletas());
		T15EstadisticasLetrasTaiwan.setFormatTaiwan();
	}

	/**
	 * 
	 * @return
	 */
	public static String[] getPalabrasTaiwan() {
		return T15EstadisticasTaiwanVocalesConsonantes.getSilabasTaiwanCompletas();
	}

}
