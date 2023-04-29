package t17.ejercicios.escritos;

import java.util.Arrays;

/**
 * Escribe un programa <br>
 * 
 * Que imprima por pantalla la frase de la lista de argumentos recibidos<br>
 * Que son cadenas largas ( de longitud mayor de cinco) <br>
 * Que son letras ( longitud uno) <br>
 * No llevan la letra 'a'
 * 
 * @author Roboto
 *
 */
public class Test171FiltradoTextoLambda {

	public static void main(String[] args) {

		String [] cadena = {"hola","adios","nuevo","cadena","ejemplo","new branch","nana","mmma","xaxaxa","remota","trabajo"};

			  Arrays.stream(cadena)
			  .filter(s -> s.length() >= 5 && (!s.contains("a")))
			  .forEach(System.out::println);
		
	}
}
