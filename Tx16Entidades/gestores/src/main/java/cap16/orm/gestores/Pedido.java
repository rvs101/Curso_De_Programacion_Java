package cap16.orm.gestores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase Concreta <b>Pedido</b> <br>
 * Creamos una clase llamada <b>'Pedido'</b> que se mapea con la tabla
 * <b>'Pedido'</b> de la base de datos <b>'gestores'</b> creando todos los
 * atributos que tiene esta clase en columnas dentro de la base de datos con la
 * que se sincroniza
 * 
 * @author rad
 *
 */
@Entity // Clase que se refleja en la BD
@Table(name = "pedido") // Tabla en la BD
public class Pedido {

	/**
	 * Atributo de instancia
	 * 
	 * Almacena el identificador del valor númerico en cada nuevo registro
	 * 
	 */
	@Column(name = "id") // Creamos el identificador de la clase
	@Id // Identificador como etiqueta
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Generamos un nuevo valor en cada registro
	private int id;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena una referencia del pedido
	 * 
	 */
	@Column(name = "referencia")
	private String referencia;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena la fecha del pedido
	 */
	@Column(name = "fecha")
	private LocalDateTime fecha;

	/**
	 * Pag 417 <br>
	 * Atributo de instancia <br>
	 * Lista de objetos de tipo Albaran <br>
	 * Contiene/Almacena todos los objetos de tipo Albaran <br>
	 * 
	 * Pag 423 <br>
	 * Añadimos cascade = CascadeType.ALL
	 * 
	 */
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<Albaran> albaranes = new ArrayList<>();

	/**
	 * Pag 421 <br>
	 *
	 * Atributo de instancia <br>
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Factura factura;

	/**
	 * Pag 421 <br>
	 * Atributo de instancia <br>
	 * Conjunto de objetos del tipo <b>Pedidos</b> para la relación <b>N:M</b> <br>
	 * Contiene/Almacena todos los objetos de tipo <b>Pedidos</b> <br>
	 * 
	 * Pag 423 <br>
	 * Añadimos cascade = CascadeType.ALL
	 */
	@ManyToMany(mappedBy = "pedidos", cascade = CascadeType.ALL)
	private Set<Producto> productos = new HashSet<>();

	/**
	 * Constructor por defecto <br>
	 * Cuando se crea un nuevo objeto del tipo Pedido todos sus valores se ponen por
	 * defecto
	 */
	public Pedido() {
		this.referencia = null;
		this.fecha = null;
	}

	/**
	 * Constructor por parametrizado
	 * 
	 * Cuando se crea un nuevo objeto del tipo Pedido se le asigna unos valores por
	 * defecto
	 * 
	 */
	public Pedido(String referencia, LocalDateTime fecha) {
		this.referencia = referencia;
		this.fecha = fecha;
	}

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * 
	 * @param referencia
	 */
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	/**
	 * 
	 * @return
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Albaran> getAlbaranes() {
		return albaranes;
	}

	/**
	 * Pag 417 <br>
	 * Procedimiento de instancia <br>
	 * Establece el tipo de objetos de una lista de Albaranes <br>
	 * 
	 * @param albaranes - Lista de Albaranes <br>
	 */
	public void setAlbaranes(List<Albaran> albaranes) {
		this.albaranes = albaranes;
	}

	/**
	 * Pag 422<br>
	 * 
	 * Metodos para obtener objetos del tipo Albaranes
	 * 
	 * @return object - Devuelve un objeto del tipo Albaran y lo añade a la
	 *         List<Albaranes> con todas las caracteristicas añadidas
	 */
	public Albaran generaAlbaran() {
		Albaran albaran = new Albaran(this);
		albaranes.add(albaran);
		return albaran;
	}
	
	/**
	 * Pagina 427<br>
	 * 
	 * @return
	 */
	public Factura getFactura() {
		return factura;
	}

	/**
	 * Pagina 427<br>
	 * 
	 * @param factura
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	/**
	 * Pag 422<br>
	 * 
	 * Metodo de instancia <br>
	 * 
	 * Recibe por parametro un objeto del tipo <b>Pedido</b> <br>
	 * 
	 * @return factura - Devuelve un objeto del tipo factura que tiene almacenado un
	 *         objeto de tipo Pedido que fue pasado al constructor de Factura
	 */
	public Factura generaFactura() {
		factura = new Factura(this);
		return factura;
	}

	/**
	 * No existe en el libro porque se le olvidaron añadirlo <br>
	 * 
	 * Metodo de instancia <br>
	 * 
	 * Necesitamos este metodo para obtener todos los pedidos que tenga relacionado
	 * los productos
	 * 
	 * @return producto - Devuelve un conjunto de objetos de tipo Producto
	 */
	public Set<Producto> getProductos() {
		return productos;
	}

	/**
	 * Pag 422<br>
	 * 
	 * Metodos para añadir productos<br>
	 * <b>NO FUNCIONA</b>
	 * 
	 * @param producto - Producto - añade objetos del tipo Producto a la clase
	 *                 Pedido
	 */
//	public void addProducto(Producto producto) {
//		productos.add(producto);
//	}

	/**
	 * Pag 424<br>
	 * 
	 * Metodos para añadir productos<br>
	 * 
	 * Version más versatil<br>
	 * 
	 * Del lado de la clase Pedido modificamos addProducto para añadir productos
	 * desde la clase Pedido
	 * 
	 * @param producto
	 */
	public void addProducto(Producto producto) {
		productos.add(producto);
		if (!producto.getPedidos().contains(this)) {
			producto.addPedido(this);
		}
	}

	/**
	 * Metodo de Instancia <br>
	 * Anula el metodo de la clase Object <br>
	 * 
	 * Muestra todos los atributos de la clase Pedido
	 * 
	 */
	@Override
	public String toString() {
		return "• Pedido - Id: " + getId() + " Referencia: " + getReferencia() + " Fecha: " + getFecha();
	}

}
