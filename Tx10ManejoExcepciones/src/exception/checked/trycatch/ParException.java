package exception.checked.trycatch;

/**
 * Pagina 262
 * 
 * Clase Personalizada para gestionar una excepción del tipo "Checked Runtime"
 * heredado de la clase "Exception"
 * 
 * @author RVS
 * @time 24 may 2022 - 17:58:16
 *
 */
class ParException extends Exception {

	/**
	 * Atributo de instancia 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto
	 */
	public ParException() {
// Este super es heredado el constructor de la clase Exception		
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param mensaje - Cadenas de texto
	 */
	public ParException(String mensaje) {
// Este super es heredado el constructor de la clase Exception		
		super(mensaje);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param mensaje - String - Cadenas de texto
	 * @param cause - Throwable - objeto para capturar excepciones
	 */
	public ParException(String mensaje, Throwable cause) {
// Este super es heredado el constructor de la clase Exception		
		super(mensaje, cause);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param cause - Throwable - objeto para capturar excepciones
	 */
	public ParException(Throwable cause) {
// Este super es heredado el constructor de la clase Exception		
		super(cause);
	}

}