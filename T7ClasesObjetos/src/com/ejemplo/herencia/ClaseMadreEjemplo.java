package com.ejemplo.herencia;

public class ClaseMadreEjemplo {

	private static final String CLASE_MADRE = "Soy una clase madre";
	private int numeroClase = 5050;

	public ClaseMadreEjemplo() {
		
	}

	/**
	 * 
	 * @return
	 */
	public String getNombreClaseMadre() {
		return CLASE_MADRE;
	}

	/**
	 * 
	 * @return
	 */
	public int getNumeroClase() {
		return numeroClase;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumeroClase(int numero) {
		this.numeroClase = numero;
	}

}
