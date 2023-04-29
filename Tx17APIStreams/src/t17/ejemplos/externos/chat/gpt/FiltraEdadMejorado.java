package t17.ejemplos.externos.chat.gpt;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Clase Concreta
 */
public class FiltraEdadMejorado {

    /**
     * Atributo de clase 
     * 
     * Almacena un valor entero
     */
    private static int i = 0;
    
    /**
     * Atributo de clase
     * 
     * Almacena una List<Integer> de objetos implementada por un ArrayList
     */
    private static List<Integer> listaInteger = new ArrayList<>();
    
    /**
     * Atributo de clase
     * 
     * Almacena una condicion Predicate<Integer> que comprueba los valores que este por encima de 20
     */
    private static Predicate<Integer> condicion = (s -> s.intValue() >= 20);

    /**
     * Método de clase
     * 
     * Se usara para aumentar la cantidad del valor i
     * 
     * @return - int - Devuelve un valor entero
     */
    public static int getInt() {
        return i;
    }

    /**
     * Procedimiento de clase
     * 
     * Recibe un array de String
     * 
     * Los convierte a objetos de tipo Integer
     * 
     * Comprueba el valor de cada objeto Integer de la List<Integer> utilizando el
     * metodo get() y la condición creada por Predicate<Integer>
     * 
     * 
     * @param lista
     * @return
     */
    public static void showExecution(String[] args) {
        for (String s : args) {
            listaInteger.add(Integer.parseInt(s));
            procesar(listaInteger.get(i++), condicion);
        }
    }

    public static void main(String[] args) {
        System.out.println("Filtrar edades: ");
        showExecution(args);
    }

    /**
     * Procedimiento de Clase
     * 
     * Recibe un objeto de tipo Integer y mediante la condicion comprueba si el
     * valor recibido por teclado es mayor de 20 o no
     * 
     * @param edades          - Integer - Recibe un objeto
     * @param predicateObjeto - Predicate<Integer> - Recibe un objeto de tipo
     *                        Predicate<Integer> para invocar el metodo test()
     */
    public static void procesar(Integer objetoInteger, Predicate<Integer> predicateObjeto) {
        if (predicateObjeto.test(objetoInteger)) {
            System.out.println("Edad superior a 20 años : " + objetoInteger);
        } else {
            System.out.println("Edad NO superior a 20 años : " + objetoInteger);
        }
    }
}
