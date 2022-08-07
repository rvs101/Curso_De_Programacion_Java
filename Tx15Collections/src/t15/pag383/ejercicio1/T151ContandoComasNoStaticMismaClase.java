package t15.pag383.ejercicio1;

/**
 * Cuenta el numero de comas en el texto
 *
 * @author RVS
 *
 * @date 18 jul 2022 - 19:21:44
 *
 */
public class T151ContandoComasNoStaticMismaClase {

	public static void main(String[] args) {
		new T151ContandoComasNoStaticMismaClase().showComa();
	}

	/**
	 * Atributo de instancia - Elemento del tipo String - Almacena una cadena de
	 * texto
	 * 
	 */
	private String cadena = "Con diez cañones por banda, viento en popa a toda vela, no corta el mar, sino vuela un velero bergantín";

	/**
	 * Atributo de instancia - Elemento del tipo int - Almacena un número entero
	 */
	private int contador = 0;

	/**
	 * Metodo de instancia
	 * 
	 * @return Devuelve una cadena de texto almacenada en el atributo de instancia
	 */
	public String getCadena() {
		return cadena;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return Devuelve una variable que almacena un entero
	 */
	public int getContador() {
		return ++contador;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return Devuelve el numero de veces que aparece una coma dentro del texto
	 */
	public int getTotalComa() {
		int contador = 0;
		for (int i = 0; i < getCadena().length(); i++) {
			if (cadena.charAt(i) == ',') {
				contador = getContador();
			}
		}
		return contador;
	}

	/**
	 * Muestra el texto y el numero de comas que contiene
	 */
	public void showComa() {
		System.out.println("• Texto : " + getCadena());
		System.out.println("• Total de comas del texto : " + getTotalComa());
	}

}
