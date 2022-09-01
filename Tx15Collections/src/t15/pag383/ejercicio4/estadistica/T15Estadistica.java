package t15.pag383.ejercicio4.estadistica;

/**
 * Escribe un programa que qenere mil silabas de dos letras ( legibles o no )
 * 
 * Luego contabilice cuantas empiezan por cada letra
 *
 * @author RVS
 *
 * @date 11 ago 2022 - 11:48:52
 *
 */
public class T15Estadistica {

	public static void main(String[] args) {
		Silabas.getSilabasCompletas();
		Silabas.showSilabas();
		Letras.showLetras();
	}

}

/**
 * SubClase Concreta - Vocales
 * 
 * Almacena las vocales
 *
 * @date 11 ago 2022 - 12:38:56
 *
 */
class Vocales {

	/**
	 * Atributo de clase - Array con todas las vocales
	 * 
	 */
	public final static char[] VOCAL = { 'a', 'e', 'i', 'o', 'u' };

}

/**
 * SubClase Concreta - Consonantes
 * 
 * Almacena las consonantes
 * 
 * @date 11 ago 2022 - 12:45:16
 *
 */
class Consonantes {

	/**
	 * Atributo de clase - Array con todas las consonantes
	 * 
	 */
	public final static char[] CONSONANTE = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r',
			's', 't', 'v', 'w', 'x', 'y', 'z' };

}

/**
 * SubClase Concreta
 *
 * @author RVS
 *
 * @date 11 ago 2022 - 12:45:21
 *
 */
class Silabas {

	/**
	 * Función de clase
	 * 
	 */
	public static String[] silabas = new String[1000];

	/**
	 * Función de clase
	 * 
	 * @return
	 */
	public static String[] getSilabas() {
		return silabas;
	}

	/**
	 * Función de clase
	 * 
	 * Genera las 1000 silabas de 2 letras de forma aleatoria
	 * 
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
 * SubClase Concreta
 * 
 * Generar numeros aleatorios
 *
 * @date 31 ago 2022 - 12:10:59
 *
 */
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
 * SubClase Concreta 
 * 
 * Almacena todas las vocales y consontantes de las silabas creadas
 *
 * @date 31 ago 2022 - 14:48:26
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
		System.out.println("------------");
		System.out.println("VOCALES & CONSONANTES");
		System.out.println("-----------");
		System.out.println("Letra a: " + a);
		System.out.println("Letra b: " + b);
		System.out.println("Letra c: " + c);
		System.out.println("Letra d: " + d);
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