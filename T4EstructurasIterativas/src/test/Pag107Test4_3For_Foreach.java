package test;

public class Pag107Test4_3For_Foreach {

	public static void main(String[] args) {

		int[] numerous = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//		Bucle foreach 
		for (Integer i : numerous) {
			System.out.println(i);
		}

//		Bucle for
		int j = 0;
		for (int i = 0; i < j; i--) {
			System.out.println(j);
		}
	}
}
