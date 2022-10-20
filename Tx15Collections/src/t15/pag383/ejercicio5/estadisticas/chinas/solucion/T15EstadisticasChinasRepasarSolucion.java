package t15.pag383.ejercicio5.estadisticas.chinas.solucion;

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
 * 
 * @date 5 oct 2022 20:12:12
 * 
 * @author RVS
 *
 */
public class T15EstadisticasChinasRepasarSolucion {

	/**
	 * Constante - Numero aleatorio usando la clase Random
	 */
	private static final Random RND = new Random();

	/**
	 * Constante - Numero total de letras para el abecedario sin 'ñ'
	 */
	private static final int NUM_LETRAS = 26;

	/**
	 * Constante char - 1º letra del abecedario
	 */
	private static final char PRIMERA_LETRA = 'a';

	/**
	 * Numero de latras que queremos representar
	 */
	private static final int TAM = 10;

	public static void main(String[] args) {
// Establece la configuración regional por defecto sin afectar a la configuración regional del host. 
		Locale.setDefault(Locale.UK);
//		Locale.setDefault(Locale.CHINESE);
//		Locale.setDefault(Locale.TAIWAN);

// Creamos objeto del Interface List<String> y que lo implemente la clase ArrayList<String>
		List<String> lista = generaLista();
// Creamos objeto del tipo Interface Map el cual almacena 		
		Map<Character, Integer> mapa = cuentaLetras(lista);
		pintaMapa(mapa);

	}

	/**
	 * Procedimiento estático
	 * 
	 * Establece el archivo en el que se va a escribir los textos y lo establece
	 * sobre la palabra 'mensaje'
	 * 
	 * @param mapa - Interface <Map> - Recibe un objeto heredado de la interface map
	 *             para iterar sobre él y sacar su clave y valor
	 */
	private static void pintaMapa(Map<Character, Integer> mapa) {
// Invocamos la clase "ResourceBundle" para obtener el archivo con el recurso con la traduccion
		ResourceBundle bundle = ResourceBundle.getBundle("ejercicio15_05");
// Invocamos el metodo 'getString' para obtener la palabra dentro del <recurso>
		String mensaje = bundle.getString("mensaje");
// Creamos un objeto de tipo String mutable 'no crea objetos nuevos'		
		StringBuilder sb = new StringBuilder();
// Entry = Interface para implementar colecciones del tipo <Map>	
//		           Clave      Valor
		for (Entry<Character, Integer> entry : mapa.entrySet()) {
// MessageFormat = medio para producir mensajes concatenados en un idioma neutral	
//			                                mensaje = identificador dentro del archivo para mostrar un mensaje
//			                                        introduce clave , introduce valor
			String m = MessageFormat.format(mensaje, entry.getKey(), entry.getValue());
// Añade a la cadena			
			sb.append(m);
		}
// Muestra la cadena		
		System.out.println(sb.toString());
	}

	/**
	 * Metodo estatico
	 * 
	 * Devuelve un objeto del tipo Interface <Map> implementado:
	 * 
	 * Clave : Character y Valor : Integer
	 * 
	 * @param lista - Interface <List> - Añade una lista de objetos
	 * @return
	 */
	private static Map<Character, Integer> cuentaLetras(List<String> lista) {
// Interface - Map<Clave,Valor> objeto = implementado con la clase HashMap		
		Map<Character, Integer> mapa = new HashMap<>();
// Usamos el parametro 'lista' de la interfaz <List>
		for (String silaba : lista) {
// Objeto 'c' de Character almacena el 1º caracter del String 'silaba'
			Character c = getPrimero(silaba);
// Creamos objeto del tipo 'Integer' y almacenamos la 1º letra
			Integer cont = mapa.get(c);
// Si para la letra que contiene mapa.get(c) la variable 'cont' apunta a 'null' 
			if (cont == null) {
// A la variable 'cont' de Integer le asignamos el valor 0
				cont = 0;
			}
// Objeto mapa añade tanto el valor de la letra 'c' como el incremento		
			mapa.put(c, ++cont);
		}
// Objeto mapa devuelve tanto el valor de la letra como su valor numerico		
		return mapa;
	}

	/**
	 * Metodo estatico
	 * 
	 * Devuelve el primer caracter de un String
	 * 
	 * @param silaba - String - Recibe por parametro un objeto String
	 * @return - Character - Devuelve la 1º letra de un objeto Character 'char'
	 */
	private static Character getPrimero(String silaba) {
		return silaba.charAt(0);
	}

	/**
	 * Metodo estático
	 * 
	 * @return - List<String> Devuelve un ArrayList de objetos String con 2 letras
	 */
	private static List<String> generaLista() {
// Interfaz 'List<String> se implementa con la clase ArrayList		
		List<String> lista = new ArrayList<>(TAM);
// Recorremos el bucle "for" 10 veces para almacenar 10 objetos del tipo ArrayList  		
		for (int i = 0; i < TAM; i++) {
// Añadimos en cada posición del ArrayList 2 letras aleatorias 			
			lista.add(generaSilaba());
		}
// Devuelve un ArrayList del tipo List<String> con 2 letras
		return lista;
	}

	/**
	 * Función estática
	 * 
	 * Devuelve la suma de 2 letras
	 * 
	 * @return La suma de 2 String
	 */
	private static String generaSilaba() {
		return generaLetra() + generaLetra();
	}

	/**
	 * Función estática
	 * 
	 * Devuelve una letra dentro del rango del abecedario
	 * 
	 * @return - String - una letra del abecedario
	 */
	private static String generaLetra() {
		char c = (char) (PRIMERA_LETRA + RND.nextInt(NUM_LETRAS));
		return Character.toString(c);
	}


}
