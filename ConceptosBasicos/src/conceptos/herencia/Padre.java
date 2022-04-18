package conceptos.herencia;

/**
 * Clase Principal - Padre
 * 
 * Define una serie de caracteristicas que heredará sus clases desdencientes
 * como será la clase Hija
 * 
 * @author RVS
 *
 */
public class Padre {

	/**
	 * Atributo de instancia : Define el nombre del objeto persona que se instancie
	 */
	private String nombre;

	/**
	 * Atributo de instancia : Define la edad del objeto persona que se instancie
	 */
	private int edad;

	/**
	 * Atributo de instancia : Define la altura del objeto persona que se instancie
	 */
	private double altura;

	/**
	 * Constructor por defecto de la Clase Persona
	 * 
	 */
	public Padre() {
		this.nombre = "Anónimo";
		this.edad = 0;
		this.altura = 0.0;
	}

	/**
	 * Constructor para instanciar objetos de la Clase Persona
	 * 
	 * @param nombre
	 * @param edad
	 * @param altura
	 */
	public Padre(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	/**
	 * Establece un nombre del objeto
	 *
	 * @param nombre que se le asigna al objeto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el nombre del objeto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece la edad del objeto
	 * 
	 * @param edad que se le asigna al objeto
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Devuelve la edad del objeto
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Establece la altura del objeto
	 * 
	 * @param altura que se le asigna al objeto
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * Devuelve la altura del objeto
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " Edad: " + getEdad() + " Altura: " + getAltura();
	}
}
