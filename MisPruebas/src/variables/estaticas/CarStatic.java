package variables.estaticas;

public class CarStatic {

	public static int total;

	public CarStatic() {
		CarStatic.total = 0;
	}

	public static int getTotal() {
		return CarStatic.total;
	}

	public static void setTotal() {
		CarStatic.total++;
	}
}
