package conceptos.herencia;

/**
 * Clase Hija que hereda algunas caracteristicas de la clase Padre
 * 
 * Caracteristicas (Atributos/Metodos) a heredar de la clase Padre serán :
 * 
 * String - Nombre
 * 
 * int - Edad
 * 
 * double - Altura
 * 
 * @author RVS
 *
 */
public class Hija extends Padre {

	/**
	 * Atributo de instancia - Define el peso del objeto
	 */
	private double peso;

	/**
	 * Atributo de instancia - Define el sexo del objeto
	 */
	private String colorOjos;

	/**
	 * Atributo de instancia - Define el lugar de nacimiento del objeto
	 */
	private String lugarDeNacimiento;

	/**
	 * Constructor por defecto
	 * 
	 * Define unas caracteristicas por defecto del objeto que instanciemos
	 * 
	 */
	public Hija() {
		super();
		this.peso = 0;
		this.colorOjos = "";
		this.lugarDeNacimiento = "";
	}

	/**
	 * Constructor que permite definir al objeto que instanciemos una serie de
	 * valores y el cual define unas caracteristicas establecidas heredades del
	 * constructor Padre
	 * 
	 * @param peso
	 * @param sexo
	 * @param lugarDeNacimiento
	 */
	public Hija(double peso, String ojos, String lugarDeNacimiento) {
		super("Maria", 20, 160);
		this.peso = peso;
		this.colorOjos = ojos;
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	/**
	 * Metodo de la clase Padre heredado por la clase Hija
	 * 
	 * Permite obtener el nombre de la clase Hija
	 */
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	/**
	 * Metodo de la clase Padre heredado por la clase Hija
	 * 
	 * Permite establecer el nombre de la clase Hija
	 */
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	/**
	 * Metodo de la clase Padre heredado por la clase Hija
	 * 
	 * Permite establecer la edad de la clase Hija
	 * 
	 */
	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return super.getEdad();
	}

	/**
	 * Metodo de la clase Padre heredado por la clase Hija
	 * 
	 * Permite establecer la edad de la clase Hija
	 * 
	 */
	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		super.setEdad(edad);
	}

	/**
	 * Metodo de la clase Padre heredado por la clase Hija
	 * 
	 * Permite obtener la altura de la clase Hija
	 * 
	 */
	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return super.getAltura();
	}

	/**
	 * Metodo de la clase Padre heredado por la clase Hija
	 * 
	 * Permite establecer la altura de la clase Hija
	 * 
	 */
	@Override
	public void setAltura(int altura) {
		// TODO Auto-generated method stub
		super.setAltura(altura);
	}

	/**
	 * Obtener el peso del objeto hija
	 * 
	 * @return Peso en kilogramos
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Establecer el peso del objeto hija
	 * 
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Obtener el ojos del objeto hija
	 * 
	 * @return
	 */
	public String getColorOjos() {
		return colorOjos;
	}

	/**
	 * Establecer los ojos del objeto hija
	 * 
	 * @param ojos
	 */
	public void setOjos(String ojos) {
		this.colorOjos = ojos;
	}

	/**
	 * Obtener el lugar de nacimiento del objeto hija
	 * 
	 * @return
	 */
	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}

	/**
	 * Establecer el lugar de nacimiento del objeto hija
	 * 
	 * @param lugarDeNacimiento
	 */
	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	/**
	 * this.peso = 0; this.colorOjos = ""; this.lugarDeNacimiento = "";
	 * 
	 */
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " Edad: " + getEdad() + " Altura: " + getAltura() + " Peso: " + getPeso()
				+ " kg " + " Color de Ojos: " + getColorOjos() + " Lugar de Nacimiento: " + getLugarDeNacimiento();
	}
}