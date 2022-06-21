package ej12.testeando;

/**
 * 
 * @author Robot
 * @date 19 jun 2022 17:22:20
 */
public class Pag326TestUnitarios {

	/**
	 * Función de clase
	 * 
	 * @return Devuelve si es verdadero
	 */
	public static boolean siempreCierto() {
		return true;
	}
	
	/**
	 * 
	 * @return
	 */
	protected static boolean siempreCiertoSolucion() {
		System.out.println("siempreCierto");
		return true;
	}
	
	/**
	 * 
	 * @return
	 */
	protected static boolean siempreFalsoSolucion() {
		System.out.println("siempreFalso");
		return false;
	}

	/**
	 * Función de clase
	 * 
	 * @return Devuelve si es falso
	 */
	public static boolean siempreFalso() {
		return false;
	}

}
