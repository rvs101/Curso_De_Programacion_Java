package rvs.libro.ejemplo.system.metodos.out;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * El método close()<br>
 * <br>
 * Es un método común en Java SE que se utiliza para cerrar un recurso, como un
 * archivo o una conexión de red después de que ya no se necesite<br>
 * <br>
 * Este método es parte de la <b>interfaz AutoCloseable</b> y <b>Closeable</b>,
 * y su implementación varía según la clase que lo implemente<br>
 * <br>
 * Aquí hay un ejemplo de cómo se puede usar el <b>método close()</b> para
 * cerrar un <b>FileInputStream</b> en Java
 *
 */
public class JavaCloseEjemplo1 {

	public static final String RUTA = "..\\Java_Repaso_Basico\\JavaLibroEjemplos\\src\\recursos\\";

	public static void main(String[] args) {

// • Un "FileInputStream" obtiene "bytes" de entrada de un archivo en un sistema de archivos 
// ♦ Los archivos disponibles dependen del entorno del "host"
// • "FileInputStream" está pensado para leer "flujos de bytes" sin procesar como datos de imágenes
// ♦ Para leer secuencias de caracteres utilice "FileReader"
		FileInputStream inputStream = null;

		try {
//			
			inputStream = new FileInputStream(RUTA.concat("imagen2.jpg"));
			
		} catch (IOException e) {
			// TODO: Manejar Excepción
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO: Manejar Excepción 
				}
			}
		}
	}
}
