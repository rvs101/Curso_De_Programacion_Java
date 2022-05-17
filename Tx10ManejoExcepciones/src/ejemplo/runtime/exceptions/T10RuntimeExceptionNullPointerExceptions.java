package ejemplo.runtime.exceptions;

/**
 * Todo en Java son Punteros
 * 
 * Error al intentar acceder a una posición de memoria que no referencia ningún
 * puntero
 * 
 * @author RVS
 * @time 17 may 2022 - 23:05:08
 *
 */
public class T10RuntimeExceptionNullPointerExceptions {

	public static void main(String[] args) {

//		La variable del tipo Object no apunta a ningún sitio
		Object nada = null;
		nada.toString(); // Java.lang.NullPointerException :
//		System.out.println(nada);
	}
}
