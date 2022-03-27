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
			figura = "cuadrilátero";
			break;
		case 5:
			figura = "pentágono";
			break;
		case 6:
			figura = "hexágono";
			break;
		case 7:
			figura = "heptágono";
			break;
		case 8:
			figura = "octógono";
			break;
		case 9:
			figura = "eneágono";
			break;
		case 10:
			figura = "decágono";
			break;
		default:
			figura = "figura no encontrada";
			break;
		}

		System.out.println("Numero de lados : " + numLados + " figura: " + figura);
	}

}
