package huerto.macetas;

import huerto.enums.FormaMaceta;

/**
 * Clase hija de la clase Padre Maceta
 * 
 * @author RVS
 * @time 7 may 2022 - 14:49:32
 *
 */
public class MacetaTubular extends Maceta {

	/**
	 * Atributo de instancia
	 * 
	 * Almacena el valor del diametro
	 */
	private int diametro;

	/**
	 * Constructor parametrizado para definir una maceta tubular
	 * 
	 * @param nombre   - String - Nombre de la maceta
	 * @param alto     - int - Altura de la maceta
	 * @param diametro - int - Diametro total de la maceta
	 */
	public MacetaTubular(String nombre, int alto, int diametro) {
// Metodo heredados de la clase Padre
		super(nombre, alto);
//		Definimos el diametro
		this.diametro = diametro;
	}

	/**
	 * Obtenemos la superficie de una maceta tubular
	 * 
	 * @return int - Devuelve el calculo de la superficie de una maceta tubular
	 */
	@Override
	public int getSuperficie() {
//		PI : 3.1415926535
		return (int) Math.PI * (diametro / 2) * (diametro / 2);
	}

	/**
	 * Obtenemos un enum del tipo Tubular
	 * 
	 * @return enum - tipo enum tubular
	 */
	public FormaMaceta getForma() {
		return FormaMaceta.TUBULAR;
	}

}
