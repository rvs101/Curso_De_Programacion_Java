package t17.predicate;

import java.util.function.Predicate;

public class InstanciarPredicateClaseAnonima {

    public static void main(String[] args) {

        Predicate<String> masDe5Caracteres = new Predicate<String>() {

            @Override
            public boolean test(String t) {
                return (t.length() > 5);
            }

        };

        String Hola = "Hello Friend";

        boolean valor = masDe5Caracteres.test(Hola);

        System.out.println("El valor es : " + valor);

    }
}
