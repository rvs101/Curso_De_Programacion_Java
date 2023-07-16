package rvs.libro.pag24.ejercicios2_3.puntuaciones.examenes;

/**
* <p>Título: Aprendiendo Java</p>
* <p>Descripción: Ejemplos del Libro Aprendiendo Java de Compunauta</p>
* <p>Copyright: Copyright (c) 2006 www.compunauta.com</p>
* <p>Empresa: COMPUNAUTA</p>
* @author Gustavo Guillermo Pérez
* @version 2006.01.01
*/

/**
 * Pedir por teclado el nombre al usuario
 * 
 * Solicitar 10 puntuaciones de supuestos exámenes,para promediarlos,la salida
 * por pantalla
 * 
 * jul 2023-22:58:18
 * 
 * @author RVS
 *
 */
public class MainNotas {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		usuario.getObtenerNombre();
		System.out.println(usuario.getNombre());

		CalcularNotas nc = new CalcularNotas();
		nc.setNotasTotales();
		System.out.println(usuario.getNombre() + " , tu promedio es de " + nc.calcularMedia());

	}

}
