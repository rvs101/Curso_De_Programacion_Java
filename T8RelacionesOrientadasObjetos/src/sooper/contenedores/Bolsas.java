package sooper.contenedores;

import sooper.enums.TipoContenedores;

/**
 * 
 * @author RVS
 * 
 * @time 25 abr 2022 - 14:19:04
 *
 */
public class Bolsas extends Contenedores {

	/**
	 * Variable de instancia
	 */
	private int ancho;

	/**
	 * Constructor de la clase Bolsa
	 * 
	 * @param referencias
	 * @param altos
	 * @param ancho
	 * @param resistencia - Calcular la resistencia de una Bolsa
	 */
	public Bolsas(String referencias, int altos, int ancho, int resistencia) {
		super(referencias, altos, resistencia);
		this.ancho = ancho;
	}

	/**
	 * Metodo heredado de la interfaz IContenedor
	 * 
	 * Devuelve la superficie de una Bolsa
	 * 
	 * @return int - Devuelve la superficie después de calcular el diametro
	 */
	public int getSuperficies() {
		int radio = getDiametro() / 2;
		return (int) (Math.PI * radio * radio);
	}

	/**
	 * Metodo de Instancia
	 * 
	 * Devuelve el diametro de una Bolsa
	 * 
	 * @return diametro de la Bolsa como valor entero
	 */
	private int getDiametro() {
		return (int) ((2 * ancho) / Math.PI);
	}

	/**
	 * Enumerado del tipo <b>Bolsa</b> definido y heredado de <b>IContenedor</b>
	 * 
	 * @return BOLSA - Devuelve un elemento enum del tipo BOLSA
	 */
	@Override
	public TipoContenedores getTipos() {
		return TipoContenedores.BOLSA;
	}

}
