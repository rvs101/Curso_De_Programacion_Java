package t15.pag385.respuestas.ejercicios2;

import java.util.StringTokenizer;

/**
 * Separando textos
 * 
 * @date 18 oct 2022 10:59:45
 * 
 * @author RVS
 *
 */
public class T152SeparandoTextos {

	/**
	 * CONSTANTE de clase tipo String
	 * 
	 * Elemento de separación
	 */
	private static final String COMA = ",";

	/**
	 * CONSTANTE de clase tipo String
	 * 
	 * Cadena de texto para inspeccionar
	 */
	public static final String TEXTO = "Con diez cañones por banda, "
			+ "viento en popa a toda vela, no corta el mar, sino vuela " + "un velero bergatín";

	/**
	 * Función de Clase
	 * 
	 * @param texto - String - Cadena de texto
	 * @return array String - devuelve un array de String con la división de las
	 *         frases a través de saltos de línea
	 */
	private static String[] separa(String texto) {
// Creamos un StringTokenizer sobre el texto recibido , utilizando como separador una coma		
		StringTokenizer st = new StringTokenizer(texto, COMA);
// Creamos una array de String del tamaño necesario para albergar todos los fragmemtos que obtendremo		
		String[] res = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
// Mientras haya más fragmentos , le añadimos al 'array' no sin antes limpiar espacios al principio y al final mediante el metodo (trim)
			res[i++] = st.nextToken().trim();
		}
// Devuelve el array String con los espacios y saltos eliminados		
		return res;
	}

	public static void main(String[] args) {

// Almacenamos el valor del metodo dentro del array 
		String[] res = separa(TEXTO);

// Bucle for
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

		System.out.println();

// Bucle foreach
		for (String valores : res) {
			System.out.println(valores);
		}

	}
}
