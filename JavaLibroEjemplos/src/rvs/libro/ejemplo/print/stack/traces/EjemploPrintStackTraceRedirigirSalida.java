package rvs.libro.ejemplo.print.stack.traces;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class EjemploPrintStackTraceRedirigirSalida {

	private static final String RUTA = "..\\JavaLibroEjemplos\\src\\rvs\\libro\\ejemplo\\print\\stack\\traces\\";

	public static void main(String[] args) {
		try {
// Provocar una excepcion dividiendo por cero
			int resultado = 1 / 0;
		} catch (ArithmeticException e) {
			try {
// Agrega funcionalidad a otro flujo de salida				
				PrintStream ps = new PrintStream(new FileOutputStream(RUTA + "traza.txt"));
				ps.println("Comprobar errores");
				if (ps.checkError()) {
					System.out.println("An error ocurred while writing to the PrintStream");
				} else {
					System.out.println("No errors ocurred while writing to the PrintStream");
				}
				e.printStackTrace(ps);
				ps.close();
			} catch (FileNotFoundException ex) {
				ex.printStackTrace();
			}
// Indica la ruta absoluta
			System.out.println(System.getProperty("user.dir"));

		}
	}
}
