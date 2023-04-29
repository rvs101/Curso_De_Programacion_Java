package ejemplo.mappedby;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Utilizamos la anotación @OneToMany para indicar que un <b>Departamento</b>
 * tiene muchos <b>Empleados</b> <br>
 * <br>
 * El parametro <b>mappedBy</b> indica que la relación inversa se encuentra en
 * el atributo 'departamento' de la clase Empleado <br>
 * <br>
 * Es decir que la relación entre Departamento y Empleado se establece a traves
 * de este atributo de la clase Empleado
 *
 * @author rad
 *
 */
@Entity
public class Departamento {

	@Id
	private Long id;

	private String nombre;

	/**
	 * Agregar el atributo 'empleados' a la clase Departamento para representar
	 * todos los empleados que pertenecen a ese departamento <br>
	 * Para establecer la relación podemos utilizar la anotación @OneToMany
	 */
	@OneToMany(mappedBy = "departamento")
	private List<Empleado> empleados;

	public Departamento() {
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
