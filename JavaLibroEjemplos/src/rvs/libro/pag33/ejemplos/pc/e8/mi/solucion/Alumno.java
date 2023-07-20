package rvs.libro.pag33.ejemplos.pc.e8.mi.solucion;

/**
 * Clase Concreta : Alumno
 * 
 * 18 jul 2023 - 23:04:24
 *
 * @author RVS
 *
 */
public class Alumno {

	/**
	 * Atributo de instancia
	 * 
	 * Nombre del Alumno
	 * 
	 */
	private String nombre;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena la 1º nota
	 */
	private double nota1;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena la 2º nota
	 */
	private double nota2;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena la 3º nota
	 */
	private double nota3;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena nota total del alumno 1
	 */
	private double notaTotal1;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena nota total del alumno 2
	 */
	private double notaTotal2;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena nota total del alumno 3
	 * 
	 */
	private double notaTotal3;

	/**
	 * Constructor por defecto
	 */
	public Alumno() {
		this.nombre = null;
		this.nota1 = 0.0;
		this.nota2 = 0.0;
		this.nota3 = 0.0;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre - Nombre del alumno
	 * @param nota1  - Nota del alumno
	 * @param nota2  - Nota del alumno
	 * @param nota3  - Nota del alumno
	 */
	public Alumno(String nombre, double nota1, double nota2, double nota3) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - string - nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param nombre - nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - double - devuelve decimal que representa una nota1
	 */
	public double getNota1() {
		return nota1;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param nota1 - Nota en decimal
	 */
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - double - devuelve decimal que representa una nota1
	 */
	public double getNota2() {
		return nota2;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param nota2 - establece la nota 2
	 */
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - double - devuelve decimal que representa una nota1
	 */
	public double getNota3() {
		return nota3;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param nota3 - establece la nota 3
	 */
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param nota1 - notas totales para el alumno 1
	 */
	public void setNotaTotal1(double notaTotal1) {
		this.notaTotal1 = notaTotal1;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - double - devuelve decimal de la nota
	 */
	public double getNotaTotal1() {
		return notaTotal1;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param nota2 - establece notas totales para el alumno 2
	 */
	public void setNotaTotal2(double notaTotal2) {
		this.notaTotal2 = notaTotal2;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return nota2 - devuelve notas totales para el alumno 2
	 */
	public double getNotaTotal2() {
		return notaTotal2;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - double - devuelve la nota 3 en decimal
	 */
	public double getNotaTotal3() {
		return notaTotal3;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * @param nota1 - - establece notas totales para el alumno 3
	 */
	public void setNotaTotal3(double notaTotal3) {
		this.notaTotal3 = notaTotal3;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - double - Obtenemos el total de las 3 notas del alumno
	 */
	public double getTotal() {
		return (getNota1() + getNota2() + getNota3()) / 3;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - String - Muestra todos los datos de un alumno
	 */
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " - Nota 1: " + getNota1() + " - Nota 2: " + getNota2() + " - Nota 3: "
				+ getNota3();
	}

}
