package ejemplos;

public class Pag104Ej04_07Rectangulo {

	public static void main(String[] args) {

		getRectanguloPersonalizado(5, 10);
	}

	/**
	 * Metodo para dibujar Rectangulos
	 * 
	 * @param fila
	 * @param columnas
	 */
	public static void getRectanguloPersonalizado(int fila, int columnas) {
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columnas; j++) {
//		Si i esta por encima de 0 y entre -1 de la máxima longitud para el final
//					AND j esta entre 1 elemento por encima de 0 y una longitud máxima de -1 del largo máximo
				if ((i > 0 && i < fila - 1) && (j > 0 && j < columnas - 1)) {
//						Dibuja un espacio en blanco
					System.out.print(" ");
				} else {
//						Dibuja un circulo
					System.out.print("•");
				}
			}
			System.out.println("");
		}
	}
}