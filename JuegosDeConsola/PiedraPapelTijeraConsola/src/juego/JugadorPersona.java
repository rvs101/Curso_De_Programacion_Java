package juego;

import java.util.Scanner;

/**
 * Jugador Persona
 * 
 * @author RVS
 *
 */
public class JugadorPersona {

	private static String jugadorArma = "";
	private static String jugadorNombre = "";

	private static int jugadorGanadas = 0;
	private static int jugadorPerdidas = 0;
	private static int jugadorEmpatadas = 0;

	public JugadorPersona() {
	}

	/**
	 * Metodo que nos devuelve el arma que ha elegido el jugador
	 * 
	 * @return String
	 */
	public static String getJugadorArma() {
		return jugadorArma;
	}

	/**
	 * 
	 * @param Jugador arma
	 */
	public static void setJugadorArma(String jArma) {
		jugadorArma = jArma;
	}

	/**
	 * 
	 * @return
	 */
	public static String getJugadorNombre() {
		return jugadorNombre;
	}

	/**
	 * 
	 * @param nombreJugador
	 */
	public static void setJugadorNombre(String nombreJugador) {
		jugadorNombre = nombreJugador;
	}

	/**
	 * 
	 * @return
	 */
	public static int getJugadorGanadas() {
		return jugadorGanadas;
	}

	/**
	 * 
	 * @param jGanadas
	 */
	public static void setJugadorGanadas(int jGanadas) {
		jugadorGanadas = jGanadas;
	}

	/**
	 * 
	 * @return
	 */
	public static int getJugadorPerdidas() {
		return jugadorPerdidas;
	}

	/**
	 * 
	 * @param jPerdidas
	 */
	public static void setJugadorPerdidas(int jPerdidas) {
		jugadorPerdidas = jPerdidas;
	}

	/**
	 * 
	 * @return devuelve cuantos empates se han hecho
	 */
	public static int getJugadorEmpate() {
		return jugadorEmpatadas;
	}

	/**
	 * Establece un Empate
	 */
	public static void setJugadorEmpate(int jEmpate) {
		jugadorEmpatadas = jEmpate;
	}

	/**
	 * Establece nombre al jugador
	 */
	public static void setJugadorElegirNombre() {
		System.out.println("-------------------------------------------------------");
		System.out.println("                Elige el nombre del jugador            ");
		System.out.println("-------------------------------------------------------");
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
		} catch (Exception e) {
			System.out.println("Atención Excepción en el Scanner : " + e.getMessage() + "  ");
		}
		jugadorNombre = sc.nextLine();
	}

	/**
	 * Establece arma al jugador
	 */
	public static void setJugadorElegirArma() {
		ReglasMensajesJuego.setMensajeElegirArmas();
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
		} catch (Exception e) {
			System.out.println("Atención Excepción en el Scanner : " + e.getMessage() + "  ");
		}
		do {
			jugadorArma = sc.nextLine();
			if (!jugadorArma.equals("P") && !jugadorArma.equals("L") && !jugadorArma.equals("T")) {
				System.out.println("Por favor elige una opción entre las mostradas");
				System.out.println("Piedra → P ");
				System.out.println("Tijera → T ");
				System.out.println("Papel → L ");
			}
		} while (!jugadorArma.equals("P") && !jugadorArma.equals("L") && !jugadorArma.equals("T"));
		System.out.println("-----------------------------------------------------");
		System.out.println("Arma elegida por el (" + getJugadorNombre() + ") : " + jugadorArma + " → "
				+ ReglasMensajesJuego.getArmaJugador());
	}
}
