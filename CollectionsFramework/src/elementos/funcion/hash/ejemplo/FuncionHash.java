package elementos.funcion.hash.ejemplo;

import java.util.zip.CRC32;
import java.util.zip.Checksum;

/**
 * 
 *
 * @author RVS
 *
 * @date 17 jul 2022 - 12:24:48
 *
 */
public class FuncionHash {

	/**
	 * 
	 */
	private static String[] cadenas = null;

	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public static String[] getString() {
		return cadenas = new String[] { "pato", "pata", "pala", "palacio", "abracadabra" };
	}

	/**
	 * 
	 * @param cadena
	 */
	public static void getFunctionsHashCode(String cadena) {
		// Obtener bytes de cadena
		byte bytes[] = cadena.getBytes();
		Checksum checksum = new CRC32();
		// Actualizar la suma de comprobación actual con la matriz de bytes especificada
		checksum.update(bytes, 0, bytes.length);
		// Obtener el valor de suma de comprobación actual
		long checksumValue = checksum.getValue();
		System.out.println("CRC32 checksum para cadena • " + cadena + " •  de entrada es: " + checksumValue);
	}

	/**
	 * 
	 * @param cadena
	 */
	public static void getFunctionsHashCodeToHex(String cadena) {
		String a = cadena;
		CRC32 crc = new CRC32();
		crc.update(a.getBytes());
		String enc = Long.toHexString(crc.getValue());
		System.out.println("CRC32 checksum para cadena • " + cadena + " •  de entrada es: " + enc);
	}

	/**
	 * 
	 * @param cadenas
	 */
	public static void showValues(String[] cadenas) {
		System.out.println("• Convertir la cadena con \"CRC32\" con \"checksum\" ");
		for (String string : cadenas) {
			getFunctionsHashCode(string);
		}

		System.out.println("-------------");

		System.out.println(
				"• Convertir la cadena con \"CRC32\" y transformarlo a una cadena \"Hexadecimal\" mediante \"Long.toHexString\" ");
		for (String string : cadenas) {
			getFunctionsHashCodeToHex(string);
		}

	}

	public static void main(String[] args) {

		showValues(getString());

	}
}
