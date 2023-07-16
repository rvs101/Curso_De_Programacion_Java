package rvs.libro.pag24.ejercicios2_3.puntuaciones.examenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase Concreta : Usuario
 * 
 * Gestiona el usuario
 * 
 * 7 jul 2023 - 17:52:44
 *
 * @author RVS
 *
 */
public class Usuario {

	/**
	 * Atributo de instancia
	 */
	private String nombre = null;

	/**
	 * Constructor por defecto
	 */
	public Usuario() {
		this.nombre = null;
	}

	/**
	 * Establecer nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener nombre
	 * 
	 * @return
	 */
	public String getNombre() {
		return "Nombre?" + nombre;
	}

	/**
	 * Captura por teclado
	 * 
	 * @return cadena de texto tipo String
	 */
	public String capturaTeclado() {
		String cadena = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			cadena = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cadena;
	}

	/**
	 * Captura nombre desde teclado
	 * 
	 * @return objeto de nombre de usuario
	 */
	public void getObtenerNombre() {
		System.out.println("Introduce un nombre:");
		setNombre(capturaTeclado());
	}

}
