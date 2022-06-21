package ejercicios.practico.pag293.ej10_4.orden.ejecucion;

/**
 * 
 * @author RVS
 * @time 10 jun 2022 - 19:58:33
 *
 */
public class Pag293OrdenEjecucion {

	private static final String CASO_0 = "ABCGHI";
	private static final String CASO_1 = "ABDGHI";
	private static final String CASO_2 = "ABEGH";
	private static final String CASO_3 = "ABCG";
	private static final String CASO_4 = "ABDG";
	private static final String[] CASOS = { CASO_0, CASO_1, CASO_2, CASO_3, CASO_4 };

	protected static String res;

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
			break;
		}
	}

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

	public static void main(String[] args) throws BException {
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
}

class AException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

class BException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
