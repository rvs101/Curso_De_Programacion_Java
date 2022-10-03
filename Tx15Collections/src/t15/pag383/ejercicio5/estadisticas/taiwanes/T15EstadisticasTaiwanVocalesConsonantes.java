package t15.pag383.ejercicio5.estadisticas.taiwanes;

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
public class T15EstadisticasTaiwanVocalesConsonantes {

	/**
	 * Vocales Chinas
	 */
	public final static char[] VOCAL = { 'ㄚ', 'ㄜ', 'ㄟ', 'ㄛ', 'ㄡ' };


	/**
	 * Consonantes con caracteres chinos
	 */
	public final static String[] CONSONANTE = { "ㄅ", "ㄘ", "ㄉ", "ㄈ", "ㄍ", "ㄟ", "ㄏ", "ㄐ", "ㄎ", "ㄌ", "ㄇ", "ㄋ", "ㄆ",
			"ㄑ", "ㄖ", "ㄙ", "ㄊ", "ㄩ", "ㄨ", "ㄒ", "牙", "ㄗ" };

	
	/**
	 * 
	 */
	public static String[] silabas = new String[10];

	/**
	 * 
	 * @return
	 */
	public static String[] getSilabasTaiwanCompletas() {
		return silabas;
	}

	/**
	 * Genera silabas aleatorias
	 * 
	 * @return - String[] - Array de String de silabas
	 */
	public static String[] getSilabasCompletasTaiwan() {
		for (int i = 0; i < getSilabasTaiwanCompletas().length; i++) {
			for (int j = 0; j < getSilabasTaiwanCompletas().length; j++) {
				if ((T15EstadisticasGenerarNumeros.getNumeroNumero() % 2) == 0) {
					T15EstadisticasTaiwanVocalesConsonantes.getSilabasTaiwanCompletas()[j] = String
							.valueOf(T15EstadisticasTaiwanVocalesConsonantes.VOCAL[T15EstadisticasGenerarNumeros.getNumeroVocales()]);
				} else {
					T15EstadisticasTaiwanVocalesConsonantes.getSilabasTaiwanCompletas()[j] = String
							.valueOf(T15EstadisticasTaiwanVocalesConsonantes.CONSONANTE[T15EstadisticasGenerarNumeros.getNumeroY()]);
				}
			}
		}
		return getSilabasTaiwanCompletas();
	}

	/**
	 * Función de clase
	 * 
	 * Solo muestra las letras en lineas de 50 silabas
	 */
	public static void showSilabasTaiwan() {
		int x = 1;
		for (String valor : T15EstadisticasTaiwanVocalesConsonantes.getSilabasCompletasTaiwan()) {
			if ((x %= 50) == 0) {
				System.out.println();
			} else {
				System.out.print(valor + " ");
			}
			x++;
		}
	}
}
