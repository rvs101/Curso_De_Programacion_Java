package com.sobrecarga.sobrescribir;

/**
 * 
 * @author RVS
 * @time 28 abr 2022 - 22:38:21
 *
 */
public class T8SobrecargaOverloading {

	private static final String ELEMENTOS = "Invocamos la API de la clase String";

	public static void main(String[] args) {
		System.out.println("• Mostrar ejemplo de Overloading de parametros de un metodo");
		System.out.println(ELEMENTOS.substring(23));
		System.out.println(ELEMENTOS.substring(13, 16));
	}
}
