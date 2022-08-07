package string.array.ejemplos.basicos;

/**
 *
 * @author RVS
 *
 * @date 23 jul 2022 - 20:00:12
 *
 */
public class StringArrays {

	/**
	 * Longitud total : 103
	 */
	public static final String TEXTO = "Con diez cañones por banda, viento en popa a toda vela, no corta el mar, sino vuela un velero bergantín";

	/**
	 * 
	 * @return
	 */
	public static String getTexto() {
		return TEXTO;
	}

	/**
	 * 
	 */
	public static void showArrayChar() {
		char[] caracter = new char[getTexto().length()];
		char[] caracterAux = new char[caracter.length];

		for (int i = 0; i < getTexto().length(); i++) {
//			Array de caracteres rellenados
			caracter[i] = getTexto().charAt(i);
			System.out.print(caracter[i]);
		}
		System.out.println();

		for (int i = 0; i < caracter.length; i++) {
//	   		             26                      27
			if ((caracter[i] == ',') && (caracter[i + 1] == ' ')) {
//				           26            
				caracterAux[i] = '\n';
//				        26                26
				caracter[i] = caracterAux[i];
			} else {

			}
		}

		for (char c : caracter) {
			System.out.print(c);
		}

		System.out.println("\n -------");

		for (char c1 : caracterAux) {
			System.out.print(c1);
		}

	}

	public static void main(String[] args) {
		StringArrays.showArrayChar();

	}
}
