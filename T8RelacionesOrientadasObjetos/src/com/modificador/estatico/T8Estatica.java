package com.modificador.estatico;

/**
 * 
 * @author RVS
 * @time 5 may 2022 - 13:21:02
 *
 */
public class T8Estatica {

	/**
	 * CONSTANTE de tipo entero solo accesible por la propia clase
	 */
	private static final int CONSTANTE = 0;

	/**
	 * Variable estática privada
	 * 
	 * Solo puede ser invocada a través de la propia clase y no a través de una
	 * instancia de esta clase
	 */
	private static int compartida = 0;

	/**
	 * Variable final de instancia
	 * 
	 * No permite modificaciones pero si almacenar el valor pasado por parametro
	 * dentro del constructor
	 */
	private final int noModificable;

	/**
	 * Variable de instancia
	 * 
	 * Solo accesible desde la propia clase
	 * 
	 * Se recomienda utilizar los metodos de la propia clase para almacenar ,
	 * modificar valores
	 */
	private int normal;

	/**
	 * Constructor con parámetros que recibe un parametro para almacenarlos dentro
	 * de la variable privada final noModificable
	 * 
	 * @param n
	 */
	public T8Estatica(int n) {
//		variable final
		noModificable = n;
	}

	/**
	 * Procedimiento (subrutina) de instancia
	 * 
	 * Solo incrementa los valores de una variable de clase y de una variable de
	 * objeto
	 */
	private void incrementaTodo() {
//		CONSTANTE++
		compartida++; // Variable de clase sin invocar a su clase
//		noModificable++ // No permite el uso
		normal++; // Variable de instancia sin invocar a su objeto
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * Muestran todos los valores almacenados dentro de la clase
	 * 
	 * @param titulo - String
	 */
	private void pintaTodo(String titulo) {
		System.out.println(titulo);
		System.out.println("Constante:\t" + CONSTANTE);
		System.out.println("Compartida:\t" + compartida);
		System.out.println("No modificable:\t" + noModificable);
		System.out.println("Normal: \t" + normal);
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("Constante:\t" + CONSTANTE);
		System.out.println("Compartida:\t" + compartida);
//		System.out.println("No modificable: \t" + noModificable); // Error
//		System.out.println("Normal: \t" + normal); // Error
		System.out.println();

		T8Estatica seis = new T8Estatica(6);
		T8Estatica ocho = new T8Estatica(8);
		T8Estatica diez = new T8Estatica(10);

		seis.pintaTodo("SEIS A: ");

		seis.incrementaTodo();
		seis.pintaTodo("SEIS B: ");

		ocho.incrementaTodo();
		seis.pintaTodo("SEIS C: ");

		diez.incrementaTodo();
		diez.incrementaTodo();

		seis.pintaTodo("SEIS D: ");
		ocho.pintaTodo("OCHO: ");
		diez.pintaTodo("DIEZ: ");

	}

}
