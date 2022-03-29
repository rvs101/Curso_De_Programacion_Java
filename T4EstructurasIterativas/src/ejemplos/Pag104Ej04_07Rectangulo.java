package ejemplos;

public class Pag104Ej04_07Rectangulo {

	public static void main(String[] args) {

		int altura = 5;
		int base = 10;

		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				if (i > 0 && i < 4) {
					if (j == 1 || j == 10) {
						System.out.print("•");
					}
				} else {
					System.out.print("•");
				}
			}
			System.out.println("");
		}
	}
}