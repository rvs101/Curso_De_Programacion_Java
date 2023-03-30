package cap16.orm.gestores;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Pag 418 <br>
 * <br>
 * Relaciones 1:N <br>
 * <br>
 * Clase que tendra un ID autogenerado y un numero de factura
 * 
 * 
 * @author rad
 *
 */
@Entity
public class Factura {

	/**
	 * Pag 422 <br>
	 * <b>No aparece en el código</b> tengo que añadirlo para que funcione <br>
	 * Atributo de instancia <br>
	 * 
	 * Añade una <b>CONSTANTE PREFIJO</b> <br>
	 * 
	 */
	private static final String PREFIJO = "ALB-";

	/**
	 * Pagina 418
	 * 
	 * Atributo de Instancia
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * Pagina 418
	 * 
	 * Atributo de Instancia
	 */
	private String numero;

	/**
	 * Pagina 419 <br>
	 * Referencia a la factura en la <b>clase Pedido</b> y una referencia al
	 * <b>pedido</b> desde la factura <br>
	 */
	@OneToOne(mappedBy = "factura")
	public Pedido pedido;

	/**
	 * Pagina 418
	 * 
	 * Constructor por defecto
	 */
	public Factura() {
		this.id = 0;
		this.numero = null;
	}

	/**
	 * Pag 422
	 * 
	 * @param pedido
	 */
	public Factura(Pedido pedido) {
		this.numero = PREFIJO + pedido.getReferencia();
		this.pedido = pedido;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Obtenemos el valor del ID establecido por el objeto
	 * 
	 * @return int - ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * Establece el valor del ID establecido por el objeto
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - String - Devuelve el String con el numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param numero - String - establece el valor del numero pasado por parametro
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * 
	 * @return
	 */
	public Pedido getPedido() {
		return pedido;
	}

	/**
	 * 
	 * @param pedido
	 */
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	/**
	 * Metodo toString para devolver todos los valores
	 */
	@Override
	public String toString() {
		return "○ Factura - ID : " + getId() + " Numero : " + getNumero();
	}

}
