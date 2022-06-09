package ejemplo.practico.pag281.manejo.excepciones;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 
 * @author RVS
 * @time 2 jun 2022 - 13:20:51
 *
 */
public class Pag282ManejoExcepciones {

	public static void main(String[] args) {
		ExcepcionManejada.manejarExcepcion();
	}
}

/**
 * 
 * @author RVS
 * @time 2 jun 2022 - 13:20:18
 *
 */
class ExcepcionManejada {

	private static String ruta = "D:\\!Proyectos_Eclipse\\Curso_De_Programacion_Java\\Tx10ManejoExcepciones\\src\\ejemplo\\practico\\pag281\\manejo\\excepciones\\bitacora.log";

	private final static Logger LOGGER = Logger.getLogger("ejemplo.practico.pag281.manejo.excepciones");

	private final static Logger LOG_RAIZ = Logger.getLogger("ejemplo");
	private final static Logger LOG_SUBNIVEL = Logger.getLogger("ejemplo.practico");
	private final static Logger LOG_UNDER = Logger.getLogger("ejemplo.practico.pag281");
	private final static Logger LOG_UNDER2 = Logger.getLogger("ejemplo.practico.pag281.manejo.excepciones");

	public void controlar() {
		LOGGER.log(Level.INFO, "Proceso exitosos");
	}

	public void funcionDudosa() {
		LOGGER.log(Level.SEVERE, "ERROR MASIVO");
	}

	public void llamadaSistema() {
		LOGGER.log(Level.WARNING, "Ocurrio un error de acceso en 0xFF");
	}

	public static void manejarExcepcion() {

		Nulo nulo = null;

		try {

			Handler consoleHandler = new ConsoleHandler();
			Handler fileHandler = new FileHandler(ruta, false);
			SimpleFormatter simpleFormatter = new SimpleFormatter();
			fileHandler.setFormatter(simpleFormatter);

			LOG_RAIZ.addHandler(consoleHandler);
			LOG_RAIZ.addHandler(fileHandler);

			consoleHandler.setLevel(Level.ALL);
			fileHandler.setLevel(Level.ALL);

			LOGGER.log(Level.INFO, "○ Comprobación de errores inicializada");

//			Creamos los objetos de las otras clases
			Utilidades util = new Utilidades();
			Control control = new Control();
			InternalSys internalSys = new InternalSys();

			LOGGER.log(Level.INFO, "○ Llamadas a los componentes del sistema");

			util.funcionDudosa();
			control.controlar();
			internalSys.llamadaSistema();

			nulo.loQueSea();
			nulo.llamadaSistema();
			nulo.otraCosa();

			LOGGER.log(Level.INFO, "○ Probando manejo de excepciones");

			try {
				throw new Exception("ERROR DE CONTROL DE FLUJO DE PROGRAMA");
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, ExcepcionManejada.getStackTrace(e));
			}
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Error de IO");
		} catch (SecurityException e) {
			LOGGER.log(Level.SEVERE, "Error de Seguridad");
		} catch (NullPointerException npe) {
			npe.printStackTrace();
//			log.debug("Ups !! nulo es nulo , que mal rollo");
//			log.error(npe.getMessage(), npe);
//			npe.printStacktrace();
		}
	}

	/**
	 * 
	 * @param e
	 * @return
	 */
	public static String getStackTrace(Exception e) {
		StringWriter sWriter = new StringWriter();
		PrintWriter pWriter = new PrintWriter(sWriter);
		e.printStackTrace(pWriter);
		return sWriter.toString();
	}
}

/**
 * 
 * @author RVS
 * @time 2 jun 2022 - 13:21:20
 *
 */
class Nulo {

	private final static Logger LOGGER = Logger.getLogger("ejemplo.practico.pag281.manejo.excepciones.Nulo");

	/**
	 * Atributo de instancia
	 */
	private Nulo nulo;

	/**
	 * Constructor por defecto - Inicializa nulo a null
	 */
	public Nulo() {
	}

	/**
	 * Función de clase
	 * 
	 * Lanza un mensaje y el Error : NullPointerException
	 * 
	 * NullPointerException - El puntero del objeto instanciado no apunta a ninguna
	 * posición de la memoria donde haya un dato que le asigne
	 */
	public void loQueSea() {
		System.out.println("LANZO EL METODO : loQueSea");
		LOGGER.log(Level.WARNING, "• Ocurrio un error de acceso en 0xFF");
	}

	/**
	 * 
	 */
	public void otraCosa() {
		System.out.println("LANZO EL METODO : otraCosa");
		LOGGER.log(Level.INFO, "Proceso exitoso");
	}

	public void llamadaSistema() {
		LOGGER.log(Level.SEVERE, "ERROR MASIVO");
	}
}

/**
 * 
 * @author RVS
 * @time 2 jun 2022 - 20:46:38
 *
 */
class Control {

	private final static Logger LOGGER = Logger.getLogger("ejemplo.practico.pag281.manejo.excepciones.Control");

	public void controlar() {
		LOGGER.log(Level.INFO, "Proceso exitoso");
	}

}

/**
 * 
 * @author RVS
 * @time 2 jun 2022 - 20:46:41
 *
 */
class Utilidades {

	private final static Logger LOGGER = Logger.getLogger("ejemplo.practico.pag281.manejo.excepciones.Utilidades");

	public void funcionDudosa() {
		LOGGER.log(Level.SEVERE, "ERROR MASIVO");
	}
}

/**
 * 
 * @author RVS
 * @time 2 jun 2022 - 20:46:44
 *
 */
class InternalSys {

	private final static Logger LOGGER = Logger.getLogger("ejemplo.practico.pag281.manejo.excepciones.InternalSys");

	public void llamadaSistema() {
		LOGGER.log(Level.WARNING, "Ocurrio un error de acceso en 0xFF");
	}
}