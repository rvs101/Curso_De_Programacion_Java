package condicionales;

public class Pag76EjIfelseUsarUnaLinea {

	public static void main(String[] args) {

		int temp = Integer.valueOf(args[0]);

		if (temp > 0) {
			System.out.println(temp + "ºC positivos");
		} else if (temp == 0) {
			System.out.println(temp + "ºC , ni frio ni calor");
		} else {
			System.out.println(temp + "ºC bajo cero");
		}
	}
}
