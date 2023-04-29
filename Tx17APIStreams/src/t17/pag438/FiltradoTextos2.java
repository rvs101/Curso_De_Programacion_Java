package t17.pag438;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Clase Concreta
 */
public class FiltradoTextos2 {

    public static void main(String[] args) {
        System.out.println("Cadenas largas: ");
        procesar(args, s -> s.length() > 5);

        System.out.println("Letras : ");
        procesar(args, s -> s.length() == 1);

        System.out.println("Cadenas sin 'a' ");
        procesar(args, s -> !s.equals("a"));

    }

    /**
     * Procedimiento de clase 
     * 
     * @param textos
     * @param predicate
     */
    public static void procesar(String[] textos, Predicate<String> predicado) {
        for (String texto : textos) {
            if (predicado.test(texto)) {
                System.out.println(texto + " ");
            }
        }
        System.out.println();
    }

}
