package t15.pag383.ejercicio2.separa.texto;

import java.util.StringTokenizer;

/**
 * Solución del libro - Ejercicio 15-02
 *
 * @author RVS
 *
 * @date 20 jul 2022 - 11:57:00
 *
 */
public class T152SeparandoTextosSoluciónLibro {

	private static final String COMA = ",";
	public static final String TEXTO = "Con diez cañones por banda, "
			+ "viento en popa a toda vela, no corta el mar, sino vuela " + "un velero bergantín";

	private static String[] separa(String texto) {
		StringTokenizer st = new StringTokenizer(texto, COMA);
		String[] res = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			res[i++] = st.nextToken().trim();
		}
		return res;
	}

	public static void main(String[] args) {
		String[] res = separa(TEXTO);
		for (String string : res) {
			System.out.println(string);
		}
	}

}

class Ejercicio15_02 {

}
