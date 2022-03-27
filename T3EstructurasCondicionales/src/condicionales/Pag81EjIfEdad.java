package condicionales;

public class Pag81EjIfEdad {

	public static void main(String[] args) {

		int edad1 = ((int) (Math.random() * 100 + 1));
		System.out.println("○ Soy Mayor de edad 👨 : " + esMayorDeEdad(edad1));

		int edad2 = ((int) (Math.random() * 100 + 1));
		System.out.println("○ Soy Menor de edad 🧒 : " + esMenorDeEdad(edad2));
	}

	public static boolean esMayorDeEdad(int anyos) {
		System.out.println("◘ Mi edad es : " + anyos);
		return anyos >= 18;
	}

	public static boolean esMenorDeEdad(int anyos) {
		System.out.println("◘ Mi edad es : " + anyos);
		return !(anyos > 18);
	}

}
