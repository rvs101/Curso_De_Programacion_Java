package conceptos.mod_static;

/**
 * 
 * @author RVS
 * @time 4 may 2022 - 14:30:25
 *
 */
public class ClaseStatic {

	/**
	 * Atributo de clase
	 */
	private static int x;

	/**
	 * Atributo de clase
	 */
	private static int y;

	/**
	 * Constructor de clase por defecto
	 */
	public ClaseStatic() {
		ClaseStatic.x = 0;
		ClaseStatic.y = 0;
	}

	/**
	 * Constructor parametrizado de clase por defecto
	 * 
	 * @param x
	 * @param y
	 */
	public ClaseStatic(int x, int y) {
		ClaseStatic.x = x;
		ClaseStatic.y = y;
	}

	/**
	 * Función de clase
	 * 
	 * @return
	 */
	public static int getX() {
		return x;
	}

	/**
	 * 
	 * @return
	 */
	public static int getY() {
		return y;
	}

	/**
	 * 
	 * @param x
	 */
	public static void setX(int x) {
		ClaseStatic.x = x;
	}

	/**
	 * 
	 * @param y
	 */
	public static void setY(int y) {
		ClaseStatic.y = y;
	}

	@Override
	public String toString() {
		return " Valor x : " + ClaseStatic.getX() + " Valor y : " + ClaseStatic.getY();
	}

	public static void main(String[] args) {
		
		ClaseStatic cs = new ClaseStatic();

		ClaseStatic.setX(10);
		ClaseStatic.setY(5);
		
		System.out.println(cs.toString());
	}
}
