package condicionales;

public class Pag80EjSwitch {

	public static void main(String[] args) {

		int numLados = (int) (Math.random() * 10 + 1);
		String figura = null;

		switch (numLados) {
		case 3:
			figura = "triangulo";
			break;
		case 4:
			figura = "cuadril�tero";
			break;
		case 5:
			figura = "pent�gono";
			break;
		case 6:
			figura = "hex�gono";
			break;
		case 7:
			figura = "hept�gono";
			break;
		case 8:
			figura = "oct�gono";
			break;
		case 9:
			figura = "ene�gono";
			break;
		case 10:
			figura = "dec�gono";
			break;
		default:
			figura = "figura no encontrada";
			break;
		}

		System.out.println("Numero de lados : " + numLados + " figura: " + figura);
	}

}
