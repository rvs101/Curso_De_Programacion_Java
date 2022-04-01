package ejemplos;

public class Pag99While_Ej04_04 {

	private static final String FIN = "fin";

	public static void main(String[] args) {
		System.out.println("Se han recibido " + args.length + " argumentos");

//	El bucle while itera hasta que se cumple la condicion 
//	No podemos olvidar controlar la posicion
		int i = 0;
//  CUIDADO !!! No podemos comparar strings con ==
		while (i < args.length && !args[i].equals(FIN)) {
			System.out.println(i + ")" + args[i]);
			i++;
		}
		System.out.println("\"fin\" estaba en la posicion n " + i);
	}
}
