package conceptos.basicos.uso_this;

/**
 * 
 * @author RVS
 * @time 10 may 2022 - 23:27:01
 *
 */
public class ThisDentroMetodos {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo();
		v1.setMotor(5);
		v1.setNombre("Mercedes");
		System.out.println("Vehiculo → " + v1.toString());

		Vehiculo c1 = new Coche();
		c1.setMotor(3);
		c1.setNombre("Toyota");
		c1.getMotorTotal(100);
		System.out.println("Vehiculo → " + c1.toString());

		Coche c2 = new Coche();
		c2.setCilindrada(6);
		c2.getMotorTotal(c1.getMotor());
	}
}

/**
 * 
 * @author RVS
 * @time 10 may 2022 - 23:26:58
 *
 */
class Vehiculo {

	private String nombre;
	private double motor;

	/**
	 * 
	 */
	public Vehiculo() {
		nombre = null;
		motor = 0.0;

	}

	/**
	 * 
	 * @param nombre
	 * @param motor
	 */
	public Vehiculo(String nombre, double motor) {
		this.nombre = nombre;
		this.motor = motor;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the motor
	 */
	public double getMotor() {
		return motor;
	}

	/**
	 * @param motor the motor to set
	 */
	public void setMotor(double motor) {
		this.motor = motor;
	}

	/**
	 * 
	 * @return
	 */
	public double getMotorTotal(double motores) {
		if (motores > 500) {
			motores += 1;
		} else {
			motores += 2;
		}
		return motores;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " Motor: " + getMotor() + " Motor total " + getMotorTotal(motor);
	}

}

/**
 * 
 * @author RVS
 * @time 10 may 2022 - 23:39:55
 *
 */
class Coche extends Vehiculo {

	private int matricula;
	private char letra;
	private double cilindrada;

	/**
	 * 
	 */
	public Coche() {
		matricula = 0;
		letra = ' ';
		cilindrada = 0;
	}

	/**
	 * 
	 * @param matricula
	 * @param letra
	 */
	public Coche(int matricula, char letra, double cilindrada) {
		this.matricula = matricula;
		this.letra = letra;
		this.cilindrada = cilindrada;
	}

	/**
	 * @return the letra
	 */
	public char getLetra() {
		return letra;
	}

	/**
	 * @param letra the letra to set
	 */
	public void setLetra(char letra) {
		this.letra = letra;
	}

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * 
	 * @return
	 */
	public double getCilindrada() {
		return cilindrada;
	}

	/**
	 * 
	 * @param cilindrada
	 */
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public double getMotorTotal(double motores) {
		double cilindrada = 6;
// Estoy llamando al metodo de la clase padre con la implementación que tiene definida para ejecutar este metodo
		return super.getMotorTotal(motores) * cilindrada;
	}

}
