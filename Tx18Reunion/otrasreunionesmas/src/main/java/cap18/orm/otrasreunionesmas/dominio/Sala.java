package cap18.orm.otrasreunionesmas.dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Clase Concreta del tipo JPA
 *
 * @author rad
 *
 */
@Entity
//@Table(name = "sala")
public class Sala {

	@Id
	@Column(length = 20)
	private String id;

	/**
	 * Atributo de instancia
	 */
	private String descripcion;

	/**
	 * Atributo de instancia
	 */
	private int capacidad;

	/**
	 * Atributo de instancia <br>
	 * <br>
	 * Reuniones representa una lista de las reuniones que se han llevado a cabo en
	 * la sala<br>
	 * La anotación @OneToMany(mappedBy = "sala") indica que hay una relación
	 * uno-a-muchos entre la entidad Sala y la entidad Reunion (donde una sala puede
	 * tener muchas reuniones) <br>
	 * <br>
	 * La propiedad mappedBy especifica que el atributo sala en la clase Reunion es
	 * el propietario de la relación
	 */
	@OneToMany(mappedBy = "sala")
	private List<Reunion> reuniones;


	/**
	 * Constructor por defecto
	 */
	public Sala() {
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param id
	 * @param descripcion
	 * @param capacidad
	 */
	public Sala(String id, String descripcion, int capacidad) {
		this.id = id;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
	}

	/**
	 *
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 *
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 *
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 *
	 * @return
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 *
	 * @param capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 *
	 * @return
	 */
	public List<Reunion> getReuniones() {
		return reuniones;
	}

	/**
	 *
	 * @param reuniones
	 */
	public void setReuniones(List<Reunion> reuniones) {
		this.reuniones = reuniones;
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "○ Sala [id=" + id + ", descripcion= " + descripcion + " , capacidad= " + capacidad + "]";
	}

}
