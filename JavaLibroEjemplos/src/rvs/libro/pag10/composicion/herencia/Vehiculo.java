package rvs.libro.pag10.composicion.herencia;

/**
* Ejemplo de Herencia
*/

/**
 * 
 * Clase Padre Concreta - Vehiculo
 *
 * 20 jun 2023 23:22:04
 *
 * @author Robot
 */
public class Vehiculo {

	/**
	 * 
	 */
	private int velocidad;

	/**
	 * 
	 * @param incremento
	 */
	public void acelerar(int incremento) {
		velocidad += incremento;
	}

}

/**
 * Clase Hija Concreta - Vehiculo
 *
 * 20 jun 2023 23:23:46
 *
 * @author Robot
 */
class Auto extends Vehiculo {

	/**
	 * 
	 */
	private int ruedas;

	/**
	 * 
	 * @param ruedas
	 */
	public Auto(int ruedas) {
		this.ruedas = ruedas;
	}

}


 