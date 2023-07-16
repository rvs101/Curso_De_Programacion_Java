package rvs.libro.ejemplo.system.metodos.in;

import java.io.IOException;

/**
 * Método available() del System.in
 * 
 * Devuelve una estimación del número de bytes que se pueden leer (o saltar) de
 * este flujo de entrada (teclado) sin bloquear.
 * 
 */
public class JavaAvailable1 {

	public static final String RUTA = "..\\Java_Repaso_Basico\\JavaLibroEjemplos\\src\\recursos\\rvs\\libro\\java\\ejemplo\\system\\metodos\\in\\";

	public static void main(String[] args) throws IOException {

		System.out.print("• Escribe por teclado : ");
// Se utiliza para obtener el número de bytes 
// que están disponibles para ser leídos desde la entrada estándar 
		while (System.in.available() == 0) {
			// Espera a que el usuario escriba algo
		}
// Devuelve la cantidad de bytes que se pueden leer (o pasar por alto) 
// desde esta entrada sin bloquear la próxima llamada a lectura.
		int numBytes = System.in.available();
		System.out.println("→ Cantidad de Bytes : " + numBytes);
		byte[] data = new byte[numBytes];
// Este método solo lee un byte a la vez, por lo que si deseas leer 
// múltiples bytes o caracteres, deberás llamar al método varias veces 
// o utilizar otro método como read(byte[] b) o read(byte[] b, int off, int len).
		System.in.read(data);
		
		String input = new String(data);

		System.out.println("\u001b[33mIngresaste: " + input);

	}
}
