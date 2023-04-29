package cap18.orm.otrasreunionesmas.dominio;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Entidad Reunion<br>
 *
 * @author rad
 *
 */
@Entity
//@Table(name = "reunion")
public class Reunion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
	private int id;

//	@Column(name = "fecha")
	private LocalDateTime fecha;

//	@Column(name = "asunto")
	private String asunto;

	@ManyToOne(fetch = FetchType.LAZY)
	private Sala sala;

	@OneToOne(mappedBy = "reunion")
	private Acta acta;

	/**
	 * Relación mapeada por la propiedad "reuniones" de la entidad "Persona" <br>
	 * La tabla de unión entre las dos entidades se creara en base a esta propiedad
	 * <br>
	 * La variable 'persona' se relaciona con la clase Persona mediante la
	 * anotación @ManyToMany → Muchas personas pueden estar asociadas con muchas
	 * reuniones y que esto se puede hacer a traves de una tabla intermedia <br>
	 * <br>
	 * Si un objeto "Persona" esta asociado con una reunión especifica , su atributo
	 * "reuniones" contendra una referencia a esa reunión <br>
	 * <br>
	 * <b>mappedBy</b> = 'reuniones' indica que la relación esta mapeada por la
	 * propiedad "reuniones" de la entidad "Persona" lo que significa que la tabla
	 * de union entre dos entidades se creara en base a esas propiedades <br>
	 * <hr>
	 * <b>cascade = CascadeType.ALL</b> = Indica que cualquier operacion realizada
	 * en una entidad <b>"Reunion"</b> (Agregar/Actualizar/Eliminar) se propagará a
	 * las entidades relacionadas con la clase <b>"Persona"</b> <br>
	 * <hr>
	 * Ejemplo : <br>
	 * Si se elimina un objeto <b>"reunión"</b> se eliminarán automáticamente todas
	 * las referencias a esa <b>"reunión"</b> en la lista de <b>"reuniones"</b> de
	 * cada objeto <b>"persona"</b> relacionada <br>
	 * <hr>
	 * <br>
	 * Indica que la Entidad/Clase "Reunion" tiene un conjunto de entidades
	 * "Persona" que están enlazadas a través de una relación de @ManyToMany <br>
	 * <br>
	 * Resumen : Codigo define una variable que se utiliza para almacenar todas las
	 * "Personas" que "Participan" en una "Reunion" y establece una relación de
	 * muchos a muchos entre la "Reunion" y "Persona" <br>
	 *
	 */
	@ManyToMany(mappedBy = "reuniones", cascade = CascadeType.ALL)
	private Set<Persona> participantes; // Variable participantes - Conjunto de Set<Personas>

	/**
	 * Constructor por defecto
	 */
	public Reunion() {
//		this.id = 0;
//		this.fecha = null;
//		this.asunto = null;
		participantes = new HashSet<>();
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param id
	 * @param fecha
	 * @param asunto
	 */
	public Reunion(LocalDateTime fecha, String asunto) {
		this();
		this.fecha = fecha;
		this.asunto = asunto;
	}

	public Reunion(Reunion r) {
		this.fecha = r.fecha;
		this.asunto = r.asunto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Acta getActa() {
		return acta;
	}

	/**
	 *
	 * @param acta
	 */
	public void setActa(Acta acta) {
		this.acta = acta;
	}

	/**
	 * Devuelve una conjunto Set<Personas> de "personas" por el cual por cada objeto
	 * de tipo "participante" se obtiene un conjunto de objetos "Personas"
	 *
	 * @return
	 */
	public Set<Persona> getParticipantes() {
		return participantes;
	}

	/**
	 * Recibe como parametro un objeto de la clase Persona. <br>
	 * <br>
	 * Agrega el objeto 'participante' al conjunto de "participantes" de la reunion
	 * que se encuentra representada por el atributo 'participantes'
	 *
	 * @param participante
	 */
	public void addParticipantes(Persona participante) {
		participantes.add(participante);
//  if(Para verificar si el conjunto de objetos "reuniones" del objeto "participante"
//	de la clase Persona no contiene el objeto "reunión" actual)
		if (!participante.getReuniones().contains(this)) {
//			Si el conjunto de objetos "reuniones" del objeto "participante" la Clase Persona
//			no contiene la reunión actual, entonces
//			se llama al método addReunion() del objeto participante de la Clase Persona
//			para agregar esta "reunión" al conjunto de reuniones de la Clase Persona
			participante.addReunion(this);
		}
	}

	@Override
	public String toString() {
		return "○ Reunion [id=" + id + " fecha= " + fecha + " asunto " + asunto + "]";
	}

}
