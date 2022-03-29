package ejemplos;

public class Pag101Ej04_05_Do_While {

//	Constantes / fields / Campos / ambito
	private static final String FIN = "fin";

	public static void main(String[] args) {
		System.out.println("• Se han recibido " + args.length + " argumentos");

//		El bucle do while itera hasta que se cumple la condición
//		No podemos olvidar controlar la posición
		int i = 0;
		do {
			System.out.println(i + ") " + args[i]);
			i++;
		} while (!args[i].equals(FIN) && i < args.length);
		System.out.println("\"fin\" estaba en la posicion nº " + i);
	}
}
