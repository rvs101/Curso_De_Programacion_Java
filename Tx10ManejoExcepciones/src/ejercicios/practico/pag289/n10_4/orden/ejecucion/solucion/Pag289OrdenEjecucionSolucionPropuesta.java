package ejercicios.practico.pag289.n10_4.orden.ejecucion.solucion;

/**
 * 
 * @author RVS
 * @time 9 jun 2022 - 20:53:42
 *
 */
public class Pag289OrdenEjecucionSolucionPropuesta {

	private static final String CASO_0 = "ABCGHI";
	private static final String CASO_1 = "ABDGHI";
	private static final String CASO_2 = "ABEGH";
	private static final String CASO_3 = "ABCG";
	private static final String CASO_4 = "ABDG";
	private static final String[] CASOS = { CASO_0, CASO_1, CASO_2, CASO_3, CASO_4 };

	static String res = "";

	// 0 - Si no se producen excepciones: A-B-C-G-H-I
	// 1 - Si metodoUno lanza AException: A-B-D-G-H-I
	// 2 - Si metodoUno lanza BException: A-B-E-G-H
	// 3 - Si metodoDos lanza algo: A-B-C-G
	// 4 - Si metodoUno lanza AException y metodoDos lanza algo: A-B-D-G

	public static void main(String[] args) {
		for (int i = 0; i < CASOS.length; i++) {
			res = "";
			try {
				ordename(i);
			} catch (Exception e) {
				// aunque falle, quiero seguir y ver cómo dejó res
			}
			System.out.println("Caso " + i + ": " + res + " " + (res.equals(CASOS[i])));
		}
	}

	/**
	 * 
	 * @param caso
	 * @throws BException
	 */
	public static void ordename(int caso) throws BException {
		res += "A";
		try {
			res += "B";
			metodoUno(caso);
			res += "C";
		} catch (AException ae) {
			res += "D";
		} catch (BException be) {
			res += "E";
			throw be;
			// ni compila, si la pongo res += "F";
		} finally {
			res += "G";
			metodoDos(caso);
			res += "H";
		}
		res += "I";
	}

	/**
	 * 
	 * @param caso
	 * @throws AException
	 * @throws BException
	 */
	private static void metodoUno(int caso) throws AException, BException {
		switch (caso) {
		case 1:
		case 4:
			throw new AException();
		case 2:
			throw new BException();
		default:
			// todo bien
		}
	}

	/**
	 * 
	 * @param caso
	 */
	private static void metodoDos(int caso) {
		switch (caso) {
		case 3:
		case 4:
			throw new RuntimeException();
		default:
			// todo bien
		}
	}
}

/**
 * 
 * @author RVS
 * @time 9 jun 2022 - 20:53:58
 *
 */
class AException extends Exception {

}

/**
 * 
 * @author RVS
 * @time 9 jun 2022 - 20:54:02
 *
 */
class BException extends Exception {

}