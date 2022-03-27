package ejercicios;

public class Pag61_Ej_2_7_libro {

	public static void main(String[] args) {
		String apellido1 = args[0];
		String apellido2 = args[1];
		String hijo1 = args[2];
		String hijo2 = args[3];
		String hijo3 = args[4];
		String padre = args[5];
		String madre = args[6];
		
		pintaNombreCompleto(construyendoNombreCompleto(padre, apellido1, ""));
		pintaNombreCompleto(construyendoNombreCompleto(madre, apellido2, ""));
		pintaNombreCompleto(construyendoNombreCompleto(hijo1, apellido1, apellido2));
		pintaNombreCompleto(construyendoNombreCompleto(hijo2, apellido1, apellido2));
		pintaNombreCompleto(construyendoNombreCompleto(hijo3, apellido1, apellido2));

	}

	/**
	 * 
	 * @param nombre
	 * @param apellido1
	 * @param apellidos2
	 */
	private static String construyendoNombreCompleto(String nombre, String apellido1, String apellidos2) {
		return " Nombre : " + nombre + " Apellidos : " + apellido1 + " " + apellidos2;
	}

	private static void pintaNombreCompleto(String nombreCompleto) {
		System.out.println(nombreCompleto);
	}
}
