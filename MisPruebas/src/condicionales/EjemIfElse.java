package condicionales;

/**
 * Cuando se ejecutan 1 condicional el flujo de ejecución solo accede a una los
 * de los condiciones y no ejecuta los demas opciones
 * 
 * El flujo de ejecución solo entra en un condicional "if" o en su defecto "else
 * if" y continua con su ejecución sin entrar en los otros "if" o "else if"
 * 
 * @author RVS
 *
 */
public class EjemIfElse {

	public static void main(String[] args) {

		String si = "si";

		if (si.equals("si")) {
			System.out.println("• Se ejecuto 1º " + si);
		} else if (si.equals("si")) {
			System.out.println("○ Se ejecuto 2º " + si);
		} else if (("si").equals(si)) {
			System.out.println("◘ Se ejecuto 3º " + si);
		} else if (si.equals("si")) {
			System.out.println("🛑 Se ejecuto 4º " + si);
		} else if (si.equals("si")) {
			System.out.println("🕗 Se ejecuto 5º " + si);
		}
	}
}
