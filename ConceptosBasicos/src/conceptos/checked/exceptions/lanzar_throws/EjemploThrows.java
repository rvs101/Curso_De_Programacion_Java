package conceptos.checked.exceptions.lanzar_throws;

public class EjemploThrows {

	public static void getOperacion() throws ArithmeticException {
		System.out.println("Lanza 2º metodo");
		if (setOperacion(1) == 0) {
			System.out.println("Entro en la operación");
		}
		throw new ArithmeticException("♦ Error ");
	}

	public static int setOperacion(int num) throws ArithmeticException {
		int x = (num / 0);
		
		System.out.println("Lanza 1º metodo");
		return x;
	}

	public static void main(String[] args) {
		setOperacion(5);
	}

}
