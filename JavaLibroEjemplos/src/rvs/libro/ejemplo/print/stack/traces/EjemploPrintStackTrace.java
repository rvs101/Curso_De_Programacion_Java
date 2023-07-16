package rvs.libro.ejemplo.print.stack.traces;

public class EjemploPrintStackTrace {

	public static void main(String[] args) {
		int resultado;
		try {
// Provocar una excepcion dividiendo por cero
			resultado = 1 / 0;
// Arroja una excepción en caso condición aritmética excepcional 			
		} catch (ArithmeticException e) {
// Imprimir la traza de pila "Heap" de la excepción
			e.printStackTrace();
		}
	}
}
