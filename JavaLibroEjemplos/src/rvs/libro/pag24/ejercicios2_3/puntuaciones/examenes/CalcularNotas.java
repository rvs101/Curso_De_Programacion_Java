package rvs.libro.pag24.ejercicios2_3.puntuaciones.examenes;

/**
 * Clase Concreta : Calcular Notas
 * 
 * Gestiona los numeros
 * 
 * 7 jul 2023 - 17:51:34
 *
 * @author RVS
 *
 */
public class CalcularNotas {

	/**
	 * 
	 */
	private ObtenerDecimales decimal;

	/**
	 * 
	 */
	private Notas nota = new Notas();

	/**
	 * Metodo de instancia<br>
	 * <br>
	 * Establece 10 notas a través del metodo getValor de la clase Decimal
	 */
	public void setNotasTotales() {
		decimal = new ObtenerDecimales();

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				nota.setNota1(decimal.getValor());
				System.out.println("Examen 1? " + nota.getNota1());
			}
			if (i == 1) {
				nota.setNota2(decimal.getValor());
				System.out.println("Examen 2? " + nota.getNota2());
			}
			if (i == 2) {
				nota.setNota3(decimal.getValor());
				System.out.println("Examen 3? " + nota.getNota3());
			}
			if (i == 3) {
				nota.setNota4(decimal.getValor());
				System.out.println("Examen 4? " + nota.getNota4());
			}
			if (i == 4) {
				nota.setNota5(decimal.getValor());
				System.out.println("Examen 5? " + nota.getNota5());
			}
			if (i == 5) {
				nota.setNota6(decimal.getValor());
				System.out.println("Examen 6? " + nota.getNota6());
			}
			if (i == 6) {
				nota.setNota7(decimal.getValor());
				System.out.println("Examen 7? " + nota.getNota7());
			}
			if (i == 7) {
				nota.setNota8(decimal.getValor());
				System.out.println("Examen 8? " + nota.getNota8());
			}
			if (i == 8) {
				nota.setNota9(decimal.getValor());
				System.out.println("Examen 9? " + nota.getNota9());
			}
			if (i == 9) {
				nota.setNota10(decimal.getValor());
				System.out.println("Examen 10? " + nota.getNota10());
			}
		}
	}

	/**
	 * Metodo de instancia <br>
	 * <br>
	 * 
	 * @return - decimal - La media de las 10 notas
	 */
	public double calcularMedia() {
		return (nota.getNota1() + nota.getNota2() + nota.getNota3() + nota.getNota4() + nota.getNota5() + nota.getNota6()
				+ nota.getNota7() + nota.getNota8() + nota.getNota9() + nota.getNota10()) / 10;
	}

}
