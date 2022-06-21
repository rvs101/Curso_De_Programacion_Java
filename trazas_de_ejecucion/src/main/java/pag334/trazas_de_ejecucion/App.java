package pag334.trazas_de_ejecucion;

import java.text.MessageFormat;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

	private static Logger logger = LogManager.getLogger(App.class);

	/**
	 * Función de clase
	 * 
	 * Devuelve una cadena de texto con un número pasado por parametro
	 * 
	 * @param n - int : numero
	 * @return Cadena de texto más un numero
	 */
	public static String calculoPesado(int n) {
		String mensaje = "*** Aqui hacemos algo muy pesado" + n;
		System.out.println(mensaje);
		return mensaje;
	}

	public static void main(String[] args) {
// 1º de trazas (traces) configurado para que luego imprima una traza (trace) de cada nivel
		logger.fatal(MessageFormat.format("Nivel actual del log: {0}", logger.getLevel()));

// 2º Imprimimos de distintas formas mensajes de nivel info
		logger.trace("hola trace ♦ ");
		logger.debug("hola debug ♣ ");
		logger.info("hola info ♠ ");
		logger.warn("hola warn ☺ ");
		logger.error("hola error ☻ ");
		logger.fatal("hola fatal ♥ ");

		logger.log(Level.INFO, " Otra forma de hacerlo");

//		Aplicamos buena practica de comprobar : Evitar generar mensajes innecesarios	
		if (logger.isInfoEnabled()) {
			logger.info(calculoPesado(1));
		}
		logger.info(calculoPesado(2));
	}
}
