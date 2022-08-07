package conceptos.super_ejemplo.constructores;

/**
 * Sublase de la clase Padre la cual hereda todos los elementos de la clase
 * Padre y ademas añade elementos propios para implementar los objetos según las
 * necesidades de las reglas de negocio
 * 
 *
 */
public class Hijos extends Padre {

//	Atributos de la Clase Hijo para almacenar 
//	los elementos que vayamos añadiendo 
//	a los objetos que vayamos creando
	public String colorPelo;

	public String colorOjos;

	public double estatura;

	public boolean estudiante;

	/**
	 * Constructor por defecto
	 * 
	 * Este Constructor invoca mediante la palabra "super" al constructor de la que
	 * desciende llamada "Clase Padre" para implementar sus objetos con los
	 * atributos y metodos que esta clase posee
	 */
	public Hijos() {
		super(0, "Non-Name", "Non-SubName", 0.0); // Invoca al constructor de la clase PADRE para implementar con sus
													// atributos los objetos de la clase descendiente llamada 'Clase
													// Hija'
		this.colorPelo = null;
		this.colorOjos = null;
		this.estatura = 0.0;
		this.estudiante = false;
	}

	/**
	 * Constructor parametrizado de la clase Hijo
	 * 
	 * Este Constructor invoca mediante la palabra "super" al constructor de la que
	 * desciende llamada "Clase Padre" para implementar sus objetos con los
	 * atributos y metodos que esta clase posee
	 * 
	 * @param colorPelo  - Atributo de la clase Hijo - Almacena un String con el
	 *                   color de pelo
	 * @param colorOjos  - Atributo de la clase Hijo - Almacena un String con el
	 *                   color de ojos
	 * @param estatura   - Atributo de la clase Hijo - Almacena un numero decimal
	 *                   para estatura
	 * @param estudiante - Atributo de la clase Hijo - Almacena un booleano para los
	 *                   estudios
	 * 
	 *                   Aqui se encuentran los ATRIBUTOS heredado de la clase Padre
	 *                   para complementar los objetos de la clase Hijo
	 * 
	 * @param nombre     - Atributo heredado de la clase Padre - Almacena un String
	 *                   con el nombre
	 * @param apellidos  - Atributo heredado de la clase Padre - Almacena un String
	 *                   con el apellidos
	 * @param edad       - Atributo heredado de la clase Padre - Almacena un numero
	 *                   con la edad
	 * @param peso       - Atributo heredado de la clase Padre - Almacena un decimal
	 *                   con el peso
	 */
	public Hijos(String colorPelo, String colorOjos, double estatura, boolean estudiante, int edad, String nombre,
			String apellidos, double peso) {
		super(edad, nombre, apellidos, peso); // Invoca al constructor de la clase PADRE para implementar con sus
												// atributos los objetos de la clase descendiente llamada 'Clase Hija'
												// Cada objeto que vayamos a crear tendran tantos atributos y metodos de
												// la propia clase como de la clase superior llamada Clase Padre para
												// tener una mayor implementación , diseño de las reglas de negocios y
												// reutilización del código
		this.colorPelo = colorPelo;
		this.colorOjos = colorOjos;
		this.estatura = estatura;
		this.estudiante = estudiante;
	}

	/**
	 * 
	 * @return
	 */
	public String getColorPelo() {
		return colorPelo;
	}

	/**
	 * 
	 * @param colorPelo
	 */
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	/**
	 * 
	 * @return
	 */
	public String getColorOjos() {
		return colorOjos;
	}

	/**
	 * 
	 * @param colorOjos
	 */
	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	/**
	 * 
	 * @return
	 */
	public double getEstatura() {
		return estatura;
	}

	/**
	 * 
	 * @param estatura
	 */
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	/**
	 * 
	 * @return
	 */
	public boolean getEstudiante() {
		return estudiante;
	}

	/**
	 * 
	 * @param estudiante
	 */
	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}

	/**
	 * 
	 */
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	/**
	 * 
	 */
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	/**
	 * 
	 */
	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return super.getApellidos();
	}

	/**
	 * 
	 */
	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return super.getEdad();
	}

	/**
	 * at
	 */
	@Override
	public double getPeso() {
		// TODO Auto-generated method stub
		return super.getPeso();
	}

	/**
	 * 
	 */
	@Override
	public void setApellidos(String apellidos) {
		// TODO Auto-generated method stub
		super.setApellidos(apellidos);
	}

	/**
	 * 
	 */
	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		super.setEdad(edad);
	}

	/**
	 * 
	 */
	@Override
	public void setPeso(double peso) {
		// TODO Auto-generated method stub
		super.setPeso(peso);
	}

	/**
	 * Metodo heredado de la Clase Base Object para mostrar todos los valores que
	 * hemos ido añadiendo a los objetos que hemos instanciado
	 * 
	 */
	@Override
	public String toString() {
		return " Nombre: " + getNombre() + " Apellidos: " + getApellidos() + " Edad: " + getEdad() + " Peso: "
				+ getPeso() + " Color Ojos: " + getColorOjos() + " Color Pelo: " + getColorPelo() + " Estudiante: "
				+ getEstudiante();
	}

}