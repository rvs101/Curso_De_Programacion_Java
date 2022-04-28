package sooper.alimentacion.descendientes;

/**
 * Invocación de la Clase Padre Alimentación
 */
import sooper.alimentacion.Alimentacion;

/**
 * "Clase Hija NoPerecederos" extiende de la "clase Padre Alimentación"
 * 
 * @author RVS
 * @time 25 abr 2022 - 14:22:15
 */
public class NoPerecederos extends Alimentacion {

	/**
	 * Constructor parametrizado heredado de la clase Alimentación
	 * 
	 * @param referencia
	 * @param peso
	 * @param volumen
	 */
	public NoPerecederos(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

}
