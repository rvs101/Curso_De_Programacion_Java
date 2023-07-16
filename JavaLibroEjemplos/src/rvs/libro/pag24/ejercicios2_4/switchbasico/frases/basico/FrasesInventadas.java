package rvs.libro.pag24.ejercicios2_4.switchbasico.frases.basico;

import java.io.IOException;

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
 * 15 jul 2023 - 22:14:43
 *
 * @author RVS
 *
 */
public class FrasesInventadas {

	/**
	 * 
	 */
	private FrasesCapturaTeclado fct = new FrasesCapturaTeclado();

	/**
	 * 
	 */
	private ListaFrases lf = new ListaFrases();

	/**
	 * 
	 */
	private int valor = 0;

	/**
	 * 
	 * @return
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * 
	 * @param valor
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * Procedimiento de Instancia<br>
	 * <br>
	 * 
	 * @param numero - int - valor para elegir el mensaje
	 */
	public void showPhrase() {

//		Interruptor
		boolean off = true;

		do {
			System.out.println("Elije un mensaje nuevo");
			try {
				setValor(fct.getCapturaNumero());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (getValor() > 0) {
				lf.listPhrase(getValor());
				off = true;
			} else if (getValor() == 0) {
				off = false;
			}
		} while (off);
	}

	public static void main(String[] args) {
		FrasesInventadas fi = new FrasesInventadas();
		fi.showPhrase();
	}
}
