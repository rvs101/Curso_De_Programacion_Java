package ejercicios.pag289.n103.controlando.primera.excepcion;

public class Pag289ControlandoPrimeraExcepcion {

	public static void main(String[] args) {

		System.out.println("♦ Resultado: " + TodoControlado.cuentaBytes());
	}
}

/**
 * 
 * @author RVS
 * @time 8 jun 2022 - 18:45:21
 *
 */
class TodoControlado {

	/**
	 * 
	 * @return
	 */
	public static int cuentaBytes() {
		String s = "Me ilusiona tener las expresiones controladas";
		byte[] misBytes = null;
		try {
			misBytes = s.getBytes();
		} catch (ClassCastException cce) {
			System.out.println("♦ Error: " + cce + " ♦ Localized Message: " + cce.getLocalizedMessage() + " ♦ Message: "
					+ cce.getMessage() + " ♦ Cause: " + cce.getCause());
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("♦ Error: " + aiob + " ♦ Localized Message: " + aiob.getLocalizedMessage()
					+ " ♦ Message: " + aiob.getMessage() + " ♦ Cause: " + aiob.getCause());
		} catch (NullPointerException npe) {
			System.out.println("♦ Error: " + npe + " ♦ Localized Message: " + npe.getLocalizedMessage() + " ♦ Message: "
					+ npe.getMessage() + " ♦ Cause: " + npe.getCause());
		} catch (Exception e) {
			System.out.println("♦ Error: " + e + " ♦ Localized Message: " + e.getLocalizedMessage() + " ♦ Message: "
					+ e.getMessage() + " ♦ Cause: " + e.getCause());
		}
		return misBytes.length;
	}
}
