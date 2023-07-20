package rvs.libro.pag33.ejemplos.pc.e8.mi.solucion;

/**
 * Clase Concreta - CalcularNotas
 * 
 * 18 jul 2023 - 23:05:33
 *
 * @author RVS
 *
 */
public class CalcularNotas {

	/**
	 * Procedimiento de instancia <br>
	 * <br>
	 * Calcula las notas de todos los alumnos y muestra quién tiene la mayor
	 * 
	 * @param a1 - Objeto - alumno1
	 * @param a2 - Objeto - alumno2
	 * @param a3 - Objeto - alumno3
	 */
	public void calcularNotas(Alumno a1, Alumno a2, Alumno a3) {

		a1.setNotaTotal1(a1.getTotal());
		
		a2.setNotaTotal2(a2.getTotal());
		
		a3.setNotaTotal3(a3.getTotal());

		System.out.println("Resultado final : ");
		
		System.out.println("Alumno 1º " + a1.toString());
		
		System.out.println("Alumno 2º " + a2.toString());
		
		System.out.println("Alumno 3º " + a3.toString());

		if (a1.getNotaTotal1() > a2.getNotaTotal2()) {
			System.out.println("El Alumno : " + a1.getNombre() + " - tiene la nota mayor con : " + a1.getNotaTotal1());
		} else if (a2.getNotaTotal2() > a3.getNotaTotal3()) {
			System.out.println("El Alumno : " + a2.getNombre() + " - tiene la nota mayor con : " + a2.getNotaTotal2());
		} else if (a3.getNotaTotal3() > a1.getNotaTotal1()) {
			System.out.println("El Alumno : " + a3.getNombre() + " - tiene la nota mayor con : " + a3.getNotaTotal3());
		} else {
			System.out.println("El Alumno : " + a1.getNombre() + " - tiene la nota mayor con : " + a1.getNotaTotal1());
		}
	}
}
