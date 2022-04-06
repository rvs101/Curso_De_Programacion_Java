package ejemplos.operadores.asignacion;

/**
 * 
 * @author Robot
 *
 */
public class Pag55Ejemplo02_05IncrementoDecremento {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 7;
		System.out.println("1 ) n: " + n); // valor entero
		System.out.println("2 ) ++n: " + ++n); // incrementa el valor y lo asigna a la variable
		System.out.println("3 ) n: " + n); // muestra el resultado
// Invoca el número y asigna el incremento
// pero no lo muestra hasta la siguiente línea de ejecución
		System.out.println("4 ) n++: " + n++);
//		Aquí muestra el valor real del postincremento
		System.out.println("5 ) n: " + n);
	}
}
