package condicionales;

public class Pag80EjIfElseSwitch {

	public static void main(String[] args) {

		int numLados = (int) (Math.random() * 10 + 1);
		String figura = null;

		if (numLados == 3) {
			figura = "triangulo";
		} else if (numLados == 4) {
			figura = "cuadril�tero";
		} else if (numLados == 5) {
			figura = "pent�gono";
		} else if (numLados == 6) {
			figura = "hex�gono";
		} else if (numLados == 7) {
			figura = "hept�gono";
		} else if (numLados == 8) {
			figura = "oct�gono";
		} else if (numLados == 9) {
			figura = "ene�gono";
		} else if (numLados == 10) {
			figura = "dec�gono";
		} else if (numLados == 2) {
			figura = "no existe";
		} else {
			figura = "no existe";
		}

		System.out.println("N�mero de lados son : " + numLados + " corresponde al : " + figura);
	}
}
