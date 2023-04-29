
package t17.ejercicios.test;

/**
 * 
 * @author Roboto
 *
 */
public class Test171TraduceExpresionLambda {

	/**
	 * Metodo estático
	 * 
	 * Define una CONSTANTE que tiene definido la implementación del metodo de la
	 * interfaz mediante una expresión lambda
	 */
	public static final Operacion CALCULO = (a, b) -> a * a + 2 * a * b - b * b;

	/**
	 * Interface Definida
	 */
	interface Operacion {
		// define la cabecera/signatura del metodo
		double operaciones(double x, double y);

	}

	public static void main(String[] args) {
		System.out.println("Operacion Calculo " + Test171TraduceExpresionLambda.CALCULO.operaciones(11, 2));

	}
}
