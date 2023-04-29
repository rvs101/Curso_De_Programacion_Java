package t17.predicate;

import java.util.function.Predicate;

public class InstanciarPredicateReferenciaMetodo {
    public static boolean tieneMasDe5Caracteres(String s) {
        return (s.length() > 5);
    }

    public static void main(String[] args) {

        Predicate<String> masDe5Caracteres = InstanciarPredicateReferenciaMetodo::tieneMasDe5Caracteres;

        String ejemplo = "Hola Mundo";

        boolean resultado = masDe5Caracteres.test(ejemplo);
        
        System.out.println("Es mayor de 5 Caracteres: " + resultado);

    }
}
