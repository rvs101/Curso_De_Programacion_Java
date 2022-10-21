/**
 * 1. Generación de las sílabas aleatorias
 * 	1.1 Generar constantes 
 * 	   1.1.1 Un objeto Random (del paquete java.util)
 * 	   1.1.2 El número de letras del abecedario
 *     1.1.3 El caracter con la primera letra
 *  1.2 Creamos un método para generar una letra
 *     1.1.1 Le sumamos a la primera letra , que en esta operacion Java la considerará un entero,
 *           un número aleatorio entre 0 y el numero de letras menos uno , y convertimos el resultado
 *           mediante un casting al tipo basico char
 *     1.1.2 Convertimos el resultado a String y lo devolvemos
 *     
 *     1.1.3 Creamos un metodo para generar una silaba de dos letras , que simplemente concatenara el resultado de llammar 2 veces a generarLetras
 *     1.1.4 LLamamos a generaSilaba desde el main y pintamos el resultado para comprobar que vamos bien , por ejemplo : op    
 * 
 */
package t15.pag386.respuestas.ejercicios4;

import java.util.Random;

/**
 * 
 * @date 20 oct 2022 18:06:12
 * 
 * @author RVS
 *
 */
public class T154Estadisticas_1PARTE {

	private static final Random RND = new Random();
	private static final int NUM_LETRAS = 26;
	private static final char PRIMERA_LETRA = 'a';

	public static void main(String[] args) {
		System.out.println(generaLetra());
	}

	/**
	 * Función de clase
	 * 
	 * Genera dos letras aleatorias y las une en una sola palabra
	 * 
	 * @return String - devuelve la suma de 2 caracteres para forma una sola letra
	 */
	public static String generaSilaba() {
		return generaLetra() + generaLetra();
	}

	/**
	 * Función de clase
	 * 
	 * Genera una letra de formma aleatoria
	 * 
	 * @return String - devuelve una letra del abecedario de forma aleatoria
	 */
	public static String generaLetra() {
		char c = (char) (PRIMERA_LETRA + RND.nextInt(NUM_LETRAS));
		return Character.toString(c);
	}

}
