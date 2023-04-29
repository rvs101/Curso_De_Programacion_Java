package t17.api.streams.interfaz.predicate;

import java.util.function.Predicate;

/**
 * Clase Concreta <br>
 * 
 * Creamos
 * 
 * @author Roboto
 *
 */
public class InterfacePredicateEj2 {

	/**
	 * Procedimiento de clase / estático
	 * 
	 * @param textos    - String [] - Recibe una cadena de texto
	 * @param predicado - Interfaz Predicate<String> - Recibe una expresión lambda
	 */
	public static void procesar(String[] textos, Predicate<String> predicado) {
//
		for (String texto : textos) {
// Invocamos el metodo 'test' que comprueba si se cumple la condición de la expresión lambda
			if (predicado.test(texto)) {
				System.out.println("Se cumple : " + texto);
			} else {
				System.out.println("No se cumple : " + texto);
			}
		}
	}

	public static void main(String[] args) {

		String[] textos = { "Hola", "Mundo", "Java", "Predicate" };

// Creamos la interface Predicate 
//		Define la condición el cual comprueba que la cadena tenga más 4 caracteres		
//		                                                      ↓
		Predicate<String> expresionLambdaCondicion = (s -> s.length() > 4);
//		                                              ↓
//		                                             Hace referencia al String
//		
//		
//		        Texto Recibido
//		           ↓
//		           ↓     Expresión Lambda
//		           ↓             ↓
		procesar(textos, expresionLambdaCondicion);

		
		
	}
}