package test;

public class Pag83Test3_6CuantoValeX {

	public static void main(String[] args) {
		boolean mujer = false;
		String nombre = null;
		
		if (mujer) {
			nombre = "Mario";
		} else {
			nombre = "Maria";
		}
		
		String nombre1 = mujer ? "Maria" : "Mario";
		System.out.println("Solucion 1 → mujer ? \"Maria\" : \"Mario\" : " + nombre1);
		String nombre2 = mujer ? "Mario" : "Maria";
		System.out.println("Solucion 2 → mujer ? \"Mario\" : \"Maria\" : " + nombre2);
		String nombre3 = !mujer ? "Maria" : "Mario";
		System.out.println("Solucion 3 → !mujer ? \"Maria\" : \"Mario\" : " + nombre3);
		String nombre4 = !mujer ? "Mario" : "Maria";
		System.out.println("Solucion 4 → !mujer ? \"Mario\" : \"Maria\" : " + nombre4);
	}
}


