package sooper.alimentacion;

import sooper.enums.Categorias;

/**
 * Clase Hija Mascotas que desciende de la clase Productos
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:22:15
 */
public class Mascotas extends Productos {

	/**
	 * Constructor por defecto
	 */
	public Mascotas() {
	}

	/**
	 * Constructor de instancia que acepta parametros
	 * 
	 * Establece los atributos de los objetos que instanciemos
	 * 
	 * @param referencias
	 * @param peso
	 * @param volumen
	 */
	public Mascotas(String referencias, int peso, int volumen) {
// super - Hace referencia al constructor de la clase Productos
		super(referencias, peso, volumen);
	}

	/**
	 * Metodo heredado de la interface Categorias
	 * 
	 * @return Devuelve - elemento del tipo enum identificado como MASCOTAS
	 * 
	 */
	@Override
	public Categorias getCategorias() {
		return Categorias.MASCOTAS;
	}

	/**
	 * Metodo heredado de la interface IProductos
	 * 
	 * @return boolean - Indica si el elemento de tipo Producto es compatible con
	 *         los objetos de tipo Mascota
	 */
	@Override
	public boolean esCompatibles(IProductos p) {
		return false;
	}

}
