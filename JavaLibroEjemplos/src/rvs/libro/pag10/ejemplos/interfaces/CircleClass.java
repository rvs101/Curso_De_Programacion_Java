package rvs.libro.pag10.ejemplos.interfaces;

/**
 * Clase Concreta - Representa un circulo en un plano 2D <br>
 * <br>
 * Un circulo que se define por su Area y Color <br>
 * <br>
 * 20 jun 2023 9:01:48 <br>
 * <br>
 *
 * @author Robot
 */
public class CircleClass implements ColourInterface, ShapeInterface {

	/**
	 * Atributo de instancia
	 * 
	 * Almacena el radio
	 */
	private double radio;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena el color
	 */
	private String colour;

	/**
	 * Constructor por defecto
	 */
	public CircleClass() {
		this.radio = 0.0;
		this.colour = null;
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param radio - radio del circulo
	 * @param colour - color del circulo
	 */
	public CircleClass(double radio, String colour) {
		this.radio = radio;
		this.colour = colour;
	}

	/**
	 * Devuelve el radio del Radio
	 * 
	 * @return el radio del circulo
	 */
	public double getRadio() {
		return radio;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getArea() {
		return Math.PI * (radio * 2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getColours() {
		return colour;
	}
	
	/**
	 * Muestra el Area y el Color del objeto Circulo
	 */
	@Override
	public String toString() {
		return " Area : " + getArea() + " Color : " + getColours();
	}
}
