package letras.chinas;

import java.io.UnsupportedEncodingException;

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
public class T15EstadisticaChinasMain {

	public static void main(String[] args) throws UnsupportedEncodingException {
		SilabasChinas.getSilabasCompletasChinas();
		SilabasChinas.showSilabasChinas();
		LetrasChinas.showLetras();

	 

	}
}
