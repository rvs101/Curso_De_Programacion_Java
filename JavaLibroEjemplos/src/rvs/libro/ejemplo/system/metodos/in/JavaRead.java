package rvs.libro.ejemplo.system.metodos.in;

import java.io.IOException;

/**
 * El método read(byte[] b, int off, int len) <br>
 * <br>
 * Es un método de la clase InputStream en Java SE.<br>
 * <br>
 * Este método intenta leer hasta len bytes de datos del InputStream y
 * almacenarlos en el array de bytes b, comenzando en la posición off.<br>
 * <br>
 * Los parámetros de este método son: <br>
 * - b: el array de bytes en el que se almacenarán los datos leídos. <br>
 * - off: el índice inicial en el array de bytes en el que se almacenarán los
 * datos leídos. <br>
 * - len: el número máximo de bytes a leer<br>
 * <br>
 * Este método devuelve el número real de bytes leídos o -1 si se alcanza el
 * final del InputStream.<br>
 * <br>
 * Si len es cero, entonces no se leen bytes y se devuelve 0.<br>
 * <br>
 * Aquí tienes un ejemplo de cómo usar este método para leer datos de un
 * InputStream:
 * 
 * 24 may 2023 - 20:21:41
 * 
 * @author RVS
 *
 */
public class JavaRead {

	/**
	 * Metodo read() <br>
	 * <br>
	 * Lee el siguiente byte de datos del flujo de entrada<br>
	 * <br>
	 * <b>Un flujo de entrada es una secuencia ordenada de datos que se pueden leer
	 * desde algún origen, como un archivo, un socket de red o un teclado.<br>
	 * <br>
	 * El método `read` lee el siguiente byte de datos del flujo de entrada, es
	 * decir, obtiene el siguiente byte de la secuencia y avanza el puntero del
	 * flujo para apuntar al siguiente byte. Si el método se llama varias veces,
	 * leerá los bytes del flujo en orden secuencial hasta que se alcance el final
	 * del flujo. <br>
	 * Lo devuelve como un entero en el rango de 0 a 255 </b> <br>
	 * <br>
	 * El byte de valor se devuelve como un int en el rango de 0 a 255<br>
	 * <br>
	 * Si no hay ningún byte disponible porque se ha alcanzado el final del flujo,
	 * se devuelve el valor -1<br>
	 * <br>
	 * Este método se bloquea hasta que hay datos de entrada disponibles, se detecta
	 * el final del flujo o se lanza una excepción.
	 */
	public static void showMethodReadBasico() {
		System.out.println("• Introduce un caracter");
		int caracter = 0;
		try {
			caracter = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("El caracter introducido es : " + (char) caracter);
	}

	/**
	 * 
	 */
	public static void showMethodReadParametrizado() {
		int contador_bytes = 0;

		System.out.println("♦ Introduce diez caracteres 🔡");
		byte[] buffer_relleno = new byte[10]; // Creamos un array de maximo 10 posiciones

		try {
// La variable contador_bytes almacena el numero de "bytes" leidos
//			                                               off : Posicion en la que empezamos a leer bytes
//			                                                ↓
//			                                                ↓  len : numero máximo de bytes por leer 
//--------------------------------------------------------- ↓ ↓
			contador_bytes = System.in.read(buffer_relleno, 1, 5);
			int i = 0; // variable de iteracion
			while ((i < 10) && (buffer_relleno[i] != 10)) { // buffer [i] diferente a diez porque no queremos imprimir
															// la tecla ENTER, que en ASCII es 10.
				System.out.println("Has introducido: " + buffer_relleno[i] + "\n");
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// contador-1 porque se tiene en cuenta la tecla ENTER del final
		System.out.println("El numero de bytes leidos es : " + (contador_bytes - 1));
	}

	public static void main(String[] args) {

// • Al ser la propiedad 'in' de System un objeto de tipo static , solo existe una copia de ese objeto en todo el programa
// • Significa que solo almacenará un valor
		showMethodReadBasico();
		System.out.println("-------------");
		showMethodReadParametrizado();
	}
}
