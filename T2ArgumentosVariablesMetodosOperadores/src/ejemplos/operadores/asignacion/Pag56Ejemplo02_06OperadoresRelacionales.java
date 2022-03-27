package ejemplos.operadores.asignacion;

public class Pag56Ejemplo02_06OperadoresRelacionales {

	public static void main(String[] args) {

		int x = 3;
		int y = 3;

		System.out.println("• Comparación de tipos primitivos int");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("x == y ? " + (x == y)); // true
		System.out.println("x != y ? " + (x != y)); // false
		
		String a = new String("hola");
		String b = new String("hola");

		System.out.println("a: " + a);
		System.out.println("a: " + b);

		
		System.out.println("• Comparación de objetos tipo String");
		System.out.println("Objeto String → a == b?  " + (a == b));
		System.out.println("Objeto String → a != b? " + (a != b));

	}
}
