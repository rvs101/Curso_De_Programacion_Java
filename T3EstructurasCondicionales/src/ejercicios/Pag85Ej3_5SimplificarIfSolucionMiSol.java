package ejercicios;

public class Pag85Ej3_5SimplificarIfSolucionMiSol {

	private static final String CANTA = "CANTA";
	private static final String LADRA = "LADRA";

	public static void main(String[] args) {

		if (args != null) {
			boolean hayArgumentos;
			if (args.length > 0) {
				hayArgumentos = true;
//			} 
//				else {
////				hayArgumentos = false;
//			}
//			if (!hayArgumentos) {
//				System.err.println("No tengo argumentos");
//				return;
//			}
				if (hayArgumentos) {
					int numArgumentos = args.length;
					String primerArgumento = args[0];

					if (primerArgumento.equals(CANTA)) {
						System.out.println("Un , dos , tres , un pasito palante , Maria!");
					}

					else if (LADRA.equals(primerArgumento)) {
						boolean faltaNombre;
						String nombrePerro = "";

						if (numArgumentos > 1) {
							faltaNombre = false;
							nombrePerro = args[1];
							System.out.println("Bub bub bub");
						} else {
							faltaNombre = true;
							System.out.println("Grr grr grr");
						}
//					if (faltaNombre) {
//						System.out.println("No sé cómo te llamas");
//					} else {
//						System.out.println("Hola " + nombrePerro);
//					}
//				} else {
//					System.err.println("No sé qué quieres que haga");
//				}
					}
				} else {
					System.err.println("Necesito argumentos");

				}
			}
		}
	}
}
