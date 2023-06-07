package rvs.libro.java.ejemplo.system.metodos.in;

import java.io.IOException;

public class JavaAvailable5 {

	public static void main(String[] args) {
		System.out.println("Ingrese un texto y presione Enter:");

		// Usar el msétodo available() para verificar si hay datos disponibles
		while (true) {
			try {
				if (System.in.available() > 0) { //  
					int data = System.in.read();
					System.out.print((char) data);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 	
	}
}