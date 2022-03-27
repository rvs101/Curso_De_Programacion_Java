package ejemplos.metodos;

/**
 * 
 * @author Robot
 *
 */
public class Pag52Ejemplo02_03_static {

	public static void main(String[] args) {
		
		int numClientes = Integer.valueOf(args[0]);
		int numEmpleado = Integer.valueOf(args[1]);
		int numSilla = Integer.valueOf(args[2]);
		int numMesas = Integer.valueOf(args[3]);
		int numContratos = Integer.valueOf(args[4]);
		int numReclamaciones = Integer.valueOf(args[5]);

//		Guardamos el resultado del calculo en una variable mediante una clase 'static' externa
		int numPersonas = Pag52EjemploMetodo.suma(numClientes, numEmpleado);
		int numMuebles = Pag52EjemploMetodo.suma(numSilla, numMesas);
		int numExpedientes = Pag52EjemploMetodo.suma(numContratos, numReclamaciones);
		
		System.out.println("Tenemos " + numPersonas + " personas " + numMuebles + " muebles " + numExpedientes + " expedientes");

	}

	/**
	 * Metodo de instancia local
	 * 
	 * @param a
	 * @param b
	 * @return int suma
	 */
	private static int suma(int a, int b) {
		return a + b;
	}
}
