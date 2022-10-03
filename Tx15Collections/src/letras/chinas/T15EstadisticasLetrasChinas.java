package letras.chinas;

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
	 * Procedimiento de clase
	 * 
	 * Muestra todas las letras almacenadas de cada letra dentro del array de String
	 * 
	 */
	public static void showTotalLetrasChinas() {
		System.out.println("\n-----  -------");
		System.out.println("VOCALES & CONSONANTES");
		System.out.println("-----------");
		System.out.println("Letra a - 阿 : " + a);
		System.out.println("Letra b - 贝: " + b);
		System.out.println("Letra c - 色: " + c);
		System.out.println("Letra d - 德: " + d);
		System.out.println("Letra e - 俄: " + e);
		System.out.println("Letra f - 俄非: " + f);
		System.out.println("Letra g - 黑: " + g);
		System.out.println("Letra h - 阿车: " + h);
		System.out.println("Letra i - 伊: " + i);
		System.out.println("Letra j - 厚塔: " + j);
		System.out.println("Letra k - 卡: " + k);
		System.out.println("Letra l - 艾勒: " + l);
		System.out.println("Letra m - 艾么: " + m);
		System.out.println("Letra n - 艾呢: " + n);
		System.out.println("Letra ñ - 艾涅: " + ñ);
		System.out.println("Letra o - 哦: " + o);
		System.out.println("Letra p - 佩: " + p);
		System.out.println("Letra q - 苦: " + q);
		System.out.println("Letra r - 艾和: " + r);
		System.out.println("Letra s - 艾色: " + s);
		System.out.println("Letra t - 特: " + t);
		System.out.println("Letra u - 吴: " + u);
		System.out.println("Letra v - 吴维: " + v);
		System.out.println("Letra w - 吴维豆布勒: " + w);
		System.out.println("Letra x - 艾吉尺: " + x);
		System.out.println("Letra y - 伊列哈: " + y);
		System.out.println("Letra z - 舍塔: " + z);
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
		setVocalConsonantesChinas(SilabasChinas.getSilabasChinas());
		showTotalLetrasChinas();
	}

}
