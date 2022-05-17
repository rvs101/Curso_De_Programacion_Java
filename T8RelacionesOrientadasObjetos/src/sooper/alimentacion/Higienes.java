package sooper.alimentacion;

import sooper.enums.Categorias;

/**
 * "Clase Hija Higiene" que hereda de la "Clase Productos"
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:22:15
 */
public class Higienes extends Productos {

	/**
	 * Constructor por defecto
	 */
	public Higienes() {
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param referencia
	 * @param peso
	 * @param volumen
	 */
	public Higienes(String referencia, int peso, int volumen) {
//		Constructor parametrizado de la clase padre Productos
		super(referencia, peso, volumen);
	}

	/**
	 * Metodo de Instancia heredado por la interface IProductos
	 * 
	 * @return Devuelve un tipo enumerado Higiene
	 * 
	 */
	@Override
	public Categorias getCategorias() {
		return Categorias.HIGIENE;
	}

	/**
	 * Metodo de Instancia heredado por la interface IProductos
	 * 
	 * @return boolean - Devuelve false si el objeto pasado por parametros no es
	 *         compatible
	 */
	@Override
	public boolean esCompatibles(IProductos p) {
//		Vale cualquier Producto salvo los de Alimentación
		return !Categorias.ALIMENTACION.equals(p.getCategorias());
	}

}
