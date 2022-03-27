package condicionales;

public class Pag83OperadorTernario {

	public static void main(String[] args) {

		int grados = (int) (Math.random() * 10 - 10 + 5);

		boolean llegar = (int) (Math.random() * 10 + 1) > 5 ? true : false;
		boolean isHombre = (int) (Math.random() * 10 + 1) > 5 ? true : false;

		String saludo = llegar ? "Hola " : "Adiós ";
		String tratamiento = isHombre ? "Sr." : "Sra.";
		String nombre = (tratamiento == "Sr.") ? "Robert" : "Ana";
		
		String nombreCompleto = nombre + (getNumeroAleatorio() != null ? "" : getSegundoNombre());

		if (tratamiento == "Sr.") {
			System.out.println(saludo + tratamiento + " " + nombreCompleto);
			System.out.println("Hoy la máxima será de : " + grados + " º " + (grados < 0 ? " negativos " : " "));
		} else if (tratamiento == "Sra.") {
			System.out.println(saludo + tratamiento + " " + nombreCompleto);
			System.out.println("Hoy la máxima será de : " + grados + " º " + (grados < 0 ? " negativos " : " "));
		}
	}

	private static String getNumeroAleatorio() {
		int x = (int) (Math.random() * 10 + 1);
		return x > 5 ? " " : null;
	}

	/**
	 * 
	 * @param segundoNombre
	 * @return
	 */
	private static String getSegundoNombre() {
		int valor = (int) (Math.random() * 10 + 1);
		return (valor > 5 ? "" : " Paulson");
	}

}
