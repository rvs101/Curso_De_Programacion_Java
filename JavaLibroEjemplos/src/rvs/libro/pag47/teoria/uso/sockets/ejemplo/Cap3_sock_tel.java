package rvs.libro.pag47.teoria.uso.sockets.ejemplo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
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
 * Clase Socket Telefono<br>
 * <br>
 * 24 jul 2023 - 22:44:52
 *
 * @author RVS
 *
 */
public class Cap3_sock_tel {
// Declaramos unas variables globales a este tipo de datos
	public static int PORT = 4567;
	public static int BUFF_SIZE = 40; // tamaño del buffer
	public static int TIMER_SLEEP = (60 * 1000);
	public static int buff_elem = 0;
	public static int[] buffer = new int[BUFF_SIZE];

	public static void main(String[] args) {
//Declaramos la variable 'socket' (sera un puntero a un objeto) - No apunta a ninguna referencia Socket
		Socket skt = (Socket) null;
//Declaramos vacío el "Servidor de Sockets" para inicializarlo - No apunta a ninguna referencia ServerSocket
		ServerSocket ss = (ServerSocket) null;
// Tratamos de escuchar por el "puerto 4567" definido por la variable PORT
		System.err.println("Escuchando el puerto: " + PORT);

		try {
			ss = new ServerSocket(PORT);
		} catch (IOException ex) {
			System.out.println("El sistema no permite abrir el puerto");
			System.err.println("Esperando conexion... ");
			System.exit(-1);
		}

		try {
			skt = ss.accept();
		} catch (IOException ex1) {
			System.out.println("Error - skt : " + ex1.getMessage());
			ex1.printStackTrace(System.err);
			System.exit(-1);
		}

		System.err.println("Conectado... Esperando telefonos");

		try {
//			Deserializar objetos y datos primitivos 
			ObjectInputStream datos = new ObjectInputStream(skt.getInputStream());
// Utilizaremos para medir el tiempo y asi crear nuestro temporizador			
			long timer = 0;
// Nos servirá de bandera para saber el estado del temporizador
			boolean timer_on = false;
// Leeremos datos hasta que la secretaria envie la señal de fin
// Mientras tengamos telefonos para mostrar en el buffer no podremos dejar
// de mostrarlo , se ejecutara siempre hasta que el programa lo decida
			while (true) {
// Si la conexión está cerrada && La cantidad de elementos del buffer es inferior a 1 
// o sucede que el elemento cero del buffer[0] es el número -1 
// Indica que la secretaria terminó entonces nos vamos 
// porque es el último elemento y no es necesario mostrarlo.
				if ((skt.isClosed() && (buff_elem < 1)) || (buffer[0] == -1)) {
					// Terminamos el programa si la secretaria termino
					System.err.println("Ultima llamada , nos vamos ... terminado");
					System.exit(0);
				}
// Si hay telefonos los guardamos
// Almacenamos numero entero desde la conexión de red de datos si hay datos disponibles
// Lo revisamos con la función available() que no se quedara esperando si existe o no
// datos disponibles
				if (datos.available() > 0) {
					put_tel(datos.readInt());
				}
//				
				if (timer_on) {
//				Si el timer funciona no hacer nada , si se pasó pararlo
					if ((timer + TIMER_SLEEP) < System.currentTimeMillis()) {
						timer_on = false;
					}
				} else {
//				Si el "timer_on" esta apagado "false" , mostramos un "telefono" si es que hay 
// Nos preparamos para encender el timer y mostrar telefonos que 
// sucedera si hay más de 1 elemento en el buffer 						
					if (buff_elem > 0) { // Almacena la cantidad de elementos en nuestra memoria temporal
						System.out.println("Secretaria llamanndo al telefono : " + get_tel());
//				Encendemos el timer y guardamos la hora en que empezó
						timer_on = true;
						timer = System.currentTimeMillis();
					}
				}
//				Pausamos 100ms para no sobrecargar el procesador
				try {
					Thread.sleep(100);
				} catch (InterruptedException ex3) {
//					Fin del bloque eterno
				}
			}
		} catch (IOException ex2) {
			ex2.printStackTrace(System.err);
			System.exit(-1);
		}
	} // Fin del metodo principal

	/**
	 * Funcion de clase <br>
	 * <br>
	 * Agregará un telefono en la memoria temporal ( en nuestro buffer ) haciendo
	 * una cierta "detección de errores" no sea lo suficientemente grande como para
	 * almacenar el proximo dato ( en este caso el programa se sale con error)
	 * 
	 * @param tel
	 */
	public static void put_tel(int tel) {
//		Si se supera el espacio producir un error
		if (BUFF_SIZE < (buff_elem + 1)) {
			System.err.println("Buffer overrun: El Buffer se lleno demasiado rapido");
			System.exit(-1);
		}
//		Linea más importante
//		Guardamos el tel y aumentamos en uno el contador
		buffer[buff_elem++] = tel;
	}

	/**
	 * Funcion de clase <br>
	 * <br>
	 * Función extraera un elemento del "buffer" pero al mismo tiempo que lo extrae
	 * debe posicionar los demas elementos hacia el inicio del arreglo <br>
	 * <br>
	 * Tampoco hacemos la comprobacion de que no haya elementos en el buffer porque
	 * la hacemos en el codigo cada vez que vemos si hay telefonos para mostrar
	 * 
	 * @return - int - devuelve el numero de telefono
	 */
	public static int get_tel() {
//		Almacenamos de manera temporal el telefono proximo antes de recorrer los datos
		int tel = buffer[0];
//		Quitamos uno al contador de elementos
		buff_elem--;
//		Recorremos los otros elementos
		for (int i = 0; i < buff_elem; i++) {
			buffer[i] = buffer[i + 1];
		}
		return tel;
	}

}
