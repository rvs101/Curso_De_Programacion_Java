package test;

public class Pag83Test3_1ExpresionesBooleanas {

	public static void main(String[] args) {
		int a = 2, b = 3 , e = 5 , f = 10;
		boolean ba = true, bb = false, bc = true, bd = false;

		System.out.println(!ba && (bb ^ bc) || bd & (e >= f));
		System.out.println(a == b);
	}
}
