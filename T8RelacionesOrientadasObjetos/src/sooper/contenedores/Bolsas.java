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
	 */
	public Bolsas(String referencias, int altos, int ancho) {
		super(referencias, altos , 0);
		this.ancho = ancho;
	}

	/**
	 * Enumerado del tipo <b>Bolsa</b> definido y heredado de <b>IContenedor</b>
	 * 
	 * @return BOLSA - Devuelve un elemento enum del tipo BOLSA
	 */
	public TipoContenedores getTipo() {
		return TipoContenedores.BOLSA;
	}

	/**
	 * Metodo heredado de la interfaz IContenedor
	 * 
	 * @return int - Devuelve la superficie después de calcular el diametro
	 */
	public int getSuperficies() {
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

	@Override
	public TipoContenedores getTipos() {
		// TODO Auto-generated method stub
		return TipoContenedores.BOLSA;
	}

}
