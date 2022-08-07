package conceptos.super_ejemplo.constructores;

/**
 * Clase Concreta - Padre
 * 
 * Contiene todos los valores más generalizados con los que vamos a trabajar
 * 
 */
public class Padre {

	public static void main(String[] args) {

	}

//	Atributos de Instancia de la propia 
//	clase para almacenas los valores de los objetos que vayamos creando
	public int edad;

	public String nombre;

	public String apellidos;

	public double peso;

	/**
	 * Constructor por defecto de la clase Padre
	 * 
	 * Se usa para inicializar los objetos de la clase Padre
	 */
	public Padre() {
		edad = 0;
		nombre = null;
		apellidos = null;
		peso = 0.0;
	}

	/**
	 * Constructor parametrizado de la clase Padre
	 * 
	 * Se usa para inicializar los objetos de la clase Padre
	 * 
	 * @param edad
	 * @param nombre
	 * @param apellidos
	 * @param peso
	 */
	public Padre(int edad, String nombre, String apellidos, double peso) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.peso = peso;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return Devuelve edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param edad - Establece la edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Procedimiento de instancia
	 * 
	 * @return - Devuelve nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param nombre - Establece Nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - Devuelve apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param apellidos - Establece apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - Devuelve peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param peso - Establece peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Metodo heredado de la Clase Base Object para mostrar todos los valores que
	 * hemos ido añadiendo a los objetos que hemos instanciado
	 */
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " Apellidos: " + getApellidos() + " Edad: " + getEdad() + " Peso: "
				+ getPeso();
	}
}
