package sooper.alimentacion;

import sooper.contenedores.IContenedores;

/**
 * Producto → Como concepto general
 * 
 * No define un tipo de producto especifico por lo que esta tarea la haran los
 * hijos
 * 
 * Al no definir este metodo en esta clase y dejar que lo hagan las clases hijas
 * definimos esta clase como Abstracta
 * 
 * Porque delega la implementación de un metodo en sus clases descendientes
 * 
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:21:31
 *
 */
public abstract class Productos implements IProductos {

	/**
	 * Atributos de Instancia
	 * 
	 * Almacena la referencia de un objeto Productos
	 */
	private String referencias;

	/**
	 * Atributos de Instancia
	 * 
	 * Almacena el peso de un objeto Productos
	 */
	private int pesos;

	/**
	 * Atributos de Instancia
	 * 
	 * Almacena el volumen de un objeto Productos
	 * 
	 */
	private int volumenes;

	/**
	 * Constructor por defecto
	 */
	public Productos() {
		this.referencias = null;
		this.pesos = 0;
		this.volumenes = 0;
	}

	/**
	 * Constructor para establecer valores dentro del objeto productos
	 * 
	 * @param referencia - String - Asignamos una referencia del producto
	 * @param peso       - int - Asignamos un peso del producto
	 * @param volumen    - int - Asignamos un volumen del producto
	 */
	public Productos(String referencia, int peso, int volumen) {
		this.referencias = referencia;
		this.pesos = peso;
		this.volumenes = volumen;
	}

	/**
	 * Obtener referencias
	 * 
	 * @return - String - Devuelve una referencia
	 */
	@Override
	public String getReferencias() {
		return referencias;
	}

	/**
	 * Obtener pesos
	 * 
	 * @return - String - Devuelve un peso
	 */
	@Override
	public int getPesos() {
		return pesos;
	}

	/**
	 * Obtener volumenes
	 * 
	 * @return - int - Devuelve un volumen
	 * 
	 */
	@Override
	public int getVolumenes() {
		return volumenes;
	}

	/**
	 * Metodo será implementando por las clases hijas como son :
	 * 
	 * Mascotas , Alimentación , Higiene , Droguerias
	 * 
	 * Obtenemos un conjunto de categorias
	 * 
	 * @return - Categorias - Devuelve un tipo de enum de Categoria
	 */
//	@Override
//	public Categorias getCategorias() {
//		return null;
//	}

	/**
	 * Obtenemos
	 * 
	 */
//	@Override
//	public boolean esCompatibles(IProductos p) {
//		return false;
//	}

	/**
	 * 
	 */
	@Override
	public boolean tengoEspacios(IContenedores contenedores) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 */
	@Override
	public void meters(IContenedores contenedores) {

	}

}
