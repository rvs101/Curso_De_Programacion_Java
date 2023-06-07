package rvs.libro.java.ejemplo.system.metodos.in;

import java.io.IOException;
import java.util.Scanner;

/**
 * El método available() de System.in en Java SE devuelve una estimación del
 * número de bytes que se pueden leer (o saltar) de este flujo de entrada sin
 * bloquear. Esto significa que puedes usar el método available() para
 * determinar cuántos bytes están disponibles para leer en System.in sin tener
 * que esperar a que lleguen más datos.
 * 
 * Es importante tener en cuenta que el método available() solo proporciona una
 * estimación y no garantiza que haya suficientes datos disponibles para leer
 * sin bloquear. Además, el método available() no se debe utilizar para
 * determinar la longitud de un archivo o flujo de entrada, ya que el número de
 * bytes disponibles puede cambiar con el tiempo.
 * 
 * En general, el método available() se utiliza principalmente en situaciones en
 * las que necesitas leer datos de un flujo de entrada sin bloquear, como cuando
 * estás leyendo datos desde un socket o un canal no bloqueante. En estos casos,
 * puedes usar el método available() para determinar cuántos bytes están
 * disponibles para leer y luego leer solo esa cantidad de bytes para evitar
 * bloquear la ejecución del programa.
 * 
 * @author Robot
 *
 */
public class JavaAvailable3Mejorado {

	public static void main(String[] args) {
		
		System.out.println("Escribe algo y presiona Enter:");

		try {
			while (System.in.available() == 0) {
				// Espera a que haya datos disponibles para leer
				Thread.sleep(100);
			}

			int availableBytes = System.in.available();
			
			System.out.println("Hay " + availableBytes + " bytes disponibles para leer.");

			byte[] inputData = new byte[availableBytes];
			System.in.read(inputData);

			String inputString = new String(inputData).replaceAll("\r\n|\r|\n", "");
			System.out.println("Ingresaste: " + inputString);

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
