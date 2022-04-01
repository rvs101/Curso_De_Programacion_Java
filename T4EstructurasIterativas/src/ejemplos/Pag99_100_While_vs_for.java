package ejemplos;

public class Pag99_100_While_vs_for {

	public static final int NUM = 10;

	public static void main(String[] args) {

		for (int i = 0; i < NUM; i++) {
//			instrucciones;
			char letra = (char) (Math.random() * 26 + 'a');
			System.out.println("Posicion : " + i + " Valor - " + letra);
		}
		
		System.out.println("-----------------");

		int i = 0; // Declaracion
		while (i < NUM) {
//			instrucciones;
			char letra = (char) (Math.random() * 26 + 'a');
			System.out.println("Posicion : " + i + " Valor - " + letra);
			i++;
		}
	}
}
