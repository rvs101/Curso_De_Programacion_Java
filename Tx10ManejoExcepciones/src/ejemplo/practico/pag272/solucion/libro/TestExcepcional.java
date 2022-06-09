package ejemplo.practico.pag272.solucion.libro;

/**
 * 
 * @author RVS
 * @time 31 may 2022 - 13:35:53
 *
 */
public class TestExcepcional {

	/**
	 * CONSTANTE de clase : Almacena un mensaje
	 */
	private static final String TECH_SIN_ARGUMENTOS = "Se esperaba al menos 1 argumento";

	/**
	 * CONSTANTE de clase : Almacena un mensaje
	 */
	private static final String TECH_MAL_FORMATO = "El primer argumento debe ser un número entero";

	/**
	 * 
	 * @param args
	 * @return
	 * @throws BusinessException
	 */
	private static int trataNumero(String[] args) throws BusinessException {
		if (args.length == 0) {
			throw new TechnicalException(TECH_SIN_ARGUMENTOS);
		}
		try {
			int num = Integer.parseInt(args[0]);
			noQuieroPares(num);
			noQuieroNegativos(num);
			return num * num;
		} catch (NumberFormatException nfe) { // Hereda de RuntimeException
			throw new TechnicalException(TECH_MAL_FORMATO, nfe);
		}
	}

	/**
	 * 
	 * @param n
	 * @throws BusinessException
	 */
	private static void noQuieroPares(int n) throws BusinessException {
		if (n % 2 == 0) {
			throw new BusinessException(BusinessException.ErrorCode.EVEN, "Valor " + n);
		}
	}

	/**
	 * 
	 * @param n
	 * @throws BusinessException
	 */
	private static void noQuieroNegativos(int n) throws BusinessException {
		if (n < 0) {
			throw new BusinessException(BusinessException.ErrorCode.NEGATIVE, "Valor " + n);
		}
	}

	public static void main(String[] args) {

		try {
			int res = trataNumero(args);
			System.out.println("El resultado es " + res);
		} catch (BusinessException be) {
			System.out.println("===== ERROR FUNCIONAL =====");
			System.out.println("Se ha producido un error funcional: " + be);

			switch (be.getErrorCode()) {
			case EVEN:
				System.out.println("Prefiero números impares (1, 3, 5, ...)");
				break;
			case NEGATIVE:
				System.out.println("Quiero números positivos");
				break;
			}
		} catch (TechnicalException te) {
			System.err.println("***** ERROR TECNICO *****");
			System.err.println("Se ha producido un error técnico: " + te);
		} finally {
			System.out.println("¡Gracias por usar este programa!");
		}
	}

}
