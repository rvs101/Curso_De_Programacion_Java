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
public class T15EstadisticasLetrasLatinas {

}

/**
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:56:21
 *
 */
class LetrasLatinas {

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
	public static void setVocalConsonantes(String[] letras) {
		for (int i = 0; i < letras.length; i++) {
			if (letras[i].charAt(0) == 'a') {
				LetrasLatinas.a++;
			}
			if (letras[i].charAt(0) == 'b') {
				LetrasLatinas.b++;
			}
			if (letras[i].charAt(0) == 'c') {
				LetrasLatinas.c++;
			}
			if (letras[i].charAt(0) == 'd') {
				LetrasLatinas.d++;
			}
			if (letras[i].charAt(0) == 'e') {
				LetrasLatinas.e++;
			}
			if (letras[i].charAt(0) == 'f') {
				LetrasLatinas.f++;
			}
			if (letras[i].charAt(0) == 'g') {
				LetrasLatinas.g++;
			}
			if (letras[i].charAt(0) == 'h') {
				LetrasLatinas.h++;
			}
			if (letras[i].charAt(0) == 'i') {
				LetrasLatinas.i++;
			}
			if (letras[i].charAt(0) == 'j') {
				LetrasLatinas.j++;
			}
			if (letras[i].charAt(0) == 'k') {
				LetrasLatinas.k++;
			}
			if (letras[i].charAt(0) == 'l') {
				LetrasLatinas.l++;
			}
			if (letras[i].charAt(0) == 'm') {
				LetrasLatinas.m++;
			}
			if (letras[i].charAt(0) == 'n') {
				LetrasLatinas.n++;
			}
			if (letras[i].charAt(0) == 'ñ') {
				LetrasLatinas.ñ++;
			}
			if (letras[i].charAt(0) == 'o') {
				LetrasLatinas.o++;
			}
			if (letras[i].charAt(0) == 'p') {
				LetrasLatinas.p++;
			}
			if (letras[i].charAt(0) == 'q') {
				LetrasLatinas.q++;
			}
			if (letras[i].charAt(0) == 'r') {
				LetrasLatinas.r++;
			}
			if (letras[i].charAt(0) == 's') {
				LetrasLatinas.s++;
			}
			if (letras[i].charAt(0) == 't') {
				LetrasLatinas.t++;
			}
			if (letras[i].charAt(0) == 'u') {
				LetrasLatinas.u++;
			}
			if (letras[i].charAt(0) == 'v') {
				LetrasLatinas.v++;
			}
			if (letras[i].charAt(0) == 'w') {
				LetrasLatinas.w++;
			}
			if (letras[i].charAt(0) == 'x') {
				LetrasLatinas.x++;
			}
			if (letras[i].charAt(0) == 'y') {
				LetrasLatinas.y++;
			}
			if (letras[i].charAt(0) == 'z') {
				LetrasLatinas.z++;
			}
		}
	}

	/**
	 * 
	 */
	public static void setLetrasConsonantes() {
		almacenarLetras = new ArrayList<>();
		if (LetrasLatinas.a > 0) {
			almacenarLetras.add("a : " + LetrasLatinas.a);
		}
		if (LetrasLatinas.b > 0) {
			almacenarLetras.add("b : " + LetrasLatinas.b);
		}
		if (LetrasLatinas.c > 0) {
			almacenarLetras.add("c : " + LetrasLatinas.c);
		}
		if (LetrasLatinas.d > 0) {
			almacenarLetras.add("d : " + LetrasLatinas.d);
		}
		if (LetrasLatinas.e > 0) {
			almacenarLetras.add("e : " + LetrasLatinas.e);
		}
		if (LetrasLatinas.f > 0) {
			almacenarLetras.add("f : " + LetrasLatinas.f);
		}
		if (LetrasLatinas.g > 0) {
			almacenarLetras.add("g : " + LetrasLatinas.g);
		}
		if (LetrasLatinas.h > 0) {
			almacenarLetras.add("h : " + LetrasLatinas.h);
		}
		if (LetrasLatinas.i > 0) {
			almacenarLetras.add("i : " + LetrasLatinas.i);
		}
		if (LetrasLatinas.j > 0) {
			almacenarLetras.add("j : " + LetrasLatinas.j);
		}
		if (LetrasLatinas.k > 0) {
			almacenarLetras.add("k : " + LetrasLatinas.k);
		}
		if (LetrasLatinas.l > 0) {
			almacenarLetras.add("l : " + LetrasLatinas.l);
		}
		if (LetrasLatinas.m > 0) {
			almacenarLetras.add("m : " + LetrasLatinas.m);
		}
		if (LetrasLatinas.n > 0) {
			almacenarLetras.add("n : " + LetrasLatinas.n);
		}
		if (LetrasLatinas.ñ > 0) {
			almacenarLetras.add("ñ : " + LetrasLatinas.ñ);
		}
		if (LetrasLatinas.o > 0) {
			almacenarLetras.add("o : " + LetrasLatinas.o);
		}
		if (LetrasLatinas.p > 0) {
			almacenarLetras.add("p : " + LetrasLatinas.p);
		}
		if (LetrasLatinas.q > 0) {
			almacenarLetras.add("q : " + LetrasLatinas.q);
		}
		if (LetrasLatinas.r > 0) {
			almacenarLetras.add("r : " + LetrasLatinas.r);
		}
		if (LetrasLatinas.s > 0) {
			almacenarLetras.add("s : " + LetrasLatinas.s);
		}
		if (LetrasLatinas.t > 0) {
			almacenarLetras.add("t : " + LetrasLatinas.t);
		}
		if (LetrasLatinas.u > 0) {
			almacenarLetras.add("u : " + LetrasLatinas.u);
		}
		if (LetrasLatinas.v > 0) {
			almacenarLetras.add("v : " + LetrasLatinas.v);
		}
		if (LetrasLatinas.w > 0) {
			almacenarLetras.add("w : " + LetrasLatinas.w);
		}
		if (LetrasLatinas.x > 0) {
			almacenarLetras.add("x : " + LetrasLatinas.x);
		}
		if (LetrasLatinas.y > 0) {
			almacenarLetras.add("y : " + LetrasLatinas.y);
		}
		if (LetrasLatinas.z > 0) {
			almacenarLetras.add("z : " + LetrasLatinas.z);
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
			SilabasLatinas.getSilabas();
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
		setVocalConsonantes(SilabasLatinas.getSilabas());
		setFormatLatino();
	}
}
