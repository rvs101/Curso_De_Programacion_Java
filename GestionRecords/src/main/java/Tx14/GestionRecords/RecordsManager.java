package Tx14.GestionRecords;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Tema 14 - Gestion de Records
 * 
 * @author Robot
 * @date 22 jun 2022 13:52:07
 */
public class RecordsManager {

//	Variable de instancia : Se usa para registrar los mensajes
	private static Logger logger = LogManager.getLogger(RecordsManager.class);

//	CONSTANTES
	private static final String INPUT_FILE = "puntuaciones.txt";
	private static final String OUTPUT_FILE = "records.txt";
	private static final int MIN_NAME_LENGTH = 6;
	private static final int MIN_SCORE = 1000;

	/**
	 * Atributo de clase - <b>Clase Random</b>
	 */
	private static Random r = new Random();

	public static void main(String[] args) throws IOException, PlayerNameTooShortException {
// (9)  Cerramos el Scanner del fichero de entrada	
// usando el try con recursos nos aseguramos de que el Scanner se cierra		
// Usaremos la interface <MAP> o diccionario para guardar los datos leidos 
// nombre como clave y puntuación como contenido
		try (Scanner sc = new Scanner(new File(INPUT_FILE))) {
			Map<String, Integer> players = new HashMap<String, Integer>();

// (1) Leer fichero de entrada
			Scanner s = new Scanner(new File(INPUT_FILE));
//	Mientras tenga más líneas
			while (s.hasNextLine()) {
// Cogemos la siguiente línea
				String line = s.nextLine();
// Y la troceamos por los espacios
				String[] data = line.split(" ");
// El primer fragmento sera el nombre del jugador 
				String name = data[0];
// y el segundo fragmento su puntuacion
				int score = Integer.parseInt(data[1]);
				validateName(name);
// (8) Validamos la puntuación
// los tratamos por separado para poder validar la puntuacion
// despues de haber arreglado el nombre
				try {
					validateScore(name, score);
				} catch (ScoreTooLowException stle) {
					logger.error(stle.getMessage());
					continue; // → Nos saltamos este jugador, vamos a la siguiente línea
				}
// añadimos este jugador al DICCIONARIO <Map> 
				players.put(name, score);
// Registramos las 'traces' de la ejecución			
				logger.info("Linea tratada correctamente: " + name + " - " + score);
			}

// (2) Mostrar por consola todos los datos guardados
			System.out.println("Datos procesados: ");
//		Recorremos todo el diccionario a traves 
			for (String name : players.keySet()) {
				System.out.println(name + ":\t" + players.get(name));
			}

// (3) Pedir confirmacion al usuario
			System.out.println("¿Son correctos? [S]i / [N]o");
// leemos la respuestas del usuario de la entrada estandar		
			Scanner sConsole = new Scanner(System.in);
			String answer = sConsole.next();
// y comprobamos si es afirmativa
			boolean confirmed = answer.equalsIgnoreCase("S");

// 4- Escribir a fichero
			if (confirmed) {
				System.out.println("Procedemos al volcado de datos del fichero...");
// Abrimos el fichero de salida para escribir en él
				FileOutputStream fos = new FileOutputStream(OUTPUT_FILE);
// Por cada uno de los jugadores en nuestro diccionario <Map>	
				for (String name : players.keySet()) {
//				escribimos una linea en el fichero de salida
					fos.write((name + " " + players.get(name) + "\n").getBytes());
				}
			}
		} catch (FileNotFoundException fnfe) {
			logger.error("No podemos ejecutar el programa porque no se encuentra el fichero de entrada esperado : "
					+ INPUT_FILE);
		}
	}

	/**
	 * Función de Clase
	 * 
	 * Devuelve un valor booleano dependiendo de la cadena de texto que reciba como
	 * parametro
	 * 
	 * Si la cadena es mejor que 6 devuelve <b>false</b>
	 * 
	 * Si la cadena es menor que 6 devuelve <b>true</b>
	 * 
	 * @param nombre - Recibe una cadena de texto
	 * @return String
	 */
	private static boolean validateName(String nombre) {
		int longitud = nombre.length();
		boolean valor = (longitud < 6) ? false : true;
		return valor;
	}

	/**
	 * Procedimiento de clase
	 * 
	 * Recibe por parametro un valor númerico el cual si es menor que MIN_SCORE
	 * lanza una excepción
	 * 
	 * @param name : String - Recibe cadena de texto
	 * @param score : int - Recibe un numero
	 * @throws ScoreTooLowException : Lanza una excepción del tipo ScoreTooLowException 
	 */
	private static void validateScore(String name, int score) throws ScoreTooLowException {
		if (score < MIN_SCORE) {
			throw new ScoreTooLowException(name, score);
		}
	}

	/**
	 * Función de Clase
	 * 
	 * @param name : String - Recibe por parametro una cadena en forma de nombre
	 * @return Devuelve la cadena de texto con un numero asignado
	 */
	private static String generateNewName(String name) {
//		Recibe por parametro una cadena texto a la cual le restamos la longitud que es 6 de la variable MIN_NAME_LENGTH 
		int randomSize = (MIN_NAME_LENGTH - name.length());
//		Ejecuta el bucle for tantas veces como de largo sea la cadena de letras
		for (int i = 0; i < randomSize; i++) {
//			Almacena el valor del numero aleatorio generado 
			int randomNum = r.nextInt(10);
//			Le añadimos el numero generado a la cadena de texto
			name += randomNum; // Añadimos un número más al final
		}
//		Devuelve la cadena de texto
		return name;
	}

//	/**
//	 * 
//	 * @param name
//	 * @param score
//	 * @throws PlayerNameTooShortException
//	 */
//	private static void validatePlayer(String name, int score) throws PlayerNameTooShortException {
//		if (name.length() < MIN_NAME_LENGTH) {
//			throw new PlayerNameTooShortException();
//		}
//	}

}
