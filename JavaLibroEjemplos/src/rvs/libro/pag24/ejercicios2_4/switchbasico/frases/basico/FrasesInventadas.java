package rvs.libro.pag24.ejercicios2_4.switchbasico.frases.basico;

import java.io.IOException;

/**
 * Clase Concreta : Frases Inventadas
 *
 * 15 jul 2023 - 22:14:43
 *
 * @author RVS
 *
 */
public class FrasesInventadas {

	/**
	 * Atributo de instancia <br>
	 * <br>
	 * Clase para invocar metodos
	 */
	private FrasesCapturaTeclado fct = new FrasesCapturaTeclado();

	/**
	 * Atributo de instancia <br>
	 * <br>
	 * Clase para invocar metodos
	 * 
	 */
	private ListaFrases lf = new ListaFrases();

	/**
	 * Atributo de instancia <br>
	 * <br>
	 * Almacena el valor para elegir una frase
	 */
	private int valor = 0;

	/**
	 * Metodo de Instancia <br>
	 * <br>
	 * 
	 * @return - int - devuelve un valor entero
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Procedimiento de Instancia <br>
	 * <br>
	 * 
	 * @param valor - int - establece el valor entero
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * Procedimiento de Instancia<br>
	 * <br>
	 * Muestra un mensaje despues de elegir un numero entre 1 y 10
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
				System.exit(-1);
			}
			if (getValor() > 0) {
				lf.listPhrase(getValor());
				off = true;
			} else if (getValor() == 0) {
				off = false;
			}
		} while (off);
	}
}
