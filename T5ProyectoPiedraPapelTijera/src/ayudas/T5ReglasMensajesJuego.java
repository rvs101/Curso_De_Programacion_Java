package ayudas;

import programa.T5ContadoresPuntuacion;
import programa.T5JugadorMaquina;
import programa.T5JugadorPersona;
import programa.T5LogicaJuego;
import programa.T5CapturaTeclado;

/**
 * Clase Secundaria del programa
 * 
 * → Componentes principales del programa
 * 
 * @author RVS
 *
 */
public class T5ReglasMensajesJuego {

	/**
	 * 
	 */
	public static void getInstrucciones() {
		System.out.println("🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩");
		System.out.println("          ✊🖐✌ Bienvenido al Juego ✊🖐✌           ");
		System.out.println("         ‼‼ Piedra ‼‼ Papel ‼‼ Tijera ‼‼          ");
		System.out.println("🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩");
		System.out.println("              🕹 Cuando empiece el juego 🕹             ");
		System.out.println("🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩");
		System.out.println("⚔ El jugador 🧑👱‍♀️ elegirá entre 3 tipos de armas para jugar ⚔");
		System.out.println("✊ \"Piedra\" ✊ mediante la palabra (P)               ");
		System.out.println("🖐 \"Papel\" 🖐 mediante la palabra (L)                ");
		System.out.println("✌ \"Tijera\" ✌ mediante la palabra (T)                ");
		System.out.println("🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩");
		System.out.println("             ⚔ Después de elegir tu arma ⚔ ");
		System.out.println("🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩");
		System.out.println("⚔ La maquina 🤖 elegirá su propia arma para jugar ⚔ ");
		System.out.println("✊ \"Piedra\" ✊ mediante la palabra (P)               ");
		System.out.println("🖐 \"Papel\" 🖐 mediante la palabra (L)                ");
		System.out.println("✌ \"Tijera\" ✌ mediante la palabra (T)                ");
		System.out.println("🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩");
		System.out.println("⚔ Seleccionadas las armas ✊🖐✌ por ambos jugadores se mostrarán ");
		System.out.println("⚔ Las reglas 📕 del juego 🎲 decidirá quién es el ganador 👑 de ese Round de juego");
		System.out.println("⚔ El juego 🎲 decidirá quién es el ganador 👑 después de 10 partidas jugadas");
		System.out.println("🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩");
	}

	/**
	 * 
	 */
	public static void getReglas() {
		System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
		System.out.println("                  📖 Reglas de Juego 📖               ");
		System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
		System.out.println("⚔ La \"Piedra\" ✊ vence a la \"Tijera\" 🖐           ");
		System.out.println("⚔ El \"Papel\" 🖐 vence a la \"Piedra\" ✊            ");
		System.out.println("⚔ La \"Tijera\" 🖐 vence al \"Papel\" 🖐              ");
		System.out.println("⚔ Si ambas armas ⚔ son iguales se considera 😲 (EMPATE) 😲 ");
		System.out.println("⚔ Se repite el juego 🎲 y no se contará en el marcador 🎰 de los jugadores 🧑👱‍♀️ y 🤖");
		System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
	}

	/**
	 * 
	 */
	public static void setMensajeElegirArmas() {
		System.out.println("✌ 👊 🖐 Elige el arma ✌ 👊 🖐");
		System.out.println("👊 Escribe (P) - Piedra 👊  ");
		System.out.println("🖐 Escribe (L) - Papel 🖐  ");
		System.out.println("✌ Escribe (T) - Tijera ✌  ");
	}

	/**
	 * 
	 */
	public static void setElegirJugar() {
		System.out.println("🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧");
		System.out.println("                     Elige una opción                       ");
		System.out.println("             ♦ 0 - Para salir del juego -   ♦               ");
		System.out.println("             ♦ 1 - Para empezar a jugar -   ♦               ");
		System.out.println("🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧");
	}

	/**
	 * 
	 */
	public static void setRound() {
		System.out.println("                 ▶▶▶▶ Round " + T5ContadoresPuntuacion.getUnaPartida() + " ◀◀◀◀◀");
		System.out.println("🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧🟧");
	}

	/**
	 * 
	 * @return valor : true o false
	 */
	public static String setMensajeContinuarJugando() {
		System.out.println("¿ 🎰 Desea seguir jugando 🎰 ?");
		System.out.println(" ✔ Pulsa 'S' para continuar ✔ ");
		System.out.println(" ❌ Pulsa 'N' para finalizar ❌ ");
		System.out.println(" ⏳ Esperando Respuesta ⏳ ");
		return T5CapturaTeclado.getRespuesta();
	}

	/**
	 * 
	 */
	public static void setMostrarArmas() {
		System.out.println("🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟧🟧🟧🟧🟧🟧");
		System.out.println("🧑👱‍♀️ El Jugador \"" + T5JugadorPersona.getJugadorNombre() + "\" juega con el arma : "
				+ T5JugadorPersona.getJugadorArma() + " → " + getArmaJugador());

		System.out.println("🤖 El Maquina \"" + T5JugadorMaquina.getMaquinaNombre() + "\" juega con el arma : "
				+ T5JugadorMaquina.getMaquinaArma() + " → " + getArmaMaquina());
		System.out.println("🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟪🟧🟧🟧🟧🟧🟧");
	}

	/**
	 * 
	 * @return
	 */
	public static String getArmaMaquina() {
		String arma = "";
		if (T5JugadorMaquina.getMaquinaArma().equals("L")) {
			arma = "🖐";
		} else if (T5JugadorMaquina.getMaquinaArma().equals("P")) {
			arma = "👊";
		} else if (T5JugadorMaquina.getMaquinaArma().equals("T")) {
			arma = "✌";
		}
		return arma;
	}

	public static String getArmaJugador() {
		String arma = "";
		if (T5JugadorPersona.getJugadorArma().equals("L")) {
			arma = "🖐";
		} else if (T5JugadorPersona.getJugadorArma().equals("P")) {
			arma = "👊";
		} else if (T5JugadorPersona.getJugadorArma().equals("T")) {
			arma = "✌";
		}
		return arma;
	}

	/**
	 * 
	 */
	public static void setMarcadorGeneral() {
		System.out.println("🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨");
		System.out.println("🧑👱‍♀️ Partidas ganadas por el jugador " + T5JugadorPersona.getJugadorNombre() + " : "
				+ T5ContadoresPuntuacion.getJugadorUnaVictoria());
		System.out.println("🧑👱‍♀️‍ Partidas perdidas por el jugador " + T5JugadorPersona.getJugadorNombre() + " : "
				+ T5ContadoresPuntuacion.getJugadorUnaPerdida());
		System.out.println("🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨");
		System.out.println("🤖 Partidas ganadas por la maquina " + T5JugadorMaquina.getMaquinaNombre() + " : "
				+ T5ContadoresPuntuacion.getMaquinaUnaVictoria());
		System.out.println("🤖 Partidas perdidas por la maquina " + T5JugadorMaquina.getMaquinaNombre() + " : "
				+ T5ContadoresPuntuacion.getMaquinaUnaPerdida());
		System.out.println("◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼");
		System.out.println("                   🤝 Empates : " + T5ContadoresPuntuacion.getEmpates() + " 🤝 ");
		System.out.println("◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼");

	}

	/**
	 * 
	 */
	public static void setJugadorGanador(String msn) {
		System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
		System.out.println("✳ El Jugador \"" + T5JugadorPersona.getJugadorNombre() + "\" con el arma \""
				+ getArmaJugador() + "\" ha ganado a la \"" + T5JugadorMaquina.getMaquinaNombre() + "\" con el arma \""
				+ getArmaMaquina());
		System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
	}

	/**
	 * 
	 */
	public static void setMaquinaGanador(String msn) {
		System.out.println("〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰");
		System.out.println("✳ La \"" + T5JugadorMaquina.getMaquinaNombre() + "\" con el arma \"" + getArmaMaquina()
				+ " ha ganado al \"" + T5JugadorPersona.getJugadorNombre() + "\" con el arma \"" + getArmaJugador());
		System.out.println("〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰〰");
	}

	/**
	 * 
	 */
	public static void setGanador() {
		if (T5ContadoresPuntuacion.getJugadorUnaVictoria() > T5ContadoresPuntuacion.getMaquinaUnaVictoria()) {
			System.out.println("🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅");
			System.out.println("🎉 El jugador \"" + T5JugadorPersona.getJugadorNombre() + "\" ha ganado con \""
					+ T5ContadoresPuntuacion.getJugadorUnaVictoria() + "\" a la maquina \""
					+ T5JugadorMaquina.getMaquinaNombre() + "\" con \"" + T5ContadoresPuntuacion.getMaquinaUnaVictoria()
					+ "\" victorias 🎉 ");
			System.out.println("🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅");

		} else if (T5ContadoresPuntuacion.getJugadorUnaVictoria() < T5ContadoresPuntuacion.getMaquinaUnaVictoria()) {
			System.out.println("🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅");
			System.out.println("🎉 La \"" + T5JugadorMaquina.getMaquinaNombre() + "\" ha ganado con \""
					+ T5ContadoresPuntuacion.getMaquinaUnaVictoria() + "\" al jugador \""
					+ T5JugadorPersona.getJugadorNombre() + "\" con \"" + T5ContadoresPuntuacion.getJugadorUnaVictoria()
					+ "\" victorias 🎉");
			System.out.println("🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅🏅");
		}
	}

	/**
	 * 
	 */
	public static void setPerdedor() {
		if (T5ContadoresPuntuacion.getJugadorUnaPerdida() > T5ContadoresPuntuacion.getMaquinaUnaPerdida()) {
			System.out.println("🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆");

			System.out.println("🎃 El jugador \"" + T5JugadorPersona.getJugadorNombre() + "\" ha perdido con \""
					+ T5ContadoresPuntuacion.getJugadorUnaPerdida() + "\" contra la maquina \""
					+ T5JugadorMaquina.getMaquinaNombre() + "\" con \"" + T5ContadoresPuntuacion.getMaquinaUnaPerdida()
					+ "\" derrotas 🎃");

			System.out.println("🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆");
		} else if (T5ContadoresPuntuacion.getJugadorUnaPerdida() < T5ContadoresPuntuacion.getMaquinaUnaPerdida()) {
			System.out.println("🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆");

			System.out.println("🎃 La \"" + T5JugadorMaquina.getMaquinaNombre() + "\" ha perdido con \""
					+ T5ContadoresPuntuacion.getMaquinaUnaPerdida() + "\" contra el jugador \""
					+ T5JugadorPersona.getJugadorNombre() + "\" con \"" + T5ContadoresPuntuacion.getJugadorUnaPerdida()
					+ "\" derrotas 🎃 ");

			System.out.println("🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆🍆");
		}
	}

	/**
	 * 
	 */
	public static void setEmpate() {
		System.out.println("◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼");
		System.out.println(
				"🤝 El numero de \"Empates\" entre el jugador \"" + T5JugadorPersona.getJugadorNombre() + "\" 🤝");
		System.out.println("y la \"" + T5JugadorMaquina.getMaquinaNombre() + "\" durante el juego han sido ("
				+ T5ContadoresPuntuacion.getEmpates() + ") en total 🤝");
		System.out.println("◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼◼");
	}


	/**
	 * 
	 */
	public static void setGanadorFinal(String ganador) {
		System.out.println("🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨");
		System.out.println("          👑 Ganador es : " + ganador + " 👑   ");
		System.out.println("🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨");
	}

	/**
	 * 
	 * @param partidas
	 * @return
	 */
	public static int getFinDelJuego(int partidas) {
		System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
		System.out.println("\t       🎲 PARTIDAS JUGADAS : " + partidas + " 🎲 ");
		System.out.println("\t \t  🎲 FIN DEL JUEGO 🎲 ");
		System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
		return partidas;
	}

}
