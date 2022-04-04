package programa;

import ayudas.T5ReglasMensajesJuego;

public class T5LogicaJuego {

	/**
	 * 
	 */
	public static void comenzarJuego() {
		setPartidasJugadas();
	}

	/**
	 * 
	 * @return 1 == false && 0 == true
	 */
	public static boolean getEmpezarJugar() {
		boolean valor = true;
		T5ReglasMensajesJuego.setElegirJugar();
		String respuesta = T5CapturaTeclado.getNumero();
		while ((!respuesta.equals("0")) && (!respuesta.equals("1"))) {
			System.out.println("🚫 Por favor introduce un respuesta mediante '0' - Para Salir o '1' - Para Jugar ");
			respuesta = T5CapturaTeclado.getNumero();
		}
		if (respuesta.equals("1")) {
			valor = true;
		} else if (respuesta.equals("0")) {
			valor = false;
		}
		return valor;
	}

	/**
	 * 
	 */
	public static void setPartidasJugadas() {
		int partidas = 0;
		boolean empezamos = false;
		T5ReglasMensajesJuego.getInstrucciones();
		T5ReglasMensajesJuego.getReglas();
		empezamos = getEmpezarJugar();
		if (empezamos == true) {

			T5JugadorPersona.setJugadorElegirNombre();
			T5JugadorMaquina.getMaquinaNombre();

			boolean interruptor = true;
			while ((T5ContadoresPuntuacion.getJugadorUnaVictoria() < 5)
					&& (T5ContadoresPuntuacion.getMaquinaUnaVictoria() < 5) && (T5ContadoresPuntuacion.getEmpates() < 9)
					&& (interruptor == true)) {
				++partidas;
				T5JugadorPersona.setJugadorElegirArma();
				T5JugadorMaquina.getMaquinaArmaElegida();
				T5ReglasMensajesJuego.setMostrarArmas();
				getCompararArmas();
				interruptor = getContinuarJugando();
			}
		}
		T5ReglasMensajesJuego.setGanadorFinal(getObtenerGanador());
		T5ReglasMensajesJuego.getFinDelJuego(partidas);
	}

	/**
	 * 
	 * @return
	 */
	public static boolean getContinuarJugando() {
		boolean valor = true;
		String respuesta = T5ReglasMensajesJuego.setMensajeContinuarJugando();

		while (!respuesta.equals("S") && !respuesta.equals("N")) {
			System.out.println("🚫 Por favor introduce un respuesta mediante 'S' o 'N' ");
			respuesta = T5CapturaTeclado.getRespuesta();
		}

		if (respuesta.equals("S")) {
			valor = true;
		} else if (respuesta.equals("N")) {
			valor = false;
		}
		return valor;
	}

	/**
	 * 
	 */
	public static void getCompararArmas() {
		if (T5JugadorPersona.getJugadorArma().equals(T5JugadorMaquina.getMaquinaArma())) {
			System.out.println("Empate");
			T5ContadoresPuntuacion.setEmpates();
			// • Piedras
//			Jugador Piedra - Maquina Tijera 
		} else if (T5JugadorPersona.getJugadorArma().equals("P") && T5JugadorMaquina.getMaquinaArma().equals("T")) {
			T5ReglasMensajesJuego.setJugadorGanador(T5JugadorPersona.getJugadorArma());
			T5ContadoresPuntuacion.setJugadorUnaVictoria();
			T5ContadoresPuntuacion.setMaquinaUnaPerdidas();
			T5ContadoresPuntuacion.setUnaPartida();
//			Maquina Piedra - Jugador Tijera
		} else if (T5JugadorMaquina.getMaquinaArma().equals("P") && T5JugadorPersona.getJugadorArma().equals("T")) {
			T5ReglasMensajesJuego.setMaquinaGanador(T5JugadorMaquina.getMaquinaArma());
			T5ContadoresPuntuacion.setMaquinaUnaVictoria();
			T5ContadoresPuntuacion.setJugadorUnaPerdida();
			T5ContadoresPuntuacion.setUnaPartida();
//❌			Jugador Piedra - Maquina Papel
		} else if (T5JugadorPersona.getJugadorArma().equals("P") && T5JugadorMaquina.getMaquinaArma().equals("L")) {
			T5ReglasMensajesJuego.setMaquinaGanador(T5JugadorMaquina.getMaquinaArma());
			T5ContadoresPuntuacion.setMaquinaUnaVictoria();
			T5ContadoresPuntuacion.setJugadorUnaPerdida();
			T5ContadoresPuntuacion.setUnaPartida();
//			Jugador Papel - Maquina Piedra
		} else if (T5JugadorPersona.getJugadorArma().equals("L") && T5JugadorMaquina.getMaquinaArma().equals("P")) {
			T5ReglasMensajesJuego.setJugadorGanador(T5JugadorPersona.getJugadorArma());
			T5ContadoresPuntuacion.setJugadorUnaVictoria();
			T5ContadoresPuntuacion.setMaquinaUnaPerdidas();
			T5ContadoresPuntuacion.setUnaPartida();
//			Maquina Piedra - Jugador Papel
		} else if (T5JugadorMaquina.getMaquinaArma().equals("P") && T5JugadorPersona.getJugadorArma().equals("L")) {
			T5ReglasMensajesJuego.setJugadorGanador(T5JugadorPersona.getJugadorArma());
			T5ContadoresPuntuacion.setJugadorUnaVictoria();
			T5ContadoresPuntuacion.setMaquinaUnaPerdidas();
			T5ContadoresPuntuacion.setUnaPartida();
			// • Tijeras
		} else if (T5JugadorPersona.getJugadorArma().equals("T") && T5JugadorMaquina.getMaquinaArma().equals("L")) {
			T5ReglasMensajesJuego.setJugadorGanador(T5JugadorPersona.getJugadorArma());
			T5ContadoresPuntuacion.setJugadorUnaVictoria();
			T5ContadoresPuntuacion.setMaquinaUnaPerdidas();
			T5ContadoresPuntuacion.setUnaPartida();
//			Maquina Tijera - Jugador Papel
		} else if (T5JugadorMaquina.getMaquinaArma().equals("T") && T5JugadorPersona.getJugadorArma().equals("L")) {
			T5ReglasMensajesJuego.setMaquinaGanador(T5JugadorMaquina.getMaquinaArma());
			T5ContadoresPuntuacion.setMaquinaUnaVictoria();
			T5ContadoresPuntuacion.setJugadorUnaPerdida();
			T5ContadoresPuntuacion.setUnaPartida();
//			Jugador Tijera - Maquina Papel
		} else if (T5JugadorPersona.getJugadorArma().equals("T") && T5JugadorMaquina.getMaquinaArma().equals("P")) {
			T5ReglasMensajesJuego.setMaquinaGanador(T5JugadorMaquina.getMaquinaArma());
			T5ContadoresPuntuacion.setMaquinaUnaVictoria();
			T5ContadoresPuntuacion.setJugadorUnaPerdida();
			T5ContadoresPuntuacion.setUnaPartida();
//			Maquina Tijera - Jugador Piedra
		} else if (T5JugadorMaquina.getMaquinaArma().equals("T") && T5JugadorPersona.getJugadorArma().equals("P")) {
			T5ReglasMensajesJuego.setJugadorGanador(T5JugadorPersona.getJugadorArma());
			T5ContadoresPuntuacion.setJugadorUnaVictoria();
			T5ContadoresPuntuacion.setMaquinaUnaPerdidas();
			T5ContadoresPuntuacion.setUnaPartida();
			// • Papeles
//			Maquina Papel - Persona Piedra
		} else if (T5JugadorMaquina.getMaquinaArma().equals("L") && T5JugadorPersona.getJugadorArma().equals("P")) {
			T5ReglasMensajesJuego.setMaquinaGanador(T5JugadorMaquina.getMaquinaArma());
			T5ContadoresPuntuacion.setMaquinaUnaVictoria();
			T5ContadoresPuntuacion.setJugadorUnaPerdida();
			T5ContadoresPuntuacion.setUnaPartida();
//			Maquina Papel - Persona Tijera
		} else if (T5JugadorMaquina.getMaquinaArma().equals("L") && T5JugadorPersona.getJugadorArma().equals("T")) {
			T5ReglasMensajesJuego.setJugadorGanador(T5JugadorPersona.getJugadorArma());
			T5ContadoresPuntuacion.setJugadorUnaVictoria();
			T5ContadoresPuntuacion.setMaquinaUnaPerdidas();
			T5ContadoresPuntuacion.setUnaPartida();
//			Persona Papel - Maquina Tijera
		} else if (T5JugadorPersona.getJugadorArma().equals("L") && T5JugadorMaquina.getMaquinaArma().equals("T")) {
			T5ReglasMensajesJuego.setMaquinaGanador(T5JugadorMaquina.getMaquinaArma());
			T5ContadoresPuntuacion.setMaquinaUnaVictoria();
			T5ContadoresPuntuacion.setJugadorUnaPerdida();
			T5ContadoresPuntuacion.setUnaPartida();
		}
		T5ReglasMensajesJuego.setMarcadorGeneral();
	}

	/**
	 * 
	 * @return
	 */
	public static String getObtenerGanador() {
		String ganador = "Sin Ganador";

		if (T5ContadoresPuntuacion.getJugadorUnaVictoria() > T5ContadoresPuntuacion.getMaquinaUnaVictoria()) {
			ganador = T5JugadorPersona.getJugadorNombre();
		} else if (T5ContadoresPuntuacion.getMaquinaUnaVictoria() > T5ContadoresPuntuacion.getJugadorUnaVictoria()) {
			ganador = T5JugadorMaquina.getMaquinaNombre();
		}
		return ganador;
	}

}
