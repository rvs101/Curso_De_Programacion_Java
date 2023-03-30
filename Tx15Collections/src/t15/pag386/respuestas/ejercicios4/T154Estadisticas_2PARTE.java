/**
 * 2. Generación de la lista de sílabas
 * 	2.1 Creamos una lista del tamaño indicado. Como es una lista bastante grande , de mil elementos , 
 * 		así evitamos que Java tenga que ir haciendola crecer desde su capacidad incial por defecto (diez) hasta los mil poco a poco
 *  2.2 Iteramos mil veces para añadir a la lista una silaba generada
 *  2.3 Desde el main llamamos a generaLista en vez de a generaSilaba
 * 
 */
package t15.pag386.respuestas.ejercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @date 20 oct 2022 18:06:12
 * 
 * @author RVS
 *
 */
public class T154Estadisticas_2PARTE {

	/**
	 * CONSTANTE tipo objeto Random para invocar todos los metodos de la clase
	 * Random
	 */
	private static final Random RND = new Random();

	/**
	 * CONSTANTE tipo entero almacena el valor 26
	 */
	private static final int NUM_LETRAS = 26;

	/**
	 * CONSTANTE tipo char almacena el caracter 'a'
	 */
	private static final char PRIMERA_LETRA = 'a';
//	private static final int TAM = 1000;

	/**
	 * CONSTANTE tipo int almacena el valor 10
	 */
	private static final int TAM = 10;

	public static void main(String[] args) {
// Creamos una lista mutable de elementos desde la interface List<String> de objetos de tipo String
//   La lista almacenará la posición en memoria del metodo generaLista() para ejecutarlo cuando se invoque
		List<String> lista = generaLista();
//		Mostramos toda la lista de elementos
		System.out.println(lista);

	}

	/**
	 * Función de Clase
	 * 
	 * Crea una lista de objetos de tipo String mediante la interface List<String>
	 * implementada por la clase ArrayList , la cual la recorre 10 veces para
	 * almacenar las 2 silabas generadas por la función estática
	 * 
	 * @return - lista - objeto con una lista de 10 silabas
	 */
	public static List<String> generaLista() {
// Interface<Tipo Elemento - String> 
//		             ref.objeto 
//		                         Clase ArrayList Implementa la Interface List<>
		List<String> lista = new ArrayList<>(TAM);
// Recorrer el bucle 10 veces		
		for (int i = 0; i < TAM; i++) {
// Añadir elementos 'silabas' a la lista			
			lista.add(T154Estadisticas_1PARTE.generaSilaba());
		}
// Devuelve un objeto List<String> con las letras unidas	
		return lista;
	}

}
