package ejercicios.practico.pag292.ej10_1.provoca.nullpointer;

/**
 * Clase Concreta con el metodo main
 * 
 * @author RVS
 * @time 9 jun 2022 - 23:46:41
 *
 */
public class Pag292EjProvocaNullPointerException {

	public static void main(String[] args) {
		LanzadorNullPointer.lloron();
	}
}

/**
 * Clase Concreta
 * 
 * @author RVS
 * @time 9 jun 2022 - 23:52:59
 *
 */
class LanzadorNullPointer {

	/**
	 * Atributo de instancia
	 */
	private static String saludo;

	/**
	 * Procedimiento de clase
	 * 
	 * <br>
	 * Ejecuta un metodo que lanza una excepción NullPointerException
	 */
	public static void lloron() {
		saludo = null;
		try {
			saludo.toUpperCase();
			System.out.println(saludo);
		} catch (java.lang.NullPointerException npe) {
			System.out.println("• Error " + npe + "\n♦ Cause: " + npe.getCause() + " \n♠ Localized Message: "
					+ npe.getLocalizedMessage() + "\n♣ toString: " + npe.toString());
		}
	}
}
