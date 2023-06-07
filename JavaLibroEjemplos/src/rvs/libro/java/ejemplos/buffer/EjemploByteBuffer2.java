package rvs.libro.java.ejemplos.buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * Clase Concreta
 */
public class EjemploByteBuffer2 {

	public static final String RUTA = "..\\JavaLibroEjemplos\\src\\rvs\\libro\\java\\ejemplos\\buffer\\";
	public static void main(String[] args) {

		try {
// 1º - Crear un buffer de lectura y escritura de 1024 bytes de capacidad máxima
			ByteBuffer buffer = ByteBuffer.allocate(1024);

// 2º - Abrir un canal de archivo para lectura
			FileInputStream inputFile = new FileInputStream(RUTA.concat("archivo_entrada.txt"));
			FileChannel inputChannel = inputFile.getChannel();

// 3º - Abrir un canal de archivo para escritura
			FileOutputStream outputFile = new FileOutputStream(RUTA.concat("archivo_salida.txt"));
			FileChannel outputChannel = outputFile.getChannel();

// 4º - Lee los datos del canal de entrada 'inputFile' al buffer de 1024 bytes
			int bytesRead = inputChannel.read(buffer);
			while (bytesRead != -1) {
// flip() - Cambiar el buffer al modo de lectura
// Voltear(Poner al revés) este búfer. 
// El límite se fija en la posición actual y luego la posición se pone a cero. 
// Si la marca está definida, se descarta.
// Después de una secuencia de operaciones channel-read o put()
// Invoca este método para preparar una secuencia de operaciones "channel-write" o relative get(). 
				buffer.flip();
// Escribir datos desde el buffer al canal de salida
				outputChannel.write(buffer);
// Limpiar el buffer para su reutilización
				buffer.clear();
// Leer más datos del canal de entrada al buffer
				bytesRead = inputChannel.read(buffer);
			}
// Cerrar canal de entrada y el archivo
			inputChannel.close();
// Cerrar el archivo
			inputFile.close();
// Cerrar canal de salida
			outputChannel.close();
// Cerrar el archivo
			outputFile.close();
			System.out.println("\u001B[30mDatos copiados correctamente de archivo_entrada.txt a archivo_salida.txt");

		} catch (IOException ioe) {
			System.out.println(
					"\u001B[31mOcurrió un error durante la operación de lectura/escritura: " + ioe.getMessage());
		}

	}
}
