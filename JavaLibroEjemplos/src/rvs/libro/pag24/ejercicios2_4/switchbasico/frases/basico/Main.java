package rvs.libro.pag24.ejercicios2_4.switchbasico.frases.basico;

/**
 * Las frases inventarlas <br>
 * <br>
 * Hacer un programa que utilice la estructura switch() para mostrar una frase
 * de acuerdo a un número<br>
 * <br>
 * Pedir por teclado un número del 1 al 10, exigir que no se pase de esos
 * valores, capturar errores y repetir hasta que se introduzca el 0 que será que
 * sale del programa. <br>
 * <br>
 * 
 * 17 jul 2023 - 1:03:11
 *
 * @author RVS
 *
 */
public class Main {

	public static void main(String[] args) {
		FrasesInventadas fi = new FrasesInventadas();
		fi.showPhrase();
	}
}
