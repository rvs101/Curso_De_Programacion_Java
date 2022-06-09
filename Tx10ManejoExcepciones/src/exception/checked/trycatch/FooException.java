package exception.checked.trycatch;

/**
 * Pagina 262
 * 
 * Clase Personalizada para gestionar una excepción del tipo "Checked Runtime"
 * heredado de la clase "Exception"
 * 
 * Creada por mi para gestionar los errores en las clases que necesite controlar
 * un error en cuestión
 * 
 * @author RVS
 * @time 24 may 2022 - 14:50:06
 *
 */
class FooException extends Exception {

	/**
	 * Atributo de instancia
	 * 
	 * Añade un identificador numerico
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto
	 */
	public FooException() {
// Este 'super' es heredado el constructor de la clase Exception
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message String - Recibe una cadena de texto con el error
	 */
	public FooException(String message) {
// Este 'super' es heredado el constructor de la clase Exception
		super(message);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message String - Recibe una cadena de texto con el error
	 * @param cause   Throwable - Recibe un objeto del tipo cause
	 */
	public FooException(String message, Throwable cause) {
// Este 'super' es heredado el constructor de la clase Exception
		super(message, cause);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param cause - Throwable - Recibe un objeto del tipo cause
	 */
	public FooException(Throwable cause) {
// Este 'super' es heredado el constructor de la clase Exception
		super(cause);
	}

}
