package ejemplo.mappedby;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Mapeo de la Relación Inversa<br>
 * Se refiere a la manera en que una entidad puede "ENCONTRAR" su relación con
 * otra entidad
 * <hr>
 * Ejemplo : <br>
 * Cada empleado pertenece a un departamento : 1 - 1 <br>
 * Cada departamento tiene muchos empleados : 1 - M <br>
 * • Tenemos una relación de muchos (empleados) a uno (departamento)
 * <hr>
 *
 * @ManyToOne - Para indicar que un 'Empleado' pertenece a un 'Departamento'
 *            <br>
 * @JoinColumn - Para indicar el nombre de la columna en la tabla 'Empleado' que
 *             se utiliza para almacenar el ID del departamento al que pertenece
 *             cada empleado
 *
 *             Clase Empleado <br>
 *             Es la que tiene la clave foranea FK y la que mapea la clase
 *             Departamentos <br>
 *
 * @author rad
 *
 */
@Entity
public class Empleado {

	@Id
	private Long id;

	private String nombre;

	@ManyToOne // Muchos a Uno
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;

}
