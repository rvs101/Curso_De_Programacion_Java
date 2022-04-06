package test;

public class Pag59_2_8 {

	public static void main(String[] args) {
		int a = 4;
		int b = 8;
		int c = 2;
		boolean res = c >= (b / a) || (a * b) - c < 0;
		System.out.println(res);
	}
}
