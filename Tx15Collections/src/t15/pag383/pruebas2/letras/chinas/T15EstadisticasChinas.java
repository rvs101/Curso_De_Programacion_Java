package t15.pag383.pruebas2.letras.chinas;

import java.text.MessageFormat;
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
public class T15EstadisticasChinas {
	
	private static final String ruta =  "cadena/mensaje/formatos/mensaje";

	public static void main(String[] args) {
//		Silabas.getSilabasCompletas();
//		Silabas.showSilabas();
//		Letras.showLetras();
//		Mensajes.setFormat();
		
		
		String cadena1 = "en";
		String cadena2 = "EN";

//		Establece el idioma
		Locale.setDefault(new Locale(cadena1.toLowerCase(), cadena2.toUpperCase()));
		
		System.out.println("• Localización Actual : " + Locale.getDefault());
		
		Locale.setDefault(new Locale.Builder().setLanguage(cadena1.toLowerCase()).setRegion(cadena1.toUpperCase()).build());

//		Ruta donde esta el archivo con las traducciones y los acronimos que los identifica
		ResourceBundle bundle = ResourceBundle.getBundle(ruta,new Locale(cadena1.toLowerCase(), cadena1.toUpperCase()));
		
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

}

/**
 * 
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:51:51
 *
 */
class Vocales {

	public final static char[] VOCAL = { 'a', 'e', 'i', 'o', 'u' };

}

/**
 * 
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:51:48
 *
 */
class Consonantes {

	public final static char[] CONSONANTE = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r',
			's', 't', 'v', 'w', 'x', 'y', 'z' };
}

/**
 * 
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:51:44
 *
 */
class Silabas {

	public static String[] silabas = new String[10];

	/**
	 * 
	 * @return
	 */
	public static String[] getSilabas() {
		return silabas;
	}

	/**
	 * 
	 * @return
	 */
	public static String[] getSilabasCompletas() {

		for (int i = 0; i < getSilabas().length; i++) {
			for (int j = 0; j < getSilabas().length; j++) {

				if ((GenerarNumeros.getNumeroNumero() % 2) == 0) {
					Silabas.getSilabas()[j] = String.valueOf(Vocales.VOCAL[GenerarNumeros.getNumeroX()])
							.concat(String.valueOf(Consonantes.CONSONANTE[GenerarNumeros.getNumeroY()]));
				} else {
					Silabas.getSilabas()[j] = String.valueOf(Consonantes.CONSONANTE[GenerarNumeros.getNumeroY()])
							.concat(String.valueOf(Vocales.VOCAL[GenerarNumeros.getNumeroX()]));
				}
			}
		}
		return getSilabas();
	}

	/**
	 * Función de clase
	 * 
	 * Solo muestra las letras en lineas de 50 silabas
	 */
	public static void showSilabas() {
		int x = 1;
		for (String valor : Silabas.getSilabasCompletas()) {
			if ((x %= 50) == 0) {
				System.out.println();
			} else {
				System.out.print(valor + " ");
			}
			x++;
		}
	}
}

/**
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:56:21
 *
 */
class Letras {

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
	public static void setVocalConsonants(String[] letras) {
		for (int i = 0; i < letras.length; i++) {
			if (letras[i].charAt(0) == ('a')) {
				Letras.a++;
			}
			if (letras[i].charAt(0) == ('e')) {
				Letras.e++;
			}
			if (letras[i].charAt(0) == ('i')) {
				Letras.i++;
			}
			if (letras[i].charAt(0) == ('u')) {
				Letras.u++;
			}
			if (letras[i].charAt(0) == ('o')) {
				Letras.o++;
			}
			if (letras[i].charAt(0) == ('b')) {
				Letras.b++;
			}
			if (letras[i].charAt(0) == ('c')) {
				Letras.c++;
			}
			if (letras[i].charAt(0) == ('d')) {
				Letras.d++;
			}
			if (letras[i].charAt(0) == ('f')) {
				Letras.f++;
			}
			if (letras[i].charAt(0) == ('g')) {
				Letras.g++;
			}
			if (letras[i].charAt(0) == ('h')) {
				Letras.h++;
			}
			if (letras[i].charAt(0) == ('j')) {
				Letras.j++;
			}
			if (letras[i].charAt(0) == ('k')) {
				Letras.k++;
			}
			if (letras[i].charAt(0) == ('l')) {
				Letras.l++;
			}
			if (letras[i].charAt(0) == ('m')) {
				Letras.m++;
			}
			if (letras[i].charAt(0) == ('n')) {
				Letras.n++;
			}
			if (letras[i].charAt(0) == ('ñ')) {
				Letras.ñ++;
			}
			if (letras[i].charAt(0) == ('p')) {
				Letras.p++;
			}
			if (letras[i].charAt(0) == ('q')) {
				Letras.q++;
			}
			if (letras[i].charAt(0) == ('r')) {
				Letras.r++;
			}
			if (letras[i].charAt(0) == ('s')) {
				Letras.s++;
			}
			if (letras[i].charAt(0) == ('t')) {
				Letras.t++;
			}
			if (letras[i].charAt(0) == ('v')) {
				Letras.v++;
			}
			if (letras[i].charAt(0) == ('w')) {
				Letras.w++;
			}
			if (letras[i].charAt(0) == ('x')) {
				Letras.x++;
			}
			if (letras[i].charAt(0) == ('y')) {
				Letras.y++;
			}
			if (letras[i].charAt(0) == ('z')) {
				Letras.z++;
			}
		}
	}

	/**
	 * Procedimiento de clase
	 * 
	 * Muestra todas las letras almacenadas de cada letra dentro del array de String
	 * 
	 */
	public static void showTotalLetras() {
		System.out.println("\n------------");
		System.out.println("VOCALES & CONSONANTES");
		System.out.println("-----------");
		System.out.println("Letra a: " + a);
		System.out.println("Letra b: " + b);
		System.out.println("Letra c: " + c);
		System.out.println("Letra d: " + d);
		System.out.println("Letra e: " + e);
		System.out.println("Letra f: " + f);
		System.out.println("Letra g: " + g);
		System.out.println("Letra h: " + h);
		System.out.println("Letra i: " + i);
		System.out.println("Letra j: " + j);
		System.out.println("Letra k: " + k);
		System.out.println("Letra l: " + l);
		System.out.println("Letra m: " + m);
		System.out.println("Letra n: " + n);
		System.out.println("Letra ñ: " + ñ);
		System.out.println("Letra o: " + o);
		System.out.println("Letra p: " + p);
		System.out.println("Letra q: " + q);
		System.out.println("Letra r: " + r);
		System.out.println("Letra s: " + s);
		System.out.println("Letra t: " + t);
		System.out.println("Letra u: " + u);
		System.out.println("Letra v: " + v);
		System.out.println("Letra w: " + w);
		System.out.println("Letra x: " + x);
		System.out.println("Letra y: " + y);
		System.out.println("Letra z: " + z);
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
	public static void showLetras() {
		setVocalConsonants(Silabas.getSilabas());
		showTotalLetras();
	}

}

class GenerarNumeros {

	/**
	 * Función de clase
	 * 
	 * Devuelve un numero entre 1 y 4
	 * 
	 * @return int - Numero entre 1 y 4
	 */
	public static int getNumeroX() {
		return (int) (Math.random() * (1 + 4));
	}

	/**
	 * Función de clase
	 * 
	 * Devuelve un numero entre 1 y 21
	 * 
	 * @return int - Numero entre 1 y 21
	 */
	public static int getNumeroY() {
		return (int) (Math.random() * (1 + 21));
	}

	/**
	 * Función de clase
	 * 
	 * Devuelve un numero entre 1 y 100
	 * 
	 * @return int - Numero entre 1 y 100
	 */
	public static int getNumeroNumero() {
		return (int) (Math.random() * (1 + 100));
	}
}

/**
 * 
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:52:22
 *
 */
class Mensajes {

	

 
}
