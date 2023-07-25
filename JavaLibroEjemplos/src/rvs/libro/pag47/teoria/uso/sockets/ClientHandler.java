package rvs.libro.pag47.teoria.uso.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * La clase `ClientHandler` es una interfaz de cliente para invocar una API <br>
 * <br>
 * Es una clase abstracta que extiende `Object` y es conocida por tener una
 * subclase directa llamada `ClientHandlerImpl`
 * 
 * 24 jul 2023 - 19:47:49
 *
 * @author RVS
 *
 */
public class ClientHandler implements Runnable {

	/**
	 * Atributo de instancia <br>
	 * <br>
	 * Objeto de la clase Socket que se utiliza para transmitir y recibir datos a
	 * traves de la red utilizando el protocolo TCP
	 */
	private final Socket clientSocket;

	/**
	 * Constructor parametrizados <br>
	 * <br>
	 * 
	 * @param clientSocket - objeto de la clase Socket que se utiliza para la
	 *                     transmisión de datos
	 */
	public ClientHandler(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	/**
	 * Metodo sobreescrito <br>
	 * <br>
	 * Crea un BufferedReader para leer datos del cliente y entrar en un bucle donde
	 * lee lineas del cliente y las imprime en la consola
	 * 
	 */
	@Override
	public void run() {
		String line;
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
			while ((line = reader.readLine()) != null) {
				System.out.println("Mensaje del cliente : " + line);
			}
		} catch (IOException e) {
			System.err.println("Error al leer del cliente: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
