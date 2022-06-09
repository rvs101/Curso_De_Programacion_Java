package exception.checked.finallys.java6;

public class Pag269TryWithResourceJava6{

	public static void tryCatchVersion6() {
		Recurso rec = null;
		try {
			rec = new Recurso();
		} catch (Exception me) {
			
		} finally {
			if (rec != null) {
				try {
					rec.close();
				} catch (Exception me) {
					// TODO: handle exception
				}
			}
		}
	}
}

/**
 * 
 * @author RVS
 * @time 26 may 2022 - 14:42:02
 *
 */
class Recurso {

	private String mensaje = null;

	public Recurso() {
		this.mensaje = null;
	}

	public void close() {
		System.err.println("cerrado");
	}

	public Recurso(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
