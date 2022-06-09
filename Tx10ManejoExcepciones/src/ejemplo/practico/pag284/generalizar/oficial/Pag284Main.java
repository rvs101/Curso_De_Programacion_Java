package ejemplo.practico.pag284.generalizar.oficial;

public class Pag284Main {

	public static void main(String[] args) {

		Empleado e = new Empleado();

		try {
			e.lanzarExcepcionParaTodoCorrecto();
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}
	}

}
