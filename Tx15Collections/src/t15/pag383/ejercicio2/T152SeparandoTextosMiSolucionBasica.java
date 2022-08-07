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
public class T152SeparandoTextosMiSolucionBasica {

	public static void main(String[] args) {
		SepararTexto.getShow();

	}
}

/**
 * Clase concreta con los metodos
 *
 * @author RVS
 *
 * @date 23 jul 2022 - 14:48:37
 *
 */
class SepararTexto {

	/**
	 * Elemento separador y a eliminar
	 */
	private static final char COMA = ',';

	/**
	 * CONSTANTE de Clase : Contiene el mensaje
	 */
	private static final String TEXTO = "Con diez cañones por banda, viento en popa a toda vela, no corta el mar, sino vuela un velero bergantín";

//	private static final String TEXTO = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años; era de complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de Quijada, o Quesada, que en esto hay alguna diferencia en los autores que deste caso escriben; aunque por conjeturas verosímiles se deja entender que se llamaba Quijana. Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.";

	/**
	 * Atributo de Clase sin instanciar
	 * 
	 * Se usará para almacenar todos los elementos que vayamos modificando de la
	 * cadena TEXTO
	 */
	private static char[] caracteresAux;

	/**
	 * Atributo de Clase
	 * 
	 * Crea un array de char con la longitud de la cadena de TEXTO
	 * 
	 */
	private static char[] caracteres = new char[TEXTO.length()];

	/**
	 * Atributo de Clase
	 * 
	 * @return - char - Devuelve el simbolo de la coma ','
	 */
	public static char getComa() {
		return COMA;
	}

	/**
	 * Atributo de Clase
	 * 
	 * @return - String - Devuelve una cadena con todo el texto
	 */
	public static String getTexto() {
		return TEXTO;
	}

	/**
	 * Procedimiento de Clase
	 * 
	 * Muestra la cadena de texto y la longitud del texto en caracteres
	 * 
	 */
	public static void verDatos() {
		System.out.println("--------");
		System.out.println("Longitud del String: " + getTexto().length());
		caracteres = new char[getTexto().length()]; // 103
		System.out.println("Longitud de los caracteres: " + caracteres.length);
//		Devuelve la cadena completa sin tener que recorrerla para verla
		System.out.println("--------");
		System.out.println(convertirStringEnCaracteres());
		System.out.println("--------");
	}

	/**
	 * Función de Clase
	 * 
	 * Convierte una cadena String en un array de char
	 * 
	 * @return array de char - Devuelve un array de char
	 */
	public static char[] convertirStringEnCaracteres() {
		for (int i = 0; i < getTexto().length(); i++) {
			caracteres[i] = getTexto().charAt(i);
		}
		return caracteres;
	}

	/**
	 * Función de Clase
	 * 
	 * Contabiliza el numero de simbolos de la coma ',' que contenga el texto y lo
	 * devuelve
	 * 
	 * @return int - numero de comas
	 */
	public static int getCuantasComas() {
		int comas = 0;
		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == ',') {
				comas++;
			}
		}
		return comas;
	}

	/**
	 * Función de Clase
	 * 
	 * Elimina todas las comas y todos los simbolos de espacios libres ' ' de un
	 * parrafo de texto y añade un salto de línea por cada simbolo de la coma ','
	 * que encuentre en la cadena de texto
	 * 
	 * @return array [] char - Devuelve un array de char sin las comas ni los
	 *         espacios y añadiendole un salto de linea
	 */
	public static char[] getQuitarComasEspacios() {
		int comas = 0;
		caracteres = convertirStringEnCaracteres(); // 103
		caracteresAux = new char[caracteres.length]; // 103 - (3 simbolos de la coma + 2 espacios por cada coma) = 97

		for (int i = 0; i < (caracteres.length - (getCuantasComas())); i++) { // 97 Vueltas
			if (caracteres[i] != ',') { // Si Hay Coma → 26 caracteres
				caracteresAux[i] = caracteres[i];
			} else if ((caracteres[i] == ',') && (caracteres[i + 1] == ' ')) {
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
