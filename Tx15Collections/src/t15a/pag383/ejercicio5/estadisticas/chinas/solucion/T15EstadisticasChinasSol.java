package t15a.pag383.ejercicio5.estadisticas.chinas.solucion;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * Internacionaliza el programa del ejercicio 15.5
 * 
 * De forma que funcione por defecto en ingles pero que tengas versiones
 * distintas para China y Taiwan
 * 
 *
 * @author RVS
 *
 * @date 31 ago 2022 - 20:27:01 d
 */
public class T15EstadisticasChinasSol {

	private static final Random RND = new Random();
	private static final int NUM_LETRAS = 26;
	private static final char PRIMERA_LETRA = 'a';
	private static final int TAM = 10;

	public static void main(String[] args) {
//		Locale.setDefault(Locale.CHINA);
//		Locale.setDefault(Locale.TAIWAN);
		Locale.setDefault(Locale.UK);

		List<String> lista = generaLista();
		Map<Character, Integer> mapa = cuentaLetras(lista);
		pintaMapa(mapa);
	}

	/**
	 * 
	 * @param mapa
	 */
	private static void pintaMapa(Map<Character, Integer> mapa) {
//		Archivo con la traduccion
		ResourceBundle bundle = ResourceBundle.getBundle("ejercicio15_05");
//		Palabra dentro del archivo con las posiciones de los elementos que quiero traducir
		String mensaje = bundle.getString("mensaje");
		
		StringBuilder sb = new StringBuilder();

		for (Entry<Character, Integer> entry : mapa.entrySet()) {
			String m = MessageFormat.format(mensaje, entry.getKey(), entry.getValue());
			sb.append(m);
		}
		System.out.println(sb.toString());
	}

	/**
	 * 
	 * @param lista
	 * @return
	 */
	private static Map<Character, Integer> cuentaLetras(List<String> lista) {
		
		Map<Character, Integer> mapa = new HashMap<>();

		for (String silaba : lista) {
			Character c = getPrimero(silaba);
			Integer cont = mapa.get(c);
			if (cont == null) {
				cont = 0;
			}
			mapa.put(c, ++cont);
		}
		return mapa;
	}

	/**
	 * 
	 * @param silaba
	 * @return
	 */
	private static Character getPrimero(String silaba) {
		return silaba.charAt(0);
	}

	/**
	 * 
	 * @return
	 */
	private static List<String> generaLista() {
		List<String> lista = new ArrayList<>(TAM);
		
		for (int i = 0; i < TAM; i++) {
			lista.add(generaSilaba());
		}
		return lista;
	}

	/**
	 * 
	 * @return
	 */
	private static String generaSilaba() {
		return generaLetra() + generaLetra();
	}

	/**
	 * 
	 * @return
	 */
	private static String generaLetra() {
		char c = (char) (PRIMERA_LETRA + RND.nextInt(NUM_LETRAS));
		return Character.toString(c);
	}

}

