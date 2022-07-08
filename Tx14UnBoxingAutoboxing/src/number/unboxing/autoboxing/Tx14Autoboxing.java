package number.unboxing.autoboxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Number - Clase Abstracta
 * 
 * @author RVS
 * 
 * @date 3 jul 2022 23:00:59
 *
 */
public class Tx14Autoboxing {

	/**
	 * Muestra una lista de objetos de tipo númericos usando la interface List y se
	 * implementa con la
	 * <p>
	 * clase ArrayList
	 * </p>
	 */
	public static void showListSinAutoboxing() {
		System.out.println("Unboxing");
		// List → Interface (Collections) - Colección ordenada
		List<Integer> lista = new ArrayList<Integer>();
//Recorre una 4 veces
		for (int i = 0; i < 5; i++) {
// Formato antiguo de conversion de valores
// Había que convertir el tipo primitivo al tipo objeto
			lista.add(Integer.valueOf(i));
			System.out.println(i + " - " + lista.add(Integer.valueOf(i)));
		}
	}

	/**
	 * Muestra una lista de objetos de tipo númericos usando la interface List y se
	 * implementa con la
	 * <p>
	 * clase ArrayList
	 * </p>
	 */
	public static void showListConAutoboxing() {
		System.out.println("Autoboxing");
		// List → Interface (Collections) - Colección ordenada
		List<Integer> lista = new ArrayList<Integer>();
//Recorre una 4 veces
		for (int i = 0; i < 5; i++) {
// Formato Autoboxing de conversion de valores - El compilador hace la conversión
// Directamente se convierte el tipo primitivo a objeto sin usar el casteo/casting 
			lista.add(i);
			System.out.println(i + " - " + lista.add(Integer.valueOf(i)));
		}
	}

	/**
	 * 
	 */
	public static void obtenerTipoPrimitivoDeInteger() {
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Conversion lista.add : " + lista.add(i) + " i " + i);
		}

		System.out.println(
				"-- AutoBoxing : No hace falta llamar a un metodo de la clase Wrapper para hacer la conversión de objeto a tipo primitivo --");
		int res = 0;
		for (Integer i : lista) {
			res += i;
			System.out.println("i " + i + " Acumulado: " + res);
		}

		System.out.println(
				"-- UnBoxing : Necesita de un metodo de la clase Wrapper para poder operar con el tipo primitivo --");
		int res1 = 0;
		for (Integer i : lista) {
// intValue() o doubleValue()			
			res1 += i.intValue();
			System.out.println("i " + i + " Acumulado: " + res1);
		}

	}

	public static void main(String[] args) {
		showListSinAutoboxing();
		showListConAutoboxing();
		obtenerTipoPrimitivoDeInteger();

	}
}
