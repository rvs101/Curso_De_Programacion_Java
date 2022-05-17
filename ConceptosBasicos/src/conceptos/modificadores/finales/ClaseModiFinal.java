package conceptos.modificadores.finales;

public final class ClaseModiFinal {

//	Constantes
	private static final double PI = 3.14159265;
	private static final String MENSAJE = "Hola";

//	Variables de instancia privadas
	/**
	 * 
	 */
	private int x;
	private int y;

	/**
	 * Variables de instancia privadas
	 * 
	 */
	private double a;
	private double b;

	/**
	 * Constructor por defecto
	 */
	public ClaseModiFinal() {
//		No te permite cambiar el valor de los atributos finales = Constantes
//		ClaseModiFinal.PI = 0;
//		ClaseModiFinal.MENSAJE = "Adios";
	}

	/**
	 * Constructor parametrizado con valores finales
	 * 
	 * @param x - valor final
	 * @param y - valor final
	 * @param a - 
	 * @param b
	 */
	public ClaseModiFinal(final int x, final int y, double a, double b) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
	}

	/**
	 * 
	 * @return
	 */
	public final int getX() {
		final int xx = 10;
		return (x + xx);
	}

	/**
	 * 
	 * @param x
	 */
	public final void setX(int x) {
		final int xx = 11;
		this.x = x + xx;
	}

	/**
	 * 
	 * @return
	 */
	public final int getY() {
		final int yy = 22;
		this.y += yy;
		return yy;
	}

	/**
	 * 
	 * @param y
	 */
	public final void setY(int y) {
		this.y = y;
	}

	/**
	 * 
	 * @return
	 */
	public final double getA() {
		return a;
	}

	/**
	 * 
	 * @param a
	 */
	public final void setA(double a) {
		this.a = a;
	}

	/**
	 * 
	 * @return
	 */
	public final double getB() {
		return b;
	}

	/**
	 * 
	 * @param b
	 */
	public final void setB(double b) {
		this.b = b;
	}

	/**
	 * 
	 * @return
	 */
	public final static double getPi() {
		return PI;
	}

	/**
	 * 
	 * @return
	 */
	public final static String getMensaje() {
		final String ADIOS = " Adios";
		return MENSAJE.concat(ADIOS);
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return " Valor de A : " + getA() + " Valor de B : " + getB() + " Valor de Mensaje : " + getMensaje()
				+ " Valor de PI: " + getPi() + " Valor de X: " + getX() + " Valor de Y: " + getY();
	}

	public static void main(String[] args) {

		ClaseModiFinal cmf = new ClaseModiFinal();
		System.out.println(cmf.toString());
	}
}
