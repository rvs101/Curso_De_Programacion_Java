package ejercicios;

public class Pag85Ej3_5SimplificarIfSolucionLibro {

	private static final String CANTA = "CANTA";
	private static final String LADRA = "LADRA";

	public static void main(String[] args) {

		boolean hayArgumentos = args.length > 0;

		if (!hayArgumentos) { // Si no hay longitud
			System.err.println("No tengo argumentos");
			return;
		}

		int numArgumentos = args.length; // Total de argumentos
		String primerArgumento = args[0]; 
		
		if (primerArgumento.equals(CANTA)) { // 1º argumento es "CANTA"
			System.out.println("Un , dos , tres , un pasito palante , Maria");
		} else if (LADRA.equals(primerArgumento)) { // 1º argumento es "LADRA"
//			Negamos la condicion o giramos el > 
			boolean faltaNombre = numArgumentos <= 1; // Si argumentos son menores a 1
			if (!faltaNombre) { // (7) - (8)
				String nombrePerro = args[1];
				System.out.println("Bub bub bub");
				System.out.println("Hola " + nombrePerro);
			} else {
				System.out.println("Grr grr grr");
				System.out.println("No se cómo te llamas");
			}
		} else {
			System.err.println("No sé qué quieres que haga");
		}
	}
}
