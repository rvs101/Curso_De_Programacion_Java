package t15.pag383.ejercicio5.estadisticas.chinas;

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
public class T15EstadisticasChinasVocalesConsonantes {

	/**
	 * Vocales Chinas
	 */
	public final static char[] VOCAL = { '阿', '俄', '伊', '哦', '吴' };


	/**
	 * Consonantes con caracteres chinos
	 */
	public final static String[] CONSONANTE = { "贝", "色", "德", "俄非", "黑", "阿车", "厚塔", "卡", "艾勒", "艾么", "艾呢", "艾涅", "佩",
			"苦", "艾和", "艾色", "特", "吴维", "吴维豆布勒", "艾吉尺", "伊列哈", "舍塔" };

	
	/**
	 * 
	 */
	public static String[] silabas = new String[10];

	/**
	 * 
	 * @return
	 */
	public static String[] getSilabasChinasCompletas() {
		return silabas;
	}

	/**
	 * Genera silabas aleatorias
	 * 
	 * @return - String[] - Array de String de silabas
	 */
	public static String[] getSilabasCompletasChinas() {
		for (int i = 0; i < getSilabasChinasCompletas().length; i++) {
			for (int j = 0; j < getSilabasChinasCompletas().length; j++) {
				if ((T15EstadisticasGenerarNumeros.getNumeroNumero() % 2) == 0) {
					T15EstadisticasChinasVocalesConsonantes.getSilabasChinasCompletas()[j] = String
							.valueOf(T15EstadisticasChinasVocalesConsonantes.VOCAL[T15EstadisticasGenerarNumeros.getNumeroVocales()]);
				} else {
					T15EstadisticasChinasVocalesConsonantes.getSilabasChinasCompletas()[j] = String
							.valueOf(T15EstadisticasChinasVocalesConsonantes.CONSONANTE[T15EstadisticasGenerarNumeros.getNumeroY()]);
				}
			}
		}
		return getSilabasChinasCompletas();
	}

	/**
	 * Función de clase
	 * 
	 * Solo muestra las letras en lineas de 50 silabas
	 */
	public static void showSilabasChinas() {
		int x = 1;
		for (String valor : T15EstadisticasChinasVocalesConsonantes.getSilabasCompletasChinas()) {
			if ((x %= 50) == 0) {
				System.out.println();
			} else {
				System.out.print(valor + " ");
			}
			x++;
		}
	}
}
