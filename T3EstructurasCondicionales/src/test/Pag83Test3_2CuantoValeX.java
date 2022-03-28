package test;

public class Pag83Test3_2CuantoValeX {

	public static void main(String[] args) {
		int a = 5;
		int b = 8; 
		int c = 3;
		boolean x = !((b = c) <= a) && (c * c != a);
		System.out.println(x);
	}
}
