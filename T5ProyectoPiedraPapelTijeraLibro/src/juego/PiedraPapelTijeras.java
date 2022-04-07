package juego;

/**
 * Proyecto - Vamos a jugar a piedra papel tijeras contra el ordenador
 * Tendras que explicarle al jugador como se juega , pedirle que nos de su jugada
 * (Piedra , Papel , Tijera , Salir ) generar una jugada aleatoria para el ordenador
 * y decidir quién ha ganado
 */
import java.util.Scanner;

public class PiedraPapelTijeras {

//	Constantes de Clase
	private static final String PIEDRA = "P";
	private static final String PAPEL = "L";
	private static final String TIJERAS = "T";
	private static final String SALIR = "S";

	private static final String[] JUEGO = { PIEDRA, PAPEL, TIJERAS };

	private static final int EMPATE = 0;
	private static final int GANAS = 1;
	private static final int PIERDES = 2;

	private static final int ERROR_NO_ENCONTRADA = -1;

//	Mensajes al usuario
	private static final String BIENVENIDA = "¡Bienvenido al juego Piedra-Papel-Tijera!";
	private static final String OPCIONES = PIEDRA + "(piedra), " + PAPEL + " (papel) , " + TIJERAS + " (tijeras) o "
			+ SALIR + " (salir)";
	private static final String PEDIR_JUGADA = "¿ Cuál es tu jugada ? " + PIEDRA + " (piedra), " + PAPEL + " (papel), "
			+ TIJERAS + " (tijeras) o " + SALIR + " (salir)";
	private static final String PEDIR__NUEVA_JUGADA = "¿ Cuál es tu nueva jugada ? " + OPCIONES;
	private static final String FIN = "Fin de la partida";
	private static final String MSJ_ERROR_NO_ENCONTRADA = "No entiendo tu jugada";

	public static void main(String[] args) {

//		abrimos un Scanner para leer la entrada del usuarios
		Scanner s = new Scanner(System.in);

//		Instrucciones
		System.out.println(BIENVENIDA);
		System.out.println(PEDIR_JUGADA);

		while (true) {
//		Jugada del Ordenador
			int eleccionPC = (int) (Math.random() * JUEGO.length);
//		System.out.println("*** Ordenador " + JUEGO[eleccionPC]);

//		Jugada del Usuario
			String seleccionUsuario = s.next();
			if (seleccionUsuario.equalsIgnoreCase(SALIR)) {
				break; // Si nos da una S , cortamos el bucle para terminar
			}

//		System.out.println("*** Usuario " + seleccionUsuario);

//		Interpretacion de la jugada del usuario
			int eleccionUsuario = convertir(seleccionUsuario);
//		System.out.println("*** Interpretacion " + eleccionUsuario);
			if (eleccionUsuario == ERROR_NO_ENCONTRADA) {
				System.err.println(MSJ_ERROR_NO_ENCONTRADA);
				continue;
			}

//		Calcular el ganador de la jugada
			int resultado = usuarioGana(eleccionPC, eleccionUsuario);
//		System.out.println("*** Resultado: " + eleccionUsuario);

//		cerramos lo que abrimos

//		Mostrar el ganador de la jugada
			switch (resultado) {
			case GANAS:
				System.out.println("! Enhorabuena ! Tu " + JUEGO[eleccionUsuario] + " gana a " + JUEGO[eleccionPC]);
				break;
			case PIERDES:
				System.out.println("! Lo siento ! Tu " + JUEGO[eleccionUsuario] + " pierde ante " + JUEGO[eleccionPC]);
				break;
			default:
			case EMPATE:
				System.out.println("! Empate a " + JUEGO[eleccionPC] + "!");
				break;
			}
			System.out.println("¿ Cuál es tu nueva jugada? P (piedra) , L (papel) , T (tijera) o S (salir)");
		}
		System.out.println(FIN);
		s.close();
	}

	/**
	 * 
	 * @param seleccionUsuario
	 * @return
	 */
	private static int convertir(String seleccionUsuario) {
		for (int i = 0; i < JUEGO.length; i++) {
			if (JUEGO[i].equalsIgnoreCase(seleccionUsuario)) {
				return i;
			}
		}
		return ERROR_NO_ENCONTRADA; // TODO tratar esto correctamente
	}

	/**
	 * 
	 * @param eleccionPC
	 * @param eleccionUsuario
	 * @return
	 */
	private static int usuarioGana(int eleccionPC, int eleccionUsuario) {
		int res = eleccionUsuario - eleccionPC;
		if (res < 0) {
			res += JUEGO.length;
		}
		return res;
	}

}
