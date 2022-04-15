package sooper;

import java.util.Set;

/**
 * Clase abstracta que esta implementada por la Interface IContenedor
 * 
 * @author RVS
 *
 */
public abstract class Contenedor implements IContenedor {

	/**
	 * 
	 */
	private String referencia;
	
	/**
	 * 
	 */
	private int alto;
	
	/**
	 * 
	 */
	private int resistencia;
	
	/**
	 * 
	 */
	private Set<IProducto> productos;

	/**
	 * Constructor Basico
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
		// TODO Auto-generated method stub
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
		return resistencia;
	}

	/**
	 * 
	 */
	@Override
	public Set<IProducto> getProductos() {
		return productos;
	}

	/**
	 * 
	 */
	@Override
	public boolean meter(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 */
	@Override
	public boolean resiste(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public String getTipo() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
