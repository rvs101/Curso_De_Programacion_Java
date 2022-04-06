package ejercicios;

/**
 * Calcula el Area de un Rectangulo
 * 
 * @author Robot
 *
 */
public class Pag61_Ej_2_3 {

	public static void main(String[] args) {
		float lado1 = (float) (Math.random() * 10 + 1);
		float lado2 = (float) (Math.random() * 10 + 1);
		System.out.println("- Lado 1 : " + lado1 + "\n- Lado 2 : " + lado2 + "\n▲ Area del Rectangulo :  "
				+ Pag61_Ej_2_3.getAreaRectangulo(lado1, lado2));
	}

	/**
	 * Calcular el Area De Un Triangulo
	 * 
	 * @param lado1
	 * @param lado2
	 * @return Devolver el area de un triangulo
	 */
	private static float getAreaRectangulo(float lado1, float lado2) {
		final float resultado = (lado1 * lado2);
		return resultado;
	}
}
