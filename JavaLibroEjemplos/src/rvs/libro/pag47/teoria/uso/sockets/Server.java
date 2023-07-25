package rvs.libro.pag47.teoria.uso.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Clase Server <br>
 * <br>
 * ServerSocket implementa sockets de servidor que espera a que las solicitudes
 * lleguen a traves de la red <br>
 * <br>
 * Realiza alguna operacion basada en esa solicitud y luego devuelve el
 * resultado al solicitante<br>
 * <br>
 * El trabajo real del objeto socket del servidor lo realiza una instancia de la
 * clase SocketImplm <br>
 * <br>
 * ServerSocket define metodos convenientes para configurar y obtener varias
 * opciones de socket <br>
 * <br>
 * <hr>
 * Usar la clase ServerSocket para crear un servidor que escuche en el puerto
 * 1234
 * 
 * 24 jul 2023 - 19:39:17
 *
 * @author RVS
 *
 */
public class Server {

	public static void main(String[] args) {

		final int port = 1234;

		try (ServerSocket serverSocket = new ServerSocket(port)) {

			System.out.println("Servidor escuchando en el puerto : " + port);

			while (true) {
				Socket clientSocket = serverSocket.accept();
// • Manejar la conexion con el cliente en un nuevo hilo de ejecución
				new Thread(new ClientHandler(clientSocket)).start();
			}
		} catch (IOException e) {
			System.err.println("Error al iniciar el servidor : " + e.getMessage());
			e.printStackTrace(System.err);
			System.exit(-1);
		}
	}
}
