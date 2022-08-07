package t15.pag383.ejercicio1;

/**
 * Cuenta el numero de comas en el texto
 *
 * @author RVS
 *
 * @date 18 jul 2022 - 19:21:44
 *
 */
public class T151ContandoComasNoStaticClaseDiferente {

	public void main(String[] args) {
		ContarComas metodo = new ContarComas();
		metodo.showComa();
	}
}

/**
 *
 *
 * @author RVS
 *
 * @date 18 jul 2022 - 19:56:17 
 *
 */
class ContarComas {

	/**
	 * 
	 */
	private String cadena = "Con diez cañones por banda, viento en popa a toda vela, no corta el mar, sino vuela un velero bergantín";

	/**
	 * 
	 */
	private int contador = 0;

	/**
	 * 
	 * @return
	 */
	public String getCadena() {
		return cadena;
	}

	/**
	 * 
	 * @return
	 */
	public int getContador() {
		return ++contador;
	}

	/**
	 * 
	 * @return
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
	 * 
	 */
	public void showComa() {
		System.out.println("• Texto : " + getCadena());
		System.out.println("• Total de comas del texto : " + getTotalComa());
	}
}
