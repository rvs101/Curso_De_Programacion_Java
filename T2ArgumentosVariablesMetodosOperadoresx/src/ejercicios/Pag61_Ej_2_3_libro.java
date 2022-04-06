package ejercicios;

/**
 * Calcula el Area de un Rectangulo
 * 
 * @author Robot
 *
 */
public class Pag61_Ej_2_3_libro {

	public static void main(String[] args) {
		float ladoX = Integer.valueOf(args[0]);
		float ladoY = Integer.valueOf(args[1]);
		System.out.println("- Lado 1 : " + ladoX + "\n- Lado 2 : " + ladoY + "\n▲ Area del Rectangulo :  "
				+ Pag61_Ej_2_3_libro.getAreaRectangulo(ladoX, ladoY));
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
