package ejercicios.practico.pag293.ej10_2.muchas.excepciones;

/**
 * 
 * @author RVS
 * @time 10 jun 2022 - 13:41:31
 *
 */
public class Pag293Ej102MuchasExcepciones {

	public static void main(String[] args) {
//		LanzadorMultiple.queMeSalgo();
//		LanzadorMultiple.malditaCasta();
		LanzadorMultiple.siemprePositivoNuncaNegativo();
	}
}

/**
 * 
 * @author RVS
 * @time 10 jun 2022 - 13:43:30
 *
 */
class LanzadorMultiple {

	/**
	 * 
	 */
	public static void queMeSalgo() {
//	Inténtalo aquí: escribe cualquier código
//	que lance una IndexOutOfBoundsException
		String[] lista = { "uno", "dos" };
		String tercero = lista[2];
		System.out.println(tercero);
	}

	/**
	 * 
	 */
	public static void malditaCasta() {
//Inténtalo aquí: escribe cualquier código
//que lance una ClassCastException
//		Number numero = new Integer(3);
		Number numero = Integer.valueOf(3);
		Double decimal = (Double) numero;
		System.out.println(decimal);
	}

	/**
	 * 
	 */
	public static void siemprePositivoNuncaNegativo() {
// Intentalo aquí : escribe cualquier código
// que lance una NegativaArraySizeException 	
		String[] lista = new String[-2];
	}
}
