package t15.pag383.ejercicio5.estadisticas.latinas;

import t15.pag383.ejercicio5.estadisticas.principal.T15EstadisticasGenerarNumeros;

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
public class T15EstadisticasLatinasVocalesConsonantes {

	public final static char[] VOCAL = { 'a', 'e', 'i', 'o', 'u' };

	public final static char[] CONSONANTE = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r',
			's', 't', 'v', 'w', 'x', 'y', 'z' };

	/**
	 * 
	 */
	public static String[] silabas = new String[10];

	/**
	 * 
	 * @return
	 */
	public static String[] getSilabasLatinas() {
		return silabas;
	}

	/**
	 * Genera silabas aleatorias
	 * 
	 * @return - String[] - Array de String de silabas
	 */
	public static String[] getSilabasLatinasCompletas() {
		for (int i = 0; i < getSilabasLatinas().length; i++) {
			for (int j = 0; j < getSilabasLatinas().length; j++) {
				if ((T15EstadisticasGenerarNumeros.getNumeroNumero() % 2) == 0) {
					T15EstadisticasLatinasVocalesConsonantes.getSilabasLatinas()[j] = String
							.valueOf(T15EstadisticasLatinasVocalesConsonantes.VOCAL[T15EstadisticasGenerarNumeros.getNumeroVocales()])
							.concat(String.valueOf(T15EstadisticasLatinasVocalesConsonantes.CONSONANTE[T15EstadisticasGenerarNumeros.getNumeroY()]));
				} else {
					T15EstadisticasLatinasVocalesConsonantes.getSilabasLatinas()[j] = String
							.valueOf(T15EstadisticasLatinasVocalesConsonantes.CONSONANTE[T15EstadisticasGenerarNumeros.getNumeroY()])
							.concat(String.valueOf(T15EstadisticasLatinasVocalesConsonantes.VOCAL[T15EstadisticasGenerarNumeros.getNumeroVocales()]));
				}
			}
		}
		return getSilabasLatinas();
	}

	/**
	 * Función de clase
	 * 
	 * Solo muestra las letras en lineas de 50 silabas
	 */
	public static void showSilabasLatinas() {
		int x = 1;
		for (String valor : T15EstadisticasLatinasVocalesConsonantes.getSilabasLatinasCompletas()) {
			if ((x %= 50) == 0) {
				System.out.println();
			} else {
				System.out.print(valor + " ");
			}
			x++;
		}
	}
}
