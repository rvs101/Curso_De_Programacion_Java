package exception.checked.trycatch;

/**
 * 
 * @author RVS
 * @time 24 may 2022 - 22:31:57
 *
 */
public class Pag261TryCatch {

	/**
	 * 
	 * @param a
	 */
	public void setNumeroNoPares(int a) {
		if (getPares(a)) {
			throw new ArithmeticException();
		}
	}

	/**
	 * 
	 * @param a
	 * @return
	 */
	public boolean getPares(int a) {
		if (a / 2 == 0) {
			return true;
		}
		return false;
	}

}
