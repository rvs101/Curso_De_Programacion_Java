package interfaces.list.basico;

import java.util.ArrayList;
import java.util.List;

/**
 * Conceptos de List
 * 
 * Muchos elementos distintos pero del mismo tipo
 * 
 * Elementos ordenados
 *
 * @author RVS
 *
 * @date 16 jul 2022 - 0:36:00
 *
 */
public class ListasBasico {

	public static void main(String[] args) {

		Coche c1 = new Coche();
		Coche c2 = new Coche(4, 325.5, "Lamborghini Tornado ", false);
		Coche c3 = new Coche(4, 221.5, "Cayenne Diésel", false);
		Coche c4 = new Coche(4, 195.5, "Fiat Freemont", false);
		Coche c5 = new Coche(4, 205.5, "Toyota Célica", false);

		List<Coche> coches = new ArrayList<Coche>();
		coches.add(c1);
		coches.add(c2);
		coches.add(c3);
		coches.add(c4);
		coches.add(c5);
		coches.add(new Coche(4, 156.5, "Opel Grandland", false));

		for (Coche coche : coches) {
			System.out.println(coche);
		}

		System.out.println("-------------");

		for (Coche coche : coches) {
			System.out.println("• Modelo: " + coche.getModelo() + " • Velocidad Max: " + coche.getMaxVelocidad());
		}

//		System.out.println("Solo muestra las referencias : " + coches);

	}
}

/**
 * 
 *
 * @author RVS
 *
 * @date 16 jul 2022 - 16:40:15
 *
 */
class Coche {

	/**
	 * 
	 */
	private int ruedas;

	/**
	 * 
	 */
	private double maxVelocidad;

	/**
	 * 
	 */
	private String modelo;

	/**
	 * 
	 */
	private boolean apagado;

	/**
	 * Constructor
	 */
	public Coche() {
		ruedas = 0;
		maxVelocidad = 0.0;
		modelo = null;
		apagado = true;
	}

	/**
	 * Constructor
	 * 
	 * @param ruedas
	 * @param max
	 * @param modelo
	 * @param apagado
	 */
	public Coche(int ruedas, double max, String modelo, boolean apagado) {
		this.ruedas = ruedas;
		this.maxVelocidad = max;
		this.modelo = modelo;
		this.apagado = apagado;
	}

	/**
	 * 
	 * @return
	 */
	public int getRuedas() {
		return ruedas;
	}

	/**
	 * 
	 * @param ruedas
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	/**
	 * 
	 * @return
	 */
	public double getMaxVelocidad() {
		return maxVelocidad;
	}

	/**
	 * 
	 * @param maxVelocidad
	 */
	public void setMaxVelocidad(double maxVelocidad) {
		this.maxVelocidad = maxVelocidad;
	}

	/**
	 * 
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * 
	 * @param apagado
	 */
	public void setApagado(boolean apagado) {
		this.apagado = apagado;
	}

	/**
	 * 
	 * @return
	 */
	public boolean getApagado() {
		return apagado;
	}

	/**
	 * Si este metodo no podria mostrar los valores del objeto
	 */
	@Override
	public String toString() {
		return "• Modelo: " + getModelo() + " • Max Velocidad: " + getMaxVelocidad() + " • Ruedas: " + getRuedas()
				+ " • Apagado: " + getApagado();
	}

}