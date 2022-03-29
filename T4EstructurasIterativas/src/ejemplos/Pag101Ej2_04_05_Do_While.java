package ejemplos;

public class Pag101Ej2_04_05_Do_While {

	private static final String FIN = "fin";

	public static void main(String[] args) {
//		!= sera cierto si ambos operandos son distintos
		if (args.length != 0) {
			System.out.println("Se ha recibido " + args.length + " argumentos:");

//			El bucle do while se ejecuta al menos una vez
//			y hasta que se cumple la condición
			int i = 0;
//			Debemos declararla fuera de bucle
//			y hasta que se cumple la condición
			String palabra;
			do {
				palabra = args[i];
				System.out.println(i + ")" + palabra);
				i++;
			} while (!palabra.equals(FIN) && i < args.length);
		} else {
			System.err.println("No se han recibido argumentos");
		}
	}
}
