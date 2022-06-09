package ejercicios.pag289.n101.nullpoint;

/**
 * 
 * @author RVS
 * @time 8 jun 2022 - 17:43:35
 *
 */
public class Pag289numero10_1 {

	public static void main(String[] args) {

		LanzarNullPointerException.lloron();

	}

}

/**
 * 
 * @author RVS
 * @time 8 jun 2022 - 17:43:44
 *
 */
class LanzarNullPointerException {

	/**
	 * Metodo lanzar un Null Pointer Exception
	 */
	public static void lloron() {
		Empleado n = null;
		try {
			n.setSueldo(10);
		} catch (NullPointerException npe) {
			System.out.println("• Excepcion: " + npe + "\n• GetMessage: " + npe.getMessage() + " • Cause: "
					+ npe.getCause() + " • LocalizedMessage: " + npe.getLocalizedMessage());
		}
	}

}

/**
 * 
 * @author RVS
 * @time 8 jun 2022 - 17:43:52
 *
 */
class Empleado {

	/**
	 * 
	 */
	private int sueldo;

	/**
	 * 
	 * @param sueldo
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}