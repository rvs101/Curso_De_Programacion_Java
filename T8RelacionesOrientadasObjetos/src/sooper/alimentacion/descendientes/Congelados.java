package sooper.alimentacion.descendientes;

/**
 * Invocamos la clase Padre
 */
import sooper.alimentacion.Alimentacion;

/**
 * "Clase Hija Congelados" que hereda de la "Clase Alimentación"
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:22:15
 */
public class Congelados extends Alimentacion {

	/**
	 * Constructor parametrizado que utiliza el constructor de la clase padre para
	 * definir el objeto que creemos
	 * 
	 * @param referencia
	 * @param peso
	 * @param volumen
	 */
	public Congelados(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

}
