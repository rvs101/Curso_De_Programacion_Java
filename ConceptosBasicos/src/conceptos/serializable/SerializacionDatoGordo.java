package conceptos.serializable;

import java.io.Serializable;

public class SerializacionDatoGordo implements Serializable {

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

	public int d;
	public Integer e;
	DatosSerializacion f;

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public void setE(Integer e) {
		this.e = e;
	}

	public Integer getE() {
		return e;
	}

	public void setF(DatosSerializacion f) {
		this.f = f;
	}

	public DatosSerializacion getF() {
		return f;
	}
}
