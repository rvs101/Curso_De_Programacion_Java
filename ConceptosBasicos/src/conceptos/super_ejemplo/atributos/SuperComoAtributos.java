package conceptos.super_ejemplo.atributos;

/**
 * 
 * @author RVS
 *
 * @date 6 ago 2022 - 14:12:14
 *
 */
public class SuperComoAtributos {

	public static void main(String[] args) {
// Definimos el objeto de la Clase Padre
		Padre padre = new Padre("Juan", "Sainz Vazquez", 43);
// Mostramos los valores que contiene el 
// objeto invocando el metodo sobreescrito toString() de la super Clase Object
		System.out.println(padre.toString());

// Definimos un objeto de la Subclase Hijo 		
		Hijo hijoSinParametros = new Hijo();
// Mostramos los valores del objeto de la Clase Hijo utilizando el metodo toString() de la SuperClase Object
		System.out.println(hijoSinParametros.toString());
// Definimos un objeto de la Subclase Hijo el cual internamente tiene definido el atributo "nombre" el cual asigna un valor al objeto de forma automática
		Hijo hijoSegundoConstructorParametrizado = new Hijo(154, 45);
// Mostramos los valores del objeto de la Clase Hijo utilizando el metodo toString() de la SuperClase Object
		System.out.println(hijoSegundoConstructorParametrizado.toString());
// Definimos un objeto de la Subclase Hijo el cual internamente tiene definido el atributo "nombre" mediante la llamada al metodo de la Clase Padre 
// el cual asigna un valor de forma automática al objeto 
		Hijo hijoTercerConstructorParametrizado = new Hijo(145, 39, "Felipe");
// Mostramos los valores del objeto de la Clase Hijo utilizando el metodo toString() de la SuperClase Object
		System.out.println(hijoTercerConstructorParametrizado.toString());
	}
}

/**
 * Clase Concreta Padre
 * 
 * Define una serie de atributos y metodos que podrá heredar la "SubClase Hija"
 * llamada "Clase Hijo"
 *
 */
class Padre {

// Atributos de instancia de clase Padre para almacenar los valores
	public String nombre;
	public String apellidos;
	public int edad;

	/**
	 * Constructor por defecto
	 */
	public Padre() {
		this.nombre = "Non-Names";
		this.apellidos = "Non-Surnames";
		this.edad = 0;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre    - String - Define el nombre del objeto que instanciemos por
	 *                  la clase Padre
	 * @param apellidos - String - Define los apellidos del objeto que instanciemos
	 *                  por la clase Padre
	 * @param edad      - int - Define la edad del objeto que instanciemos por la
	 *                  clase Padre
	 */
	public Padre(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param apellidos - Establece el valor del atributo apellido
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - String - Devuelve el valor del atributo apellido
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param edad - Establece el valor del atributo edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - Devuelve el valor del atributo edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - Devuelve el valor del atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param nombre - Establece el valor del atributo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Heredado por la Super Clase Object que muestra los atributos que le pasemos
	 * dentro de cuerpo del metodo
	 * 
	 */
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " Apellidos: " + getApellidos() + " Edad: " + getEdad();
	}

}

/**
 * Subclase Hijo que hereda todos los atributos y metodos de la clase Padre
 *
 */
class Hijo extends Padre {

// Atributos de instancia de clase Padre para almacenar los valores	
	public double altura;
	public double peso;

	/**
	 * Constructor por defecto
	 * 
	 * Inicaliza todos atributos de la Subclase Hijo
	 */
	public Hijo() {
		this.altura = 0.0;
		this.peso = 0.0;
// Hemos invocado de forma explitica mediante la palabra "super" el atributo "apellidos" 
// de la clase Padre para que cuando creamos un objeto de tipo Hijo se le asigne de
// forma automática el valor preestablecido		
		super.apellidos = "Perez Sainz";
	}

	/**
	 * Constructor parametrizados
	 * 
	 * Establecemos mediante argumentos los valores que contendra el objeto de la
	 * clase Hijo que instanciemos
	 * 
	 * @param altura - Establece la altura que tendra los objetos que instanciemos
	 *               desde la Subclase Hijo
	 * @param peso   - Establece el peso que tendra los objetos que instanciemos
	 *               desde la Subclase Hijo
	 */
	public Hijo(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
// Hemos invocado de forma explitica mediante la palabra "super" el atributo "nombre" 
// de la clase Padre para que cuando creamos un objeto de tipo Hijo se le asigne de
// forma automática el valor preestablecido	
		super.nombre = "David";
	}

	/**
	 * Constructor parametrizado
	 * 
	 * Establecemos mediante argumentos los valores que contendra el objeto de la
	 * clase Hijo que instanciemos
	 * 
	 * @param altura
	 * @param peso
	 * @param nombre
	 */
	public Hijo(double altura, double peso, String nombre) {
		this.altura = altura;
		this.peso = peso;
// Podemos utilizar el metodo heredado de la propia clase Padre invocado con la palabra clave "super" para
// establecerle el valor que queramos a los objetos que instanciemos desde la Subclase llamada Clase Hijo
		super.setNombre(nombre);
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - Devuelve el valor de la altura establecido dentro del objeto
	 *         instanciado
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param altura - Establece el valor de la altura que tendra el objeto
	 *               instanciado
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - Devuelve el valor del peso establecido dentro del objeto
	 *         instanciado
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Metodo de instancia
	 * 
	 */
	public double getPesoPorEdad() {
		super.edad = 14;
		return peso * edad;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param peso - Establece el valor del peso que tendra el objeto instanciado
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Heredado de la Super Clase Object y modificado explicitamente para mostrar
	 * los valores que le hemos ido asignado a todos los objectos que hayamos ido
	 * instanciando en nuestro programa
	 * 
	 */
	@Override
	public String toString() {
		return " Nombre: " + super.nombre + " Apellidos: " + super.getApellidos() + " Altura: " + getAltura()
				+ " Peso: " + getPeso() + " Peso Por Edad: " + getPesoPorEdad();
	}
}
