package rvs.libro.pag23.ejercicios2_1.entrada.datos.conversiones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * Título: Aprendiendo Java
 * </p>
 * <p>
 * Descripción: Ejemplos del Libro Aprendiendo Java de Compunauta
 * </p>
 * <p>
 * Copyright: Copyright (c) 2006 www.compunauta.com
 * </p>
 * <p>
 * Empresa: COMPUNAUTA
 * </p>
 * 
 * @version 2006.01.01 10.
 *
 * @version 1 - 30 jun 2023 - 20:38:19
 *
 * @author Gustavo Guillermo Pérez 9.
 * 
 * @author RVS
 *
 */
public class EntradaDeDatosConversiones {

	public static void main(String[] args) {
		Usuario.executionProgram();
	}

}

/**
 * 
 * 1 jul 2023 - 14:14:59
 *
 * @author RVS
 *
 */
class Usuario {

	/**
	 * Atributo de clase - int - Almacenar edad
	 */
	private static int edad;

	/**
	 * Atributo de clase - int - Almacenar edadTotal
	 */
	private static int edadTotal;

	/**
	 * Atributo de clase - String - Almacenar nombre
	 */
	private static String nombre;

	/**
	 * Atributo de clase - String - Almacenar grupo
	 */
	private static String grupo;

	/**
	 * Constructor por defecto
	 */
	public Usuario() {
		Usuario.edad = 0;
		Usuario.nombre = null;
		Usuario.grupo = null;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param edad   - Establece la edad al objeto
	 * @param nombre - Establece el nombre
	 */
	public Usuario(int edad, String nombre) {
		Usuario.edad = edad;
		Usuario.nombre = nombre;
	}

	/**
	 * Obtener la edad
	 * 
	 * @return
	 */
	public static int getEdad() {
		return edad;
	}

	/**
	 * Establecer la edad
	 * 
	 * @param edad
	 */
	public static void setEdad(int edad) {
		Usuario.edad = edad;
	}

	/**
	 * 
	 * @return
	 */
	public static int getEdadTotal() {
		return edadTotal;
	}

	/**
	 * 
	 * @param edadTotal
	 */
	public static void setEdadTotal(int edadTotal) {
		Usuario.edadTotal = edadTotal;
	}

	/**
	 * Establecer el nombre
	 * 
	 * @return
	 */
	public static String getNombre() {
		return nombre;
	}

	/**
	 * Obtener el nombre
	 * 
	 * @param nombre
	 */
	public static void setNombre(String nombre) {
		Usuario.nombre = nombre;
	}

	/**
	 * Obtener grupo
	 * 
	 * @return la letra de grupo al que pertenece
	 */
	public static String getGrupo() {
		return grupo;
	}

	/**
	 * Establecer grupo
	 * 
	 * @param la letra del grupo
	 */
	public static void setGrupo(String grupo) {
		Usuario.grupo = grupo;
	}

	/**
	 * Obtenemos por teclado los datos
	 * 
	 * @return El valor asignado por teclado
	 */
	public static String getKeyboardCapture() {
		String valor = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			valor = br.readLine();
		} catch (IOException e) {
			System.out.println("Mensaje: " + e.getMessage());
			e.printStackTrace();
		}
		return valor;
	}

	/**
	 * Establece el nombre del usuario
	 * 
	 */
	public static void getValuesNombre() {
		System.out.println("Introduce un nombre: ");
		setNombre(getKeyboardCapture());
		System.out.println("Nombre: " + getNombre());
	}

	/**
	 * Establece la edad del usuario
	 */
	public static void getValuesEdad() {
		String edadCadena = null;
		do {
			System.out.println("Introduce una edad : ");
			edadCadena = getKeyboardCapture();
		} while ((edadCadena.isEmpty()) || (!edadCadena.matches("\\d+")));
		setEdad(Integer.parseInt(edadCadena));
		System.out.println("Edad: " + getEdad());
	}

	/**
	 * Obtenemos la clasificación por edad
	 */
	public static void getClassification() {
		if (getEdad() <= 25) {
			System.out.println("Grupo A");
			setGrupo("A");
		} else if ((getEdad() >= 26) && (getEdad() <= 50)) {
			System.out.println("Grupo B");
			setGrupo("B");
		} else if (getEdad() >= 51) {
			System.out.println("Grupo C");
			setGrupo("C");
		}
	}

	/**
	 * Sumamos +10 a la edad del usuario
	 */
	public static void sumarEdad() {
		edadTotal = (getEdad() + 10);
	}

	/**
	 * Mostramos el mensaje final
	 */
	public static void mensajeFinal() {
		System.out.println("Usuario " + "\"" + getNombre() + "\"" + " de Categoría " + getGrupo()
				+ ", en una decada tendra " + getEdadTotal());
	}

	public static void executionProgram() {
		getValuesNombre();
		getValuesEdad();
		getClassification();
		sumarEdad();
		mensajeFinal();
		System.exit(0);
	}

}
