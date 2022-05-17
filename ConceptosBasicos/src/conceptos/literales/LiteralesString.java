package conceptos.literales;

/**
 * Literales : Valores que almacenan las variables : "elementos a la izquierda
 * del igual"
 * 
 * @author RVS
 * @time 17 may 2022 - 18:53:04
 *
 */
public class LiteralesString {

	public static void main(String[] args) {
//		                   VALOR LITERAL
//                              ↓
		String literal1 = "Hola Mundo";
		System.out.println("Literal String : " + literal1);
		String literal2 = "Bienvenido a Java";
		System.out.println("Literal String : " + literal2);
		String literal3 = "Espa\u00F1a";
		System.out.println("Literal String : " + literal3);
		String literal4 = "Hola Mundo";
		System.out.println("Literal String : " + literal4);

	}
}
