package sooper;

import java.util.Set;

/**
 * Clase abstracta que esta implementada por la Interface IContenedor
 * 
 * Esta clase abstracta sabe calcular el volumen pero no la superficie la cual
 * lo hará las clases hijas de Bolsa y Caja
 * 
 * Los metodos getSuperficie() y getTipo() será implementados en las clases
 * hijas Bolsa y Caja
 * 
 * @author RVS
 *
 */
public abstract class Contenedor implements IContenedor {

	/**
	 * Atributo de Instancia - Almacena una cadena referencia
	 */
	private String referencia;

	/**
	 * Atributo de Instancia
	 */
	private int alto;

	/**
	 * Atributo de Instancia - Almacena un numero como resistencia
	 */
	private int resistencia;

	/**
	 * Atributo de Instancia - Objeto de la interface <IProducto> para almacenar
	 * objetos del tipo productos
	 */
	private Set<IProducto> productos;

	/**
	 * Constructor - Almacena referencia y el alto del contenedor
	 * 
	 * @param referencia
	 * @param alto
	 */
	public Contenedor(String referencia, int alto) {
		this.referencia = referencia;
		this.alto = alto;
	}

	/**
	 * Obtenemos la referencia
	 */
	@Override
	public String getReferencia() {
		return referencia;
	}

	/**
	 * El metodo que pertenece a la <Interface IContenedor> → getSuperficie() que
	 * será implementado por las clases descendientes de Contenedor como son Bolsa y
	 * Caja
	 */
	@Override
	public int getVolumen() {
//		El metodo que pertenece a la interface IContenedor getSuperficie() que será
//		implementado por las clases descendientes de Contenedor como es Bolsa y Caja
		return alto * getSuperficie();
	}

	/**
	 * Obtenemos la resistencia de los contenedores
	 * 
	 * ¿ No debería de estar implementando en la clase hija porque cada Bolsa y Caja
	 * tiene una resistencia distinta
	 */
	@Override
	public int getResistencia() {
		return resistencia;
	}

	/**
	 * Almacena y devuelve un conjunto de productos que contiene el contenedor del
	 * tipo que sea
	 */
	@Override
	public Set<IProducto> getProductos() {
		return productos;
	}

	/**
	 * No sabemos el volumen del Contenedor por eso no lo podemos implementar
	 * 
	 * Lo implementará la clase hija descendiente de Bolsa y Caja
	 * 
	 */
	@Override
	public int volumenDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Metodo sin implementar desde la clase abstracta Contenedor descargado desde
	 * la Interface IProducto
	 * 
	 * Se implementará desde la clase hija Bolsa y Caja
	 */
	@Override
	public boolean meter(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Metodo sin implementar desde la clase abstracta Contenedor descargado desde
	 * la Interface IProducto
	 * 
	 * Se implementará desde la clase hija Bolsa y Caja
	 */
	@Override
	public boolean resiste(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	Metodo para los hijo
//	public String getTipo() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
