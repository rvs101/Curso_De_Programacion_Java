package com.sobrecarga.sobrescribir;

/**
 * 
 * @author RVS
 * @time 28 abr 2022 - 23:53:13
 *
 */
public class T8AnularOverride {

	public static void main(String[] args) {
		Coche c = new Coche();
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

	public int getPuertas() {
		return puertas;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
