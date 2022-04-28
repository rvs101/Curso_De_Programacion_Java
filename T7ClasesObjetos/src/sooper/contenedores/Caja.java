package sooper.contenedores;

import sooper.Contenedor;
import sooper.enums.TipoContenedor;

/**
 * Clase Hija Caja que hereda de la clase abstracta Contenedor que es
 * implmentada por IContenedor
 * 
 * @author RVS
 *
 */
public class Caja extends Contenedor {

	// Propiedad de instancia
	private int ancho;
	// Propiedad de instancia
	private int largo;

	/**
	 * Constructor Caja
	 * 
	 * Caja Invoca al constructor de la clase Padre Contenedor
	 * 
	 * @param referencia
	 * @param alto
	 * @param ancho
	 * @param largo
	 */
	public Caja(String referencia, int alto, int ancho, int largo) {
		super(referencia, alto);
		this.ancho = ancho;
		this.largo = largo;
	}

//	@Override
//	public String getTipo() {
//		return "caja";
//	}

	/**
	 * Enumerado del tipo <b>Bolsa</b> definido y heredado de <b>IContenedor</b>
	 * 
	 */
	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.CAJA;
	}

	/**
	 * 
	 */
	@Override
	public int getSuperficie() {
		return ancho * largo;
	}

}
