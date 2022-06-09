package ejemplo.practico.pag283.memoria.historica;

/**
 * 
 * @author RVS
 * @time 6 jun 2022 - 14:04:02
 *
 */
public class Pag283MemoriaHistorica {

	/**
	 * No añadimos la variable 'npe' al catch
	 * 
	 * @throws Exception
	 */
	public static void lanzarExcepcionSinDetalle() throws Exception {
		Nulo3 nulo = null;
		try {
			nulo.loQueSea();
		} catch (NullPointerException npe) {
// Le pasamos la variable 'npe' a la Excepción original para que se muestre el error 
			throw new Exception();
		}
	}

	/**
	 * añadimos la variable 'npe' al catch
	 * 
	 * @throws Exception
	 */
	public static void lanzarExcepcionConDetalle() throws Exception {
		Nulo3 nulo = null;
		try {
			nulo.loQueSea();
		} catch (NullPointerException npe) {
// Le pasamos la variable 'npe' a la Excepción original para que se muestre el error 
			throw new Exception(npe);
		}
	}

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
//		lanzarExcepcionSinDetalle();
		lanzarExcepcionConDetalle();

	}
}

/**
 * Clase concreta para generar el error
 * 
 * @author RVS
 * @time 6 jun 2022 - 14:03:57
 *
 */
class Nulo3 {

	public Nulo3() {

	}

	/**
	 * 
	 */
	public void loQueSea() {
		System.out.println("Lo que sea");
	}
                                                                                                                                                                                                                                                                                                                          
	/**
	 * 
	 */
	public void otraCosa() {
		System.out.println("Otra cosa");
	}

}