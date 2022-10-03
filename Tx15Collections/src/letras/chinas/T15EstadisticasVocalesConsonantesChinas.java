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
public class T15EstadisticasVocalesConsonantesChinas {

}

/**
 * 
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:51:51
 *
 */
class VocalesChinas {

	/**
	 * Vocales Chinas
	 */
	public final static char[] VOCAL = { '阿', '俄', '伊', '哦', '吴' };

}

/**
 * 
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:51:48
 *
 */
class ConsonantesChinas {

	/**
	 * Consonantes con caracteres chinos
	 */
	public final static String[] CONSONANTE = { "贝", "色", "德", "俄非", "黑", "阿车", "厚塔", "卡", "艾勒", "艾么", "艾呢", "艾涅", "佩",
			"苦", "艾和", "艾色", "特", "吴维", "吴维豆布勒", "艾吉尺", "伊列哈", "舍塔" };
}

/**
 *
 * @author RVS
 *
 * @date 1 sept 2022 - 18:51:44
 *
 */
class SilabasChinas {

	/**
	 * 
	 */
	public static String[] silabasChinas = new String[10];

	/**
	 * 
	 * @return
	 */
	public static String[] getSilabasChinas() {
		return silabasChinas;
	}

	/**
	 * Genera silabas aleatorias
	 * 
	 * @return - String[] - Array de String de silabas
	 */
	public static String[] getSilabasCompletasChinas() {

		for (int i = 0; i < getSilabasChinas().length; i++) {
			for (int j = 0; j < getSilabasChinas().length; j++) {
				if ((GenerarNumeros.getNumeroNumero() % 2) == 0) {
					SilabasChinas.getSilabasChinas()[j] = String
							.valueOf(VocalesChinas.VOCAL[GenerarNumeros.getNumeroVocales()]);
				} else {
					SilabasChinas.getSilabasChinas()[j] = String
							.valueOf(ConsonantesChinas.CONSONANTE[GenerarNumeros.getNumeroY()]);
				}
			}
		}
		return getSilabasChinas();
	}

	/**
	 * Función de clase
	 * 
	 * Solo muestra las letras en lineas de 50 silabas
	 */
	public static void showSilabasChinas() {
		int x = 1;
		for (String valor : SilabasChinas.getSilabasCompletasChinas()) {
			if ((x %= 50) == 0) {
				System.out.println();
			} else {
				System.out.print(valor + " ");
			}
			x++;
		}
	}
}
