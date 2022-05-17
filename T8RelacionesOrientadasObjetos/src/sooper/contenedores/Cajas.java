package sooper.contenedores;

import sooper.alimentacion.IProductos;
/**
 * Invocamos las clases que vamos a usar
 */
import sooper.enums.TipoContenedores;

/**
 * "Clase Hija Caja" hereda de la "Clase Padre Contenedores"
 * 
 * @author RVS
 * 
 * @time 25 abr 2022 - 14:19:14
 *
 */
public class Cajas extends Contenedores {

	/**
	 * Atributo de instancia
	 * 
	 * Almacena el ancho de un objeto
	 */
	private int anchos;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena el largo de un objeto
	 */
	private int largos;

	/**
	 * Crea un objeto de tipo Caja
	 * 
	 * @param referencias
	 * @param altos
	 * @param ancho
	 * @param largo
	 */
	public Cajas(String referencias, int altos, int anchos, int largos) {
		super(referencias, altos, 0);
		this.anchos = anchos;
		this.largos = largos;
	}

	/**
	 * Calcula la superficie de una Caja
	 * 
	 * @return int - Devuelve la superficie total de una Caja
	 */
	public int getSuperficies() {
		return anchos * largos;
	}

	/**
	 * Metodo heredado de IContenedor
	 * 
	 */
	@Override
	public boolean resistes(IProductos productos) {
		return true;
	}

	/**
	 * Metodod heredado de IContenedor
	 * 
	 * Devuelve un objeto de tipo enum
	 * 
	 * @return Devuelve un objeto del tipo enum TipoContenedores.Caja
	 */
	@Override
	public TipoContenedores getTipos() {
		// TODO Auto-generated method stub
		return TipoContenedores.CAJA;
	}

}
