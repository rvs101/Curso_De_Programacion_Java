package exception.checked.trycatch;

/**
 * 
 * @author RVS
 * @time 24 may 2022 - 23:32:53
 *
 */
public class Pag264YoFuncionoAVeces {

	/**
	 * 
	 * IllegalStateException - Excepcion descendiente de la clase RuntimeException
	 * 
	 * @param a - int : Numero que le pasamos para comprobar si es par o no
	 */
	private void yoFunciono(int a) {
		try {
			noQuieroPares(a);
		} catch (ParException pe) {
			try {
				noQuieroPares(a + 1);
			} catch (ParException parE) {
//				si a era par , a+1 no puede serlo
				throw new IllegalStateException("Esta excepción debería de ser imposible con el valor" + (a + 1), parE);
			}
		}
	}

	/**
	 * 
	 * @param a
	 * @throws ParException
	 */
	public void yoFuncionoAVeces(int a) throws NegativoException, ParException {
		try {
			noQuieroParesNiNegativos(a);
		} catch (ParException pe) {
			noQuieroParesNiNegativos(a + 1);
		}
	}

	/**
	 * 
	 * @param a
	 * @throws ParException
	 * @throws NegativoException
	 */
	private static void noQuieroParesNiNegativos(int a) throws ParException, NegativoException {
		if (esPar(a)) {
			throw new ParException(a + " es par!");
		}
		if (a < 0) {
			throw new NegativoException(a + " es un número negativo :) ");
		}
	}

	/**
	 * 
	 * @param a
	 * @throws ParException
	 */
	private void noQuieroPares(int a) throws ParException {
		if (esPar(a)) {
			throw new ParException(a + " es par!");
		}
	}

	/**
	 * 
	 * @param a
	 * @return boolean - Devuelve true si es número es par o false si no lo es
	 */
	public static boolean esPar(int a) {
		return (a % 2 == 0);
	}

}
