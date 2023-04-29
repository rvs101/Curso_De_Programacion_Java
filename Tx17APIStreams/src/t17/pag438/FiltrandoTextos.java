package t17.pag438;

import java.util.function.Predicate;

/**
 * Clase Concreta 
 */
public class FiltrandoTextos {

    /**
     * Procedimiento de Clase
     * 
     * @param textos
     * @param predicado
     */
    public static void procesar(String[] textos, Predicate<String> predicado) {
        for (String n : textos) {
            if (predicado.test(n)) {
                System.out.println(n + " ");
            }
        }

    }

    public static void main(String[] args) {

        System.out.println("Cadenas Larga");
        procesar(args, s -> s.length() > 5);
        System.out.println("--------------");

        System.out.println("Letras menores de 1: ");
        procesar(args, s -> s.length() == 1);
        System.out.println("--------------");
        
        System.out.println("Palabras sin la letra 'a': ");
        procesar(args, s -> s.indexOf('a') == -1);
        System.out.println("--------------");

    }
}