package ejemplo.practico.pag284.generalizar.oficial;

/**
 * 
 * @author RVS
 * @time 7 jun 2022 - 14:58:37
 * 
 */
public class Pag284ExcepcionesGeneralizar {

	/**
	 * Lanzar una excepción al intentar convertir un String a int
	 */
	public void lanzarExcepcionParaTodoCorrecto() throws BusinessException {
		String s = "123..456";
		int num = 0;
		try {
//			trim - Elimina espacio por la derecha e izquierda
			num = Integer.parseInt(s.trim());
		} catch (NumberFormatException nfe) {
			System.out.println("• Number Format Exception: " + nfe.getMessage() + " • Localized Message: "
					+ nfe.getLocalizedMessage() + " • Cause: " + nfe.getCause() + " 's' → No lleva un número ");
		} catch (NullPointerException npe) {
			System.out.println("○ Null Pointer Exception: " + npe.getMessage() + " ○ Localized Message: "
					+ npe.getLocalizedMessage() + " ○ Cause: " + npe.getCause() + " 's' o empleados son nulos ");
		} finally {
			System.out.println("♠ Numero final: " + num);
		}

	}
}
