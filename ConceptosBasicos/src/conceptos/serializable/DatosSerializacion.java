package conceptos.serializable;

import java.io.Serializable;

/**
 * ♦ Fragmenta un objeto en <b>bytes</b> para poderlos transmitir entre los
 * distintos medios
 * 
 * Convertir un <b>objeto<b> en una <b>serie de bytes<b> y poderlos recuperar
 * después
 * 
 * El objeto necesita ser <b>Serializable</b>
 * 
 * <p>
 * Al poder convertir el objeto a bytes, ese objeto se puede enviar a través de
 * red, guardarlo en un fichero, y después reconstruirlo al otra lado de la red,
 * leerlo del fichero
 * </p>
 * 
 * @author RVS
 *
 */
public class DatosSerializacion implements Serializable {

	/**
	 * Se usa para indicar la compatibilidad entre diferentes versiones de la clase
	 * 
	 * Mecanismo de serialización de Java verifica la consistencia de la versión al
	 * juzgar el <b>serialVersionUID</b> de la clase en tiempo de ejecución.
	 * 
	 * Al deserializar, la JVM comparará el <b>serialVersionUID</b> en el flujo de
	 * bytes pasado con el <b>serialVersionUID</b> de la entidad local
	 * correspondiente <b>(clase)</b>
	 * 
	 * Si son iguales, se consideran consistentes y se pueden deserializar, de lo
	 * contrario habrá una secuencia inconsistente versión de la excepción
	 */
	private static final long serialVersionUID = 1L;

	private int a;
	private String b;
	private char c;

	public DatosSerializacion(int a, String b, char c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public String getB() {
		return b;
	}
	
	public void setB(String b) {
		this.b = b;
	}
	
	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
}
