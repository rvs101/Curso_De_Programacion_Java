package rvs.libro.pag17.ejemplos.manejo.datos.basicos;

/**
 * 
 * @author Robot
 *
 */
public class LibroJavaPag17Octales {

	public static void main(String[] args) {
//		Para representar un carácter en su versión octal, 
//		puedes utilizar el formato \ooo, donde "ooo" 
//		son tres dígitos octales que representan 
//		el valor del carácter en la tabla ASCII.
		System.out.println("'" + (char) 97 + "' - usando version : Decimal ");
		System.out.println("'\141' - usando version : Octal ");
		System.out.println("'\u0061' - usando version : Hexadecimal ");
		System.out.println("Valor de 'a' a entero " + ((int) 'a'));
//		
		int aDecimal = 97;
		char aHexaDecimal = '\u0061';
		char aOctal = '\141';

		System.out.println("Decimal: " + ((char) aDecimal) + " HexaDecimal: " + aHexaDecimal + " Octal: " + aOctal);

	}
}
