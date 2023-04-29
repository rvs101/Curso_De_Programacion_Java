package cap18.orm.otrasreunionesmas.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase Concreta Acta del tipo JPA (Java Persistence API) - Significa que esta
 * clase se puede almacenar en una BD
 *
 * Se utiliza para representar un acta en una aplicación Java EE
 *
 * @author rad
 *
 */
@Entity // Clase Concreta
//@Table(name = "Acta") // Referencia a la Tabla BD
public class Acta {

	/**
	 * Atributo de instancia
	 *
	 * Elemento de tipo int - Representa el identificador único <br>
	 * <br>
	 * Identificador unico que indica que esta variable es la clave primaria de la
	 * tabla en la BD <br>
	 * <br>
	 * Proveedor de persistencia asignar claves principales para la entidad mediante
	 * columna de identidad de la bd
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * Atributo de instancia <br>
	 * Elemento de tipo String <br>
	 * El contenido del Acta que se va a tratar
	 */
	private String contenido;

	/**
	 * Atributo de instancia <br>
	 *
	 * Este campo representa un objeto reunión a la que se refiere el acta.
	 *
	 * Creamos un objeto de tipo Reunion <br>
	 *
	 * Se utiliza para sincronizarse con la <b>tabla Reunion</b> de la bd <br>
	 * Una reunión "de Personas" a la que está asociada esta Acta
	 *
	 *
	 */
	@OneToOne
	@JoinColumn
	private Reunion reunion;

	/**
	 * Constructor por defecto
	 */
	public Acta() {
	}

	/**
	 * Constructor parametrizado de la clase Acta
	 *
	 * @param contenido - String - Hace referencia a un objeto contenido
	 * @param reunion   - Object - Se utiliza para almacenar objetos de la clase
	 *                  reunion
	 */
	public Acta(String contenido, Reunion reunion) {
		this.contenido = contenido;
		this.reunion = reunion;
// Se refiere al objeto actual que va a ser creado o modificado
// En este caso un objeto del tipo Acta
// Establece una relación bidireccional entre la clase "Reunion" y "Acta"
//		"Acta" esta relacionada con un "Reunion" especifica
//		"Reunion" esta relacionada con una "Acta" especifica
		reunion.setActa(this);
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
	public String getContenido() {
		return contenido;
	}

	/**
	 *
	 * @param contenido
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * Metodo de instancia <br>
	 * <br>
	 * Devuelve el valor actual de la variable "reunion"<br>
	 * <br>
	 * Si se llama a este método getReunion() devolverá el objeto "Reunion" que se
	 * ha asignado previamente a la variable "reunion" de la clase Acta <br>
	 * <br>
	 *
	 * @return - Object - Devuelve un objeto reunión
	 */
	public Reunion getReunion() {
		return reunion;
	}

	/**
	 * Procedimiento de instancia <br>
	 * <br>
	 * Establecer un nuevo valor para la variable "reunion" <br>
	 * <br>
	 * Este método acepta un parámetro de tipo "Reunion" que es el nuevo objeto que
	 * se desea asignar a la variable "reunion" <br>
	 * <br>
	 * Cuando se llama a este método, el objeto "reunion" de la clase "Acta" se
	 * establece en el nuevo objeto proporcionado como parámetro<br>
	 * <br>
	 *
	 * @param reunion - Object - Establece un objeto reunión dentro de la clase Acta
	 */
	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}

	/**
	 * Metodo sobre
	 *
	 */
	@Override
	public String toString() {
		return " • Acta [ Id=" + id + " Contenido= " + contenido + " ]";
	}
}
