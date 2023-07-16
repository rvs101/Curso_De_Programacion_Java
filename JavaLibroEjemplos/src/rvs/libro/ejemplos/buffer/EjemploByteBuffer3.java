package rvs.libro.ejemplos.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Es una clase en Java que se utiliza para leer texto de una fuente de entrada
 * de caracteres, como un archivo o un flujo de entrada.<br>
 * <br>
 * BufferedReader lee el texto en un búfer para reducir el número de operaciones
 * de lectura y mejorar el rendimiento del programa
 * 
 * 31 may 2023 - 20:26:08
 * 
 * @author RVS
 *
 */
public class EjemploByteBuffer3 {

	/**
	 * Constante de Clase
	 */
	public static final String RUTA = "..\\JavaLibroEjemplos\\src\\rvs\\libro\\java\\ejemplos\\buffer\\archivo_buffer.txt";

	/**
	 * Atributo de Clase - Se utiliza para indicar el numero de lineas
	 */
	public static int contador = 1;

	/**
	 * Devuelve la ruta del archivo
	 * 
	 * @return RUTA
	 */
	public static String getRuta() {
		return RUTA;
	}

	/**
	 * Devuelve el numero de lineas que aparece en el archivo
	 * 
	 * @return contador
	 */
	public static int getContador() {
		return contador++;
	}

	/**
	 * Lee una linea hasta que llega al '\r' o al '\n' del EOF del programa
	 */
	public static String parrafo = null;
	
	
	public static void main(String[] args) {
		showText(getRuta());
	}

	/**
	 * 
	 * @param archivo
	 */
	public static void showText(String archivo) {

		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

			while ((parrafo = br.readLine()) != null) {
				System.out.println((getContador()) + " " + parrafo);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}
