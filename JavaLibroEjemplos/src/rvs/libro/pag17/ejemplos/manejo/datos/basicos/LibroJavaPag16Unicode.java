package rvs.libro.pag17.ejemplos.manejo.datos.basicos;

/**
 * Clase Concreta <br>
 * <br>
 * Muestra caracteres Unicode <br>
 * <br>
 * 
 * @author Robot
 *
 */
public class LibroJavaPag16Unicode {

	public static void main(String[] args) {

		String myUnicodeSymbol = "\\u05D0";
		System.out.println("Unicode : " + myUnicodeSymbol);

		String s1 = "Hello " + new String(Character.toChars(0x1F604));
		System.out.println(s1);
		
		String s2 = "Hello " + new String(Character.toChars(0x1F605));
		System.out.println(s2);
		
	}
}