package aleatorios;

import java.util.Random;

public class NumeroAletarioEntre0y9 {

	public static void main(String[] args) {

//		Entre 0 y 9
		int x = (int) (Math.random() * 10);
		System.out.println("• Numero : " + x);

		for (int i = 0; i < 50; i++) {
//		Entre 0 y 49
			Random r = new Random();
			int y = (r.nextInt(50) + 1);
			System.out.println("• Numero : " + y);
		}
	}
}
