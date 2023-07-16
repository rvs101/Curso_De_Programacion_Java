package rvs.libro.pag17.ejemplos.operadores;

/**
 * Ejemplo anterior <br>
 * El operador ">>>" se aplica al número entero "-10" y se realiza un
 * desplazamiento de 2 posiciones a la derecha sin signo. <br>
 * <br>
 * El resultado es "1073741821" en su representación decimal. <br>
 * <br>
 * En términos de bits, el desplazamiento de 2 posiciones a la derecha sin signo
 * significa que los bits se desplazan dos lugares hacia la derecha y se llenan
 * con ceros en las posiciones vacías. <br>
 * <br>
 * En este caso, el resultado es "00111111 11111111 11111111 11111101", que es
 * "1073741821" en decimal. <br>
 * <br>
 * El operador ">>>" es útil cuando se desea desplazar bits hacia la derecha sin
 * signo, es decir, sin importar el valor negativo del número. <br>
 * Esto puede ser útil en ciertas situaciones, como el procesamiento de datos
 * binarios o manipulación de bits. <br>
 * <br>
 * Es importante tener en cuenta que el operador ">>>" solo se aplica a valores
 * enteros y no se puede utilizar con tipos de datos de punto flotante o tipos
 * de datos no numéricos.
 *
 */
public class JavaOperadorAngularesDesplazamientoDerechaIzqSinSigno {

	/**
	 * Operador >>> <br>
	 * <br>
	 * Se conoce como el operador de desplazamiento a la derecha sin signo (unsigned
	 * right shift operator) <br>
	 * <br>
	 * Este operador desplaza los bits de un valor numérico hacia la derecha un
	 * número determinado de posiciones y siempre inserta ceros en las posiciones
	 * más a la izquierda <br>
	 * <br>
	 * A diferencia del operador de desplazamiento a la derecha con signo >>, que
	 * inserta el bit de signo en las posiciones más a la izquierda. <br>
	 * Por ejemplo <br>
	 * <br>
	 * Si aplicamos el operador >>> al número -8 <br>
	 * (Que se representa en binario como 11111111111111111111111111111000) <br>
	 * Con un desplazamiento de 2 posiciones hacia la derecha, obtendremos el
	 * resultado 1073741822 (que se representa en binario como
	 * 00111111111111111111111111111110)
	 */
	public static void showDisplacementLeftToRight() {
		int valor = -10; // Representación binaria: 11111111 11111111 11111111 11110110
		int resultado = valor >>> 2; // Desplazamiento de 2 posiciones a la derecha sin signo
		System.out.println("Resultado: " + resultado); // Salida: 1073741821
		System.out.println(Integer.toBinaryString(resultado));
	}

	public static void main(String[] args) {

		showDisplacementLeftToRight();
	}
}
