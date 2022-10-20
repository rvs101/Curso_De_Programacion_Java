package t15.pag383.pruebas.letras.chinas;

/**
 * Internacionaliza el programa del ejercicio 15.4 de forma que funcione por
 * defecto en ingles
 * 
 * Pero que tengas versiones distintas para China y Taiwan
 * 
 * @author RVS
 *
 * @date 31 ago 2022 - 20:27:01
 */
public class T15EstadisticasGenerarNumeros {

}	

/**
 * 
 * @author Roboto
 * @date 21 sept 2022 21:05:48
 */
class GenerarNumeros {

	/**
	 * Función de clase
	 * 
	 * Devuelve un numero entre 1 y 4
	 * 
	 * @return int - Numero entre 1 y 4
	 */
	public static int getNumeroVocales() {
		return (int) (Math.random() * (1 + 4));
	}

	/**
	 * Función de clase
	 * 
	 * Devuelve un numero entre 1 y 21
	 * 
	 * @return int - Numero entre 1 y 21
	 */
	public static int getNumeroY() {
		return (int) (Math.random() * (1 + 21));
	}

	/**
	 * Función de clase
	 * 
	 * Devuelve un numero entre 1 y 100
	 * 
	 * @return int - Numero entre 1 y 100
	 */
	public static int getNumeroNumero() {
		return (int) (Math.random() * (1 + 100));
	}
}
