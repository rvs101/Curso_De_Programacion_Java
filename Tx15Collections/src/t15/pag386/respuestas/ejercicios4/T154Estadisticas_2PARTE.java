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

	private static final Random RND = new Random();
	private static final int NUM_LETRAS = 26;
	private static final char PRIMERA_LETRA = 'a';
//	private static final int TAM = 1000;
	private static final int TAM = 10;

	public static void main(String[] args) {
		List<String> lista = generaLista();
		System.out.println(lista);

	}

	/**
	 * Función de Clase
	 * 
	 * @return
	 */
	public static List<String> generaLista() {
// Interface<Tipo Elemento - String> 
//		             ref.objeto 
//		                         Clase ArrayList Implementa la Interface List<>
		List<String> lista = new ArrayList<>(TAM);
		for (int i = 0; i < TAM; i++) {
			lista.add(T154Estadisticas_1PARTE.generaSilaba());
		}
		return lista;
	}

}
