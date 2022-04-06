package juego;


public class LogicaJuego {

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
		ReglasMensajesJuego.setElegirJugar();
		String respuesta = CapturaTeclado.getNumero();
		while ((!respuesta.equals("0")) && (!respuesta.equals("1"))) {
			System.out.println("⛒ Por favor introduce un respuesta mediante '0' - Para Salir o '1' - Para Jugar ");
			respuesta = CapturaTeclado.getNumero();
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

		ReglasMensajesJuego.getInstrucciones();
		ReglasMensajesJuego.getReglas();
		empezamos = getEmpezarJugar();

		if (empezamos == true) {

			JugadorPersona.setJugadorElegirNombre();
			JugadorMaquina.getMaquinaNombre();

			boolean interruptor = true;

			while ((ContadoresPuntuacion.getJugadorUnaVictoria() < 5)
					&& (ContadoresPuntuacion.getMaquinaUnaVictoria() < 5) && (ContadoresPuntuacion.getEmpates() < 9)
					&& (interruptor == true)) {
				++partidas;
				JugadorPersona.setJugadorElegirArma();
				JugadorMaquina.getMaquinaArmaElegida();
				ReglasMensajesJuego.setMostrarArmas();
				getCompararArmas();
				interruptor = getContinuarJugando();
			}
		}
		ReglasMensajesJuego.setGanadorFinal(getObtenerGanador());
		ReglasMensajesJuego.setEmpate();
		ReglasMensajesJuego.getFinDelJuego(partidas);
	}

	/**
	 * 
	 * @return
	 */
	public static boolean getContinuarJugando() {
		boolean valor = true;
		String respuesta = ReglasMensajesJuego.setMensajeContinuarJugando();

		while (!respuesta.equals("S") && !respuesta.equals("N")) {
			System.out.println("⛒ Por favor introduce un respuesta mediante 'S' o 'N' ");
			respuesta = CapturaTeclado.getRespuesta();
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
		ContadoresPuntuacion.setUnaPartida();
		ReglasMensajesJuego.setRound();
		if (JugadorPersona.getJugadorArma().equals(JugadorMaquina.getMaquinaArma())) {
			ContadoresPuntuacion.setEmpates();
			// • Piedras
//			Jugador Piedra - Maquina Tijera 
		} else if (JugadorPersona.getJugadorArma().equals("P") && JugadorMaquina.getMaquinaArma().equals("T")) {
			ReglasMensajesJuego.setJugadorGanador(JugadorPersona.getJugadorArma());
			ContadoresPuntuacion.setJugadorUnaVictoria();
			ContadoresPuntuacion.setMaquinaUnaPerdidas();
//			Maquina Piedra - Jugador Tijera
		} else if (JugadorMaquina.getMaquinaArma().equals("P") && JugadorPersona.getJugadorArma().equals("T")) {
			ReglasMensajesJuego.setMaquinaGanador(JugadorMaquina.getMaquinaArma());
			ContadoresPuntuacion.setMaquinaUnaVictoria();
			ContadoresPuntuacion.setJugadorUnaPerdida();
//❌			Jugador Piedra - Maquina Papel
		} else if (JugadorPersona.getJugadorArma().equals("P") && JugadorMaquina.getMaquinaArma().equals("L")) {
			ReglasMensajesJuego.setMaquinaGanador(JugadorMaquina.getMaquinaArma());
			ContadoresPuntuacion.setMaquinaUnaVictoria();
			ContadoresPuntuacion.setJugadorUnaPerdida();
//			Jugador Papel - Maquina Piedra
		} else if (JugadorPersona.getJugadorArma().equals("L") && JugadorMaquina.getMaquinaArma().equals("P")) {
			ReglasMensajesJuego.setJugadorGanador(JugadorPersona.getJugadorArma());
			ContadoresPuntuacion.setJugadorUnaVictoria();
			ContadoresPuntuacion.setMaquinaUnaPerdidas();
//			Maquina Piedra - Jugador Papel
		} else if (JugadorMaquina.getMaquinaArma().equals("P") && JugadorPersona.getJugadorArma().equals("L")) {
			ReglasMensajesJuego.setJugadorGanador(JugadorPersona.getJugadorArma());
			ContadoresPuntuacion.setJugadorUnaVictoria();
			ContadoresPuntuacion.setMaquinaUnaPerdidas();
			// • Tijeras
		} else if (JugadorPersona.getJugadorArma().equals("T") && JugadorMaquina.getMaquinaArma().equals("L")) {
			ReglasMensajesJuego.setJugadorGanador(JugadorPersona.getJugadorArma());
			ContadoresPuntuacion.setJugadorUnaVictoria();
			ContadoresPuntuacion.setMaquinaUnaPerdidas();
//			Maquina Tijera - Jugador Papel
		} else if (JugadorMaquina.getMaquinaArma().equals("T") && JugadorPersona.getJugadorArma().equals("L")) {
			ReglasMensajesJuego.setMaquinaGanador(JugadorMaquina.getMaquinaArma());
			ContadoresPuntuacion.setMaquinaUnaVictoria();
			ContadoresPuntuacion.setJugadorUnaPerdida();
//			Jugador Tijera - Maquina Papel
		} else if (JugadorPersona.getJugadorArma().equals("T") && JugadorMaquina.getMaquinaArma().equals("P")) {
			ReglasMensajesJuego.setMaquinaGanador(JugadorMaquina.getMaquinaArma());
			ContadoresPuntuacion.setMaquinaUnaVictoria();
			ContadoresPuntuacion.setJugadorUnaPerdida();
//			Maquina Tijera - Jugador Piedra
		} else if (JugadorMaquina.getMaquinaArma().equals("T") && JugadorPersona.getJugadorArma().equals("P")) {
			ReglasMensajesJuego.setJugadorGanador(JugadorPersona.getJugadorArma());
			ContadoresPuntuacion.setJugadorUnaVictoria();
			ContadoresPuntuacion.setMaquinaUnaPerdidas();
			// • Papeles
//			Maquina Papel - Persona Piedra
		} else if (JugadorMaquina.getMaquinaArma().equals("L") && JugadorPersona.getJugadorArma().equals("P")) {
			ReglasMensajesJuego.setMaquinaGanador(JugadorMaquina.getMaquinaArma());
			ContadoresPuntuacion.setMaquinaUnaVictoria();
			ContadoresPuntuacion.setJugadorUnaPerdida();
//			Maquina Papel - Persona Tijera
		} else if (JugadorMaquina.getMaquinaArma().equals("L") && JugadorPersona.getJugadorArma().equals("T")) {
			ReglasMensajesJuego.setJugadorGanador(JugadorPersona.getJugadorArma());
			ContadoresPuntuacion.setJugadorUnaVictoria();
			ContadoresPuntuacion.setMaquinaUnaPerdidas();
//			Persona Papel - Maquina Tijera
		} else if (JugadorPersona.getJugadorArma().equals("L") && JugadorMaquina.getMaquinaArma().equals("T")) {
			ReglasMensajesJuego.setMaquinaGanador(JugadorMaquina.getMaquinaArma());
			ContadoresPuntuacion.setMaquinaUnaVictoria();
			ContadoresPuntuacion.setJugadorUnaPerdida();
		}
		ReglasMensajesJuego.setMarcadorGeneral();
	}

	public static String getObtenerGanador() {
		String ganador = "☹ Sin Ganador ☹";

		if (ContadoresPuntuacion.getJugadorUnaVictoria() > ContadoresPuntuacion.getMaquinaUnaVictoria()) {
			ganador = JugadorPersona.getJugadorNombre();
		} else if (ContadoresPuntuacion.getMaquinaUnaVictoria() > ContadoresPuntuacion.getJugadorUnaVictoria()) {
			ganador = JugadorMaquina.getMaquinaNombre();
		}
		ReglasMensajesJuego.setGanador();
		ReglasMensajesJuego.setPerdedor();
		return ganador;
	}

	/**
	 * 
	 * @return
	 */
	public static String getGanadorFinal() {
		String ganadorFinal = "";
		if ((ContadoresPuntuacion.getJugadorUnaVictoria() > ContadoresPuntuacion.getJugadorUnaVictoria())) {
			ganadorFinal = JugadorPersona.getJugadorNombre();
		} else if ((ContadoresPuntuacion.getJugadorUnaVictoria() < ContadoresPuntuacion.getJugadorUnaVictoria())) {
			ganadorFinal = JugadorMaquina.getMaquinaNombre();
		}
		return ganadorFinal;
	}

	/**
	 * 
	 * @return
	 */
	public static String getPerdedorFinal() {
		return ContadoresPuntuacion.getJugadorUnaPerdida() > ContadoresPuntuacion.getMaquinaUnaPerdida()
				? JugadorPersona.getJugadorNombre()
				: JugadorMaquina.getMaquinaNombre();
	}

}
