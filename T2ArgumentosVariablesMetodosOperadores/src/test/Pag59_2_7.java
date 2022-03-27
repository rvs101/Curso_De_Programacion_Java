package test;

public class Pag59_2_7 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 1;
		int res1 = (a + b) / (a + c) / b;
		int res2 = a + (b / a) + c / b;
		int res3 = a + b / (a + (c / b));
		int res4 = (a + b / a) + c / b;
		System.out.println(" • Respuesta = " + res1);
		System.out.println(" • Respuesta = " + res2);
		System.out.println(" • Respuesta = " + res3);
		System.out.println(" • Respuesta = " + res4);
	}

}
