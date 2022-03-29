package ejemplos;

public class Pag96EjBucleForeach {

	public static void main(String[] args) {

		int contador = 0;
		for (String s : args) {
			System.out.println(++contador + " - " + s);
		}
	}
}
 