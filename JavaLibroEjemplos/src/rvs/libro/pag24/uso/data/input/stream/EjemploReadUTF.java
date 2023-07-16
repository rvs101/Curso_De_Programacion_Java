package rvs.libro.pag24.uso.data.input.stream;

import java.io.*;

/**
 * Leer un archivo con contenido
 * 
 * 7 jul 2023 - 17:36:41
 *
 * @author RVS
 *
 */
public class EjemploReadUTF {

	public static void main(String[] args) throws IOException {

		// Crear un archivo temporal para el ejemplo
		File archivoTemporal = File.createTempFile("ejemplo", "txt");
		
		// El método deleteOnExit() de la clase java.io.File solicita que
		// el archivo o directorio indicado por esta ruta de acceso abstracta
		// se elimine cuando la máquina virtual termine.
		// Los archivos (o directorios) se eliminan en el orden inverso al que están
		// registrados
		archivoTemporal.deleteOnExit();

		// Escribir una cadena en el archivo utilizando writeUTF()
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivoTemporal));
		dos.writeUTF("Hola mundo!");
		dos.close();

		// Leer la cadena del archivo utilizando readUTF()
		DataInputStream dis = new DataInputStream(new FileInputStream(archivoTemporal));
		String cadenaLeida = dis.readUTF();
		dis.close();

		System.out.println(cadenaLeida); // Imprime "Hola mundo!"


	}
}
