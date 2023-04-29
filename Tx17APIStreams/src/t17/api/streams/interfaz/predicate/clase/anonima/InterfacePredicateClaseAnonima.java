package t17.api.streams.interfaz.predicate.clase.anonima;

import java.util.function.Predicate;

/**
 * Clase Concreta <br>
 * 
 * Creamos una Clase Anonima
 * 
 * @author Roboto
 *
 */
public class InterfacePredicateClaseAnonima {

	/**
	 * Clase Anonima
	 * 
	 * Tipo Predicate que implementa el metodo de la interfaz 'test()'
	 * 
	 */
	public static Predicate<String> masDe5Caracteres = new Predicate<String>() {

		/**
		 * Reescribo el metodo test() para definirle el criterio
		 * 
		 */
		@Override
		public boolean test(String t) {
			return t.length() > 5;
		}
	};

	/**
	 * Metodo de clase o estatico
	 * 
	 * Ejecutar el metodo test() implementado de la Interfaz Predicate
	 * 
	 * @param cadenas
	 * @param masPredicate
	 */
	public static void procesar(String[] cadenas, Predicate<String> masPredicate) {

		for (String cadena : cadenas) {
//			Invoco el metodo test() para ejecutar la expresion lambda
			if (masPredicate.test(cadena)) {
				System.out.println("Es mayor de 5 : ".concat(cadena));
			} else {
				System.out.println("No es mayor de 5 : ".concat(cadena));
			}
		}
	}

	public static void main(String[] args) {

		String[] cadenas = { "Soy una cadena", "No soy una cadena" };

		InterfacePredicateClaseAnonima.procesar(cadenas, masDe5Caracteres);
	}
}