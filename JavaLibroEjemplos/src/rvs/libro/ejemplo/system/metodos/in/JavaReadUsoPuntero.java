package rvs.libro.ejemplo.system.metodos.in;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Concepto de puntero interno<br>
 * <br>
 * Un puntero interno es una variable que se utiliza para mantener un registro
 * de la posición actual dentro de una estructura de datos, como un flujo de
 * entrada<br>
 * <br>
 * No tiene un aspecto físico ya que es una variable en el código. <br>
 * <br>
 * No se puede reconocer visualmente, pero se puede acceder a él a través del
 * código<br>
 * <br>
 * Aquí hay un ejemplo en Java que muestra cómo se puede utilizar el método skip
 * para avanzar el puntero interno de un flujo de entrada
 * 
 * 24 may 2023 - 23:04:51
 * 
 * @author RVS
 *
 */
public class JavaReadUsoPuntero {

	public static final String RUTA = "..\\JavaLibroEjemplos\\src\\rvs\\libro\\java\\ejemplo\\system\\metodos\\in\\";

	public static void main(String[] args) {

		try {
			InputStream inputStream = new FileInputStream(RUTA.concat("fileSkip.txt"));
// Avanza el puntero interno 5 bytes
			inputStream.skip(5);
			int data = inputStream.read();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
