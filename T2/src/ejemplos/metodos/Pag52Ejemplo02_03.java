package ejemplos.metodos;

/**
 * 
 * @author Robot
 *
 */
public class Pag52Ejemplo02_03 {

	public static void main(String[] args) {
		
		int numClientes = Integer.valueOf(args[0]);
		int numEmpleado = Integer.valueOf(args[1]);
		int numSilla = Integer.valueOf(args[2]);
		int numMesas = Integer.valueOf(args[3]);
		int numContratos = Integer.valueOf(args[4]);
		int numReclamaciones = Integer.valueOf(args[5]);

//		Guardamos el resultado del calculo en una variable
		int numPersonas = suma(numClientes, numEmpleado);
		int numMuebles = suma(numSilla, numMesas);
		int numExpedientes = suma(numContratos, numReclamaciones);
		System.out.println("Tenemos : " + numPersonas + " personas " + numMuebles + " muebles " + numExpedientes + " expedientes");

//		Guardamos el resultado del calculo en una variable mediante una clase 'static' externa
//		int numPersonas = EjemploMetodo.suma(numClientes, numEmpleado);
//		int numMuebles = EjemploMetodo.suma(numSilla, numMesas);
//		int numExpedientes = EjemploMetodo.suma(numContratos, numReclamaciones);
//		System.out.println("Tenemos " + numPersonas_local + " personas " + numMuebles_local + " muebles "
//				+ numExpedientes_local + " expedientes");

	}

	/**
	 * Metodo de instancia local
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int suma(int a, int b) {
		return a + b;
	}
}
