package ejemplos.operadores.asignacion;

public class Pag55Ejemplo02_05PrecedenciaDeOperadores {

	public static void main(String[] args) {
		int x = 1, y = 5, z = 10;

		int valor1 = x + y / 2 + z;
		int valor2 = (x + y) / (2 + z);
	}
}
