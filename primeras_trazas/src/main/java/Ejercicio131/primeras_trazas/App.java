package Ejercicio131.primeras_trazas;

import java.text.MessageFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

	private static Logger logger = LogManager.getLogger(App.class);

	private static void pintaResultadoPlantar(IPlanta planta, IMaceta maceta) {
		if (maceta != null) {
			logger.info("He plantado " + planta.getNombre() + " en " + maceta.getNombre());
		} else {
			logger.warn("No he podido plantar " + planta.getNombre());
		}
	}

	public static void main(String[] args) {

	}
}

interface IPlanta {

	public String getNombre();
}

interface IMaceta {

	public String getNombre();
}

/**
 * 
 * @author Robot
 * @date 21 jun 2022 23:30:08
 */
class Planta implements IPlanta {

	@Override
	public String getNombre() {
		return "Planta";
	}

}

/**
 * 
 * @author Robot
 * @date 21 jun 2022 23:30:05
 */
class Maceta implements IMaceta {

	@Override
	public String getNombre() {
		return "Maceta";
	}

}