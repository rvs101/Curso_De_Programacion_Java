package cap16.orm.gestores;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Pagina 421 <br>
 * <b>Entidad Producto</b> <br>
 * Crea una relación <b>N:M</b> entre la tabla <b>Pedido</b> y la tabla
 * <b>Producto</b> <br>
 * Lo que genera una tabla intermedia llamada Producto_pedido para entrelazar
 * los valores entre ambas tablas para que no existan duplicidades y solo haya
 * un valor "normalización"
 * 
 * @author rad
 *
 */
@Entity
public class Producto {

	// Anotación para un atributo de una clase de entidad la cual se mapea a la
	// columna de clave primaria de una tabla de la bd
	// Permite que los framework puedan hacer operaciones con las entidades basadas
	// en su identificador
	/**
	 * 
	 * Atributo de instancia
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //
	private int id;

	/**
	 * Atributo de instancia
	 */
	@Column(unique = true) // Referencia única
	private String referencia;

	/**
	 * Atributo de instancia
	 */
	private String descripcion;

	/**
	 * Pag 421<br>
	 * Atributo de instancia<br>
	 * Conjunto de objetos del tipo <b>Pedidos</b> para la relación <b>N:M</b> <br>
	 * Contiene/Almacena todos los objetos de tipo <b>Pedido</b> <br>
	 * Se usa para poder relacionar los objetos de la clase 'Pedido' con los objetos
	 * de la clase 'Producto' y así poder obtener todos los objetos que estén
	 * relacionados <br>
	 * La versión del libro no viene implementada este atributo
	 * 
	 */
	@ManyToMany
	private Set<Pedido> pedidos = new HashSet<>();
//	private Set<Pedido> pedidos;

	/**
	 * Constructor por defecto
	 */
	public Producto() {
		this.referencia = null;
		this.descripcion = null;
	}

	/**
	 * Constructor con parametros <br>
	 * Crea un objeto de tipo <b>Producto</b> que recibe por parametros una
	 * referencia y una descripción
	 * 
	 */
	public Producto(String referencia, String descripcion) {
		this.referencia = referencia;
		this.descripcion = descripcion;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return
	 */
	public String getReferencias() {
		return referencia;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param referencias
	 */
	public void setReferencias(String referencias) {
		this.referencia = referencias;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Metodo de instancia<br>
	 * 
	 * Devuelve un conjunto de objetos de tipo Pedidos <br>
	 * 
	 * Este metodo no viene en el libro y lo he tenido que implementar a petición
	 * del programa<br>
	 * 
	 * 
	 * @return - Conjunto de objetos pedidos
	 */
	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	/**
	 * Pag 424<br>
	 * 
	 * Metodo de instancia
	 * 
	 * Version mas versatil
	 * 
	 * Del lado de la clase Producto modificamos addProducto para añadir pedidos
	 * desde la clase Pedido
	 * 
	 * @param pedido
	 */
	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
		if (!pedido.getProductos().contains(this)) {
			pedido.addProducto(this);
		}
	}

	/**
	 * Metodo de Instancia toString
	 * 
	 * Muestra todos los atributos de la clase Producto
	 * 
	 * @Override Invalidador
	 */
	@Override
	public String toString() {
		return "♦ Producto Id : " + getId() + " Referencias : " + getReferencias() + " Descripcion : "
				+ getDescripcion();
	}
}
