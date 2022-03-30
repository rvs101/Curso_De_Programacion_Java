package test;

public class Pag107Test4_4EquivalentesBucles {

	private static final int NUM = 10;
	
	
	public static void main(String[] args) {

		for(int i = 0 ; i <= NUM ; i++) {
			System.out.println("• Bucle for : "+i);
		}
		
		System.out.println("---------------");
		
		int i = 0;
		while(i++ < NUM) {
			System.out.println("• Bucle while : "+i);
		}
	}
}
