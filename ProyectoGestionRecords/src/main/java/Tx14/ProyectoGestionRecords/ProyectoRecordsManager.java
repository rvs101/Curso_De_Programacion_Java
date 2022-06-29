package Tx14.ProyectoGestionRecords;

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
 *
 * @author Robot
 * @date 27 jun 2022 16:49:23
 */
public class ProyectoRecordsManager {

	/**
	 * Atributo de clase
	 *
	 * Variable objeto de clase Logger para registrar todos los errores que se
	 * producen en la ejecución del programa
	 */
	private static Logger logger = LogManager.getLogger(ProyectoRecordsManager.class);

	/**
	 * CONSTANTES
	 */
	private static final String INPUT_FILE = "puntuaciones.txt";
	private static final String OUTPUT_FILE = "records.txt";
	private static final int MIN_NAME_LENGTH = 6;
	private static final int MIN_SCORE = 1000;

	/**
	 * Atributo de clase
	 *
	 * Creamos una variable objeto que apunta al constructor de la clase Random para
	 * poder invocar todo sus metodos
	 *
	 * Solo tenemos una copia de ese objeto de la clase
	 *
	 */
	private static Random r = new Random();

	public static void main(String[] args) throws IOException, ScoreTooLowException {

		// Usaremos un <Map> o Dictionary -> Key - Value = No Sincroniza , No Null
		// Nombre como clave y puntuación como contenido
//		(9) Cerramos el Scanner del fichero de entrada
		try (Scanner sInput = new Scanner(new File(INPUT_FILE))) {
			Map<String, Integer> players = new HashMap<>();

//		(1) Leer fichero de entrada
//			Scanner s = new Scanner(new File(INPUT_FILE));
//		Mientras tengas mas lineas
			while (sInput.hasNextLine()) {
//		Cogemos la siguiente linea
				String line = sInput.nextLine();
//		Y la troceamos por los espacios
				String[] data = line.split(" ");
				try {
//					El primer fragmento sera el nombre del jugador
					String name = data[0];
//					Y el segundo fragmento su puntacion
					int score = Integer.parseInt(data[1]);
//					(7) Tratamos los problemas de validación del jugador
					try {
						validateName(name);
					} catch (PlayerNameTooShortException pntse) {
						logger.warn(pntse.getMessage());
						name = generateNewName(name);
						System.out.println(" El nuevo nombre de usuario es " + name);
					}
//					(8) Validamos la puntuacion
					try {
						validateScore(name, score);
					} catch (ScoreTooLowException stle) {
						logger.error(stle.getMessage());
						System.out.println(" Jugador descartado");
						continue;
					}
					players.put(name, score);
					logger.info("Linea tratada correctamente: " + name + " - " + score);
				} catch (IndexOutOfBoundsException | NumberFormatException e) {
					logger.error("La linea no contiene los datos esperados (" + line + ")");
					// y seguimos con el while
				}
			}

//			(2) Mostrar por consola todos los datos guardados
			System.out.println("Datos procesados: ");
//			Obtenemos el 'Set=Conjunto' de todas las <key> contenidas en Map
			for (String name : players.keySet()) {
//				Salto de Linea y obtenemos el nombre del usuario
//				players.get → Devuelve el valor al que se asigna la clave especificada o nulo si este mapa no contiene ninguna asignación para la clave.
				System.out.println(name + ":\t" + players.get(name));
			}

//			(3) Pedir confirmación al usuario
			System.out.println("¿Son correctos? [S]i/[N]o");
//			(10) Cerramos el escaner de consola
			String answer;
//			System.in → Este flujo ya está abierto y listo para proporcionar datos de entrada.
			try (Scanner sConsole = new Scanner(System.in)) {
				answer = sConsole.next();
//				sConsole.next → Encuentra y d uelve el siguiente token completo de este scanner
			}
			boolean confirmed = answer.equalsIgnoreCase("S");

//			(4) Escribir a fichero
			if (confirmed) {
				System.out.println("Procedemos al volcado de datos del fichero...");
//			(11) Cerramos e lfichero de salida y controlamos IOE
				try (FileOutputStream fos = new FileOutputStream(OUTPUT_FILE)) {
					for (String name : players.keySet()) {
						fos.write((name + " " + players.get(name) + "\n").getBytes());
					}
				} catch (IOException ioe) {
					logger.error("No hemos podido escribir los resultados en el fichero porque algo ha fallado: "
							+ ioe.getMessage());
				}
			}
		} catch (FileNotFoundException fnfe) {
			logger.error(
					"No podemos ejecutar el programa porque no se encuentra en el fichero de entrada: " + INPUT_FILE);
		}
	}

	/**
	 * Función de clase
	 *
	 * (5) Validamos la longitud del nombre
	 *
	 * @param name String Recibe una cadena de texto por parametro
	 * @throws PlayerNameTooShortException Si el nombre del jugador es menor a 6
	 *                                     caracteres lanza la excepcion
	 */
	private static void validateName(String name) throws PlayerNameTooShortException {
		if (name.length() < MIN_NAME_LENGTH) {
			throw new PlayerNameTooShortException(name);
		}
	}

	/**
	 * Función de clase
	 *
	 * (6) Validamos la puntuacion mínima
	 *
	 * @param name  String Nombre del jugador
	 * @param score int Puntuación del jugador
	 * @throws ScoreTooLowException Si los puntos son por debajo de 6000 lanza una
	 *                              excepcion
	 */
	private static void validateScore(String name, int score) throws ScoreTooLowException {
		if (score < MIN_SCORE) {
			throw new ScoreTooLowException(name, score);
		}
	}

	/**
	 * Función de clase
	 *
	 * Devuelve una variable del tipo objeto String
	 *
	 * Si el nombre es menor que la longitud de 6 caracteres se le añaden un numero
	 * aleatorio entre 10 el numero de veces que sea la longitud después de restar
	 * <b> MIN_NAME_LENGTH - name.length() </b>
	 *
	 * @param name String El nombre que queremos asignarle al jugador
	 * @return nane String El nombre del jugador con o sin numeros de relleno
	 */
	private static String generateNewName(String name) {
		int randomSize = (MIN_NAME_LENGTH - name.length());
		for (int i = 0; i < randomSize; i++) {
			int randomNum = r.nextInt(10);
			name += randomNum;
		}
		return name;
	}

}
