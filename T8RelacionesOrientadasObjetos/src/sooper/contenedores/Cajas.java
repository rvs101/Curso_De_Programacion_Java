package sooper.contenedores;

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
	private int ancho;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena el largo de un objeto
	 */
	private int largo;

	/**
	 * Crea un objeto de tipo Caja
	 * 
	 * @param referencias
	 * @param altos
	 * @param ancho
	 * @param largo
	 */
	public Cajas(String referencias, int altos, int ancho, int largo) {
		super(referencias, altos);
		this.ancho = ancho;
		this.largo = largo;
	}

	/**
	 * Devuelve un objeto de tipo enum
	 * 
	 * @return enum Caja - Devuelve un elemento de tipo enum llamado CAJA
	 */
	public TipoContenedores getTipo() {
		return TipoContenedores.CAJA;
	}

	/**
	 * Calcula la superficie de una Caja
	 * 
	 * @return int - Devuelve la superficie total de una Caja
	 */
	public int getSuperficie() {
		return ancho * largo;
	}

}
