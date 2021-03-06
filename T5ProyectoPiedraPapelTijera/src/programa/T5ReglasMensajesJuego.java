package programa;

/**
 * Clase Secundaria del programa
 * 
 * β Componentes principales del programa
 * 
 * @author RVS
 *
 */
public class T5ReglasMensajesJuego {

	/**
	 * 
	 */
	public static void getInstrucciones() {
		System.out.println("π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©");
		System.out.println("          βπβ Bienvenido al Juego βπβ                        ");
		System.out.println("         βΌβΌ Piedra βΌβΌ Papel βΌβΌ Tijera βΌβΌ                         ");
		System.out.println("π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©");
		System.out.println("              πΉ Cuando empiece el juego πΉ                      ");
		System.out.println("π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©");
		System.out.println("β El jugador π§π±ββοΈ elegirΓ‘ entre 3 tipos de armas para jugar β");
		System.out.println("β \"Piedra\" β mediante la palabra (P)                          ");
		System.out.println("π \"Papel\" π mediante la palabra (L)                          ");
		System.out.println("β \"Tijera\" β mediante la palabra (T)                          ");
		System.out.println("π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©");
		System.out.println("             β DespuΓ©s de elegir tu arma β                     ");
		System.out.println("π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©");
		System.out.println("β La maquina π€ elegirΓ‘ su propia arma para jugar β            ");
		System.out.println("β \"Piedra\" β mediante la palabra (P)                  		 ");
		System.out.println("π \"Papel\" π mediante la palabra (L)                   		 ");
		System.out.println("β \"Tijera\" β mediante la palabra (T)                   		 ");
		System.out.println("π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©");
		System.out.println("β Seleccionadas las armas βπβ por ambos jugadores se mostrarΓ‘n ");
		System.out.println("β Las reglas π del juego π² decidirΓ‘ quiΓ©n es el ganador π de ese Round de juego");
		System.out.println("β El juego π² decidirΓ‘ quiΓ©n es el ganador π despuΓ©s de 10 partidas jugadas");
		System.out.println("π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©π©");
	}

	/**
	 * 
	 */
	public static void getReglas() {
		System.out.println("βββββββββββββββββββββββββββββββ");
		System.out.println("                  π Reglas de Juego π               			 ");
		System.out.println("βββββββββββββββββββββββββββββββ");
		System.out.println("β La \"Piedra\" β vence a la \"Tijera\" π           			 ");
		System.out.println("β El \"Papel\" π vence a la \"Piedra\" β            			 ");
		System.out.println("β La \"Tijera\" π vence al \"Papel\" π              			 ");
		System.out.println("β Si ambas armas β son iguales se considera π² (EMPATE) π²     ");
		System.out.println("β Se repite el juego π² y no se contarΓ‘ en el marcador π° de los jugadores π§π±ββοΈ y π€");
		System.out.println("βββββββββββββββββββββββββββββββ");
	}

	/**
	 * 
	 */
	public static void setMensajeElegirArmas() {
		System.out.println("β π π Elige el arma β π π");
		System.out.println("π Escribe (P) - Piedra π  ");
		System.out.println("π Escribe (L) - Papel π  ");
		System.out.println("β Escribe (T) - Tijera β  ");
	}

	/**
	 * 
	 */
	public static void setElegirJugar() {
		System.out.println("π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§");
		System.out.println("                     Elige una opciΓ³n                       	 ");
		System.out.println("             β¦ 0 - Para salir del juego -   β¦               	 ");
		System.out.println("             β¦ 1 - Para empezar a jugar -   β¦               	 ");
		System.out.println("π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§");
	}

	/**
	 * 
	 */
	public static void setRound() {
		System.out.println("                 βΆβΆβΆβΆ Round " + T5ContadoresPuntuacion.getUnaPartida() + " ββββ");
		System.out.println("π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§π§");
	}

	/**
	 * 
	 * @return valor : true o false
	 */
	public static String setMensajeContinuarJugando() {
		System.out.println("ΒΏ π° Desea seguir jugando π° ?");
		System.out.println(" β Pulsa 'S' para continuar β ");
		System.out.println(" β Pulsa 'N' para finalizar β ");
		System.out.println(" β³ Esperando Respuesta β³ ");
		return T5CapturaTeclado.getRespuesta();
	}

	/**
	 * 
	 */
	public static void setMostrarArmas() {
		System.out.println("πͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπ§π§π§π§π§π§");
		System.out.println("π§π±ββοΈ El Jugador \"" + T5JugadorPersona.getJugadorNombre() + "\" juega con el arma : "
				+ T5JugadorPersona.getJugadorArma() + " β " + getArmaJugador());

		System.out.println("π€ El Maquina \"" + T5JugadorMaquina.getMaquinaNombre() + "\" juega con el arma : "
				+ T5JugadorMaquina.getMaquinaArma() + " β " + getArmaMaquina());
		System.out.println("πͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπͺπ§π§π§π§π§π§");
	}

	/**
	 * 
	 * @return
	 */
	public static String getArmaMaquina() {
		String arma = "";
		if (T5JugadorMaquina.getMaquinaArma().equals("L")) {
			arma = "π";
		} else if (T5JugadorMaquina.getMaquinaArma().equals("P")) {
			arma = "π";
		} else if (T5JugadorMaquina.getMaquinaArma().equals("T")) {
			arma = "β";
		}
		return arma;
	}

	public static String getArmaJugador() {
		String arma = "";
		if (T5JugadorPersona.getJugadorArma().equals("L")) {
			arma = "π";
		} else if (T5JugadorPersona.getJugadorArma().equals("P")) {
			arma = "π";
		} else if (T5JugadorPersona.getJugadorArma().equals("T")) {
			arma = "β";
		}
		return arma;
	}

	/**
	 * 
	 */
	public static void setMarcadorGeneral() {
		System.out.println("π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨");
		System.out.println("π§π±ββοΈ Partidas ganadas por el jugador " + T5JugadorPersona.getJugadorNombre() + " : "
				+ T5ContadoresPuntuacion.getJugadorUnaVictoria());
		System.out.println("π§π±ββοΈβ Partidas perdidas por el jugador " + T5JugadorPersona.getJugadorNombre() + " : "
				+ T5ContadoresPuntuacion.getJugadorUnaPerdida());
		System.out.println("π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨");
		System.out.println("π€ Partidas ganadas por la maquina " + T5JugadorMaquina.getMaquinaNombre() + " : "
				+ T5ContadoresPuntuacion.getMaquinaUnaVictoria());
		System.out.println("π€ Partidas perdidas por la maquina " + T5JugadorMaquina.getMaquinaNombre() + " : "
				+ T5ContadoresPuntuacion.getMaquinaUnaPerdida());
		System.out.println("βΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌ");
		System.out.println("                   π€ Empates : " + T5ContadoresPuntuacion.getEmpates() + " π€ ");
		System.out.println("βΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌ");

	}

	/**
	 * 
	 */
	public static void setJugadorGanador(String msn) {
		System.out.println("βββββββββββββββββββββββββββββββ");
		System.out.println("β³ El Jugador \"" + T5JugadorPersona.getJugadorNombre() + "\" con el arma \""
				+ getArmaJugador() + "\" ha ganado a la \"" + T5JugadorMaquina.getMaquinaNombre() + "\" con el arma \""
				+ getArmaMaquina());
		System.out.println("βββββββββββββββββββββββββββββββ");
	}

	/**
	 * 
	 */
	public static void setMaquinaGanador(String msn) {
		System.out.println("γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°");
		System.out.println("β³ La \"" + T5JugadorMaquina.getMaquinaNombre() + "\" con el arma \"" + getArmaMaquina()
				+ " ha ganado al \"" + T5JugadorPersona.getJugadorNombre() + "\" con el arma \"" + getArmaJugador());
		System.out.println("γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°γ°");
	}

	/**
	 * 
	 */
	public static void setGanador() {
		if (T5ContadoresPuntuacion.getJugadorUnaVictoria() > T5ContadoresPuntuacion.getMaquinaUnaVictoria()) {
			System.out.println("πππππππππππππππππππππππππππππππ");
			System.out.println("π El jugador \"" + T5JugadorPersona.getJugadorNombre() + "\" ha ganado con \""
					+ T5ContadoresPuntuacion.getJugadorUnaVictoria() + "\" a la maquina \""
					+ T5JugadorMaquina.getMaquinaNombre() + "\" con \"" + T5ContadoresPuntuacion.getMaquinaUnaVictoria()
					+ "\" victorias π ");
			System.out.println("πππππππππππππππππππππππππππππππ");

		} else if (T5ContadoresPuntuacion.getJugadorUnaVictoria() < T5ContadoresPuntuacion.getMaquinaUnaVictoria()) {
			System.out.println("πππππππππππππππππππππππππππππππ");
			System.out.println("π La \"" + T5JugadorMaquina.getMaquinaNombre() + "\" ha ganado con \""
					+ T5ContadoresPuntuacion.getMaquinaUnaVictoria() + "\" al jugador \""
					+ T5JugadorPersona.getJugadorNombre() + "\" con \"" + T5ContadoresPuntuacion.getJugadorUnaVictoria()
					+ "\" victorias π");
			System.out.println("πππππππππππππππππππππππππππππππ");
		}
	}

	/**
	 * 
	 */
	public static void setPerdedor() {
		if (T5ContadoresPuntuacion.getJugadorUnaPerdida() > T5ContadoresPuntuacion.getMaquinaUnaPerdida()) {
			System.out.println("πππππππππππππππππππππππππππππππ");

			System.out.println("π El jugador \"" + T5JugadorPersona.getJugadorNombre() + "\" ha perdido con \""
					+ T5ContadoresPuntuacion.getJugadorUnaPerdida() + "\" contra la maquina \""
					+ T5JugadorMaquina.getMaquinaNombre() + "\" con \"" + T5ContadoresPuntuacion.getMaquinaUnaPerdida()
					+ "\" derrotas π");

			System.out.println("πππππππππππππππππππππππππππππππ");
		} else if (T5ContadoresPuntuacion.getJugadorUnaPerdida() < T5ContadoresPuntuacion.getMaquinaUnaPerdida()) {
			System.out.println("πππππππππππππππππππππππππππππππ");

			System.out.println("π La \"" + T5JugadorMaquina.getMaquinaNombre() + "\" ha perdido con \""
					+ T5ContadoresPuntuacion.getMaquinaUnaPerdida() + "\" contra el jugador \""
					+ T5JugadorPersona.getJugadorNombre() + "\" con \"" + T5ContadoresPuntuacion.getJugadorUnaPerdida()
					+ "\" derrotas π ");
			System.out.println("πππππππππππππππππππππππππππππππ");
		}
	}

	/**
	 * 
	 */
	public static void setEmpate() {
		System.out.println("βΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌ");
		System.out.println(
				"π€ El numero de \"Empates\" entre el jugador \"" + T5JugadorPersona.getJugadorNombre() + "\" π€");
		System.out.println("y la \"" + T5JugadorMaquina.getMaquinaNombre() + "\" durante el juego han sido ("
				+ T5ContadoresPuntuacion.getEmpates() + ") en total π€");
		System.out.println("βΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌβΌ");
	}

	/**
	 * 
	 */
	public static void setGanadorFinal(String ganador) {
		System.out.println("π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨");
		System.out.println("          π Ganador es : " + ganador + " π                     ");
		System.out.println("π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨π¨");
	}

	/**
	 * 
	 * @param partidas
	 * @return
	 */
	public static int getFinDelJuego(int partidas) {
		System.out.println("β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­");
		System.out.println("\t       π² PARTIDAS JUGADAS : " + partidas + " π²           ");
		System.out.println("\t \t  π² FIN DEL JUEGO π²                                   ");
		System.out.println("β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­β­");
		return partidas;
	}

}
