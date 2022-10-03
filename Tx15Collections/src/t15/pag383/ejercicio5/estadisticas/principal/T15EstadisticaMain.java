package t15.pag383.ejercicio5.estadisticas.principal;


import t15.pag383.ejercicio5.estadisticas.chinas.T15EstadisticasLetrasChinas.*;
import t15.pag383.ejercicio5.estadisticas.chinas.T15EstadisticasVocalesConsonantesChinas.*;

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
public class T15EstadisticaMain {

	public static void main(String[] args) {
//		SilabasLatinas.getSilabasLatinasCompletas();
//		SilabasLatinas.showSilabasLatinas();
//		LetrasLatinas.showLetrasLatinas();
		
		SilabasChinas.getSilabasCompletasChinas();
		SilabasChinas.showSilabasChinas();
		LetrasChinas.showLetrasChinas();
		Mensajes.setFormatChina();
		
		
//		Mensajes.setFormat();
		
		
		
	}
}
