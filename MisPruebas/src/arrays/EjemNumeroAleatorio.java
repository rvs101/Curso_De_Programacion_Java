package arrays;

public class EjemNumeroAleatorio {

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			int x = (int) (Math.random() * 3 + 1);
			System.out.println(x);
		}

	}
}
