package ejercicios.practico.pag289.n10_4.orden.ejecucion;

/**
 * 0 > "ABCGHI"
 * 
 * 1 > "ABDGHI"
 * 
 * 2 > "ABEGH"
 * 
 * 3 > "ABCG"
 * 
 * 4 > "ABDG"
 * 
 * @author RVS
 * @time 8 jun 2022 - 19:17:04
 *
 */
public class Pag289OrdenEjecucion {

	private static final String CASO_0 = "ABCGHI";
	private static final String CASO_1 = "ABDGHI";
	private static final String CASO_2 = "ABEGH";
	private static final String CASO_3 = "ABCG";
	private static final String CASO_4 = "ABDG";
	private static final String[] CASOS = { CASO_0, CASO_1, CASO_2, CASO_3, CASO_4 };

	private static String res = "";

	/**
	 * Función de clase
	 * 
	 * 0 - Si no se producen excepciones: A-B-C-G-H-I
	 * 
	 * 1 - Si metodoUno lanza AException: A-B-D-G-H-I
	 * 
	 * 2 - Si metodoUno lanza BException: A-B-E-G-H
	 * 
	 * 3 - Si metodoDos lanza algo: A-B-C-G
	 * 
	 * 4 - Si metodoUno lanza AException y metodoDos lanza algo: A-B-D-G
	 * 
	 * @param caso - int : introduce un numero
	 * @throws BException - Lanza la excepcion BException
	 */
	public static void ordename(int caso) throws BException {
		res = "A";
		try {
			res += "B";
			OrdenEjecucion.metodoUno(caso);
			res += "C";
		} catch (AException ae) {
			res += "D";
		} catch (BException be) {
			res += "E";
			throw be;
//			ni compila , si la pongo res += "F";
		} finally {
			res += "G";
			OrdenEjecucion.metodoDos(caso);
			res += "H";
		}
		res += "I";
	}

	public static void main(String[] args) {
		for (int i = 0; i < CASOS.length; i++) {
			res = "";
			try {
				ordename(i);
			} catch (Exception e) {
				// aunque falle, quiero seguir y ver cómo dejó res
			}
			System.out.println("Caso " + i + ": " + res + " " + (res.equals(CASOS[i])));
		}
	}
}

/**
 * 
 * 
 * @author RVS
 * @time 8 jun 2022 - 19:17:21
 *
 */
class OrdenEjecucion {

	/**
	 * 
	 * @param caso
	 * @throws AException
	 * @throws BException
	 */
	public static void metodoUno(int caso) throws AException, BException {
		switch (caso) {
		case 1:
		case 4:
			throw new AException();
		case 2:
			throw new BException();
		default:
//			System.out.println("♦ Final de la ejecución - metodoUno : " + caso);
			break;
		}
	}

	/**
	 * 
	 * @param caso
	 * @throws BException
	 */
	public static void metodoDos(int caso) {
		switch (caso) {
		case 3:
		case 4:
			throw new RuntimeException();
		default:
//			System.out.println("♣ Final de la ejecución - metodoDos : " + caso);
			break;
		}
	}
}

/**
 * Clase concreta
 * 
 * Controla las excepciones de la clase
 * 
 * @author RVS
 * @time 8 jun 2022 - 19:25:02
 *
 */
class AException extends Exception {

	/**
	 * Atributo de clase
	 * 
	 * Contiene un identificador
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia
	 * 
	 * Tipo Enum
	 */
	private ErrorCode errorCode;

	/**
	 * Constructor por defecto
	 */
	public AException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - mensaje del error
	 * @param cause   - lanza la causa del error
	 */
	public AException(String message, Throwable cause) {
		this(message, cause, null);
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param message - mensaje del error
	 * @param cause   - lanza la causa del error
	 * @param error   - muestra el tipo de error
	 */
	public AException(String message, Throwable cause, ErrorCode error) {
		super(generateMessage(error, message), null);
	}

	/**
	 * Función de clase : Devuelve un mensaje de error con los argumentos que le
	 * pasemos
	 * 
	 * @param errorCode     - recibe el tipo enum del error
	 * @param detailMessage - recibe el mensaje de error
	 * @return - String : Devuelve el tipo de error con un mensaje
	 */
	private static String generateMessage(ErrorCode errorCode, String detailMessage) {
		return errorCode + detailMessage;
	}

	/**
	 * Metodo de instancia : Devuelve un elemento del tipo enum
	 * 
	 * @return - enum : Elemento del tipo errorCode
	 */
	public ErrorCode getErrorCode() {
		return errorCode;
	}

}

/**
 * Clase Concreta del tipo Excepción que hereda de la clase Exception
 * 
 * @author RVS
 * @time 8 jun 2022 - 19:25:08
 *
 */
class BException extends Exception {

	/**
	 * Atributo de clase
	 * 
	 * Identificador de error
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto
	 * 
	 * @throws BException
	 */
	public BException() throws BException {

	}
}

/**
 * Clase enum
 * 
 * Almacena mensaje con los tipos de errores más frecuentes
 * 
 * @author RVS
 * @time 8 jun 2022 - 20:56:27
 *
 */
enum ErrorCode {

	/**
	 * Constructor de Enum
	 */
	NEGATIVE("No puedes introducir valores negativos"), ERROR("Otro error");

	/**
	 * Atributo de instancia
	 */
	private String message;

	/**
	 * Constructor parametrizado
	 * 
	 * @param message
	 */
	ErrorCode(String message) {
		this.message = message;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Muestra el mensaje de error
	 */
	@Override
	public String toString() {
		return "Error: " + message + ". Detalle: ";
	}
}
