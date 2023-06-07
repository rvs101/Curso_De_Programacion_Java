package rvs.libro.java.ejemplo.system.metodos.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class JavaCloseEjemplo3 {

	public static String RUTA = "..\\JavaLibroEjemplos\\src\\rvs\\libro\\java\\uso\\metodos\\out\\";

	public static void main(String[] args) {
		
// • Lee texto de un flujo de entrada de caracteres almacenando los caracteres 
// en el buffer para permitir una lectura eficiente de caracteres , matrices y líneas. 
// • Se puede especificar el tamaño del búfer o utilizar el tamaño predeterminado
// • El tamaño por defecto es lo suficientemente grande para la mayoría de los propósitos
// • En general, cada solicitud de lectura de un lector provoca la correspondiente solicitud de lectura del 
// flujo de caracteres o bytes subyacente
// • Es aconsejable envolver un BufferedReader alrededor de cualquier Reader 
// cuyas operaciones read() puedan ser costosas como FileReaders e InputStreamReaders
		BufferedReader reader = null;

		try {

			reader = new BufferedReader(new FileReader("archivo.txt"));

			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException io) {
			System.out.println("\u001b[31mOcurrio un error al leer el archivo : " + io.getMessage());
		} finally {
			if (reader != null)
				try {
					reader.close();
				} catch (IOException ioe) {
					System.out.println("\u001b[31mOcurrio un error al cerrar el BufferedReader " + ioe.getMessage());
				}
		}
	}
}
