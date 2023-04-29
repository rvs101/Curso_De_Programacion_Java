package t17.pag437.test.expresion.lambda;

/**
 * Clase Concreta y Principal
 */
public class Test17TraduceExpresionLambda {

    /**
     * Metodo estático
     * 
     * Define una CONSTANTE que tiene definido la implementación del metodo de la
     * interfaz mediante una expresión lambda
     */
    public static final Operacion CALCULO = (a, b) -> a * a + 2 * a * b - b * b;

    /**
     * Interface Definida
     */
    interface Operacion {
        // define la cabecera/signatura del metodo 
        double operaciones(double x, double y);

    }

    public static void main(String[] args) {
        System.out.println("Operacion Calculo " + Test17TraduceExpresionLambda.CALCULO.operaciones(11, 2));
    }
}