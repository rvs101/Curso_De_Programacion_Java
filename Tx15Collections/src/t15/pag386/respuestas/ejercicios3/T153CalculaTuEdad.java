/**
 * Creamos un objeto 'LocalDate' con nuestra fecha de nacimiento
 * 
 * Y otro con la fecha de hoy
 * 
 * Calculamos el periodo entre una fecha y otra
 * 
 * Imprimimos recuperando años , meses y días
 * 
 * <b> La clase Duration de <code>java.time</code>	
 * 
 */
package t15.pag386.respuestas.ejercicios3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * 
 * @date 20 oct 2022 17:49:02
 * 
 * @author RVS
 *
 */
public class T153CalculaTuEdad {

	public static void main(String[] args) {
		LocalDate miNacimiento = LocalDate.of(1980, Month.JULY, 1);
		LocalDate now = LocalDate.now();
		Period edad = Period.between(miNacimiento, now);
		
		System.out.println("Tengo " + edad.getYears() + " Años " + edad.getMonths() + " Meses " +  edad.getDays()+ " Dias");
		
		
	}
}
