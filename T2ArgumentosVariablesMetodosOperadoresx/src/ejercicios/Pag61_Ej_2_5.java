package ejercicios;

/**
 * 
 * @author Robot
 *
 */
public class Pag61_Ej_2_5 {

	public static void main(String[] args) {
		int base = Integer.valueOf(args[0]);
		int altura = Integer.valueOf(args[1]);
		int area = (base * altura);
		System.out.println("El rectangulo de " + base + " por " + altura + "  tiene una área de " + area);
		System.out.println("El rectangulo de " + base + " por " + altura + "  tiene una área de " + getAreaRectangulo(base, altura));
	}
	
	private static int getAreaRectangulo(int base , int altura) {
		return base * altura;
	}
}
