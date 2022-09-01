package t15.pag383.ejercicio3.calcula.edad;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Calcula tu edad exacta a dia de hoy
 * 
 * Programa que al introducir tu fecha de nacimiento y te dice cuantos años ,
 * meses y días han pasado hasta la fecha actual
 *
 * @author RVS
 *
 * @date 7 ago 2022 - 22:55:58
 *
 */
public class T15ECalculaEdadMiSolucion {

	public static void main(String[] args) {

		System.out.println("Calcula tu edad en formato completo");
		MisFechas.getCalcularEdad(MisFechas.getFechaFormateada(MisFechas.getFechaFijada()),
				MisFechas.getFechaFormateada(MisFechas.getFechaActual()));

	}
}

/**
 *
 * @author RVS
 *
 * @date 7 ago 2022 - 23:00:21
 *
 */
class MisFechas {

	/**
	 * 
	 * @return
	 */
	public static String getFechaFijada() {
		String anioString = String.valueOf(Anio.getAnioEstablecido());
		String mesString = Mes.getMesFormeteado();
		System.out.println("• Mes: " + mesString);
		String diaString = Dia.getDiaFormeteado();
		System.out.println("• Dia: " + diaString);
		String fechaFijada = anioString.concat("/").concat(mesString.concat("/").concat(diaString));
		return fechaFijada;
	}

	/**
	 * 
	 * @return
	 */
	public static String getFechaActual() {
		Instant rightNow = Calendar.getInstance().getTime().toInstant();
		String fecha = rightNow.toString();
		String anioString = fecha.substring(0, 4);
		String mesString = fecha.substring(5, 7);
		String diaString = fecha.substring(8, 10);
		String fechaActual = anioString.concat("/").concat(mesString.concat("/").concat(diaString));
		return fechaActual;
	}

	/**
	 * 
	 * @param fechaActual
	 * @return
	 */
	public static LocalDate getFechaFormateada(String fechaActual) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate fechaActualFormateada = LocalDate.parse(fechaActual, formatter);
		return fechaActualFormateada;
	}

	/**
	 * 
	 * @param start_date
	 * @param end_date
	 */
	public static void getCalcularEdad(LocalDate start_date, LocalDate end_date) {
		Period diff = Period.between(start_date, end_date);
		System.out.println("Diferencia entre las 2 fechas es : ");
		System.out.printf("%d años , %d meses , %d dias", diff.getYears(), diff.getMonths(), diff.getDays());
	}

}

/**
 *
 * @author RVS
 *
 * @date 10 ago 2022 - 17:41:25
 *
 */
class Dia {

	/**
	 * Atributo de Instancia - int - Almacena el valor día
	 */
	public static int dia;

	/**
	 * 
	 */
	public static String diaStringModificado;

	/**
	 * Procedimiento de Instancia
	 * 
	 * Establece el valor de la variable día en el atributo de instancia de la clase
	 * 
	 * @param dia - int - Establece el día dentro de la variable de instancia de la
	 *            clase Dia
	 */
	public static void setDia(int dia) {
		Dia.dia = dia;
	}

	/**
	 * Metodo de Instancia
	 * 
	 * Devuelve el valor establecido dentro de la variable de instancia de la clase
	 * 
	 * @return
	 */
	public static int getDia() {
		return dia;
	}

	/**
	 * 
	 * @return
	 */
	public static String diaStringModificado() {
		return diaStringModificado;
	}

	/**
	 * 
	 * @return
	 */
	public static int getDiaDelMes() {
		System.out.println("El mes establecido: " + Mes.getMes());
		System.out.println("Introduce un dia del mes establecido");
		switch (Mes.getMes()) {
		case 1:
			System.out.println("Elige un numero entre el 1 y 31");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 31));
			}
			Dia.setDia(Dia.getDia());
			break;
		case 2:
			System.out.println("Elige un numero entre el 1 y 28");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 28)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 28");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 28));
			}
			Dia.setDia(Dia.getDia());
			break;
		case 3:
			System.out.println("Elige un numero entre el 1 y 31");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 31));
			}
			Dia.setDia(Dia.getDia());
			break;
		case 4:
			System.out.println("Elige un numero entre el 1 y 30");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 30)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 30");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 30));
			}
			Dia.setDia(Dia.getDia());
			break;
		case 5:
			System.out.println("Elige un numero entre el 1 y 31");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 31));
			}
			Dia.setDia(Dia.getDia());
			break;
		case 6:
			System.out.println("Elige un numero entre el 1 y 30");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 30)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 30");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 30));
			}
			Dia.setDia(Dia.getDia());
			break;
		case 7:
			System.out.println("Elige un numero entre el 1 y 31");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 31));
			}
			Dia.setDia(Dia.getDia());

			break;
		case 8:
			System.out.println("Elige un numero entre el 1 y 31");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 31));
			}
			Dia.setDia(Dia.getDia());
			break;
		case 9:
			System.out.println("Elige un numero entre el 1 y 30");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 30)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 30");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 30));
			}
			Dia.setDia(Dia.getDia());
			break;
		case 10:
			System.out.println("Elige un numero entre el 1 y 31");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 31));
			}
			Dia.setDia(Dia.getDia());

			break;
		case 11:
			System.out.println("Elige un numero entre el 1 y 30");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 30)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 30");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 30));
			}
			Dia.setDia(Dia.getDia());
			break;
		case 12:
			System.out.println("Elige un numero entre el 1 y 31");
			Dia.setDia(Captura.getNumero());
			if ((Dia.getDia() < 1) || (Dia.getDia() > 31)) {
				do {
					System.out.println("Por favor : Elige un numero entre el 1 y 31");
					Dia.setDia(Captura.getNumero());
				} while ((Dia.getDia() < 1) || (Dia.getDia() > 31));
			}
			Dia.setDia(Dia.getDia());
			break;
		default:
			break;
		}
		return Dia.getDia();
	}

	/**
	 * 
	 * @return
	 */
	public static String getDiaFormeteado() {
		Dia.getDiaDelMes();
		if (Dia.getDia() < 10) {
			diaStringModificado = "0".concat(String.valueOf(getDia()));
		} else {
			diaStringModificado = String.valueOf(Dia.getDia());
		}
		return diaStringModificado;
	}

}

/**
 *
 * @author RVS
 *
 * @date 10 ago 2022 - 17:41:13
 *
 */
class Mes {

	/**
	 * Atributo de Instancia - int almacena el valor de la semana
	 */
	public static int mes;

	/**
	 * Atributo de Instancia - int almacena el valor de la semana
	 */
	public static String mesStringModificado;

	/**
	 * 
	 * @param mes
	 */
	public static void setMes(int mes) {
		Mes.mes = mes;
	}

	/**
	 * 
	 * @return
	 */
	public static int getMes() {
		return mes;
	}

	/**
	 * 
	 * @return
	 */
	public static String getMesStringModificado() {
		return mesStringModificado;
	}

	/**
	 * 
	 * @param mesStringModificado
	 */
	public static void setMesStringModificado(String mesStringModificado) {
		Mes.mesStringModificado = mesStringModificado;
	}

	/**
	 * 
	 * @return
	 */
	public static int getMesEstablecido() {
		System.out.println("Introduce un mes entre 1 y 12");
		Mes.setMes(Captura.getNumero());
		if ((Mes.getMes() > 12) || (Mes.getMes() < 1)) {
			do {
				System.out.println("Por favor - Introduce un mes entre 1 y 12");
				Mes.setMes(Captura.getNumero());
			} while ((Mes.getMes() > 12) || (Mes.getMes() < 1));
		} else if ((Mes.getMes() == 2) && (Year.isLeap(Mes.getMes()))) {
			Dia.setDia(Dia.getDia() + 1);
		}
		return Mes.getMes();
	}

	/**
	 * 
	 * @return
	 */
	public static String getMesFormeteado() {
		getMesEstablecido();
		if (Mes.getMes() < 10) {
			setMesStringModificado("0".concat(String.valueOf(getMes())));
		} else {
			setMesStringModificado(String.valueOf(getMes()));
		}
		return getMesStringModificado();
	}
}

/**
 *
 * @author RVS
 *
 * @date 10 ago 2022 - 17:41:31
 *
 */
class Anio {

	/**
	 * Atributo de Instancia - int almacena el valor de la anio
	 */
	public static int anio;

	/**
	 * 
	 * @param anio
	 */
	public static void setAnio(int anio) {
		Anio.anio = anio;
	}

	/**
	 * 
	 * @return
	 */
	public static int getAnio() {
		return anio;
	}

	/**
	 * 
	 * @return
	 */
	public static int getAnioActual() {
		Calendar calendar = GregorianCalendar.getInstance();
		int anioActual = calendar.get(Calendar.YEAR);
//		return (anioActual - 3);
		return anioActual;
	}

	/**
	 * 
	 * @return
	 */
	public static int getAnioEstablecido() {
		System.out.println("Introduce un anio entre 1900 y el " + Anio.getAnioActual());
		Anio.setAnio(Captura.getNumero());
		if ((Anio.getAnio() > Anio.getAnioActual()) || (Anio.getAnio() < 1900)) {
			do {
				System.out.println("Por favor - Introduce un anio entre 1900 y el " + Anio.getAnioActual());
				Anio.setAnio(Captura.getNumero());
			} while ((Anio.getAnio() > Anio.getAnioActual()) || (Anio.getAnio() < 1900));
		} else {
			Anio.getAnioBisiesto(Anio.getAnio());
		}
		return Anio.getAnio();
	}

	/**
	 * 
	 * @param anio
	 */
	public static void getAnioBisiesto(int anio) {
		if (Year.isLeap(Anio.getAnio())) {
			System.out.println("• El " + Anio.getAnio() + " es un anio Bisiesto");
		} else {
			System.out.println("○ El " + Anio.getAnio() + " o es un anio Bisiesto");
		}
	}
}

/**
 * SubClase Captura
 * 
 * Contiene todos los metodos que captura por teclado los dias , meses , anios
 *
 * @author RVS
 *
 * @date 9 ago 2022 - 13:15:50
 *
 */
class Captura {

	/**
	 * Atributo de Instancia - sc almacena un objeto Scanner para capturar elementos
	 * desde teclado
	 */
	public static Scanner sc;

	/**
	 * Constructor sin parametro
	 */
	public Captura() {
		Captura.sc = new Scanner(System.in);
	}

	/**
	 * 
	 * @return
	 */
	public static int getNumero() {
		int numero;
		Captura.sc = new Scanner(System.in);
		numero = sc.nextInt();
		return numero;
	}
}
