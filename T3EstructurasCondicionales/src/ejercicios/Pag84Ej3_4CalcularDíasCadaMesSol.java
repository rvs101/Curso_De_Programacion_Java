package ejercicios;

public class Pag84Ej3_4CalcularDíasCadaMesSol {

//	Mis Constantes: 
	public static final int DIAS_28 = 28;
	public static final int DIAS_30 = 30;
	public static final int DIAS_31 = 31;

	public static void main(String[] args) {

		if (args.length == 1) {
			int mes = Integer.valueOf(args[0]);
			if (mes < 1 || mes > 12) {
				System.out.println(mes + "no es un mes valido");
			} else {
				int dias = calculaDias(mes);
				int diasConstantes = calculaDiasConstantes(mes);
				System.out.println("El mes " + mes + " tiene " + dias + " dias ");
				System.out.println("El mes " + mes + " tiene " + diasConstantes + " dias ");
			} // if mes
		} // if args
	}

	/**
	 * Calculamos los días
	 * 
	 * @param mes
	 * @return
	 */
	private static int calculaDias(int mes) {
		int dias;
		switch (mes) {
		case 2:
			System.out.println("Febrero");
			dias = 28;
			break;
		case 4:
			System.out.println("Abril");
		case 6:
			System.out.println("Junio");
		case 9:
			System.out.println("Septiembre");
		case 11:
			System.out.println("Noviembre");
			dias = 30;
			break;
		default:
			System.out.println("Mes de los largos");
			dias = 31;
			break;
		} // end switch
		return dias;
	}

	/**
	 * Calculamos los días
	 * 
	 * @param mes
	 * @return
	 */
	private static int calculaDiasConstantes(int mes) {
		int dias;
		switch (mes) {
		case 2:
			System.out.println("Febrero");
			dias = DIAS_28;
			break;
		case 4:
			System.out.println("Abril");
		case 6:
			System.out.println("Junio");
		case 9:
			System.out.println("Septiembre");
		case 11:
			System.out.println("Noviembre");
			dias = DIAS_30;
			break;
		default:
			System.out.println("Mes de los largos");
			dias = DIAS_31;
			break;
		} // end switch
		return dias;
	}
} // end clase
