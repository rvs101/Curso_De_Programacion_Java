package ejemplo.practico.pag281.manejo.excepciones;

public class Pag282ExcepcionesLog {

	private static Nulo2 nulo2 = null;

	public static void main(String[] args) {
		
		try {
			nulo2.loQueSea();
		} catch (NullPointerException npe) {
//			log.debug("Ups!! nulo es nulo, " + " que mal rollo");
//			log.error(npe.getMessage(), npe);
			npe.printStackTrace();
		}
		nulo2.otraCosa();
	}
}


class Nulo2 {

	public Nulo2() {

	}

	public void loQueSea() {
		System.out.println("• Lo que sea ");
	}

	public void otraCosa() {
		System.out.println("• Otra cosa ");
	}

}
