package rvs.libro.pag33.ejemplos.pc.e8.mi.solucion;

/**
 * Clase Concreta : Main
 * 
 * 18 jul 2023 - 23:02:39
 *
 * @author RVS
 *
 */
public class Main {

	/**
	 * Ejercicio8: Se ingresan por teclado las notas obtenidas por tres alumnos en
	 * un parcial de ciertas materia. <br>
	 * <br>
	 * Se desea saber cuáles de estos alumnos resultaron aplazados, y además se pide
	 * determinar cuál fue la mayor nota, y cuál fue el alumno que la obtuvo.
	 */

	public static void main(String[] args) {

		Teclado t = new Teclado();
		
		Alumno a1 = new Alumno(t.getNombre(), t.getNota(), t.getNota(), t.getNota());
		
		Alumno a2 = new Alumno(t.getNombre(), t.getNota(), t.getNota(), t.getNota());
		
		Alumno a3 = new Alumno(t.getNombre(), t.getNota(), t.getNota(), t.getNota());

		CalcularNotas cn = new CalcularNotas();
		
		cn.calcularNotas(a1, a2, a3);

	}
}
