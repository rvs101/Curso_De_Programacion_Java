package ejemplos;

public class Pag105EjCaracteresEspeciales {

	private static final int LINEA = 55;

	public static void main(String[] args) {

		getLineas();
		System.out.println("Salto de Linea con  \n - \\n ");
		System.out.println("Retorno de carro con  \r - \\r ");
		System.out.println("Tabulación con  \t - \\t ○ ");
		System.out.println("Comillas dobles → para escribir literales \"hola \"adios\" chao\"");
		System.out.println("Apostrofo → Comillas simples para escribir literales \'hola \'adios\' chao\'");
		System.out.println("Contrabarra → \\ : Para declarar o mostrar rutas");
		getLineas();
		
		System.out.println(
				"Debes copiar el texto \"I'm happy\" dentro del fichero:\n" + "\tC:\\app\\nube\\recursos\\textos.txt");
	}

	private static void getLineas() {
		for (int i = 0; i < LINEA; i++) {
			System.out.print("-");
			if (i == (LINEA - 1)) {
				System.out.println("");
			}
		}
	}
}
