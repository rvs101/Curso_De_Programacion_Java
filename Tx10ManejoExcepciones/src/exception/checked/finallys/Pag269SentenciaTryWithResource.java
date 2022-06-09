package exception.checked.finallys;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author RVS
 * @time 26 may 2022 - 11:01:52
 *
 */		
public class Pag269SentenciaTryWithResource {

	/**
	 * Función de clase
	 * 
	 * Lee la 1º línea de un archivo
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
//			Lee la 1º linea de codigo
			return br.readLine();
		} finally {
// El objeto BufferedReader no apunta a ninguna dirección de memoria "null"						
			if (br != null)
//				Cierra el stream del archivo
				br.close();
		}
	}

	/**
	 * Función de clase
	 * 
	 * Versión 7 de Java
	 * 
	 * Lee la 1º línea de un fichero usando la sentencia <b>try-with-resources</b>
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static String readFirstLineFromFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

}
