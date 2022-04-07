package programa;

/**
 * Jugador Maquina
 * 
 * @author RVS
 *
 */
public class T5JugadorMaquina {

	private static String maquinaArma = "";
	private static final String maquinaNombre = "Jugador-Maquina";

	private static int maquinaGanadas = 0;
	private static int maquinaPerdidas = 0;
	private static int maquinaEmpatadas = 0;

	/**
	 * Constructor por defecto
	 * 
	 * Cada vez que creamos un objeto lo inicializamos con los valores que tengamos
	 * definido aqui
	 * 
	 */
	public T5JugadorMaquina() {
	}

	/**
	 * 
	 * @return String
	 */
	public static String getMaquinaNombre() {
		return maquinaNombre;
	}

	/**
	 * 
	 * @return String
	 */
	public static String getMaquinaArma() {
		return maquinaArma;
	}

	/**
	 * 
	 * @param String
	 */
	public static void setMaquinaArma(String mArma) {
		maquinaArma = mArma;
	}

	/**
	 * 
	 * @return int7
	 */
	public static int getMaquinaGanadas() {
		return maquinaGanadas;
	}

	/**
	 * 
	 * @param mGanadas
	 */
	public static void setMaquinaGanadas(int mGanadas) {
		maquinaGanadas = mGanadas;
	}

	/**
	 * 
	 * @return int
	 */
	public static int getMaquinaPerdidas() {
		return maquinaPerdidas;
	}

	/**
	 * 
	 * @param int
	 */
	public static void setMaquinaPerdidas(int mPerdidas) {
		maquinaPerdidas = mPerdidas;
	}

	/**
	 * 
	 * @return int
	 */
	public static int getMaquinaEmpatadas() {
		return maquinaEmpatadas;
	}

	/**
	 * 
	 * @param int
	 */
	public static void setMaquinaEmpatadas(int mEmpatadas) {
		maquinaEmpatadas = mEmpatadas;
	}

	/**
	 * Genera numero aleatorio
	 * 
	 * @return entre 1 , 2 , 3
	 */
	public static int getMaquinaNumeroAletario() {
		return (int) (Math.random() * 3 + 1);
	}

	/**
	 * Switch para elegir arma
	 * 
	 */
	public static void getMaquinaArmaElegida() {
		switch (getMaquinaNumeroAletario()) {
		case 1:
			setMaquinaArma("P");
			break;
		case 2:
			setMaquinaArma("T");
			break;
		case 3:
			setMaquinaArma("L");
			break;
		}
		System.out.println("🤖 Arma elegida ⚔ : " + getMaquinaArma() + " → " + T5ReglasMensajesJuego.getArmaMaquina());
	}
}
