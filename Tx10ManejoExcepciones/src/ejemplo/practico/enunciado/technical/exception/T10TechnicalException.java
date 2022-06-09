package ejemplo.practico.enunciado.technical.exception;

/**
 * 
 * 
 * @author RVS
 * @time 18 may 2022 - 20:56:30
 *
 */
public class T10TechnicalException {

}

/**
 * Runtime Exception - No se pueden controlar - Errores Tecnicos
 * 
 * @author RVS
 * @time 18 may 2022 - 22:09:08
 *
 */
class TechnicalException extends RuntimeException{

	/**
	 * Atributo de instancia
	 */
	private String causa;
	private String mensaje;

	/**
	 * Constructor por defecto
	 */
	public TechnicalException() {
		this.causa = null;
		this.mensaje = null;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param mensaje
	 * @param causa
	 */
	public TechnicalException(String mensaje, String causa) {
		this.mensaje = mensaje;
		this.causa = causa;
	}
}

/**
 * Checked Exception - Se pueden controlar todos los errores que tengan que ver
 * con la lógica de negocio
 * 
 * @author RVS
 * @time 18 may 2022 - 23:34:54
 *
 */
class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia
	 */
	private String causa;
	private String mensaje;
	private String codigo_error;

	/**
	 * Constructor por defecto
	 */
	public BusinessException() {
		this.causa = null;
		this.mensaje = null;
		this.codigo_error = null;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param causa
	 * @param mensaje
	 * @param codigo
	 */
	public BusinessException(String causa, String mensaje, String codigo) {
		this.causa = causa;
		this.mensaje = mensaje;
		this.codigo_error = codigo;
	}

	/**
	 * 
	 * @return String - Devuelve el mensaje de error
	 */
	private String generateMessage() {
		return " Codigo de error: " + codigo_error + " Mensaje de error: " + mensaje;
	}

}

/**
 * 
 * @author RVS
 * @time 18 may 2022 - 23:51:54
 *
 */
enum ErrorCode {
	NEGATIVO, EVEN;

	private String mensaje;

	ErrorCode() {
		this.mensaje = null;
	}

	ErrorCode(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "ERROR" + mensaje + ". Detalle";
	}

}