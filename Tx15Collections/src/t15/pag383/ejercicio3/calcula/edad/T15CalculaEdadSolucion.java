package t15.pag383.ejercicio3.calcula.edad;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * 
 *
 * @author RVS
 *
 * @date 11 ago 2022 - 11:49:10
 *
 */
public class T15CalculaEdadSolucion {

	public static void main(String[] args) {

		LocalDate miNacimiento = LocalDate.of(1980, Month.JULY, 1);
		LocalDate now = LocalDate.now();

		Period edad = Period.between(miNacimiento, now);

		System.out.println(
				"Tengo " + edad.getYears() + " años , " + edad.getMonths() + " meses y " + edad.getDays() + " dias");

	}
}
