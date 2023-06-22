package rvs.libro.pag17.java.ejemplos.operadores;

/**
 * 
 * @author Robot
 *
 */
public class JavaOperadorAngularesDesplazamientoIzqDerecha {

	/**
	 * 
	 */
	public static void showDisplacementRightToLeft() {
		int num = 20; // Representación binaria: 00000000 00000000 00000000 00010100
//		Resultado = 5 // Representación binaria: 00000000 00000000 00000000 00000101
		int resultado = num >> 2; // Desplazamiento de 2 posiciones a la derecha

		System.out.println(resultado); // Salida: 5

	}

	public static void main(String[] args) {

		showDisplacementRightToLeft();
	}
}
