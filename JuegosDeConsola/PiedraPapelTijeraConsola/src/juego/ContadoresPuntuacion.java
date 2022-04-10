package juego;

/**
 * Contadores de puntuacion
 * 
 * @author RVS
 *
 */
public class ContadoresPuntuacion {

	private static int jugadorVictorias;
	private static int jugadorPerdidas;

	private static int maquinaVictorias;
	private static int maquinaPerdidas;

	private static int empates;

	private static int partidas = 0;

	/**
	 * Constructor
	 */
	public ContadoresPuntuacion() {
	}

	/**
	 * Establece +1 Victoria
	 */
	public static void setJugadorUnaVictoria() {
		jugadorVictorias++;
	}

	/**
	 * 
	 * @return int
	 */
	public static int getJugadorUnaVictoria() {
		return jugadorVictorias;
	}

	/**
	 * Establece +1 Perdida
	 */
	public static void setJugadorUnaPerdida() {
		jugadorPerdidas++;
	}

	/**
	 * 
	 * @return int
	 */
	public static int getJugadorUnaPerdida() {
		return jugadorPerdidas;
	}

	/**
	 * Establece +1 Victoria
	 */
	public static void setMaquinaUnaVictoria() {
		maquinaVictorias++;
	}

	/**
	 * 
	 * @return int
	 */
	public static int getMaquinaUnaVictoria() {
		return maquinaVictorias;
	}

	/**
	 * Establece +1 Perdida
	 */
	public static void setMaquinaUnaPerdidas() {
		maquinaPerdidas++;
	}

	/**
	 * 
	 * @return int
	 */
	public static int getMaquinaUnaPerdida() {
		return maquinaPerdidas;
	}

	/**
	 * Establece +1 Partida
	 */
	public static void setUnaPartida() {
		partidas++;
	}

	/**
	 * 
	 * @return int
	 */
	public static int getUnaPartida() {
		return partidas;
	}

	/**
	 * Establece +1 Empate
	 */
	public static void setEmpates() {
		System.out.println("                       -----         ");
		System.out.println("                     - Empate -         ");
		System.out.println("                       -----         ");
		empates++;
	}

	/**
	 * 
	 * @return int
	 */
	public static int getEmpates() {
		return empates;
	}

}
