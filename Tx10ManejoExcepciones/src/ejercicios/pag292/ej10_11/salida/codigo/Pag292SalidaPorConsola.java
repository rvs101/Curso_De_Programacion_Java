package ejercicios.pag292.ej10_11.salida.codigo;

/**
 * 
 * @author RVS
 * @time 9 jun 2022 - 23:34:34
 *
 */
public class Pag292SalidaPorConsola {

	public static void main(String[] args) {

		SalidaConsola sc = new SalidaConsola();
		try {
			sc.metodo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * 
 * @author RVS
 * @time 9 jun 2022 - 23:44:57
 *
 */
class SalidaConsola {

	/**
	 * 
	 * @throws Exception
	 */
	public void metodo() throws Exception {
		System.out.print("A");
		try {
			System.out.print("B");
			throw new Exception();
//			System.out.print("C");
		} catch (RuntimeException re) {
			System.out.print("D");
			throw re;
//			System.out.print("E");
		} catch (Exception e) {
			System.out.print("F");
			throw e;
//			System.out.println("G");
		}
//		System.out.println("H");
	}
}