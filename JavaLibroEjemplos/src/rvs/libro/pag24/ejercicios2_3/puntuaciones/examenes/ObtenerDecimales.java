package rvs.libro.pag24.ejercicios2_3.puntuaciones.examenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase Concreta : Nota
 * 
 * Gestiona los numeros
 * 
 * 7 jul 2023 - 17:51:34
 *
 * @author RVS
 *
 */
public class ObtenerDecimales {

	/**
	 * Atributo de Instancia <br>
	 * <br>
	 * Una sola copia del atributo para todos los elementos de la clase <br>
	 * <br>
	 * Almacena el número de veces que se ejecuta el metodo
	 * 
	 */
	public static int i = 0;

	/**
	 * Atributo de instancia
	 * 
	 * Almacena el valor de la nota
	 */
	private double decimal = 0;

	/**
	 * Atributo de instancia <br>
	 * <br>
	 * Almacena la cadena con el valor a transforma en decimal
	 */
	private String cadena;

	/**
	 * Obtengo la cadena
	 * 
	 * @return - String valor cualquiera
	 */
	public String getCadena() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			if (i == 0) {
				System.out.println("• - Introduce un numero entre 0 y 10 ");
				i++;
			}
			cadena = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cadena;
	}

	/**
	 * Compruebo que no esta vacia la cadena
	 * 
	 * @return - String con un valor
	 */
	public String cadenaNoVacia(String cadena) {
		if (cadena == "") {
			do {
				System.out.println("☼ - No introduzcas cadenas vacias");
				cadena = getCadena();
			} while (cadena == "");
		}
		return cadena;
	}

	/**
	 * Compruebo si la cadena es Decimal o String
	 * 
	 * @param str - String de un valor cualquiera
	 * 
	 * @return true - si es decimal - false - si es String
	 */
	public double convertirDecimal(String cadena) {
		decimal = 0;
		try {
			decimal = Double.parseDouble(cadena);
		} catch (NumberFormatException nfe) {
			System.out.println("• - Error Mensaje : " + nfe.getMessage());
			do {
				cadena = getCadena();
				System.out.println("• - Introduce un valor decimal");
				try {
					decimal = Double.parseDouble(cadena);
					break;
				} catch (NumberFormatException e) {
					System.out.println("• - Error : " + e.getMessage());
				}

			} while (true);
		}
		return decimal;
	}

	/**
	 * Comprueba que esta entre 1 y 10
	 * 
	 * @param - Valor decimal sin rango decimal
	 * 
	 * @return - Decimal entre 0 y 10
	 */
	public double isOneToTen(double decimal) {
		if ((decimal < 0) || (decimal > 10)) {
			do {
				System.out.println("♠ Valor entre 0 y 10");
				decimal = convertirDecimal(getCadena());
			} while ((decimal < 0) || (decimal > 10));
		}
		return decimal;
	}

	/**
	 * Metodo de instancia <br>
	 * <br>
	 * Filtra las cadenas de caracteres para devolver un decimal entre 0 y 10
	 * 
	 * @return - Valor decimal entre 0 y 10
	 */
	public double getValor() {
		cadenaNoVacia(getCadena());
		isOneToTen(convertirDecimal(cadena));
		return decimal;
	}

}
