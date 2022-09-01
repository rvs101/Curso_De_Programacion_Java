package t15.pag383.ejercicio3.calcula.edad;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Calcula tu edad exacta a dia de hoy
 * 
 * Programa que al introducir tu fecha de nacimiento y te dice cuantos años ,
 * meses y días han pasado hasta la fecha actual
 * 
 *
 * @author RVS
 *
 * @date 11 ago 2022 - 11:49:10
 *
 */
public class T15CalculaEdadSolucion {

	public static void main(String[] args) {

//		Asignar fecha de nacimiento
		LocalDate miNacimiento = LocalDate.of(1980, Month.JULY, 1);

//		Asignar fecha actual
		LocalDate now = LocalDate.now();

//		Calcular fechas
		Period edad = Period.between(miNacimiento, now);

//		Mostrar resultados
		System.out.println(
				"Tengo: " + edad.getYears() + " años , " + edad.getMonths() + " meses y " + edad.getDays() + " dias");
	}
}
