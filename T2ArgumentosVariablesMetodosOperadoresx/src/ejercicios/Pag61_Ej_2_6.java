package ejercicios;

public class Pag61_Ej_2_6 {

	public static void main(String[] args) {
		String nombre = String.valueOf(args[0]);
		String apellidos1 = String.valueOf(args[1]);
		String apellidos2 = String.valueOf(args[2]);
		String nombrePrimerHijo4 = String.valueOf(args[3]);
		String nombreSegundoHijo5 = String.valueOf(args[4]);
		String nombreTercerHijo6 = String.valueOf(args[5]);
		String nombrePadre = String.valueOf(args[6]);
		String nombreMadre = String.valueOf(args[7]);
		getPintarPersonas(nombre, apellidos1, apellidos2, nombrePrimerHijo4, nombreSegundoHijo5, nombreTercerHijo6,
				nombrePadre, nombreMadre);
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido1
	 * @param apellidos2
	 */
	private static void getPintarPersonas(String nombre, String apellido1, String apellidos2, String nombrePrimerHijo4 , String nombreSegundoHijo5 ,
			String nombreTercerHijo6 , String nombrePadre  , String nombreMadre  ) {
		System.out.println(
				" 👨 Nombre: " + nombre + " " + apellido1 + " " + apellidos2 +
				" \n 👱‍♂️ Nombre primer hijo: " +  nombrePrimerHijo4 + apellido1 + " " + apellidos2 +
				" \n 👨‍🦱 Nombre segundo hijo: " + nombreSegundoHijo5 + apellido1 + apellidos2 +
			 " \n 👶 Nombre tercer hijo: " + nombreTercerHijo6 + apellido1 + " " + apellidos2 +
			 " \n 👨 Nombre del Padre: " + nombrePadre + " " + apellido1 + " " + apellidos2 + 
			 " \n 👩 Nombre de la Madre: " + nombreMadre + " " + apellido1 + " " + apellidos2);

	}
}
