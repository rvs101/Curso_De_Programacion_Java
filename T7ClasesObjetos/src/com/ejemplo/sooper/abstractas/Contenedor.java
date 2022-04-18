package com.ejemplo.sooper.abstractas;

import java.util.Set;

/**
 * 
 * @author RVS
 *
 */
public abstract class Contenedor implements IContenedor {

	private String referencia;
	private int alto;
	private int resistencia;

	/**
	 * 
	 */
	private Set<IProducto> productos;

	/**
	 * 
	 * @param referencia
	 * @param alto
	 */
	public Contenedor(String referencia, int alto) {
		this.referencia = referencia;
		this.alto = alto;
	}

	/**
	 * 
	 */
	@Override
	public String getReferencia() {
		return referencia;
	}

	/**
	 * 
	 */
	@Override
	public int getVolumen() {
		return alto * getSuperficie();
	}

	/**
	 * 
	 */
	@Override
	public int volumenDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 
	 */
	@Override
	public int getResistencia() {
		// TODO Auto-generated method stub
		return resistencia;
	}

	/**
	 * 
	 */
	@Override
	public Set<IProducto> getProductos() {
		// TODO Auto-generated method stub
		return productos;
	}
	
	/**
	 * 
	 */
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Implementa las clases hijas heredadas
	 */
	@Override
	public boolean meter(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Implementa las clases hijas heredadas
	 */
	@Override
	public boolean resiste(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * 
	 */
	@Override
	public int getSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}

}
