package sooper.alimentacion;


import sooper.enums.Categorias;

/**
 * "Clase Hija Alimentacion" que desciende de la "clase Productos"
 * 
 * 7 Define elementos propios de su clase y de la clase Producto
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:22:15
 *
 */
public class Alimentacion extends Productos {

	/**
	 * Constructor de instancia
	 * 
	 * Invoca al constructor de la clase Productos
	 * 
	 * @param referencia - String → Define la referencia del Alimento para que
	 *                   coincida con la del Producto
	 * @param peso       - int → Define el peso del Alimento para que coincida con
	 *                   la del Producto
	 * @param volumen    - int → Define el volumen del Alimento para que coincida
	 *                   con la del Producto
	 */
	public Alimentacion(String referencia, int peso, int volumen) {
		// super - Hace referencia al constructor de la clase Productos
		super(referencia, peso, volumen);
	}

	/**
	 * Obtenemos la categoría de la alimentación que será 'ALIMENTACION'
	 * 
	 * Ya que es la clase en la que nos encontramos
	 * 
	 * @return enum - Tipo Categoría - ALIMENTACION, DROGUERIA, HIGIENE, MASCOTAS
	 */
	@Override
	public Categorias getCategorias() {
		return Categorias.ALIMENTACION;
	}

	/**
	 * Obtenemos si el alimento es compatible
	 * 
	 * @return boolean - Si el alimento es compatible con el Producto
	 * 
	 */
	@Override
	public boolean esCompatibles(IProductos p) {
		// TODO Auto-generated method stub
		return false;
	}

}
