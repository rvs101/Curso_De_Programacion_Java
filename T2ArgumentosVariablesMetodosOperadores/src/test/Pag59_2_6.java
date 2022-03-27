package test;

/**
 * 
 * @author Robot
 *
 */
public class Pag59_2_6 {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 10 + 1);
		int y = (int) (Math.random() * 10 + 1);
		System.out.println("Base : " + x + " Altura : " + y);
		getAreaTriangulo(x, y);
	}

	/**
	 * Obtener area de un triangulo
	 * 
	 * @param base
	 * @param altura
	 * @return Area del triangulo
	 */
	private static int getAreaTriangulo(int base, int altura) {
		return base + altura;
	}
}
