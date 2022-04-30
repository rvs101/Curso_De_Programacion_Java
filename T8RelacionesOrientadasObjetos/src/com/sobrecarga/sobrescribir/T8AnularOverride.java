package com.sobrecarga.sobrescribir;

/**
 * 
 * @author RVS
 * @time 28 abr 2022 - 23:53:13
 *
 */
public class T8AnularOverride {

	public static void main(String[] args) {
		Coche coche1 = new Coche(4, 4, "Mercedes", "300 SL");
		System.out.println(coche1.toString());
	}
}

/**
 * 
 * @author RVS
 * @time 28 abr 2022 - 23:53:10
 *
 */
class Coche {

	private int ruedas = 0;
	private int puertas = 0;
	private String nombre = null;
	private String modelo = null;

	/**
	 * 
	 */
	public Coche() {
		ruedas = 0;
		puertas = 0;
		nombre = null;
		modelo = null;
	}

	/**
	 * 
	 * @param ruedas
	 * @param puertas
	 * @param nombre
	 * @param modelo
	 */
	public Coche(int ruedas, int puertas, String nombre, String modelo) {
		this.ruedas = ruedas;
		this.puertas = puertas;
		this.nombre = nombre;
		this.modelo = modelo;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	/**
	 * 
	 * @return
	 */
	public int getPuertas() {
		return puertas;
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
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo heredado de la "Clase Object" reescrito para mostrar los valores
	 * propios de la "Clase Coche"
	 */
	@Override
	public String toString() {
		return "• Nombre: ".concat(getModelo()) + " Modelo: ".concat(getModelo()) + " Puertas: " + getPuertas()
				+ " Ruedas: " + getRuedas();
	}

}
