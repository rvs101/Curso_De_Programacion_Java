package t15.pag383.ejercicio5.estadisticas.latinas;

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
public class T15EstadisticasLetrasLatinas {

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
	 * @param letras - Array de String con las palabras de 2 silabas
	 */
	public static void setVocalConsonantesLatin(String[] letras) {
		for (int i = 0; i < letras.length; i++) {
			if (letras[i].charAt(0) == 'a') {
				T15EstadisticasLetrasLatinas.a++;
			}
			if (letras[i].charAt(0) == 'b') {
				T15EstadisticasLetrasLatinas.b++;
			}
			if (letras[i].charAt(0) == 'c') {
				T15EstadisticasLetrasLatinas.c++;
			}
			if (letras[i].charAt(0) == 'd') {
				T15EstadisticasLetrasLatinas.d++;
			}
			if (letras[i].charAt(0) == 'e') {
				T15EstadisticasLetrasLatinas.e++;
			}
			if (letras[i].charAt(0) == 'f') {
				T15EstadisticasLetrasLatinas.f++;
			}
			if (letras[i].charAt(0) == 'g') {
				T15EstadisticasLetrasLatinas.g++;
			}
			if (letras[i].charAt(0) == 'h') {
				T15EstadisticasLetrasLatinas.h++;
			}
			if (letras[i].charAt(0) == 'i') {
				T15EstadisticasLetrasLatinas.i++;
			}
			if (letras[i].charAt(0) == 'j') {
				T15EstadisticasLetrasLatinas.j++;
			}
			if (letras[i].charAt(0) == 'k') {
				T15EstadisticasLetrasLatinas.k++;
			}
			if (letras[i].charAt(0) == 'l') {
				T15EstadisticasLetrasLatinas.l++;
			}
			if (letras[i].charAt(0) == 'm') {
				T15EstadisticasLetrasLatinas.m++;
			}
			if (letras[i].charAt(0) == 'n') {
				T15EstadisticasLetrasLatinas.n++;
			}
			if (letras[i].charAt(0) == 'ñ') {
				T15EstadisticasLetrasLatinas.ñ++;
			}
			if (letras[i].charAt(0) == 'o') {
				T15EstadisticasLetrasLatinas.o++;
			}
			if (letras[i].charAt(0) == 'p') {
				T15EstadisticasLetrasLatinas.p++;
			}
			if (letras[i].charAt(0) == 'q') {
				T15EstadisticasLetrasLatinas.q++;
			}
			if (letras[i].charAt(0) == 'r') {
				T15EstadisticasLetrasLatinas.r++;
			}
			if (letras[i].charAt(0) == 's') {
				T15EstadisticasLetrasLatinas.s++;
			}
			if (letras[i].charAt(0) == 't') {
				T15EstadisticasLetrasLatinas.t++;
			}
			if (letras[i].charAt(0) == 'u') {
				T15EstadisticasLetrasLatinas.u++;
			}
			if (letras[i].charAt(0) == 'v') {
				T15EstadisticasLetrasLatinas.v++;
			}
			if (letras[i].charAt(0) == 'w') {
				T15EstadisticasLetrasLatinas.w++;
			}
			if (letras[i].charAt(0) == 'x') {
				T15EstadisticasLetrasLatinas.x++;
			}
			if (letras[i].charAt(0) == 'y') {
				T15EstadisticasLetrasLatinas.y++;
			}
			if (letras[i].charAt(0) == 'z') {
				T15EstadisticasLetrasLatinas.z++;
			}
		}
	}

	/**
	 * 
	 */
	public static void setLetrasConsonantes() {
		almacenarLetras = new ArrayList<>();
		if (T15EstadisticasLetrasLatinas.a > 0) {
			almacenarLetras.add("a : " + T15EstadisticasLetrasLatinas.a);
		}
		if (T15EstadisticasLetrasLatinas.b > 0) {
			almacenarLetras.add("b : " + T15EstadisticasLetrasLatinas.b);
		}
		if (T15EstadisticasLetrasLatinas.c > 0) {
			almacenarLetras.add("c : " + T15EstadisticasLetrasLatinas.c);
		}
		if (T15EstadisticasLetrasLatinas.d > 0) {
			almacenarLetras.add("d : " + T15EstadisticasLetrasLatinas.d);
		}
		if (T15EstadisticasLetrasLatinas.e > 0) {
			almacenarLetras.add("e : " + T15EstadisticasLetrasLatinas.e);
		}
		if (T15EstadisticasLetrasLatinas.f > 0) {
			almacenarLetras.add("f : " + T15EstadisticasLetrasLatinas.f);
		}
		if (T15EstadisticasLetrasLatinas.g > 0) {
			almacenarLetras.add("g : " + T15EstadisticasLetrasLatinas.g);
		}
		if (T15EstadisticasLetrasLatinas.h > 0) {
			almacenarLetras.add("h : " + T15EstadisticasLetrasLatinas.h);
		}
		if (T15EstadisticasLetrasLatinas.i > 0) {
			almacenarLetras.add("i : " + T15EstadisticasLetrasLatinas.i);
		}
		if (T15EstadisticasLetrasLatinas.j > 0) {
			almacenarLetras.add("j : " + T15EstadisticasLetrasLatinas.j);
		}
		if (T15EstadisticasLetrasLatinas.k > 0) {
			almacenarLetras.add("k : " + T15EstadisticasLetrasLatinas.k);
		}
		if (T15EstadisticasLetrasLatinas.l > 0) {
			almacenarLetras.add("l : " + T15EstadisticasLetrasLatinas.l);
		}
		if (T15EstadisticasLetrasLatinas.m > 0) {
			almacenarLetras.add("m : " + T15EstadisticasLetrasLatinas.m);
		}
		if (T15EstadisticasLetrasLatinas.n > 0) {
			almacenarLetras.add("n : " + T15EstadisticasLetrasLatinas.n);
		}
		if (T15EstadisticasLetrasLatinas.ñ > 0) {
			almacenarLetras.add("ñ : " + T15EstadisticasLetrasLatinas.ñ);
		}
		if (T15EstadisticasLetrasLatinas.o > 0) {
			almacenarLetras.add("o : " + T15EstadisticasLetrasLatinas.o);
		}
		if (T15EstadisticasLetrasLatinas.p > 0) {
			almacenarLetras.add("p : " + T15EstadisticasLetrasLatinas.p);
		}
		if (T15EstadisticasLetrasLatinas.q > 0) {
			almacenarLetras.add("q : " + T15EstadisticasLetrasLatinas.q);
		}
		if (T15EstadisticasLetrasLatinas.r > 0) {
			almacenarLetras.add("r : " + T15EstadisticasLetrasLatinas.r);
		}
		if (T15EstadisticasLetrasLatinas.s > 0) {
			almacenarLetras.add("s : " + T15EstadisticasLetrasLatinas.s);
		}
		if (T15EstadisticasLetrasLatinas.t > 0) {
			almacenarLetras.add("t : " + T15EstadisticasLetrasLatinas.t);
		}
		if (T15EstadisticasLetrasLatinas.u > 0) {
			almacenarLetras.add("u : " + T15EstadisticasLetrasLatinas.u);
		}
		if (T15EstadisticasLetrasLatinas.v > 0) {
			almacenarLetras.add("v : " + T15EstadisticasLetrasLatinas.v);
		}
		if (T15EstadisticasLetrasLatinas.w > 0) {
			almacenarLetras.add("w : " + T15EstadisticasLetrasLatinas.w);
		}
		if (T15EstadisticasLetrasLatinas.x > 0) {
			almacenarLetras.add("x : " + T15EstadisticasLetrasLatinas.x);
		}
		if (T15EstadisticasLetrasLatinas.y > 0) {
			almacenarLetras.add("y : " + T15EstadisticasLetrasLatinas.y);
		}
		if (T15EstadisticasLetrasLatinas.z > 0) {
			almacenarLetras.add("z : " + T15EstadisticasLetrasLatinas.z);
		}
	}

	/**
	 * Cambia el idioma por defecto del sistema
	 */
	public static void setFormatLatino() {
		setLetrasConsonantes();
// Ruta donde se encuentra los archivos para traducir las palabras
		String ruta = "t15/pag383/ejercicio5/estadisticas/chinas/resource/ejercicio15_06";
//Establecer Idiomas para la tradución
		Locale.setDefault(Locale.ENGLISH);
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
			T15EstadisticasLatinasVocalesConsonantes.getSilabasLatinas();
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
	public static void showLetrasLatinas() {
		setVocalConsonantesLatin(T15EstadisticasLatinasVocalesConsonantes.getSilabasLatinas());
		T15EstadisticasLetrasLatinas.setFormatLatino();
	}
	
	/**
	 * 
	 * @return
	 */
	public static String[] getPalabrasLatinas() {
		return T15EstadisticasLatinasVocalesConsonantes.getSilabasLatinasCompletas();
	}
}
