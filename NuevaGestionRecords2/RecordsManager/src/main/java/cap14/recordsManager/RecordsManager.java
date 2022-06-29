package cap14.recordsManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Tema 14 - Funciona
 * 
 * @author Robot
 * @date 25 jun 2022 23:22:05
 */
public class RecordsManager {

	/**
	 * Atributo de clase - Creamos un objeto de tipo logger para generar mensaje de
	 * Log de errores
	 */
	private static Logger logger = LogManager.getLogger(RecordsManager.class);

//	CONSTANTE
	private static final String INPUT_FILE = "puntuaciones.txt";
	private static final String OUTPUT_FILE = "records.txt";
	private static final int MIN_NAME_LENGTH = 6;
	private static final int MIN_SCORE = 1000;

	/**
	 * Atributo de clase - Genera un numero aleatorio
	 */
	private static Random r = new Random();

	public static void main(String[] args) {

		/// (9) Cerramos el scanner del fichero de entrada
		// Usando el try con recursos nos aseguramos de que el Scanner se cierra
		try (Scanner sInput = new Scanner(new File(INPUT_FILE))) {
// Interface 'Map' - Collection → Key - Value → No ordena , No Sincroniza
//			                               Clase HashMap implementa esta interface 'Map'
			Map<String, Integer> players = new HashMap<String, Integer>();
			/// (1) Leer fichero de entrada
			while (sInput.hasNextLine()) {
//				Lee cada linea del archivo y la almacena 
				String line = sInput.nextLine();
//				Fragmenta la linea del archivo con un espacio en blanco y lo almacena dentro de un array de String
				String[] data = line.split(" ");
				try {
//					Posicion 0 del array de String lo almacena
					String name = data[0];
//					Posicion 1 del array lo convierte a entero y lo almacena en una variable entera
					int score = Integer.parseInt(data[1]);
					/// (7) Tratamos los problemas de validación del jugado
					try {
						validateName(name);
					} catch (PlayerNameTooShortException pntse) {
//						Mostramos mensaje de log
						logger.warn(pntse.getMessage());
//						Generamos un nuevo nombre
						name = generateNewName(name);
						System.out.println(" El nuevo nombre de usuario es " + name);
					}
					/// (8) Validamos la puntuación
					try {
						validateScore(name, score);
					} catch (ScoreTooLowException stle) {
						logger.error(stle.getMessage());
						System.out.println(" Jugador descartado");
						continue;
					}
					players.put(name, score);
					logger.info("Línea tratada correctamente: " + name + " - " + score);
				} catch (IndexOutOfBoundsException | NumberFormatException e) {
					logger.error("La línea no contiene los datos esperados (" + line + ")");
					// y seguimos con el while
				}
			}

			/// (2) Mostrar por consola todos los datos guardados
			System.out.println("Datos procesados: ");
			for (String name : players.keySet()) {
				System.out.println(name + ":\t" + players.get(name));
			}

			/// (3) Pedir confirmación al usuario
			System.out.println("¿Son correctos? [S]i/[N]o");
			/// (10) Cerramos el escáner de consola
			String answer;
			try (Scanner sConsole = new Scanner(System.in)) {
				answer = sConsole.next();
			}
			boolean confirmed = answer.equalsIgnoreCase("S");

			/// (4) Escribir a fichero
			if (confirmed) {
				System.out.println("Procedemos al volcado de datos del fichero...");
				/// (11) Cerramos el fichero de salida y controlamos IOE
				try (FileOutputStream fos = new FileOutputStream(OUTPUT_FILE)) {
					for (String name : players.keySet()) {
						fos.write((name + " " + players.get(name) + "\n").getBytes());
					}
				} catch (IOException ioe) {
					logger.error("No hemos podido escribir los resultados en el " + "fichero porque algo ha fallado: "
							+ ioe.getMessage());
				}
			}
		} catch (FileNotFoundException fnfe) {
			logger.error("No podemos ejecutar el programa porque no se encuentra " + "el fichero de entrada esperado: "
					+ INPUT_FILE);
		}
	}

	/**
	 * Función de clase
	 * 
	 * @param name : String - Nombre del usuario
	 * @throws PlayerNameTooShortException - Si el nombre del usuario es menor de 6
	 *                                     caracteres lanza una excepcion
	 */
	protected static void validateName(String name) throws PlayerNameTooShortException {
		/// (5) Validamos la longitud del nombre
		if (name.length() < MIN_NAME_LENGTH) {
			throw new PlayerNameTooShortException(name);
		}
	}

	/**
	 * Función de clase
	 * 
	 * Lanza una excepción si el usuario tiene menos del 6000 puntos
	 * 
	 * @param name  : String - Nombre del usuario
	 * @param score : int - Puntuación del usuario
	 * @throws ScoreTooLowException - Si el usuario tienen menos del 6000 puntos
	 */
	protected static void validateScore(String name, int score) throws ScoreTooLowException {
		/// (6) Validamos la puntuación mínima
		if (score < MIN_SCORE) {
			throw new ScoreTooLowException(name, score);
		}
	}

	/**
	 * Función de clase
	 * 
	 * Si el nombre es menor de 6 caracteres le añade numeros para implementarlos
	 * 
	 * @param name : String - nombre de usuario
	 * @return name : String - nombre de usuario con una serie de numeros añadidos
	 */
	protected static String generateNewName(String name) {
		int randomSize = (MIN_NAME_LENGTH - name.length());
		for (int i = 0; i < randomSize; i++) {
			int randomNum = r.nextInt(10);
			name += randomNum;
		}
		return name;
	}
}
