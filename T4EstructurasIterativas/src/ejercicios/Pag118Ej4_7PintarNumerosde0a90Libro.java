package ejercicios;

public class Pag118Ej4_7PintarNumerosde0a90Libro {

	private static final int TAM = 10;

	public static void main(String[] args) {

		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}
}
