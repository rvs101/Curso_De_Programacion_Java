package t15.pag383.ejercicio3.calcula.edad;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 
 *
 * @author RVS
 *
 * @date 7 ago 2022 - 22:55:58
 *
 */
public class T15ECalculaEdad {

	public static void main(String[] args) {

		Captura c = new Captura();
		System.out.println(c.getMesEstablecido());
		System.out.println(c.getDiaDelMes());

		MyDates mydates = new MyDates();

	}
}

/**
 * 
 *
 * @author RVS
 *
 * @date 7 ago 2022 - 23:00:21
 *
 */
class MyDates {

	public static void setCalcularEdad(LocalDate start_date, LocalDate end_date) {
//		LocalDate start_date = LocalDate.of(0, 0, 0);

	}

	public static void getCalcularEdad(LocalDate start_date, LocalDate end_date) {
		Period diff = Period.between(start_date, end_date);
		System.out.println("Diferencia entre las 2 fechas es : ");
		System.out.printf("%d años , %d meses , %d dias", diff.getYears(), diff.getMonths(), diff.getDays());
	}

}

/**
 * 
 *
 * @author RVS
 *
 * @date 9 ago 2022 - 13:15:50
 *
 */
class Captura {

	/**
	 * Atributo de Instancia - int almacena el valor día
	 */
	public int dia;

	/**
	 * Atributo de Instancia - int almacena el valor de la semana
	 */
	public int mes;

	/**
	 * Atributo de Instancia - int almacena el valor de la anio
	 */
	public int anio;

	/**
	 * Atributo de Instancia - sc almacena un objeto Scanner para capturar elementos
	 * desde teclado
	 */
	public Scanner sc;

	/**
	 * Constructor sin parametro
	 */
	public Captura() {
		this.dia = 0;
		this.mes = 0;
		this.anio = 0;
	}

	/**
	 * Procedimiento de Instancia - Establece el valor de la variable día en el
	 * atributo de instancia de la clase
	 * 
	 * @param dia - int - Establece el día dentro de la variable de instancia de la
	 *            clase Dia
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Metodo de Instancia - Devuelve el valor establecido dentro de la variable de
	 * instancia de la clase
	 * 
	 * @return
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * 
	 * @return
	 */
	public int getDiaDelMes() {
		System.out.println("El mes establecido: " + getMes());
		System.out.println("Introduce un dia del mes establecido");

		switch (getMes()) { // 28

		case 1:
			System.out.println("Elige un numero entre el 1 y 31");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 31));
			}
			setDia(getDia());
			break;
		case 2:
			System.out.println("Elige un numero entre el 1 y 28");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 28)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 28");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 28));
			}
			setDia(getDia());
			break;
		case 3:
			System.out.println("Elige un numero entre el 1 y 31");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 31));
			}
			setDia(getDia());
			break;
		case 4:
			System.out.println("Elige un numero entre el 1 y 30");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 30)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 30");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 30));
			}
			setDia(getDia());
			break;
		case 5:
			System.out.println("Elige un numero entre el 1 y 31");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 31));
			}
			setDia(getDia());
			break;
		case 6:
			System.out.println("Elige un numero entre el 1 y 30");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 30)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 30");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 30));
			}
			setDia(getDia());
			break;
		case 7:
			System.out.println("Elige un numero entre el 1 y 31");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 31));
			}
			setDia(getDia());

			break;
		case 8:
			System.out.println("Elige un numero entre el 1 y 31");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 31));
			}
			setDia(getDia());
			break;
		case 9:
			System.out.println("Elige un numero entre el 1 y 30");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 30)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 30");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 30));
			}
			setDia(getDia());
			break;
		case 10:
			System.out.println("Elige un numero entre el 1 y 31");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 31));
			}
			setDia(getDia());

			break;
		case 11:
			System.out.println("Elige un numero entre el 1 y 30");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 30)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 30");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 30));
			}
			setDia(getDia());
			break;
		case 12:
			System.out.println("Elige un numero entre el 1 y 31");
			setDia(getNumero());
			if ((getDia() < 1) || (getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					setDia(getNumero());
				} while ((getDia() < 1) || (getDia() > 31));
			}
			setDia(getDia());
			break;
		default:
			break;
		}
		return dia;
	}

	/**
	 * 
	 * @return
	 */
	public int getMesEstablecido() {
		System.out.println("Introduce un mes entre 1 y 12");
		setMes(getNumero());

		if ((getMes() > 12) || (getMes() < 1)) {
			do {
				System.out.println("Por favor - Introduce un mes entre 1 y 12");
				setMes(getNumero());
			} while ((getMes() > 12) || (getMes() < 1));
		}
		return getMes();
	}

	/**
	 * 
	 * @param num
	 */
	public void setMes(int num) {
		this.mes = num;
	}

	/**
	 * Metodo de instancia - Devuelve establecido un numero de mes
	 * 
	 * @return - int : Numero de mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * 
	 * @return
	 */
	public int getAnioActual() {
		Calendar calendar = GregorianCalendar.getInstance();
		int anioActual = calendar.get(Calendar.YEAR);
		return anioActual;
	}

	/**
	 * 
	 * @return
	 */
	public int getAnio() {
		System.out.println("Introduce un anio entre 1900 y el " + getAnioActual());
		anio = getNumero();
		if ((anio > getAnioActual()) || (anio < 1900)) {
			do {
				System.out.println("Por favor - Introduce un anio entre 1900 y el " + getAnioActual());
				anio = getNumero();
			} while ((anio > getAnioActual()) || (anio < 1900));
		}
		return anio;
	}

	/**
	 * 
	 * @return
	 */
	public int getNumero() {
		sc = new Scanner(System.in);
		int numero = sc.nextInt();
		return numero;
	}

}