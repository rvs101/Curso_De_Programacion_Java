package rvs.libro.ejemplo.system.metodos.out;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * El <code>método close()</code><br>
 * <br>
 * Es un método común en Java SE que se utiliza para cerrar un recurso, como un
 * archivo o una conexión de red, después de que ya no se necesite<br>
 * <br>
 * Este método es parte de la <b>interfaz AutoCloseable</b> y <b>Closeable</b>,
 * y su implementación varía según la clase que lo implemente. <br>
 * <br>
 * En este ejemplo<br>
 * <br>
 * El <b>FileInputStream</b> se crea dentro de los paréntesis después de la
 * palabra clave <b>try</b><br>
 * <br>
 * Esto asegura que el recurso se cierre automáticamente al final del bloque
 * <b>try</b>, incluso si ocurre una excepción durante el procesamiento del
 * archivo
 *
 */
public class JavaCloseEjemplo2 {

	public static String RUTA = "..\\JavaLibroEjemplos\\src\\rvs\\libro\\java\\uso\\metodos\\out\\";

	public static void main(String[] args) {

		try (FileInputStream inputStream = new FileInputStream(RUTA.concat("fileInputStream.txt"))) {

		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
