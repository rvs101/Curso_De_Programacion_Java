package juego;

/**
 * Clase Secundaria del programa
 * 
 * → Componentes principales del programa
 * 
 * @author RVS
 *
 */
public class ReglasMensajesJuego {

	/**
	 * 
	 */
	public static void getInstrucciones() {
		System.out.println("--------------------------------------------------");
		System.out.println("               Bienvenido al Juego                ");
		System.out.println("         ‼‼ Piedra ‼‼ Papel ‼‼ Tijera ‼‼          ");
		System.out.println("--------------------------------------------------");
		System.out.println("                Cuando empiece el juego           ");
		System.out.println("--------------------------------------------------");
		System.out.println(" El jugador elegirá entre 3 tipos de armas para jugar");
		System.out.println("\"Piedra\" mediante la palabra (P)                ");
		System.out.println("\"Papel\" mediante la palabra (L)                 ");
		System.out.println("\"Tijera\" mediante la palabra (T)                ");
		System.out.println("--------------------------------------------------");
		System.out.println("             Después de elegir tu arma  ");
		System.out.println("--------------------------------------------------");
		System.out.println(" La maquina elegirá su propia arma para jugar     ");
		System.out.println("\"Piedra\" mediante la palabra (P)                ");
		System.out.println("\"Papel\" mediante la palabra (L)                 ");
		System.out.println("\"Tijera\" mediante la palabra (T)                ");
		System.out.println("--------------------------------------------------");
		System.out.println(" Seleccionadas las armas por ambos jugadores se mostrarán ");
		System.out.println(" Las reglas del juego decidirá quién es el ganador de ese Round de juego");
		System.out.println(" El juego decidirá quién es el ganador después de 10 partidas jugadas");
		System.out.println("--------------------------------------------------");
	}

	/**
	 * 
	 */
	public static void getReglas() {
		System.out.println("--------------------------------------------------");
		System.out.println("                   Reglas de Juego                ");
		System.out.println("--------------------------------------------------");
		System.out.println("La \"Piedra\" vence a la \"Tijera\"               ");
		System.out.println("El \"Papel\" vence a la \"Piedra\"                ");
		System.out.println("La \"Tijera\" vence al \"Papel\"                  ");
		System.out.println("Si ambas armas son iguales se considera  (EMPATE) ");
		System.out.println("Se repite el juego y no se contará en el marcador de los jugadores");
		System.out.println("--------------------------------------------------");
	}

	/**
	 * 
	 */
	public static void setMensajeElegirArmas() {
		System.out.println(" 		Elige el arma ");
		System.out.println("Escribe (P) - Piedra  ");
		System.out.println("Escribe (L) - Papel   ");
		System.out.println("Escribe (T) - Tijera  ");
	}

	/**
	 * 
	 */
	public static void setElegirJugar() {
		System.out.println("--------------------------------------------------");
		System.out.println("                     Elige una opción             ");
		System.out.println("              0 - Para salir del juego -          ");
		System.out.println("              1 - Para empezar a jugar -          ");
		System.out.println("--------------------------------------------------");
	}

	/**
	 * 
	 */
	public static void setRound() {
		System.out.println("                Round " + ContadoresPuntuacion.getUnaPartida());
		System.out.println("--------------------------------------------------");
	}

	/**
	 * 
	 * @return valor : true o false
	 */
	public static String setMensajeContinuarJugando() {
		System.out.println("¿  Desea seguir jugando  ?");
		System.out.println(" - Pulsa 'S' para continuar ");
		System.out.println(" - Pulsa 'N' para finalizar ");
		System.out.println("  Esperando Respuesta ");
		return CapturaTeclado.getRespuesta();
	}

	/**
	 * 
	 */
	public static void setMostrarArmas() {
		System.out.println("--------------------------------------------------");
		System.out.println("El Jugador \"" + JugadorPersona.getJugadorNombre() + "\" juega con el arma : "
				+ JugadorPersona.getJugadorArma() + " → " + getArmaJugador());

		System.out.println("El Maquina \"" + JugadorMaquina.getMaquinaNombre() + "\" juega con el arma : "
				+ JugadorMaquina.getMaquinaArma() + " → " + getArmaMaquina());
		System.out.println("--------------------------------------------------");
	}

	/**
	 * 
	 * @return
	 */
	public static String getArmaMaquina() {
		String arma = "";
		if (JugadorMaquina.getMaquinaArma().equals("L")) {
			arma = "(Papel)";
		} else if (JugadorMaquina.getMaquinaArma().equals("P")) {
			arma = "(Piedra)";
		} else if (JugadorMaquina.getMaquinaArma().equals("T")) {
			arma = "(Tijera)";
		}
		return arma;
	}

	public static String getArmaJugador() {
		String arma = "";
		if (JugadorPersona.getJugadorArma().equals("L")) {
			arma = "(Papel)";
		} else if (JugadorPersona.getJugadorArma().equals("P")) {
			arma = "(Piedra)";
		} else if (JugadorPersona.getJugadorArma().equals("T")) {
			arma = "(Tijera)";
		}
		return arma;
	}

	/**
	 * 
	 */
	public static void setMarcadorGeneral() {
		System.out.println("--------------------------------------------------");
		System.out.println("Partidas ganadas por el jugador " + JugadorPersona.getJugadorNombre() + " : "
				+ ContadoresPuntuacion.getJugadorUnaVictoria());
		System.out.println("Partidas perdidas por el jugador " + JugadorPersona.getJugadorNombre() + " : "
				+ ContadoresPuntuacion.getJugadorUnaPerdida());
		System.out.println("--------------------------------------------------");
		System.out.println("Partidas ganadas por la maquina " + JugadorMaquina.getMaquinaNombre() + " : "
				+ ContadoresPuntuacion.getMaquinaUnaVictoria());
		System.out.println("Partidas perdidas por la maquina " + JugadorMaquina.getMaquinaNombre() + " : "
				+ ContadoresPuntuacion.getMaquinaUnaPerdida());
		System.out.println("--------------------------------------------------");
		System.out.println("                   Empates : " + ContadoresPuntuacion.getEmpates() + "");
		System.out.println("--------------------------------------------------");

	}

	/**
	 * 
	 */
	public static void setJugadorGanador(String msn) {
		System.out.println("--------------------------------------------------");
		System.out.println("El Jugador \"" + JugadorPersona.getJugadorNombre() + "\" con el arma \"" + getArmaJugador()
				+ "\" ha ganado a la \"" + JugadorMaquina.getMaquinaNombre() + "\" con el arma \"" + getArmaMaquina());
		System.out.println("--------------------------------------------------");
	}

	/**
	 * 
	 */
	public static void setMaquinaGanador(String msn) {
		System.out.println("--------------------------------------------------");
		System.out.println("La \"" + JugadorMaquina.getMaquinaNombre() + "\" con el arma \"" + getArmaMaquina()
				+ "\" ha ganado al \"" + JugadorPersona.getJugadorNombre() + "\" con el arma \"" + getArmaJugador());
		System.out.println("--------------------------------------------------");
	}

	/**
	 * 
	 */
	public static void setGanador() {
		if (ContadoresPuntuacion.getJugadorUnaVictoria() > ContadoresPuntuacion.getMaquinaUnaVictoria()) {
			System.out.println("--------------------------------------------------");
			System.out.println("El jugador \"" + JugadorPersona.getJugadorNombre() + "\" ha ganado con \""
					+ ContadoresPuntuacion.getJugadorUnaVictoria() + "\" a la maquina \""
					+ JugadorMaquina.getMaquinaNombre() + "\" con \"" + ContadoresPuntuacion.getMaquinaUnaVictoria()
					+ "\" victorias");
			System.out.println("--------------------------------------------------");

		} else if (ContadoresPuntuacion.getJugadorUnaVictoria() < ContadoresPuntuacion.getMaquinaUnaVictoria()) {
			System.out.println("--------------------------------------------------");
			System.out.println("La \"" + JugadorMaquina.getMaquinaNombre() + "\" ha ganado con \""
					+ ContadoresPuntuacion.getMaquinaUnaVictoria() + "\" al jugador \""
					+ JugadorPersona.getJugadorNombre() + "\" con \"" + ContadoresPuntuacion.getJugadorUnaVictoria()
					+ "\" victorias ");
			System.out.println("--------------------------------------------------");
		}
	}

	/**
	 * 
	 */
	public static void setPerdedor() {
		if (ContadoresPuntuacion.getJugadorUnaPerdida() > ContadoresPuntuacion.getMaquinaUnaPerdida()) {
			System.out.println("--------------------------------------------------");

			System.out.println("El jugador \"" + JugadorPersona.getJugadorNombre() + "\" ha perdido con \""
					+ ContadoresPuntuacion.getJugadorUnaPerdida() + "\" contra la maquina \""
					+ JugadorMaquina.getMaquinaNombre() + "\" con \"" + ContadoresPuntuacion.getMaquinaUnaPerdida()
					+ "\" derrotas");

			System.out.println("--------------------------------------------------");
		} else if (ContadoresPuntuacion.getJugadorUnaPerdida() < ContadoresPuntuacion.getMaquinaUnaPerdida()) {
			System.out.println("--------------------------------------------------");

			System.out.println("La \"" + JugadorMaquina.getMaquinaNombre() + "\" ha perdido con \""
					+ ContadoresPuntuacion.getMaquinaUnaPerdida() + "\" contra el jugador \""
					+ JugadorPersona.getJugadorNombre() + "\" con \"" + ContadoresPuntuacion.getJugadorUnaPerdida()
					+ "\" derrotas");
			System.out.println("--------------------------------------------------");
		}
	}

	/**
	 * 
	 */
	public static void setEmpate() {
		System.out.println("--------------------------------------------------");
		System.out.println("El numero de \"Empates\" entre el jugador \"" + JugadorPersona.getJugadorNombre() + "\"");
		System.out.println("y la \"" + JugadorMaquina.getMaquinaNombre() + "\" durante el juego han sido ("
				+ ContadoresPuntuacion.getEmpates() + ") en total");
		System.out.println("--------------------------------------------------");
	}

	/**
	 * 
	 */
	public static void setGanadorFinal(String ganador) {
		System.out.println("--------------------------------------------------");
		System.out.println("            Ganador es : " + ganador + "          ");
		System.out.println("--------------------------------------------------");
	}

	/**
	 * 
	 * @param partidas
	 * @return
	 */
	public static int getFinDelJuego(int partidas) {
		System.out.println("--------------------------------------------------");
		System.out.println("\t         PARTIDAS JUGADAS : " + partidas + "    ");
		System.out.println("\t \t    FIN DEL JUEGO   						  ");
		System.out.println("--------------------------------------------------");
		return partidas;
	}
}
