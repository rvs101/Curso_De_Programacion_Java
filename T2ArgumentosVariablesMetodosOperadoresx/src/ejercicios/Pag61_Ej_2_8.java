package ejercicios;

public class Pag61_Ej_2_8 {

	public static void main(String[] args) {
		String nombre = String.valueOf(args[0]);
		String apellidos1 = String.valueOf(args[1]);
		String apellidos2 = String.valueOf(args[2]);
		String nombrePrimerHijo4 = String.valueOf(args[3]);
		String nombreSegundoHijo5 = String.valueOf(args[4]);
		String nombreTercerHijo6 = String.valueOf(args[5]);
		String nombrePadre = String.valueOf(args[6]);
		String nombreMadre = String.valueOf(args[7]);
		construyeNombreCompleto(nombreMadre, apellidos1, apellidos2);
		pintarNombreCompleto(nombre);
	}
	
	/**
	 * 
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @return Nombre + Apellidos 1 + Apellidos 2
	 */
	private static String construyeNombreCompleto(String nombre, String apellido1, String apellido2) {
		return ("Nombre " + nombre + " Apellido 1 " + apellido1 + " Apellido 2 " + apellido2);
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido1
	 * @param apellidos2
	 */
	private static void pintarNombreCompleto(String nombreCompleto) {
		System.out.println("Nombre de Completo : "  + nombreCompleto);
	}
}
