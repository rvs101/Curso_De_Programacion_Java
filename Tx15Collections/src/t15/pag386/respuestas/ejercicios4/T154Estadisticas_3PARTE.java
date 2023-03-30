/**
 * 2. Generación de la lista de	 sílabas
 * 	2.1 Creamos una lista del tamaño indicado. Como es una lista bastante grande , de mil elementos , 
 * 		así evitamos que Java tenga que ir haciendola crecer desde su capacidad incial por defecto (diez) hasta los mil poco a poco
 *  2.2 Iteramos mil veces para añadir a la lista una silaba generada
 *  2.3 Desde el main llamamos a generaLista en vez de a generaSilaba
 * 
 */
package t15.pag386.respuestas.ejercicios4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 
 * @date 24 oct 2022 17:37:45
 * 
 * @author RVS
 * 
 *         ♦ Contamos el número de sílabas que empiezan por cada letra
 * 
 *         ♦ Este tipo de operaciones se suelen resolver con un diccionario , en
 *         el que tendremos como clave la letra y como valor el contador de
 *         apariciones :
 * 
 *         • Creamos un método cuentaLetras() que recibe la lista y devuelve un
 *         diccionario
 * 
 *         • Dentro del metodo , creamos un diccionario vacio , con clave
 *         <b>Character</b> y valor <b>Integer</b>
 * 
 *         --→ Usamos las clases envolventes "Wrapper" porque las colecciones no
 *         admiten tipos primitivos
 * 
 *         • Para cada una de las silabas de la lista:
 * 
 *         --→ Obtenemos el primer caracter ( llamando a un metodo auxiliar que
 *         recupera el caracter en la primera posicion del <b>String</b>
 * 
 *         --→ Recuperamos el contador actual en el diccionario para ese
 *         caracter
 * 
 *         --→ Si el contador aun no existe , lo inicializamos a cero
 * 
 *         --→ Añadimos al mapa el caracter como clave y el contador
 *         preincrementado en uno como valor
 * 
 *         • Devolvemos el mapa , que pintaremos en el main
 *
 */
public class T154Estadisticas_3PARTE {

	/**
	 * CONSTANTE : Almacena dentro de un objeto de tipo Random una referencia al
	 * constructor Random para poder invocar su metodo dentro del script
	 * 
	 */
	private static final Random RND = new Random();

	/**
	 * CONSTANTE : Almacena dentro de un entero el numero 26
	 */
	private static final int NUM_LETRAS = 26;

	/**
	 * CONSTANTE : Almacena el caracter 'a' dentro de la palabra 'PRIMERA_LETRA'
	 */
	private static final char PRIMERA_LETRA = 'a';

	/**
	 * CONSTANTE : Almacena el numero 1000 dentro de la palabra TAM
	 */
	private static final int TAM = 1000;

	public static void main(String[] args) {

		List<String> lista = T154Estadisticas_2PARTE.generaLista();
		Map<Character, Integer> mapa = cuentaLetras(lista);
		System.out.println(mapa);

	}

	/**
	 * Función de clase
	 * 
	 * 
	 * 
	 * 
	 * @param lista - Inteface List<String>
	 * @return - map - Diccionario clave:'key' - valor:'value' que almacena la
	 *         cantidad de veces que aparece una letra en la lista 'Interface List'
	 *         de elementos
	 */
	public static Map<Character, Integer> cuentaLetras(List<String> lista) {
// Interface Map con clases Genericas
//		                        Ref.
//		                                   Constructor de la clase que lo implementa
		Map<Character, Integer> mapa = new HashMap<>();
// Foreach : Recorre todo los elementos de una List<String> recibida por parametro
		for (String silaba : lista) {
// Objeto Character almacena el resultado de la devolución de un objeto Character 			
			Character c = getPrimero(silaba);
// Creamos un objeto de tipo Integer 
//			               almacenamos en el objeto 'cont' el elemento value
			Integer cont = mapa.get(c);
// Si no existe referencia para 'cont' 			
			if (cont == null) {
// Inicializamos objeto 'cont' con 0				
				cont = 0;
			}
// Asociamos el valor de 'cont' con la clave 'c'  			
			mapa.put(c, ++cont);
		}
// Devuelve un objeto 'map' con las clave 'c' y el valor 'cont' asociado		
		return mapa;
	}

	/**
	 * Función de clase
	 * 
	 * Almacena la 1º letra de un String recibido por parametro
	 * 
	 * @param silaba - String - una cadena con dos caracteres
	 * 
	 * @return - Character - objeto de tipo character con una letra
	 */
	private static Character getPrimero(String silaba) {
		return silaba.charAt(0);
	}

}
