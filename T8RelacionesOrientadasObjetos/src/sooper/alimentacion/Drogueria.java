package sooper.alimentacion;

import sooper.enums.Categorias;

/**
 * "Clase Hija Drogueria" que desciende de la "clase Padre Productos"
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:22:15
 */
public class Drogueria extends Productos {

	/**
	 * Constructor con parametros del constructor padre
	 * 
	 * Define los objetos que vayamos a crear cada vez que instanciemos un objeto
	 * 
	 */
	public Drogueria(String referencia, int peso, int volumen) {
//		Invoco al constructor de la clase Padre Productos
		super(referencia, peso, volumen);
	}

	/**
	 * Metodos heredados de la "interface Productos"
	 * 
	 * @return devuelve un tipo enum identificado como DROGUERIA
	 * 
	 */
	@Override
	public Categorias getCategorias() {
		return Categorias.DROGUERIA;
	}

	/**
	 * 
	 * Metodos heredados de la "interface Productos"
	 * 
	 * Obtener un conjunto de categorias
	 */
	@Override
	public boolean esCompatibles(IProductos p) {
		// TODO Auto-generated method stub
		return false;
	}

}
