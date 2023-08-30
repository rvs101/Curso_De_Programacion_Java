package rvs.libro.pag47.teoria.uso.sockets.ejemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
* <p>Título: Aprendiendo Java</p>
* <p>Descripción: Ejemplos del Libro Aprendiendo Java de Compunauta</p>
* <p>Copyright: Copyright (c) 2006 www.compunauta.com</p>
* <p>Empresa: COMPUNAUTA</p>
* @author Gustavo Guillermo Pérez
* @version 2006.01.01
*/

/**
 * Clase Socket Secretaria<br>
 * 
 * 26 jul 2023 - 13:58:21
 *
 * @author RVS
 *
 */
public class Cap3_sock_sec {

// Declaramos una variables globales a este tipo de datos
	public static int PORT = 4567;
// Declaramos una variables globales de la maquina local
	public static String HOST = "127.0.0.1";

	public static void main(String[] args) {
		System.err.println("Intentando conectar con la telefonista");
		Socket skt = (Socket) null;
		try {
			skt = new Socket(HOST, PORT);
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
			System.err.println("La telefonista no esta en linea");
			System.exit(-1);
		}

		int tel;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		try {
			ObjectOutputStream datos = new ObjectOutputStream(skt.getOutputStream());
			System.err.println("Nos conectamos con la telefonista: " + HOST + " : " + PORT);
			System.err.println("Ingrese el numero -1 para terminar");
			while (true) {
//				
				if ((tel = leerInt(teclado)) == -1) {
					System.err.println("Programa ha terminado");
					datos.writeInt(-1);
					datos.flush(); // Vacia los datos de memoria RAM al flujo de datos inmediantamente
					datos.close(); // Cerramos el flujo de datos y la conexion de red
					System.exit(0); // Salimos sin producir error
				} else {
					datos.writeInt(tel);
					datos.flush();
				}
			}
		} catch (IOException ex1) {
			ex1.printStackTrace(System.err);
		}
	}

	/**
	 * Metodo de clase<br>
	 * <br>
	 * 
	 * Lee por teclado un numero entero
	 * 
	 * @param buff - objeto - Clase BufferedReader para invocar metodos para
	 *             capturar por teclado el numero entero que se escriba
	 * @return - int - Valor entero de clase entero
	 */
	public static int leerInt(BufferedReader buff) {
		int leer = 0;
		boolean error;
		do {
			error = false;
			try {
				leer = Integer.parseInt(buff.readLine());
			} catch (NumberFormatException e) {
				System.err.println(" Error Entrada : " + e.getMessage() + " - Repetir?");
				e.printStackTrace(System.err);
				error = true;
			} catch (IOException ex) {
				System.err.println(" Error Entrada : " + ex.getMessage() + " - Repetir?");
				ex.printStackTrace(System.err);
			}
		} while (error);
		return leer;
	}

}
