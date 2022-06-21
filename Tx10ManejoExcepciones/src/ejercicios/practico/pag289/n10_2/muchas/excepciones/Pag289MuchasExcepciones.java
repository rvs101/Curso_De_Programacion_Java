package ejercicios.practico.pag289.n10_2.muchas.excepciones;

/**
 * 
 * @author RVS
 * @time 8 jun 2022 - 17:44:56
 *
 */
public class Pag289MuchasExcepciones {

	public static void main(String[] args) {
//		Errores.queMeSalgo();
//		Errores.malditaCasta();
		Errores.siemprePositivoNuncaNegativo();
	}

}

/**
 * 
 * @author RVS
 * @time 8 jun 2022 - 17:43:22
 *
 */
class Errores {

	/**
	 * Lanza la excepción : StringIndexOutOfBoundsException
	 */
	public static void queMeSalgo() {
// Inténtalo aquí : escribe código
		String nom = "Pepe";
		char letra = 0;
		try {
			letra = nom.charAt(10);
// Que lance una IndexOutOfBoundsException
		} catch (java.lang.StringIndexOutOfBoundsException siobe) {
			System.out.println("• Error Principal: " + siobe + "\n• Message: " + siobe.getMessage() + " • Cause: "
					+ siobe.getCause() + " • Localized Message: " + siobe.getLocalizedMessage());
		}
		System.out.println("Letra: " + letra);
	}

	/**
	 * Lanza la excepción : ClassCastException
	 */
	public static void malditaCasta() {
// Inténtalo aquí : escribe código
		Object x = null;
		try {
			x = new Integer(0);
// Que lance una ClassCastException
		} catch (java.lang.ClassCastException e) {
			System.out.println("♦ Error: " + e + " ♦ Localized Message: " + e.getLocalizedMessage() + " ♦ Message: "
					+ e.getMessage() + " ♦ Cause: " + e.getCause());
		}
		System.out.println((String) x);
	}

	/**
	 * Lanza la excepción : RuntimeException
	 */
	public static void siemprePositivoNuncaNegativo() {
// Inténtalo aquí : escribe código
		int[] a = new int[-10];
		try {
			System.out.println(a);
// Que lance una NegativeArraySizeException
		} catch (java.lang.NegativeArraySizeException nase) {
			System.out.println("♠ Error: " + nase + " ♠ Localized Message: " + nase.getLocalizedMessage()
					+ " ♠ Message: " + nase.getMessage() + " ♠ Cause: " + nase.getCause());
		}
		System.out.println("♠ Longitud: " + a.length);
	}

}