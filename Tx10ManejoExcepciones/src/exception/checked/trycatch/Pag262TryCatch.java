package exception.checked.trycatch;

/**
 * 
 * @author RVS
 * @time 24 may 2022 - 18:06:07
 *
 */
public class Pag262TryCatch {

	/**
	 * 
	 * @param a
	 * @throws ParException
	 */
	public static void noQuieroPares(int a) throws ParException {
		if(a / 2 != 0) {
			System.out.println("Numero Impar");
		}else {
			throw new ParException("No es par");
		}
	}

	/**
	 * 
	 * @param a
	 */
	private static void yoFunciono(int a) {
		try {
			noQuieroPares(a);
		} catch (ParException pe) {
			try {
				noQuieroPares(a);
			} catch (ParException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		yoFunciono(4);
	}

}
