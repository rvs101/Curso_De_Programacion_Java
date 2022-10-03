package t15.pag383.ejercicio5.estadisticas.chinas;

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
public class T15EstadisticasLatinasConsonantesVocales {

}

/**
 * 
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:51:51
 *
 */
class VocalesLatinas {

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
class ConsonantesLatinas {

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
class SilabasLatinas {

	/**
	 * 
	 */
	public static String[] silabas = new String[10];

	/**
	 * 
	 * @return
	 */
	public static String[] getSilabas() {
		return silabas;
	}

	/**
	 * Genera silabas aleatorias
	 * 
	 * @return - String[] - Array de String de silabas
	 */
	public static String[] getSilabasLatinasCompletas() {
		
		for (int i = 0; i < getSilabas().length; i++) {
			for (int j = 0; j < getSilabas().length; j++) {
				if ((GenerarNumeros.getNumeroNumero() % 2) == 0) {
					SilabasLatinas.getSilabas()[j] = String.valueOf(VocalesLatinas.VOCAL[GenerarNumeros.getNumeroVocales()])
							.concat(String.valueOf(ConsonantesLatinas.CONSONANTE[GenerarNumeros.getNumeroY()]));
				} else {
					SilabasLatinas.getSilabas()[j] = String.valueOf(ConsonantesLatinas.CONSONANTE[GenerarNumeros.getNumeroY()])
							.concat(String.valueOf(VocalesLatinas.VOCAL[GenerarNumeros.getNumeroVocales()]));
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
	public static void showSilabasLatinas() {
		int x = 1;
		for (String valor : SilabasLatinas.getSilabasLatinasCompletas()) {
			if ((x %= 50) == 0) {
				System.out.println();
			} else {
				System.out.print(valor + " ");
			}
			x++;
		}
	}
}
