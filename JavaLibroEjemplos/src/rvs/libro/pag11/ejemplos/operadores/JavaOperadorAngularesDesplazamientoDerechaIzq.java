package rvs.libro.pag11.ejemplos.operadores;

/**
 * Operador de desplazamiento a la izquierda (left shift operator) a nivel de
 * bits
 * 
 * Este operador se aplica a un valor entero y desplaza los bits de su
 * representación binaria hacia la izquierda por un número específico de
 * posiciones
 * 
 * Donde valor es el valor entero al cual se le aplicará el desplazamiento, y
 * cantidadDePosiciones es el número de posiciones que se desplazarán los bits.
 * 
 * Cuando se aplica el operador "<<" a un valor, los bits de ese valor se
 * desplazan hacia la izquierda y se insertan ceros en las posiciones vacías a
 * la derecha.
 * 
 * @author Robot
 *
 */
public class JavaOperadorAngularesDesplazamientoDerechaIzq {

	/**
	 * El operador "<<" se aplica al número entero "5" y se realiza un
	 * desplazamiento de 2 posiciones a la izquierda
	 * 
	 * <br>
	 * El resultado es "20" en su representación decimal.
	 * 
	 * <br>
	 * En términos de bits, el desplazamiento de 2 posiciones a la izquierda
	 * significa que los bits se desplazan dos lugares hacia la izquierda y se
	 * llenan con ceros en las posiciones vacías a la derecha. <br>
	 * En este caso, <br>
	 * 5 → "00000000 00000000 00000000 00000101" <br>
	 * 20 → "00000000 00000000 00000000 00010100"
	 * 
	 * que es "20" en decimal.
	 * 
	 * 
	 */
	public static void showDisplacementLeftToRight() {

		// Representación binaria: 00000000 00000000 00000000 00000101
		int num = 5;
		// Desplazamiento de 2 posiciones a la izquierda
		int resultado = num << 2;

		System.out.println(resultado); // Salida: 20
	}

	public static void main(String[] args) {

	}
}
