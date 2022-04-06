package ejercicios;

public class Pag118Ej4_7PintarNumerosde0a90 {

	public static void main(String[] args) {

		System.out.println("• Ver lista de numeros del 0 al 99 \n ---------------------------");
		
		getNumeros();
	}

	private static void getNumeros() {
		int num = -1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (num < 9) {
					System.out.print("0" + ++num + " ");
				} else {
					System.out.print(++num + " ");
				}
			}
			System.out.println("");
		}
		System.out.println(" ---------------------------");
	}
}
