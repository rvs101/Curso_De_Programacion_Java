package t15.pag383.ejercicio5.estadisticas.chinas;

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
public class T15EstadisticasLetrasChinas {

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
	public static void setVocalConsonantesChinas(String[] letras) {
		for (int i = 0; i < letras.length; i++) {
			if (letras[i].equals("阿")) {
				T15EstadisticasLetrasChinas.a++;
			}
			if (letras[i].equals("饿")) {
				T15EstadisticasLetrasChinas.e++;
			}
			if (letras[i].equals("伊")) {
				T15EstadisticasLetrasChinas.i++;
			}
			if (letras[i].equals("吴")) {
				T15EstadisticasLetrasChinas.o++;
			}
			if (letras[i].equals("哦")) {
				T15EstadisticasLetrasChinas.u++;
			}
			if (letras[i].equals("贝")) {
				T15EstadisticasLetrasChinas.b++;
			}
			if (letras[i].equals("色")) {
				T15EstadisticasLetrasChinas.c++;
			}
			if (letras[i].equals("德")) {
				T15EstadisticasLetrasChinas.d++;
			}
			if (letras[i].equals("艾弗")) {
				T15EstadisticasLetrasChinas.f++;
			}
			if (letras[i].equals("日")) {
				T15EstadisticasLetrasChinas.g++;
			}
			if (letras[i].equals("阿什")) {
				T15EstadisticasLetrasChinas.h++;
			}
			if (letras[i].equals("鸡")) {
				T15EstadisticasLetrasChinas.j++;
			}
			if (letras[i].equals("卡")) {
				T15EstadisticasLetrasChinas.k++;
			}
			if (letras[i].equals("艾勒")) {
				T15EstadisticasLetrasChinas.l++;
			}
			if (letras[i].equals("艾马")) {
				T15EstadisticasLetrasChinas.m++;
			}
			if (letras[i].equals("艾娜")) {
				T15EstadisticasLetrasChinas.n++;
			}
			if (letras[i].equals("艾涅")) {
				T15EstadisticasLetrasChinas.ñ++;
			}
			if (letras[i].equals("佩")) {
				T15EstadisticasLetrasChinas.p++;
			}
			if (letras[i].equals("苦")) {
				T15EstadisticasLetrasChinas.q++;
			}
			if (letras[i].equals("艾和")) {
				T15EstadisticasLetrasChinas.r++;
			}
			if (letras[i].equals("艾丝")) {
				T15EstadisticasLetrasChinas.s++;
			}
			if (letras[i].equals("特")) {
				T15EstadisticasLetrasChinas.t++;
			}
			if (letras[i].equals("维")) {
				T15EstadisticasLetrasChinas.v++;
			}
			if (letras[i].equals("独布勒维")) {
				T15EstadisticasLetrasChinas.w++;
			}
			if (letras[i].equals("伊克斯")) {
				T15EstadisticasLetrasChinas.x++;
			}
			if (letras[i].equals("伊格黑克")) {
				T15EstadisticasLetrasChinas.y++;
			}
			if (letras[i].equals("贼德")) {
				T15EstadisticasLetrasChinas.z++;
			}
		}
	}

	/**
	 * 
	 */
	public static void setLetrasVocalesConsonantesChinas() {
		almacenarLetras = new ArrayList<>();
		if (T15EstadisticasLetrasChinas.a > 0) {
			almacenarLetras.add("阿 : " + T15EstadisticasLetrasChinas.a + " a ");
		}
		if (T15EstadisticasLetrasChinas.b > 0) {
			almacenarLetras.add("贝 : " + T15EstadisticasLetrasChinas.b + " b ");
		}
		if (T15EstadisticasLetrasChinas.c > 0) {
			almacenarLetras.add("色 : " + T15EstadisticasLetrasChinas.c + " c ");
		}
		if (T15EstadisticasLetrasChinas.d > 0) {
			almacenarLetras.add("德 : " + T15EstadisticasLetrasChinas.d + " d ");
		}
		if (T15EstadisticasLetrasChinas.e > 0) {
			almacenarLetras.add("俄 : " + T15EstadisticasLetrasChinas.e + " e ");
		}
		if (T15EstadisticasLetrasChinas.f > 0) {
			almacenarLetras.add("俄非 : " + T15EstadisticasLetrasChinas.f + " f ");
		}
		if (T15EstadisticasLetrasChinas.g > 0) {
			almacenarLetras.add("黑 : " + T15EstadisticasLetrasChinas.g + " g ");
		}
		if (T15EstadisticasLetrasChinas.h > 0) {
			almacenarLetras.add("阿车 : " + T15EstadisticasLetrasChinas.h + " h ");
		}
		if (T15EstadisticasLetrasChinas.i > 0) {
			almacenarLetras.add("伊 : " + T15EstadisticasLetrasChinas.i + " i ");
		}
		if (T15EstadisticasLetrasChinas.j > 0) {
			almacenarLetras.add("厚塔 : " + T15EstadisticasLetrasChinas.j + " j ");
		}
		if (T15EstadisticasLetrasChinas.k > 0) {
			almacenarLetras.add("卡 : " + T15EstadisticasLetrasChinas.k + " k ");
		}
		if (T15EstadisticasLetrasChinas.l > 0) {
			almacenarLetras.add("艾勒 : " + T15EstadisticasLetrasChinas.l + " l ");
		}
		if (T15EstadisticasLetrasChinas.m > 0) {
			almacenarLetras.add("艾么 : " + T15EstadisticasLetrasChinas.m + " m ");
		}
		if (T15EstadisticasLetrasChinas.n > 0) {
			almacenarLetras.add("艾呢 : " + T15EstadisticasLetrasChinas.n + " n ");
		}
		if (T15EstadisticasLetrasChinas.ñ > 0) {
			almacenarLetras.add("艾涅 : " + T15EstadisticasLetrasChinas.ñ + " ñ ");
		}
		if (T15EstadisticasLetrasChinas.o > 0) {
			almacenarLetras.add("哦 : " + T15EstadisticasLetrasChinas.o + " o ");
		}
		if (T15EstadisticasLetrasChinas.p > 0) {
			almacenarLetras.add("佩 : " + T15EstadisticasLetrasChinas.p + " p ");
		}
		if (T15EstadisticasLetrasChinas.q > 0) {
			almacenarLetras.add("苦 : " + T15EstadisticasLetrasChinas.q + " q ");
		}
		if (T15EstadisticasLetrasChinas.r > 0) {
			almacenarLetras.add("艾和 : " + T15EstadisticasLetrasChinas.r + " r ");
		}
		if (T15EstadisticasLetrasChinas.s > 0) {
			almacenarLetras.add("艾色 : " + T15EstadisticasLetrasChinas.s + " s ");
		}
		if (T15EstadisticasLetrasChinas.t > 0) {
			almacenarLetras.add("特 : " + T15EstadisticasLetrasChinas.t + " t ");
		}
		if (T15EstadisticasLetrasChinas.u > 0) {
			almacenarLetras.add("吴 : " + T15EstadisticasLetrasChinas.u + " u ");
		}
		if (T15EstadisticasLetrasChinas.v > 0) {
			almacenarLetras.add("吴维 : " + T15EstadisticasLetrasChinas.v + " v ");
		}
		if (T15EstadisticasLetrasChinas.w > 0) {
			almacenarLetras.add("吴维豆布勒 : " + T15EstadisticasLetrasChinas.w + " w ");
		}
		if (T15EstadisticasLetrasChinas.x > 0) {
			almacenarLetras.add("艾吉尺 : " + T15EstadisticasLetrasChinas.x + " x ");
		}
		if (T15EstadisticasLetrasChinas.y > 0) {
			almacenarLetras.add("伊列哈 : " + T15EstadisticasLetrasChinas.y + " y ");
		}
		if (T15EstadisticasLetrasChinas.z > 0) {
			almacenarLetras.add("舍塔 : " + T15EstadisticasLetrasChinas.z + " z ");
		}
	}

	/**
	 * Cambia el idioma por defecto del sistema
	 */
	public static void setFormatChino() {
		setLetrasVocalesConsonantesChinas();
// Ruta donde se encuentra los archivos para traducir las palabras
		String ruta = "t15/pag383/ejercicio5/estadisticas/chinas/resource/ejercicio15_06";
//Establecer Idiomas para la tradución
		Locale.setDefault(Locale.CHINA);
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
			T15EstadisticasChinasVocalesConsonantes.getSilabasChinasCompletas();
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
	public static void showLetrasChinas() {
		setVocalConsonantesChinas(T15EstadisticasChinasVocalesConsonantes.getSilabasChinasCompletas());
		T15EstadisticasLetrasChinas.setFormatChino();
	}

	/**
	 * 
	 * @return
	 */
	public static String[] getPalabrasChinas() {
		return T15EstadisticasChinasVocalesConsonantes.getSilabasChinasCompletas();
	}

}
