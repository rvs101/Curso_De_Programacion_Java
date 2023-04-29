package t17.ejercicios.escritos.soluciones;

import java.util.function.Predicate;

/**
 * Escribe un programa <br>
 * 
 * Que imprima por pantalla la frase de la lista de argumentos recibidos<br>
 * Que son cadenas largas ( de longitud mayor de cinco) <br>
 * Que son letras ( longitud uno) <br>
 * No llevan la letra 'a'
 * 
 *
 */
public class T17SolFiltradoTextosConLambda {
	
	/**
	 * Procedimiento de clase <br>
	 * 
	 * Recibe una cadena de texto en forma de String
	 * 
	 * Recorre cada uno de los elementos de las letras que componen el String <br>
	 * 
	 * Comprueba cada letra si se ajusta al patrón indicado mediante la expresión
	 * lambda<br>
	 * 
	 * Muestra por pantalla los valores que superen el filtro de expresion lambda
	 * <br>
	 * 
	 * @param textos    - String [] - Recibe una cadena de texto que lo transforma
	 *                  en un array de String
	 * 
	 * @param predicado - Representa un predicado (función booleana) de un
	 *                  argumento.
	 */
	public static void procesar(String[] textos, Predicate<String> predicado) {
		for (String n : textos) {
// Objeto 'predicado'
//			Si se cumple la condición 'n'
			if (predicado.test(n)) {
//				Muestra el valor
				System.out.print(n + " ");
			}
		}
	}

	public static void main(String[] args) {

		String[] args1 = { "ab", "c", "defg", "hijk", "lmñn", "opqrst", "uvwxyz" };

		System.out.println("Cadenas largas: ");
		procesar(args1, s -> s.length() > 5);
		
		System.out.println("Letras menores de 1: ");
		procesar(args1, s -> s.length() == 1);
		
		System.out.println("Sin a: ");
		procesar(args1, s -> s.indexOf('a') == -1);
	}

}
