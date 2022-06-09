package exception.checked.finallys;

/**
 * 
 * @author RVS
 * @time 25 may 2022 - 20:06:17
 *
 */
public class Pag269TryWithResource {

	private static int a = 1;

	/**
	 * 
	 * @param a
	 */
	public static void loDejoLimpio2(int a) {
//		try (Recurso2 rec = obtenerRecursos()) {
//			algoQuePuedaPetar(rec);
//			seguimos(rec);
//		} catch (Exception e) {
//			e.getMessage();
//		} finally {
//			liberarRecursos(rec);
//		}
		sigoConMiVida();
	}

	/**
	 * 
	 * @return Recurso - Devuelve un objeto del tipo recurso un mensaje
	 */
	public static Recurso2 obtenerRecursos() {
		Recurso2 recurso = new Recurso2("Soy un recurso");
		return recurso;
	}

	/**
	 * 
	 * @param rec
	 */
	public static void algoQuePuedaPetar(Recurso2 rec) {
		System.out.println(a++ + " - Puede petar");
	}

	/**
	 * 
	 * @param rec
	 */
	public static void seguimos(Recurso2 rec) {
		System.out.println(a++ + " - Seguimos la ejecución");
	}

	/**
	 * 
	 * @param rec
	 */
	public static void liberarRecursos(Recurso2 rec) {
		System.out.println(a++ + " - Liberar Recursos");
	}

	/**
	 * 
	 */
	public static void sigoConMiVida() {
		System.out.println(a++ + " - Sigo Con Mi Vida");
	}

	public static void main(String[] args) {
//		loDejoLimpio(1);
	}

}

/**
 * 
 * @author RVS
 * @time 25 may 2022 - 20:21:57
 *
 */
class Recurso2 {

	private int recurso;
	private String nombre_recurso;

	/**
	 * 
	 */
	public Recurso2() {
		this.recurso++;
		this.nombre_recurso = null;
	}

	/**
	 * 
	 * @param nombre
	 */
	public Recurso2(String nombre) {
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

