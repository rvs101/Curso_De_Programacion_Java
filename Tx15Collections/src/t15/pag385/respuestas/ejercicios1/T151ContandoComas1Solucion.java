package t15.pag385.respuestas.ejercicios1;

/**
 * 
 * @date 13 oct 2022 20:51:20
 * 
 * @author RVS
 *
 */
public class T151ContandoComas1Solucion {

	/**
	 * CONSTANTE tipo String
	 */
	private static final char COMA = ',';

	/**
	 * CONSTANTE
	 */
	public static final String TEXTO = "Con diez cañones por banda, "
			+ "viento en popa a toda vela, no corta el mar, sino vuela " + "un velero bergatín";

	/**
	 * 
	 * 
	 * @param texto
	 * @return int - Devuelve el número de comas encontradas en el archivo
	 */
	private static int cuentaComas(String texto) {
// Almacena el número de comas
		int res = 0;
// indexOf() -> Devuelve -1 si encuentra el caracter 'coma -> , '
// 'texto' almacena toda la cadena y le añadimos el metodo 'indexOf' para encontrar 'coma , '		
		int pos = texto.indexOf(COMA);
// Mientras no aparezca un caracter 'coma -> ,' dara como resultado distinto de -1 
		while (pos != -1) {
			res++;
// indexOf(COMA , pos + 1) -> Mismo metodo que el anterior pero continuando en la posición en la que se encontro		q
			pos = texto.indexOf(COMA, pos + 1);
		}
// Devuelve el número de comas		
		return res;
	}

	public static void main(String[] args) {

		System.out.println("Lanzar ejercicio: ");
		System.out.println(cuentaComas(TEXTO));

	}

}
