package t15.pag383.ejercicio2;

import java.util.StringTokenizer;

/**
 * Solución del libro
 *
 * @author RVS
 *
 * @date 20 jul 2022 - 11:57:00
 *
 */
public class T152SeparandoTextosRepetirSolución {

	public static void main(String[] args) {

		SeparadorDeTexto.showText();
	}

}

class SeparadorDeTexto {

	private static final String COMA = ",";
	public static final String TEXTO = "Con diez cañones por banda, viento en popa a toda vela, no corta el mar, sino vuela un velero bergantín";

	/**
	 * 
	 * @return
	 */
	public static String getComa() {
		return COMA;
	}

	/**
	 * 
	 * @return
	 */
	public static String getTexto() {
		return TEXTO;
	}

	/**
	 * 
	 * @param texto
	 * @return
	 */
	private static String[] getSepara(String texto) {
		StringTokenizer st = new StringTokenizer(texto, getComa());
		String[] res = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreElements()) {
			res[i++] = st.nextToken().trim();
		}
		return res;
	}

	/**
	 * 
	 */
	public static void showText() {
		String[] resultado = getSepara(getTexto());
		for (String string : resultado) {
			System.out.println(string);
		}
	}
}
