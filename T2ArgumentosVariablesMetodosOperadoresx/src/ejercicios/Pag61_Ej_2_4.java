package ejercicios;

public class Pag61_Ej_2_4 {

	public static void main(String[] args) {
		String pa1 = String.valueOf(args[0] + "\n π¨ Primer Apellido");
		String apellido1 = String.valueOf(pa1);
		String pa2 = String.valueOf(args[1] + "\n π¨ Segundo Apellido");
		String apellido2 = String.valueOf(pa2);
		String nph3 = String.valueOf(args[2] + "\n π§ Nombre primer hijo");
		String hijo1 = String.valueOf(nph3);
		String nsh4 = String.valueOf(args[3] + "\n π¨ Nombre segundo hijo");
		String hijo2 = String.valueOf(nsh4);
		String nth5 = String.valueOf(args[4] + "\n πΆ Nombre tercer hijo");
		String hijo3 = String.valueOf(nth5);
		String np1 = String.valueOf(args[5] + "\n π¨ Nombre del Padre");
		String padre = String.valueOf(np1);
		String nm1 = String.valueOf(args[6] + "\n π© Primer Apellido");
		String madre = String.valueOf(nm1);

		String apellidosHijos = apellido1 + " " + apellido2;

		System.out.println("---------------------");
		System.out.println("Padre : " + padre + " Apellidos 1 " + apellido1);
		System.out.println("Madre : " + madre + " Apellidos 2 " + apellido2);
		System.out.println("Apellidos 1 " + apellido1 + " Apellidos 2 " + apellido2);
		System.out.println("π§ββοΈ Hijos : ");
		System.out.println("1ΒΊ Hijo " + hijo1 + " " + apellidosHijos);
		System.out.println("2ΒΊ Hijo " + hijo2 + " " + apellidosHijos);
		System.out.println("3ΒΊ Hijo " + hijo3 + " " + apellidosHijos);
		System.out.println("---------------------");
		System.out.println(pa1);
		System.out.println(pa2);
		System.out.println("π§ββοΈ Hijos : ");
		System.out.println(nph3);
		System.out.println(nsh4);
		System.out.println(nth5);
		System.out.println(np1);
		System.out.println(nm1);
	}
}
