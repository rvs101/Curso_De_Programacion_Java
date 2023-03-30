package t15.pag390.respuestas.ejercicios5;

import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Map.Entry;

import t15.pag386.respuestas.ejercicios4.T154Estadisticas_2PARTE;
import t15.pag386.respuestas.ejercicios4.T154Estadisticas_3PARTE;

/**
 * Internacionalizar con una versión por defecto del ingles y dos versiones
 * especificas de China y Taiwan
 * 
 * Internacionalizar este código ; solo se vera afectado el metodo pintaMapa
 * 
 * Cambiamos el mensaje escrito 'a pelo' por un mensaje recuperado de un recurso
 * 
 * Creamos un fichero de propiedades con el mensaje en ingles
 * 
 * @date 26 oct 2022 23:01:52
 * 
 * @author RVS
 *
 */
public class T155Estadisticas_Chinas {

	public static void main(String[] args) {

		List<String> lista = T154Estadisticas_2PARTE.generaLista();
		Map<Character, Integer> mapa = T154Estadisticas_3PARTE.cuentaLetras(lista);
		Locale.setDefault(Locale.CHINA);
//		Locale.setDefault(Locale.TAIWAN);
//
		T155Estadisticas_Chinas.pintaMapaChinas(mapa);

	}

	/**
	 * Función de clase
	 * 
	 * Recibe por parametro un objeto de tipo mapa y lo añade a un objeto de tipo
	 * StringBuilder para mostrarlo por pantalla
	 * 
	 * @param mapa - objeto - Map<Character,String> que contiene la clave y el valor
	 *             de lo que recibe por parametro
	 */
	private static void pintaMapaChinas(Map<Character, Integer> mapa) {
// Creamos un objeto 'bundle' para obtener el archivo donde tiene agregado el contenido que queremos mostrar		
		ResourceBundle bundle = ResourceBundle.getBundle("ejercicio15_05");
// Establecemos la palabra 'mensaje' dentro del objeto 'mensaje' del tipo String
		String mensaje = bundle.getString("mensaje");
// Creamos un objeto del tipo 'StringBuilder' para almacenar los objetos de tipo cadena de texto		
		StringBuilder sb = new StringBuilder();

// Recorremos el objeto Map utilizando la interface Entry y obtenemos el conjunto tanto de elementos <K , V>		
		for (Entry<Character, Integer> entry : mapa.entrySet()) {
// Invoco el metodo static 'format' de MessageFormat para añadir la palabra 'mensaje' 
//	que se usara dentro del archivo 'properties' para enlazar los 2 contenidos que hemos obtenido
//	   del metodo 'entry' los cuales rescata tanto 'getKey' como 'getValue'
			String m = MessageFormat.format(mensaje, entry.getKey(), entry.getValue());
//	      y los añade al objeto String 'm' para insertarlo dentro del objeto 'sb' del StringBuilder
			sb.append(m);
		}
		System.out.println(sb.toString());
	}
}
