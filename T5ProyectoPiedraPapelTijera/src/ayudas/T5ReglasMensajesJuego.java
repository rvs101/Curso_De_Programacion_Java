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
		System.out.println("  Bienvenido al Piedra , Papel o Tijera ○ ");
		System.out.println("------------------------------------------------------");
		System.out.println("• Instrucciones de Juego •");
		System.out.println("♦ 0 - Para salir del juego");
		System.out.println("♦ 1 - Para empezar a jugar");
		System.out.println("♦ Cuando empiece el juego");
		System.out.println("♦ El jugador puede elegir entre 3 tipos de armas");
		System.out.println("→ \"Piedra\" mediante la palabra (P)");
		System.out.println("→ \"Papel\" mediante la palabra (L)");
		System.out.println("→ \"Tijera\" mediante la palabra (T)");
		System.out.println("------------------------------------------------------");
		System.out.println("♦ Después de elegir un arma , la maquina elegirá su propia arma para empezar el juego");
		System.out.println("♦ Tu mostrarás tu arma la cual pueden ser :");
		System.out.println("♦ \"Piedra → (P) \" + \"Papel → (L) \" + \"Tijera → (T) \"");
		System.out.println("♦ Y la maquina mostrará su propia arma que pueden ser también :");
		System.out.println("♦ \"Piedra\" → (P) \" + \"Papel\" → (L) \" + \"Piedra\" → (T) \"");
		System.out.println("♦ Una vez mostradas las armas después de la selección de las armas");
		System.out.println("♦ Las reglas del juego decidirá quién es el ganador de ese round");
		System.out.println("♦ El juego decidirá quién es el ganador después de 3 partidas jugadas");
	}

	/**
	 * 
	 */
	public static void getReglas() {
		System.out.println("○ Reglas de Juego ○ ");
		System.out.println("------------------------------------------------------");
		System.out.println("→ La \"Piedra\" vence a la \"Tijera\" ");
		System.out.println("→ El \"Papel\" vence a la \"Piedra\"");
		System.out.println("→ La \"Tijera\" vence al \"Papel\"");
		System.out.println("→ Si ambas armas son iguales se considera \"EMPATE\" ");
		System.out.println("→ Se repite el juego y no cuenta en el marcador del programa");
	}

	/**
	 * 
	 */
	public static void setMensajeElegirArmas() {
		System.out.println("• Elige el arma ✌ 👊 🖐");
		System.out.println("1º - Piedra 👊 - Escribe (P) ");
		System.out.println("2º - Papel 🖐 - Escribe (L)");
		System.out.println("3º - Tijera ✌ - Escribe (T)");
	}

	/**
	 * 
	 * @return valor : true o false
	 */
	public static String setMensajeContinuarJugando() {
		System.out.println("¿ 🎰 Desea seguir jugando 🎰 ?");
		System.out.println(" • Pulsa 'S' para continuar ");
		System.out.println(" • Pulsa 'N' para finalizar ");
		System.out.println(" ⏳ Esperando Respuesta ");
		return T5CapturaTeclado.getRespuesta();
	}

	/**
	 * 
	 */
	public static void setMostrarArmas() {
		System.out.println("_______________________________");
		System.out.println("• El Jugador " + T5JugadorPersona.getJugadorNombre() + " juega con : "
				+ T5JugadorPersona.getJugadorArma());
		System.out.println("○ El Maquina " + T5JugadorMaquina.getMaquinaNombre() + " juega con : "
				+ T5JugadorMaquina.getMaquinaArma());
	}

	/**
	 * 
	 */
	public static void setMarcadorGeneral() {
		System.out.println("-------------------------------");
		System.out.println("\t ▶ Resultado final ◀");
		System.out.println("-------------------------------");
		System.out.println("• Partidas ganadas por el jugador " + T5JugadorPersona.getJugadorNombre() + " : "
				+ T5ContadoresPuntuacion.getJugadorUnaVictoria());
		System.out.println("• Partidas perdidas por el jugador " + T5JugadorPersona.getJugadorNombre() + " : "
				+ T5ContadoresPuntuacion.getJugadorUnaPerdida());
		System.out.println("-------------------------------");
		System.out.println("○ Partidas ganadas por la maquina " + T5JugadorMaquina.getMaquinaNombre() + " : "
				+ T5ContadoresPuntuacion.getMaquinaUnaVictoria());
		System.out.println("○ Partidas perdidas por la maquina " + T5JugadorMaquina.getMaquinaNombre() + " : "
				+ T5ContadoresPuntuacion.getMaquinaUnaPerdida());
		System.out.println("-------------------------------");
		System.out.println("◘ Empates : " + T5ContadoresPuntuacion.getEmpates());
		System.out.println("-------------------------------");
	}

	/**
	 * 
	 */
	public static void setJugadorGanador(String msn) {
		System.out.println("________________________________");
		System.out.println("✳ El Jugador " + T5JugadorPersona.getJugadorNombre() + " con el arma "
				+ T5JugadorPersona.getJugadorArma() + " ha ganado a la " + T5JugadorMaquina.getMaquinaNombre()
				+ " con el arma " + T5JugadorMaquina.getMaquinaArma());
	}

	/**
	 * 
	 */
	public static void setMaquinaGanador(String msn) {
		System.out.println("________________________________");
		System.out.println("✳ La " + T5JugadorMaquina.getMaquinaNombre() + " con el arma "
				+ T5JugadorMaquina.getMaquinaArma() + " ha ganado al " + T5JugadorPersona.getJugadorNombre()
				+ " con el arma " + T5JugadorPersona.getJugadorArma());
	}

	/**
	 * 
	 */
	public static void setGanador() {
		System.out.println("________________________________");
		if (T5ContadoresPuntuacion.getJugadorUnaVictoria() > T5ContadoresPuntuacion.getMaquinaUnaVictoria()) {
			System.out.println("• El jugador " + T5JugadorPersona.getJugadorNombre() + " ha ganado con "
					+ T5ContadoresPuntuacion.getJugadorUnaVictoria() + " a la maquina "
					+ T5JugadorMaquina.getMaquinaNombre() + " con " + T5ContadoresPuntuacion.getMaquinaUnaVictoria());
		} else if (T5ContadoresPuntuacion.getJugadorUnaVictoria() < T5ContadoresPuntuacion.getMaquinaUnaVictoria()) {
			System.out.println("○ La " + T5JugadorMaquina.getMaquinaNombre() + " ha ganado con "
					+ T5ContadoresPuntuacion.getMaquinaUnaVictoria() + " al jugador "
					+ T5JugadorPersona.getJugadorNombre() + " con " + T5ContadoresPuntuacion.getJugadorUnaVictoria());
		}
	}

	/**
	 * 
	 */
	public static void setPerdedor() {
		if (T5ContadoresPuntuacion.getJugadorUnaPerdida() > T5ContadoresPuntuacion.getMaquinaUnaPerdida()) {
			System.out.println("• El jugador " + T5JugadorPersona.getJugadorNombre() + " ha perdido con "
					+ T5ContadoresPuntuacion.getJugadorUnaPerdida() + " a la maquina "
					+ T5JugadorMaquina.getMaquinaNombre() + " con " + T5ContadoresPuntuacion.getMaquinaUnaPerdida());
		} else if (T5ContadoresPuntuacion.getJugadorUnaPerdida() < T5ContadoresPuntuacion.getMaquinaUnaPerdida()) {
			System.out.println("○ La " + T5JugadorMaquina.getMaquinaNombre() + " ha perdido con "
					+ T5ContadoresPuntuacion.getMaquinaUnaPerdida() + " con respeto al jugador "
					+ T5JugadorPersona.getJugadorNombre() + " con " + T5ContadoresPuntuacion.getJugadorUnaVictoria());
		}
	}

	/**
	 * 
	 * @return
	 */
	public static String getGanadorFinal() {
		return T5ContadoresPuntuacion.getJugadorUnaVictoria() > T5ContadoresPuntuacion.getJugadorUnaVictoria()
				? T5JugadorPersona.getJugadorNombre()
				: T5JugadorMaquina.getMaquinaNombre();
	}

	/**
	 * 
	 * @return
	 */
	public static String getPerdedorFinal() {
		return T5ContadoresPuntuacion.getJugadorUnaPerdida() > T5ContadoresPuntuacion.getMaquinaUnaPerdida()
				? T5JugadorPersona.getJugadorNombre()
				: T5JugadorMaquina.getMaquinaNombre();
	}

	/**
	 * 
	 */
	public static void setEmpate() {
		System.out.println("♦ El numero de Empates entre el jugador " + T5JugadorPersona.getJugadorNombre() + " y la "
				+ T5JugadorMaquina.getMaquinaNombre() + "  durante el juego han sido "
				+ T5ContadoresPuntuacion.getEmpates() + " en total");
	}

	/**
	 * 
	 * @param partidas
	 * @return
	 */
	public static int getFinDelJuego(int partidas) {
		System.out.println("____________________________________________________________________");
		System.out.println("\t      🎲 PARTIDAS JUGADAS : " + partidas + " 🎲 ");
		System.out.println("\t \t  🎲 FIN DEL JUEGO 🎲 ");
		System.out.println("____________________________________________________________________");
		return partidas;
	}

	/**
	 * 
	 */
	public static void setElegirJugar() {
		System.out.println("🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨");
		System.out.println("    ♦♦♦♦ Elige una opción ♦♦♦♦");
		System.out.println("♦ 0 - Para salir del juego - 0 ♦ ");
		System.out.println("♦ 1 - Para empezar a jugar - 1 ♦ ");
		System.out.println("🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨");

	}

	/**
	 * 
	 */
	public static void setGanadorFinal(String ganador) {
		System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
		System.out.println("  El Ganador es 👑 " + ganador + " 👑 ");
		System.out.println("🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆");
	}

}
