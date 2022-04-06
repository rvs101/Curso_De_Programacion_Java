package ejercicios;

public class Pag108Ej4_3ListarArgsVariasVecesLibro {

	private static final int LIM = 5;
	private static final int REP_CORTA = 4;
	private static final int REP_LARGA = 2;

	public static void main(String[] args) {

// Recorremos todos los elementos del array de String sin importar su indice o posición
		for (String s : args) {
// Si la longitud máxima de la palabra es menor o igual que LIM=5
			if (s.length() <= LIM) {
//				Repetimos el bucle 4 veces seguidas 
				for (int i = 0; i < REP_CORTA; i++) {
					System.out.print(s + " ");
				}
				System.out.println("");
			} else {
//				Repetimos el bucle 2 veces seguidas 
				for (int i = 0; i < REP_LARGA; i++) {
					System.out.print(s + " ");
				}
				System.out.println();
			}
		}
	}
}
