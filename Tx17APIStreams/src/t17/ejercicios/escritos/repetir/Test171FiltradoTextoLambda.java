package t17.ejercicios.escritos.repetir;

import java.util.function.Predicate;

/**
 * Clase Concreta
 */
public class Test171FiltradoTextoLambda {

    public static void main(String[] args) {

        String[] textos = { "cada", "ajustan", "almacena", "boolean", "añadimos" , "Array" , "edad" };

        System.out.println("1 - Cadena menor de 5 ");
        procesar(textos, s -> s.length() < 5);

        System.out.println("2 - Sin la letra 'e' ");
        procesar(textos, s -> s.indexOf("e") == -1);

        System.out.println("3 - Contiene la 'r' ");
        procesar(textos, s -> s.contains("r"));
    }

    /**
     * 
     * @param textos
     * @param predicado
     */
    public static void procesar(String[] textos, Predicate<String> predicado) {
        for (String texto : textos) {
            if (predicado.test(texto)) {
                System.out.println("Cumple la condición : " + texto);
            }
        }

    }
}
