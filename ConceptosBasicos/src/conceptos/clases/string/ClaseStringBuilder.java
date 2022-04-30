package conceptos.clases.string;

/**
 * Va añadiendo contenido al objeto de
 * 
 * @author RVS
 * @time 30 abr 2022 - 22:37:44
 *
 */
public class ClaseStringBuilder {

	public static void main(String[] args) {

// El contructor básico crea un buffer sin caracteres que puede almacenar hasta 16 caracteres
//		                               ↓

		String[] strs = { "uno", " dos", " tres", " cuatro" };
		StringBuilder sb = new StringBuilder();
		sb.append("• Añadir Cadena a un objeto de la clase StringBuilder ");
		for (String str : strs) {
			sb.append(str);
		}

			System.out.println(sb);

	}
}
