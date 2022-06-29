package string.basico;

import java.util.Formatter;

/**
 * T14 Datos en Java
 * 
 * @author Robot
 * @date 28 jun 2022 18:33:37
 */
public class Tx14StringBasicosStatic {

	public static void main(String[] args) {

		System.out.println(String.format("%s -> %f", "PI", Math.PI));
		System.out.println(String.format("%s = %f", "PI", Math.PI));
		System.out.println(String.format("%s = %d", "joe", 35));

		StringBuilder sbuf = new StringBuilder();
		Formatter fmt = new Formatter(sbuf);
		fmt.format("PI = %f %n", Math.PI);
		System.out.print("Ejemplo de format usando StringBuilder : " + sbuf.toString());
		System.out.println("Añade un caracter indicado al final de la cadena de elementos que le indiquemos separada por comas "
						+ String.join("<", "1", "2", "3"));
		
		System.out.println(""+String.valueOf(false));
	}
}
