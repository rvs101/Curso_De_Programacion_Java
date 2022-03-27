package condicionales;

public class Pag80EjIfElseSwitch {

	public static void main(String[] args) {

		int numLados = (int) (Math.random() * 10 + 1);
		String figura = null;

		if (numLados == 3) {
			figura = "triangulo";
		} else if (numLados == 4) {
			figura = "cuadrilátero";
		} else if (numLados == 5) {
			figura = "pentágono";
		} else if (numLados == 6) {
			figura = "hexágono";
		} else if (numLados == 7) {
			figura = "heptágono";
		} else if (numLados == 8) {
			figura = "octógono";
		} else if (numLados == 9) {
			figura = "eneágono";
		} else if (numLados == 10) {
			figura = "decágono";
		} else if (numLados == 2) {
			figura = "no existe";
		} else {
			figura = "no existe";
		}

		System.out.println("Número de lados son : " + numLados + " corresponde al : " + figura);
	}
}
