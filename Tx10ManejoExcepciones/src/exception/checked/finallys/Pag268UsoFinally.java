package exception.checked.finallys;

/**
 * 
 * @author RVS
 * @time 25 may 2022 - 20:06:17
 *
 */
public class Pag268UsoFinally {

	private static int a = 1;

	/**
	 * 
	 * @param a
	 */
	public static void loDejoLimpio(int a) {
		Recurso rec = null;
		try {
			rec = obtenerRecursos();
			algoQuePuedaPetar(rec);
			seguimos(rec);
		} catch (Exception e) {
			e.getMessage();
		} finally {
			liberarRecursos(rec);
		}
		sigoConMiVida();
	}

	/**
	 * 
	 * @param a
	 */
	public static void loDejoLimpio2(int a) {
//		try (Recurso rec = obtenerRecursos()) {
//			algoQuePuedaPetar(rec);
//			seguimos(rec);
//		} catch (Exception e) {
//			e.getMessage();
//		} finally {
//			liberarRecursos(rec);
//		}
//		sigoConMiVida();
	}

	/**
	 * 
	 * @return Recurso - Devuelve un objeto del tipo recurso un mensaje
	 */
	public static Recurso obtenerRecursos() {
		Recurso recurso = new Recurso("Soy un recurso");
		return recurso;
	}

	/**
	 * 
	 * @param rec
	 */
	public static void algoQuePuedaPetar(Recurso rec) {
		System.out.println(a++ + " - Puede petar");
	}

	/**
	 * 
	 * @param rec
	 */
	public static void seguimos(Recurso rec) {
		System.out.println(a++ + " - Seguimos la ejecución");
	}

	/**
	 * 
	 * @param rec
	 */
	public static void liberarRecursos(Recurso rec) {
		System.out.println(a++ + " - Liberar Recursos");
	}

	/**
	 * 
	 */
	public static void sigoConMiVida() {
		System.out.println(a++ + " - Sigo Con Mi Vida");
	}

	public static void main(String[] args) {
		loDejoLimpio(1);
	}

}

/**
 * 
 * @author RVS
 * @time 25 may 2022 - 20:21:57
 *
 */
class Recurso {

	private int recurso;
	private String nombre_recurso;

	/**
	 * 
	 */
	public Recurso() {
		this.recurso++;
		this.nombre_recurso = null;
	}

	/**
	 * 
	 * @param nombre
	 */
	public Recurso(String nombre) {
		this.recurso++;
		this.nombre_recurso = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre_recurso() {
		return nombre_recurso;
	}

	/**
	 * 
	 * @param nombre_recurso
	 */
	public void setNombre_recurso(String nombre_recurso) {
		this.nombre_recurso = nombre_recurso;
	}

	/**
	 * 
	 * @return
	 */
	public int getRecurso() {
		return recurso;
	}

	/**
	 * 
	 * @param recurso
	 */
	public void setRecurso(int recurso) {
		this.recurso = recurso;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return getNombre_recurso() + " " + getRecurso();
	}

}

/**
 * 
 * @author RVS
 * @time 25 may 2022 - 20:21:52
 *
 */
class MiExcepcion extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public MiExcepcion() {
		super();
	}

	/**
	 * 
	 * @param message
	 */
	public MiExcepcion(String message) {
		super(message);
	}

	/**
	 * 
	 * @param cause
	 */
	public MiExcepcion(Throwable cause) {
		super(cause);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public MiExcepcion(String message, Throwable cause) {
		super(message, cause);
	}

}