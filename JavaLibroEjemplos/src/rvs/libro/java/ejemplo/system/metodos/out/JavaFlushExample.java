package rvs.libro.java.ejemplo.system.metodos.out;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * En este ejemplo <br>
 * <br>
 * Creamos un <b>BufferedWriter</b> para escribir en un archivo llamado
 * "archivo.txt". <br>
 * <br>
 * Utilizamos los métodos <code>write() y newLine()</code> para escribir datos
 * en el archivo.<br>
 * <br>
 * Luego, llamamos al método <code>flush()</code> para asegurarnos de que todos
 * los datos se escriban en el archivo de inmediato. <br>
 * <br>
 * Después de llamar a <code>flush()</code>, podemos estar seguros de que los
 * datos se han escrito correctamente en el archivo. <br>
 * <br>
 * Si ocurre algún error durante la escritura, se captura la excepción
 * <code>IOException</code> y se muestra un mensaje de error. <br>
 * <br>
 * Finalmente, en la cláusula <code>finally</code>, cerramos el
 * <code>BufferedWriter</code> utilizando el método close() para liberar los
 * recursos asociados y garantizar que el archivo se cierre adecuadamente. <br>
 * <br>
 * Recuerda que llamar al <code>método flush()</code> es especialmente útil
 * cuando se trabaja con flujos de salida en búfer, ya que garantiza que todos
 * los datos pendientes se escriban en el destino.
 *
 */
public class JavaFlushExample {
	
	public static final String RUTA ="..\\JavaLibroEjemplos\\src\\rvs\\libro\\java\\uso\\metodos\\out\\";

	public static void main(String[] args) {

// Creamos un BufferedWriter para escribir en el archivo	
		BufferedWriter writer = null;

		try {
// Creamos un Buffer de escritura dentro del archivo 'archivo.txt'			
			writer = new BufferedWriter(new FileWriter(RUTA.concat("archivoFlush.txt")));

// Escribir datos en el archivo	'archivo.txt'
			writer.write("Este es un ejemplo de escritura de un archivo");
			writer.newLine(); // Escribe un separador de líneas - // La cadena de separador de líneas está
								// definida por thesystem property line.separator, y no es necesariamente un
								// carácter de una sola línea ('n')

			writer.write("Utilizando \"BufferedWriter\" y el método \"flush()\" ");
// Vaciar el buffer y asegurarse de que todos los datos se escriban en el archivo
			writer.flush();
			System.out.println("\u001b[33mLos datos se han escrito correctamente en el archivo");
		} catch (IOException e) {
			System.out.println("\u001b[31mOcurrio un error al escribir en el archivo");
		}
	}
}
