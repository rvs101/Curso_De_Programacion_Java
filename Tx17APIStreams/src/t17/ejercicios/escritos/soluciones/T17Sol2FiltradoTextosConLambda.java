package t17.ejercicios.escritos.soluciones;

import java.util.Arrays;

/**
 * 
 * @author Roboto
 *
 */
public class T17Sol2FiltradoTextosConLambda {
	 

	public static void main(String[] args) {

		String[] argss = {"a" , "bb" , "ccc" , "dddd" , "eeeee" , "fffffff" , "ggggggggg"};
		
		System.out.println("Cadenas Largas: ");
		Arrays.stream(argss).filter(s -> s.length() > 5 )
							.forEach(arg -> System.out.println(" " + arg ));
		
		System.out.println("Cadenas igual a 1: ");
		Arrays.stream(argss).filter(s -> s.length() == 1 )
							.forEach(arg -> System.out.println(arg + " "));	
		
		System.out.println("Cadenas sin a 1º : ");
		Arrays.stream(argss).filter(s -> !s.contains("a"))
		.forEach(arg -> System.out.println(arg + " "));	
		
		System.out.println("Cadenas sin a 2º : ");
		Arrays.stream(argss).filter(s -> s.indexOf('a') != 1)
		.forEach(arg -> System.out.println(arg + " "));	
		
	}

}
