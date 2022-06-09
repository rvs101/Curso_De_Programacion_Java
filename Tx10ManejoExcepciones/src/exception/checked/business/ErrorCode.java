package exception.checked.business;

/**
 * 
 * @author RVS
 * @time 19 may 2022 - 12:18:53
 *
 */
public enum ErrorCode {

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