package t17.api.streams.interfaz.predicate;

/**
 * 
 * @author Roboto
 *
 */
public class Persone {

	private String nombre;

	private int edad;

	public Persone() {
		this.nombre = null;
		this.edad = 0;
	}

	public Persone(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
