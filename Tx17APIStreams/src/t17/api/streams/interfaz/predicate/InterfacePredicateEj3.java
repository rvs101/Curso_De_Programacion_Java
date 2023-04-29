package t17.api.streams.interfaz.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Clase Concreta <br>
 * 
 * Creamos
 * 
 * @author Roboto
 *
 */
public class InterfacePredicateEj3 {

	/**
	 * Creo la Lista de Personas
	 */
	public static List<Persone> persones = Arrays.asList(new Persone("Juan", 25), 
														 new Persone("Ana", 18),
														 new Persone("Pedro", 30), 
														 new Persone("Alejandro", 30), 
														 new Persone("Lucia", 15));
// ATRIBUTO DE CLASE  → → → → → → → → → → → → → → → → → → → → Creo la Expresiones Lambdas
//	                                                                     ↓
	public static Predicate<Persone> objetoPersona2 = (p -> (p.getNombre().length() > 5));

	/**
	 * Procedimiento de clase o estático <br>
	 * Con una expresion lambda defino el criterio de filtracion <br>
	 */
	public static void nombreMenos5Palabras() {
//			                                       Expresión Lambda
//		       		                                          ↓
		Predicate<Persone> objetoPersona1 = (p -> (p.getNombre().length() < 5));
//		 												  Convertir en 'stream'
//		Creo el STREAM									     ↓
		List<Persone> personasFiltradasPorEdad = persones.stream()
//				                                          Filtro(Condición)
//				                                             ↓
														.filter(objetoPersona1)
//														 Se utiliza para recolectar los elementos 
//														 de un flujo (stream) en una lista
//														 Método de reducción que acumula los 
//														 elementos del flujo en una nueva lista
//														 porque los valores fueron creados a partir 
//														 de la Interfaz List<Persone>
														.collect(Collectors.toList());	
		personasFiltradasPorEdad.forEach(p -> System.out.println("Nombres : ".concat(p.getNombre())));
	}

	public static void main(String[] args) {
// UTILIZANDO ATRIBUTO DE CLASE	
		System.out.println("------ Nombre Mas 5 Palabras -----");
//		Creo el STREAM
		List<Persone> nombreMas5Palabras = persones.stream()
													.filter(objetoPersona2)
													.collect(Collectors.toList());
		nombreMas5Palabras.forEach(p -> System.out.println("Nombres : ".concat(p.getNombre())));
		
// UTILIZANDO UN METODO DE CLASE
		InterfacePredicateEj3.nombreMenos5Palabras();
		
// DECLARADO EN UNA SOLA LINEA
		System.out.println("------ Edad Mayor 20 -----");
//      Creo la Expresion Lambda
		Predicate<Persone> edadMayor20 = (p -> p.getEdad() > 20);
//		Creo el STREAM
		List<Persone> personasFiltradasPorEdad = persones.stream()
														  .filter(edadMayor20)
														  .collect(Collectors.toList());
		personasFiltradasPorEdad.forEach(p -> System.out.println("Nombres : ".concat(p.getNombre())));

// DECLARADO EN UNA SOLA LINEA
		System.out.println("----- Edad Menor 20 ------");
//      Creo la Expresion Lambda
		Predicate<Persone> edadMenor20 = (p -> p.getEdad() < 20);
//		Creo el STREAM
		List<Persone> personasFiltradasPorNombre = persones.stream()
														   .filter(edadMenor20)
														   .collect(Collectors.toList());
		personasFiltradasPorNombre.forEach(p -> System.out.println("Nombres : ".concat(p.getNombre())));

		System.out.println("----- Nombre Menos 5 Palabras ------");

	}
}