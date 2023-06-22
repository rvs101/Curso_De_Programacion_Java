package rvs.libro.pag10.java.herencia.composicion;

/**
 * Ejemplo de Composición <br>
 * <br>
 * Relación "tiene un" entre clases<br>
 * <br>
 * En lugar de heredar comportamientos de una clase padre , 
 * una clase puede contener una instancia de otra clase y utilizar su comportamiento<br>
 * <br>
 * La composición se utiliza a menudo para representar relaciones 
 * entre objetos donde un objeto contiene o esta compuestos por otros objetos
 */

/**
 * Clase Concreta <br>
 * <br>
 * Contiene un objeto de otra clase para implementar sus propios objetos <br>
 * <br>
 *
 * 20 jun 2023 23:38:16
 *
 * @author Robot
 */
public class Coche {

	/**
	 * Atributo de instancia
	 * 
	 * Almacena la cantidad de ruedas
	 */
	private int ruedas;

	/**
	 * Atributo de instancia <br>
	 * <br>
	 * Contiene un objeto de la clase Motor para implementar los objetos de la clase
	 * Auto
	 * 
	 */
	private Motor motor;

	/**
	 * Constructor parametrizado de la clase Auto
	 * 
	 * @param ruedas - Atributo de la clase Auto
	 * @param motor  - Atributo de la clase motor
	 */
	public Coche(int ruedas, Motor motor) {
		this.ruedas = ruedas;
		this.motor = motor;
	}

}

/**
 * Clase Concreta<br>
 * <br>
 * Crea una clase que se añadira un objeto a otra clase en su definición
 *
 * 20 jun 2023 23:30:41
 *
 * @author Robot
 */
class Motor {

	/**
	 * Atributo de instancia
	 * 
	 * Almacena un elemento del tipo entero
	 */
	private int caballosDeFuerza;

	/**
	 * Constructor para inicializar objetos
	 * 
	 * @param caballosDeFuerza - 	
	 */
	public Motor(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}
}
