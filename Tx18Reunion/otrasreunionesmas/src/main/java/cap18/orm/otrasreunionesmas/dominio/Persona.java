package cap18.orm.otrasreunionesmas.dominio;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Clase Concreta <br>
 * <br>
 * La relación que existe es de Muchas (Personas) a Muchas (Reunion) (N:M) <br>
 * <br>
 * En la clase Muchos (Empleados) se crea la (clase foranea - FK) para
 * relacionarse con la clase Muchos (Reunion) <br>
 * <br>
 * En la (Clase Reunion) para poder enlazarse se añade el parametro
 * (mappedBy="reuniones") que es el que tiene la (clase Persona) para enlazar
 * con la (Clase Reunion)
 *
 * @author rad
 *
 */
@Entity // Define la clase
//@Table(name = "Persona") // Referencia a la tabla Persona
public class Persona {

	@Id // Identificador unico
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
	private int id;

	@Column(unique = true) // Elemento de la columna , solo puede tener un valor
	private String numeroEmpleado;

//	Atributos de instancia
	private String nombre;
	private String apellidos;

	/**
	 * Atributo de Instancia <br>
	 * <br>
	 * El campo reuniones está mapeado con la anotación @ManyToMany a la clase
	 * Reunion, lo que indica una relación muchos a muchos entre las dos entidades.
	 * <br>
	 * Significa que una persona puede asistir a varias reuniones y una reunión
	 * puede tener varios participantes. <br>
	 * Se utiliza como enlace a la tabla "Reunion" desde la tabla "Persona"
	 */
	@ManyToMany
	private Set<Reunion> reuniones;

	/**
	 * Constructor por defecto
	 */
	public Persona() {
		reuniones = new HashSet<>();
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param id
	 * @param numeroEmpleado
	 * @param nombre
	 * @param apellidos
	 */
	public Persona(String numeroEmpleado, String nombre, String apellidos) {
		this(); // Llamada al constructor por defecto y sin parametros
		this.numeroEmpleado = numeroEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo de instancia
	 *
	 * Devolvemos una Set<Reunion> de objetos reuniones
	 *
	 * @return - Set<Reunion> - Devuelve un conjunto de objetos de tipo Reunion
	 */
	public Set<Reunion> getReuniones() {
		return reuniones;
	}

	/**
	 * Prodecimiento de instancia <br>
	 *
	 * Añade un objetos de tipo Reunion al atributo 'reuniones' de elemento
	 * Set<Reunion> <br>
	 * Si el elemento 'reunion' contiene objetos del tipo persona que pertenecen a
	 * esa 'reunion'
	 *
	 * Añade ese mismo objeto <br>
	 *
	 * Agrega un objeto de tipo "reunión" al conjunto de "reuniones" de una Clase
	 * Persona (Persona) y también agrega el objeto "persona" como "participante"
	 * del objeto "reunión" si aún no lo está. <br>
	 * Se utiliza para agregar un objeto "reunión" al conjunto Set<Reunion> de
	 * "reuniones" del objeto "persona" y asegurarse que el objeto "persona" también
	 * se agregue al Set<Reunion> de "participantes" de la "reunión"
	 * <hr>
	 * El metodo addReunion <br>
	 * Toma como argumento un objeto de la clase Reunion y lo agrega al conjunto
	 * Set<Reunion> de "reuniones" de la instancia actual de la clase Persona <br>
	 * <br>
	 * Si el objeto "reunión" no contiene ya a la instancia actual de la clase
	 * Persona en su conjunto de participantes, el método también agrega a la
	 * instancia actual de la clase Persona al conjunto de participantes de la
	 * reunión. <br>
	 * <br>
	 * En resumen : <br>
	 * Este método se utiliza para agregar un objeto "reunión" al conjunto de
	 * reuniones de la "persona" y asegurarse de que la "persona" también se agregue
	 * al conjunto de participantes de la "reunión" si aún no está presente.
	 *
	 * @param reunion
	 */
	public void addReunion(Reunion reunion) {
		reuniones.add(reunion);
// La palabra clave 'this' hace referencia a la instancia actual de la clase Persona
// Es decir , a la 'persona' a la que se está agregando el objeto reunión a través del método addReunion()
// utiliza 'this' como argumento para el método contains() en el conjuntos de participantes de la reunión
// Esto permite verificar si el objeto persona ya está incluida en el conjunto de participantes de la reunión,
// evitando duplicados.
		if (!reunion.getParticipantes().contains(this)) {
			reunion.addParticipantes(this);
		}
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "◘ Persona [id= " + id + " numeroEmpleado= " + numeroEmpleado + " nombre " + nombre + " apellidos "
				+ apellidos + "]";
	}

}
