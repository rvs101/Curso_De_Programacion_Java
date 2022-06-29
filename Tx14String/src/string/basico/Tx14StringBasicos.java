package string.basico;

/**
 * T14 Datos en Java
 * 
 * @author Robot
 * @date 28 jun 2022 18:33:37
 */
public class Tx14StringBasicos {

	public static void main(String[] args) {

		String cadena1 = "cadena";
		String cadena2 = "anedac";
		String cadena3 = "cadena-cadena1-cadena2";
		String [] arrayCadena = null;
		System.out.println("String : " + cadena1);
		System.out.println("- cadena1.length → Devuelve la longitud cadena : " + cadena1.length());
		System.out.println("- cadena1.isEmpty → Devuelve si esta vacia la cadena 1º : " + cadena1.isEmpty());
		System.out.println("- cadena1.length() == 0 → Devuelve si esta vacia la cadena 2º : " + (cadena1.length() == 0));
		System.out.println("- cadena1.substring(inicio) → Devuelve la subcadena como nuevo objeto : " + (cadena1.substring(2)));
		System.out.println("- cadena1.substring(inicio , fin)  → Devuelve la cadena : " + (cadena1.substring(1, 5)));
		System.out.println("- cadena1.lastIndexOf(e) → Devuelve la posición de la ultima concurrencia " + (cadena1.lastIndexOf('e')));
		System.out.println("- cadena1.toUpperCase() → Devuelve la cadena en mayuscula : " + (cadena1.toUpperCase()));
		System.out.println("- cadena1.toLowerCase() → Devuelve la cadena en minuscula : " + (cadena1.toLowerCase()));
		System.out.println("- cadena1.trim() → Devuelve la cadena quitando delimitadores : " + (cadena1.trim()));
		System.out.println("- cadena1.charAt(3) → Devuelve el caracter de la posicion indicada : " + (cadena1.charAt(3)));
		System.out.println("- cadena1.equals(cadena2) → Devuelve el caracter de la posicion indicada : " + (cadena1.equals(cadena2)));
		System.out.println("- cadena1.equalsIgnoreCase(cadena2) → Compara el String con el nuestro sin distinguir mayusculas o minusculas : " + (cadena1.equalsIgnoreCase(cadena2)));
		System.out.println("- cadena1.replace('a','i') → remplaza dentro de la cadena el caracter del 1º parametro por los del 2º parametro  : " + (cadena1.replace('a','i')));
		arrayCadena = cadena3.split("-");
		System.out.println("- cadena3.split() → Fragmenta el String dependiendo del simbolo añadido en la expresión regular : " + (arrayCadena[0]));
		System.out.println("- cadena3.split() → Fragmenta el String dependiendo del simbolo añadido en la expresión regular : " + (arrayCadena[1]));
		System.out.println("- cadena3.split() → Fragmenta el String dependiendo del simbolo añadido en la expresión regular : " + (arrayCadena[2]));

	}
}
