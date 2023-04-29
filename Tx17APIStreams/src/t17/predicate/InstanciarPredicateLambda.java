package t17.predicate;

import java.util.function.Predicate;

/**
 * Clase Concreta
 */
public class InstanciarPredicateLambda {

    public static void main(String[] args) {

        // Array de String
        String[] textos = { "Hola", "Mundo", "Java", "Predicate" };

        // Creamos la expresión lambda que usaremos para filtrar los elementos
        Predicate<String> masDe4Caracteres = (s -> s.length() > 4);

        // Metodo que recibe el String de objetos y el patrón de filtrado
        procesar(textos, masDe4Caracteres);

    }

    /**
     * Metodo que utiliza el objeto predicado para invocar el metodo test() para
     * filtrar los objetos que se ajustan al patrón de selección
     * 
     * @param textos
     * @param predicado
     */
    public static void procesar(String[] textos, Predicate<String> predicado) {
        for (String texto : textos) {
            // Aplicamos el Predicate a cada elemento del arreglo
            if (predicado.test(texto)) {
                System.out.println("Palabras mayores de 4 caracteres : " + texto);
            }
        }
    }
}
