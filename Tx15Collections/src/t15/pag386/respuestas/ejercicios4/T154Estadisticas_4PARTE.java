/**
 * Formatear el contenido del diccionario utilizando el metodo pintaMapa
 * 
 * Crea un StringBuilder vacio
 * 
 * Por cada una de las entradas en el diccionario
 * 
 * ----> Formatear el mensaje
 * ----> Lo concatena al String que estamos construyendo
 * 
 * 
 */
package t15.pag386.respuestas.ejercicios4;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @date 26 oct 2022 20:55:08
 * 
 * @author RVS
 *
 */
public class T154Estadisticas_4PARTE {

	public static void main(String[] args) {

		List<String> lista = T154Estadisticas_2PARTE.generaLista();
		Map<Character, Integer> mapa = T154Estadisticas_3PARTE.cuentaLetras(lista);
		pintMapa(mapa);

	}

	/**
	 * Función de Instancia
	 * 
	 * @param mapa - Map<Character , Integer> - Recibe por parametro un objeto de
	 *             tipo mapa con la letra y el numero de veces que repite
	 */
	private static void pintMapa(Map<Character, Integer> mapa) {
//  Creamos un objeto de tipo StringBuilder para almacenar caracteres		
		StringBuilder sb = new StringBuilder();
// Recorremos el objeto mapa con las "clave/valor" mediante la interface Entry 		
		for (Entry<Character, Integer> entry : mapa.entrySet()) {
// Mostramos los valores del objeto map del metodo 'getKey' y 'getValue' mediante el metodo format de la clase MessageFormat
// y lo almacenamos dentro de la variable 'm' de la clase String
			String m = MessageFormat.format("{0} ha salido {1} veces \n", entry.getKey(), entry.getValue());
// Añadimos el objeto 'm' del tipo String dentro del objeto 'sb' mediante el metodo 'append'			
			sb.append(m);
		}
// Mostramos el resultado final		
		System.out.println(sb.toString());
	}

}
