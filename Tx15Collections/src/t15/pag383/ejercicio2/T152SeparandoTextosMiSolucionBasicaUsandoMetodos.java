package t15.pag383.ejercicio2;

/**
 * Ejercicio :
 * 
 * 1- Separar frases desde la coma
 * 
 * 2- Eliminar la coma
 * 
 * 3- No dejar espacios libres
 *
 * @author RVS
 *
 * @date 23 jul 2022 - 14:48:40 → 3 ago 2022 - 14:46:03 
 *
 */
public class T152SeparandoTextosMiSolucionBasicaUsandoMetodos {

	public static void main(String[] args) {
		SepararTextoConMetodos.getShow();

	}
}

/**
 * 
 *
 * @author RVS
 *
 * @date 23 jul 2022 - 14:48:37
 *
 */
class SepararTextoConMetodos {

	/**
	 * Elemento separador y a eliminar
	 */
	private static final char COMA = ',';

	/**
	 * 
	 */
	private static final String TEXTO = "Con diez cañones por banda, viento en popa a toda vela, no corta el mar, sino vuela un velero bergantín";

	/**
	 * 
	 */
	private static char[] caracteresAux;

	/**
	 * 
	 */
	private static char[] caracteres = new char[TEXTO.length()];

	
	/**
	 * 
	 * @return
	 */
	public static char[] getCaracteres() {
		return caracteres;
	}
	
	/**
	 * 
	 * @return
	 */
	public static char[] getCaracteresAux() {
		return caracteresAux;
	}

	/**
	 * 
	 * @return
	 */
	public static char getComa() {
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
	 */
	public static void verDatos() {
		System.out.println("Longitud del String: " + getTexto().length());
		caracteres = new char[getTexto().length()]; // 103
		System.out.println("Longitud de los caracteres: " + caracteres.length);
//		Devuelve la cadena completa sin tener que recorrerla para verla
		System.out.println("--------");
		System.out.println(convertirStringEnCaracteres());
		System.out.println("--------");
	}

	/**
	 * 
	 * @return
	 */
	public static char[] convertirStringEnCaracteres() {
		for (int i = 0; i < getTexto().length(); i++) {
			getCaracteres()[i] = getTexto().charAt(i);
		}
		return getCaracteres();
	}

	/**
	 * 
	 * @return
	 */
	public static int getCuantasComas() {
		int comas = 0;
		for (int i = 0; i < getCaracteres().length; i++) {
			if (getCaracteres()[i] == ',') {
				comas++;
			}
		}
		return comas;
	}

	/**
	 * 
	 * @return
	 */
	public static char[] getQuitarComasEspacios() {
		int comas = 0;
		caracteres = convertirStringEnCaracteres(); // 103
		caracteresAux = new char[caracteres.length]; // 97

		for (int i = 0; i < (getCaracteres().length - (getCuantasComas())); i++) { // 97 Vueltas
			if (caracteres[i] != ',') { // Si Hay Coma → 26 caracteres
				caracteresAux[i] = caracteres[i];
			} else if (caracteres[i] == ',' && caracteres[i + 1] == ' ') {
				comas++;
				for (int j = 0; j < (caracteres.length - (comas)); j++) {
					if (comas <= getCuantasComas()) {
						caracteres[j] = caracteres[j + 1];
						caracteresAux[i] = '\n';
					}
				}
			}
		}
		return caracteresAux;
	}

	/**
	 * Función de Clase
	 * 
	 * Elimina los últimos simbolos de espacio libres ' ' al final del array del
	 * char
	 * 
	 * @return array [] char - Devuelve array sin los últimos espacios al final del
	 *         array
	 */
	public static char[] getQuitarEspaciosfinales() {
		char[] c = getQuitarComasEspacios();
		char[] cAux = new char[(c.length - getCuantasComas())];

		for (int i = 0; i < cAux.length; i++) {
			cAux[i] = c[i];
		}
		return cAux;
	}

	/**
	 * Procedimiento de Clase
	 * 
	 * Muestra el array de char sin los espacios al final ni con los simbolos de la
	 * comas y añadiendole saltos de linea
	 * 
	 */
	public static void getShow() {
		verDatos();
		for (char indice : getQuitarEspaciosfinales()) {
			System.out.print(indice);
		}
		System.out.println("\n--------");
	}

}
