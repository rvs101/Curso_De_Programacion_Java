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

}

/**
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:56:21
 *
 */
class LetrasChinas {

	public static ArrayList<String> almacenarLetrasChinas;

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
				LetrasChinas.a++;
			}
			if (letras[i].equals("饿")) {
				LetrasChinas.e++;
			}
			if (letras[i].equals("伊")) {
				LetrasChinas.i++;
			}
			if (letras[i].equals("吴")) {
				LetrasChinas.o++;
			}
			if (letras[i].equals("哦")) {
				LetrasChinas.u++;
			}
			if (letras[i].equals("贝")) {
				LetrasChinas.b++;
			}
			if (letras[i].equals("色")) {
				LetrasChinas.c++;
			}
			if (letras[i].equals("德")) {
				LetrasChinas.d++;
			}
			if (letras[i].equals("艾弗")) {
				LetrasChinas.f++;
			}
			if (letras[i].equals("日")) {
				LetrasChinas.g++;
			}
			if (letras[i].equals("阿什")) {
				LetrasChinas.h++;
			}
			if (letras[i].equals("鸡")) {
				LetrasChinas.j++;
			}
			if (letras[i].equals("卡")) {
				LetrasChinas.k++;
			}
			if (letras[i].equals("艾勒")) {
				LetrasChinas.l++;
			}
			if (letras[i].equals("艾马")) {
				LetrasChinas.m++;
			}
			if (letras[i].equals("艾娜")) {
				LetrasChinas.n++;
			}
			if (letras[i].equals("艾涅")) {
				LetrasChinas.ñ++;
			}
			if (letras[i].equals("佩")) {
				LetrasChinas.p++;
			}
			if (letras[i].equals("苦")) {
				LetrasChinas.q++;
			}
			if (letras[i].equals("艾和")) {
				LetrasChinas.r++;
			}
			if (letras[i].equals("艾丝")) {
				LetrasChinas.s++;
			}
			if (letras[i].equals("特")) {
				LetrasChinas.t++;
			}
			if (letras[i].equals("维")) {
				LetrasChinas.v++;
			}
			if (letras[i].equals("独布勒维")) {
				LetrasChinas.w++;
			}
			if (letras[i].equals("伊克斯")) {
				LetrasChinas.x++;
			}
			if (letras[i].equals("伊格黑克")) {
				LetrasChinas.y++;
			}
			if (letras[i].equals("贼德")) {
				LetrasChinas.z++;
			}
		}
	}

	/**
	 * 
	 */
	public static void setLetrasVocalesConsonantesChinas() {
		almacenarLetrasChinas = new ArrayList<>();
		if (LetrasLatinas.a > 0) {
			almacenarLetrasChinas.add("阿 : " + LetrasLatinas.a);
		}
		if (LetrasLatinas.b > 0) {
			almacenarLetrasChinas.add("贝 : " + LetrasLatinas.b);
		}
		if (LetrasLatinas.c > 0) {
			almacenarLetrasChinas.add("色 : " + LetrasLatinas.c);
		}
		if (LetrasLatinas.d > 0) {
			almacenarLetrasChinas.add("德 : " + LetrasLatinas.d);
		}
		if (LetrasLatinas.e > 0) {
			almacenarLetrasChinas.add("俄 : " + LetrasLatinas.e);
		}
		if (LetrasLatinas.f > 0) {
			almacenarLetrasChinas.add("俄非 : " + LetrasLatinas.f);
		}
		if (LetrasLatinas.g > 0) {
			almacenarLetrasChinas.add("黑 : " + LetrasLatinas.g);
		}
		if (LetrasLatinas.h > 0) {
			almacenarLetrasChinas.add("阿车 : " + LetrasLatinas.h);
		}
		if (LetrasLatinas.i > 0) {
			almacenarLetrasChinas.add("伊 : " + LetrasLatinas.i);
		}
		if (LetrasLatinas.j > 0) {
			almacenarLetrasChinas.add("厚塔 : " + LetrasLatinas.j);
		}
		if (LetrasLatinas.k > 0) {
			almacenarLetrasChinas.add("卡 : " + LetrasLatinas.k);
		}
		if (LetrasLatinas.l > 0) {
			almacenarLetrasChinas.add("艾勒 : " + LetrasLatinas.l);
		}
		if (LetrasLatinas.m > 0) {
			almacenarLetrasChinas.add("艾么 : " + LetrasLatinas.m);
		}
		if (LetrasLatinas.n > 0) {
			almacenarLetrasChinas.add("艾呢 : " + LetrasLatinas.n);
		}
		if (LetrasLatinas.ñ > 0) {
			almacenarLetrasChinas.add("艾涅 : " + LetrasLatinas.ñ);
		}
		if (LetrasLatinas.o > 0) {
			almacenarLetrasChinas.add("哦 : " + LetrasLatinas.o);
		}
		if (LetrasLatinas.p > 0) {
			almacenarLetrasChinas.add("佩 : " + LetrasLatinas.p);
		}
		if (LetrasLatinas.q > 0) {
			almacenarLetrasChinas.add("苦 : " + LetrasLatinas.q);
		}
		if (LetrasLatinas.r > 0) {
			almacenarLetrasChinas.add("艾和 : " + LetrasLatinas.r);
		}
		if (LetrasLatinas.s > 0) {
			almacenarLetrasChinas.add("艾色 : " + LetrasLatinas.s);
		}
		if (LetrasLatinas.t > 0) {
			almacenarLetrasChinas.add("特 : " + LetrasLatinas.t);
		}
		if (LetrasLatinas.u > 0) {
			almacenarLetrasChinas.add("吴 : " + LetrasLatinas.u);
		}
		if (LetrasLatinas.v > 0) {
			almacenarLetrasChinas.add("吴维 : " + LetrasLatinas.v);
		}
		if (LetrasLatinas.w > 0) {
			almacenarLetrasChinas.add("吴维豆布勒 : " + LetrasLatinas.w);
		}
		if (LetrasLatinas.x > 0) {
			almacenarLetrasChinas.add("艾吉尺 : " + LetrasLatinas.x);
		}
		if (LetrasLatinas.y > 0) {
			almacenarLetrasChinas.add("伊列哈 : " + LetrasLatinas.y);
		}
		if (LetrasLatinas.z > 0) {
			almacenarLetrasChinas.add("舍塔 : " + LetrasLatinas.z);
		}
	}

	/**
	 * Cambia el idioma por defecto del sistema
	 */
	public static void setFormatLatino() {
		setLetrasVocalesConsonantesChinas();
// Ruta donde se encuentra los archivos para traducir las palabras
		String ruta = "t15/pag383/ejercicio5/estadisticas/chinas/resource/ejercicio15_06";
//Establecer Idiomas para la tradución
		Locale.setDefault(Locale.CHINA);
// print ISO3 country name for locale
		Locale localizacion = Locale.getDefault();
// Localización del idioma
		System.out.println("Pais : " + localizacion);
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
		for (int i = 0; i < almacenarLetrasChinas.size(); i++) {
			SilabasLatinas.getSilabas();
			acumulador = (MessageFormat.format(mensaje, almacenarLetrasChinas.get(i)));
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
		setVocalConsonantesChinas(SilabasLatinas.getSilabas());
		setLetrasVocalesConsonantesChinas();
	}

}
