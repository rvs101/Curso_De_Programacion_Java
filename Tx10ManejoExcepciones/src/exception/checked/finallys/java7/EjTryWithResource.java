package exception.checked.finallys.java7;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 
 * @author RVS
 * @time 26 may 2022 - 12:46:51
 *
 */
public class EjTryWithResource extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		int i = 0;
		try {
			System.out.println(Main.readLine());
		} catch (Exception e) {
			e.printStackTrace();
//• Devuelve una matriz que contiene todas las excepciones que se suprimieron, 
//			normalmente mediante la instrucción try-with-resources, para entregar esta excepción
//• Si no se suprimieron excepciones o si la supresión está deshabilitada, se devuelve una matriz vacia
//			Las escrituras en la matriz devuelta no afectan las futuras llamadas a este método
			for (Throwable t : e.getSuppressed()) {
//			Ver la lista de todos los metodos invocados
				System.out.println((++i) + " - Metodo : " + t);
			}
		}
	}
}

/**
 * 
 * @author RVS
 * @time 26 may 2022 - 13:01:49
 *
 */
class Main {

	private static String path_absolute = "D:\\!Proyectos_Eclipse\\Curso_De_Programacion_Java\\Tx10ManejoExcepciones\\src\\exception\\checked\\finallys\\java7\\file.txt";

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String readLine() throws Exception {
		System.out.println("0");
		String line = null;
		Exception exception = null;
		try (BufferedReader br = new BufferedReader(new FileReader(path_absolute))) {
			System.out.println("1");
			throwException(null);
			line = br.readLine();
		} catch (Exception e) {
			System.out.println("2");
			exception = e;
		} finally {
			System.out.println("3");
			throwException(exception);
		}
		System.out.println("4");
		return line;
	}

	/**
	 * 
	 * @param supressed
	 * @throws Exception
	 */
	private static void throwException(Exception supressed) throws Exception {
		Exception e = new Exception();
		if (supressed != null) {
			// método Throwable.getSuppressed() se obtienen las excepciones enmascaradas o
			// suprimidas en la sentencia try-with-resources.
			e.addSuppressed(supressed);
		}
		throw e;
	}
}
