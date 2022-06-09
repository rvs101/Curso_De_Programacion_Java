package ejemplo.practico.pag284.generalizar.oficial;

public class Empleado {

	/**
	 * Atributo de instancia
	 */
	private double salario;

	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		this.salario = 0;
	}

	/**
	 * Constructor parametrizado
	 */
	public Empleado(int salario) {
		this.salario = salario;
	}

	/**
	 * Lanzar una excepción al intentar convertir un String a int
	 * 
	 * Forma Incorrecta
	 */
	public void lanzarExcepcionParaTodoError() {
		String s = "123..456";
		int num = 0;
		try {
			num = Integer.parseInt(s.trim());
		} catch (Exception e) {
//			 Aquí se arreglaría todo
			e.printStackTrace();
			System.out.println("• Message: |" + e.getMessage() + "| • Localized Message: |" + e.getLocalizedMessage()
					+ "| • Cause: |" + e.getCause() + "|");
		}
	}

	/**
	 * Lanzar una excepción al intentar convertir un String a int
	 * 
	 * Forma correcta
	 */
	public void lanzarExcepcionParaTodoCorrecto() throws BusinessException {
		String s = "123..456";
		int num = 0;
		try {
//			trim - Elimina espacio por la derecha e izquierda
			num = Integer.parseInt(s.trim());
		} catch (NumberFormatException nfe) {
			System.out.println("• Number Format Exception: " + nfe.getMessage() + " • Localized Message: "
					+ nfe.getLocalizedMessage() + " • Cause: " + nfe.getCause());
		} catch (NullPointerException npe) {
			System.out.println("○ Null Pointer Exception: " + npe.getMessage() + " ○ Localized Message: "
					+ npe.getLocalizedMessage() + " ○ Cause: " + npe.getCause());
		} finally {
			System.out.println("♠ Numero final: " + num);
		}
	}
}
