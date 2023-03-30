package cap16.orm.gestores;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Pag 415 <br>
 * <b>Clase Concreta Albaran</b> <br>
 * <br>
 * Para generar albaranes sobre los pedidos <br>
 * <br>
 * Tipo Relación 1:N <br>
 * <br>
 * <b>Alabaran @ManyToOne</b> <br>
 * - Muchos Albaranes tienen un Pedido <br>
 * <b>Pedido @OneToMany</b> <br>
 * - Un Pedido tiene Muchos Albaranes
 * 
 * @author rad
 *
 */
@Entity
@Table(name = "albaran")
public class Albaran {

	/**
	 * <b>CONSTANTE</b> <br>
	 * Establece el prefijo
	 */
	private static final String PREFIJO = "ALB-";

	/**
	 * Id del Albaran <br>
	 * Clave primaria - Primary Key
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * Almacena la Referencia del albaran
	 */
	private String referencia;

	/**
	 * Almacena la fecha de Emision
	 */
	private LocalDateTime fechaEmision;

	/**
	 * Almacena la fecha de Recepcion
	 */
	private LocalDateTime fechaRecepcion;

	/**
	 * Pag 416 <br>
	 * <b>Atributo de instancia</b> de la <b>clase Pedido</b> <br>
	 * Se utiliza para poder relacionar el <b>ID</b> de la <b>clase Pedido</b> con
	 * los <b>IDs</b> de la <b>clase Albaran</b> por su relacion de <b>(1:N)</b>
	 * <br>
	 * Un <b>Pedido</b> tiene muchos <b>Albaranes</b> <br>
	 * El <b>ID</b> de <b>Pedido</b> es solo <b>1</b> <br>
	 * No podemos añadir todos los <b>IDs</b> de <b>Albaranes</b> porque solo
	 * podemos almacenar un <b>ID</b> por <b>Pedido</b> <br>
	 * El <b>ID</b> de los <b>Albaranes</b> son varios podemos almacenarlos un
	 * <b>ID</b> de <b>Pedido</b> porque por cada <b>Albaran</b> solo tenemos el un
	 * <b>ID</b> del <b>Pedido</b> <br>
	 * <br>
	 * FetchType.<b>LAZY</b> - <b>Define que los datos se pueden obtener
	 * perezosamente</b> <br>
	 * <br>
	 * El <b>modificador "LAZY"</b> especifica el tipo de carga de la relación y se
	 * utiliza para determinar cuándo se deben cargar los datos de la entidad
	 * relacionada <br>
	 * Con <b>"LAZY"</b>, los <b>datos de la entidad relacionada solo se cargan
	 * cuando se accede a ellos en lugar de cargarlos automáticamente cuando se
	 * carga la entidad principal</b> <br>
	 * <br>
	 * Esto se conoce como carga diferida y se utiliza para optimizar el rendimiento
	 * de la aplicación, ya que solo se cargan los datos que realmente se necesitan.
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private Pedido pedido;

	/**
	 * Constructor por defecto
	 */
	public Albaran() {
//		this.id = 0;
//		this.referencia = null;
//		this.fechaEmision = null;
//		this.fechaRecepcion = null;
	}

	/**
	 * Constructor con parametros <br>
	 * Cada vez que se genera un objeto de tipo Albaran le añadimos un valor del
	 * tipo PREFIJO + la REFERENCIA DEL PEDIDO<br>
	 * <br>
	 * 
	 * @param refPedido - String - Establece la referencia del pedido dentro de los
	 *                  objetos Albaran
	 * 
	 */
	public Albaran(String refPedido) {
		referencia = getPrefijo() + refPedido;
		fechaEmision = LocalDateTime.now();
	}

	/**
	 * Pag 422<br>
	 * Constructor con parametros<br>
	 * <br>
	 * Permite almacenar un objeto del tipo Pedido en los objetos que instancie la
	 * clase Albaran<br>
	 * 
	 * @param pedido2 - Objeto - Del tipo pedido
	 */
	public Albaran(Pedido pedido2) {
		this.pedido = pedido2;
	}

	/**
	 * Obtener el ID de Albaran
	 * 
	 * @return int - Obtener ID el valor del identificador del albaran
	 */
	public int getId() {
		return id;
	}

	/**
	 * Establecer el ID de un Albaran
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
	 * @param fechaEmision
	 */
	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	/**
	 * 
	 * @return
	 */
	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}
	
	/**
	 * 
	 * @return
	 */
	public LocalDateTime getFechaRecepcion() {
		return fechaRecepcion;
	}

	/**
	 * 
	 * @param fechaRecepcion
	 */
	public void setFechaRecepcion(LocalDateTime fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	/**
	 * Metodo de instancia<br>
	 * <br>
	 * Obtenemos un objeto Pedido para obtener el id <br>
	 * 
	 * @return Pedido - Devuelve un objeto de la clase Pedido con los atributos
	 *         (caracteristicas) y metodos (acciones)
	 */
	public Pedido getPedido() {
		return pedido;
	}

	/**
	 * Procedimiento de instancia <br>
	 * Establece el valor del objeto Pedido <br>
	 * 
	 * @param pedido - Le asignamos un valor concreto para un tipo de elemento
	 *               Pedido
	 */
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "♠ Albaran - ID : " + getId() + " Prefijo : " + getPrefijo() + " Referencia : " + getReferencia();
	}

//	------------------------------------------------------------

	/**
	 * 
	 * @return
	 */
	public static String getPrefijo() {
		return PREFIJO;
	}

}
