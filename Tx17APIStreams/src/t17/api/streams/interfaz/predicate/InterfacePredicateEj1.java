package t17.api.streams.interfaz.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 
 * @author Roboto
 *
 */
public class InterfacePredicateEj1 {

	public static void main(String[] args) {

//		Creamos una List<Personas> de objetos y la convertimos en 
		List<Persona> personas = Arrays.asList(
				new Persona("Juan", 25), 
				new Persona("Ana", 18),
				new Persona("Pedro", 30), 
				new Persona("Lucia", 15));

//	Creamos el objeto 'edadMayor20' de Predicate<T>
//	que define la condicion de la edad la cual sea mayor a 20 años
//	
// Interfaz Predicate<T> 	
//	     ↓
//	     ↓                             Condicion del Predicado
//		 ↓                             	(Expresion Lambda)
//	     ↓                                      ↓
		Predicate<Persona> edadMayor20 = (p -> p.getEdad() > 20);

//		Filtramos la lista de personas usando el Predicate
		List<Persona> personasFiltradas = personas.stream()
//				                                  Incluimos la expresión lambda al metodo filter 
//				                                  que acepta por argumento un objeto de la interfaz Predicate
												  .filter(edadMayor20)
//												  Es una operación de reducción que se 
//												  utiliza para acumular elementos en una colección, 
//												  en este caso una lista
//												  se usa después de una operación de flujo (stream) 
//												  para recopilar los elementos del flujo en una lista. Por ejemplo:
												  .collect(Collectors.toList());
		
//		Imprimir las personas filtradas
		personasFiltradas.forEach(p -> System.out.println(p.getNombre()));
	}
}

/**
 * Clase Concreta
 */
class Persona {

	/**
	 * Atributos de Instancia
	 * 
	 * Almacena el nombre
	 */
	private String nombre;

	/**
	 * Atributos de Instancia
	 * 
	 * Almacena la edad
	 */
	private int edad;

	/**
	 * Constructor por defecto
	 */
	public Persona() {
		this.nombre = null;
		this.edad = 0;
	}

	/**
	 * Constructor Parametrizado
	 * 
	 * @param nombre - String - Establece el valor del nombre
	 * @param edad   - int - Establece el valor de la edad
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
}
