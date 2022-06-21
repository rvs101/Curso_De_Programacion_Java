package ejercicios.practico.pag293.ej10_3.primera.excepcion;

import java.io.UnsupportedEncodingException;

/**
 * 
 * @author RVS
 * @time 10 jun 2022 - 19:37:12
 *
 */
public class Pag293Ej10_3ControlarPrimeraExcepcion {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		System.out.println("• Resultado : " + TodoControlado.cuentaBytes1());
		System.out.println("• Resultado : " + TodoControlado.cuentaBytes2());
	}
}

/**
 * 
 * @author RVS
 * @time 10 jun 2022 - 19:37:09
 *
 */
class TodoControlado {

	/**
	 * 
	 * @return
	 */
	public static int cuentaBytes1() {
		String s = "Me ilusiona tener las excepciones controladas";
		byte[] misBytes = null;
		try {
			misBytes = s.getBytes("Encoding Que No Existe");
		} catch (UnsupportedEncodingException e) {
			System.out.println("• Mensaje: " + e.getMessage() + "\n• Mensaje Localización: " + e.getLocalizedMessage()
					+ "\n• Cadena: " + e.toString() + "\n♦ Excepcion " + e);
			e.printStackTrace();
		}
		return misBytes.length;
	}

	/**
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static int cuentaBytes2() throws UnsupportedEncodingException {
		String s = "Me ilusiona tener las excepciones controladas";
		byte[] misBytes = null;
		misBytes = s.getBytes("Encoding Que No Existe");
		return misBytes.length;
	}
}
