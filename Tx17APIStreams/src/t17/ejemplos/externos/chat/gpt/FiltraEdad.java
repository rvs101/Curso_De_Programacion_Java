package t17.ejemplos.externos.chat.gpt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Clase Concreta
 */
public class FiltraEdad {

    public static void main(String[] args) {

        System.out.println("Filtrar edades: ");

        List<String> listaString = Arrays.asList(args);

        List<Integer> listaInteger = new ArrayList<>();

        Predicate<Integer> condicion = s -> s.intValue() > 20;

        int i = 0;

        for (String s : listaString) {
            listaInteger.add(Integer.parseInt(s));
            Integer objetoInteger = listaInteger.get(i++);
            procesar(objetoInteger, condicion);
        }
    }

    /**
     * Procedimiento de Clase
     * 
     * Recibe
     * 
     * @param edades - Integer - Recibe un objeto 
     * @param predicateObjeto - Predicate<Integer> - Recibe un objeto de tipo Predicate<Integer> para invocar el metodo test()
     */
    public static void procesar(Integer objetoInteger, Predicate<Integer> predicateObjeto) {
        if (predicateObjeto.test(objetoInteger)) {
            System.out.println("Edad superior a 20 años : " + objetoInteger);
        }
    }
}
