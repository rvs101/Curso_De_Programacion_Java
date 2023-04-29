package t17.ejercicios.escritos.repetir;

import java.util.Arrays;

/**
 * Clase Concreta
 */
public class Test172FiltradoTextosStreamsSinMetodos {

    public static void main(String[] args) {
        System.out.println("Cadenas Largas: ");

        String [] argumentos = {"a" , "ajustan" , "argumentos" , "arreglo" , "añadimos" , "via"};

        System.out.println("1 - Mayor de 5 : ");
        Arrays.stream(argumentos).filter(s -> s.length() > 5)
                                 .forEach(arg -> System.out.print(arg + " "));
        System.out.println();
        
        System.out.println("2 - No hay letras 'e' ");
        Arrays.stream(argumentos).filter(s -> s.indexOf("e") ==  -1)
                                 .forEach(arg -> System.out.print(arg + " "));
        System.out.println();
        
        System.out.println("3 - Longitud es de 3: ");
        Arrays.stream(argumentos).filter(s -> s.length() == 3)
                                 .forEach(arg -> System.out.print(arg + " "));
        System.out.println();
        
    }
}
