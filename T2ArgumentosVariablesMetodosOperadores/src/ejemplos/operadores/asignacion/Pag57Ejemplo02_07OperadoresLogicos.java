package ejemplos.operadores.asignacion;

public class Pag57Ejemplo02_07OperadoresLogicos {

	public static void main(String[] args) {
		System.out.println("→ 1 ) AND :  " + (siempreCierto() && siempreFalso()));
		System.out.println("→ 2 ) AND :  " + (siempreFalso() && siempreCierto()));
		System.out.println("→ 3 ) OR :  " + (siempreCierto() || siempreFalso()));
		System.out.println("→ 4 ) OR :  " + (siempreFalso() || siempreCierto()));
	}

	/**
	 * Metodo de clase 'static' 
	 * 
	 * @return true
	 */
	private static boolean siempreCierto() {
		System.out.println("• Siempre Cierto");
		return true;
	}

	/**
	 * Metodo de clase 'static' 
	 * 
	 * @return false
	 */
	private static boolean siempreFalso() {
		System.out.println("○ Siempre Falso");
		return false;
	}
}

