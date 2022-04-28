package sooper.contenedores;

import sooper.Contenedor;
import sooper.enums.TipoContenedor;

/**
 * Clase Hija Bolsa que hereda de la clase abstracta Contenedor que a la vez es
 * implementada por la interface IContenedor
 * 
 * @author RVS
 *
 */
public class Bolsa extends Contenedor {

	/**
	 * 	Variable de instancia
	 */
	private int ancho;

	/**
	 * Constructor de la clase Bolsa
	 * 
	 * @param referencia
	 * @param alto
	 * @param ancho
	 */
	public Bolsa(String referencia, int alto, int ancho) {
		super(referencia, alto);
		this.ancho = ancho;
	}

	/**
	 * Metodo heredado de la clase abstracta Contenedor
	 * 
	 * Devuelve el tipo de bolsa
	 */
//	@Override
//	public String getTipo() {
//		return "bolsa";
//	}

	/**
	 * Enumerado del tipo <b>Bolsa</b> definido y heredado de <b>IContenedor</b>
	 * 
	 * @return BOLSA - Devuelve un elemento enum del tipo BOLSA
	 */
	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.BOLSA;
	}

	/**
	 * Metodo heredado de la interfaz IContenedor
	 * 
	 * Devuelve la superficie después de calcular el diametro
	 */
	@Override
	public int getSuperficie() {
		int radio = getDiametro() / 2;
		return (int) (Math.PI * radio * radio);
	}

	/**
	 * Metodo de clase
	 * 
	 * @return diametro como entero
	 */
	private int getDiametro() {
		return (int) ((2 * ancho) / Math.PI);
	}
}
