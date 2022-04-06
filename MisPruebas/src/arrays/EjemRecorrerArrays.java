package arrays;

public class EjemRecorrerArrays {

//	                                     0=4     1=3    2=8         3=6       4=5      5=7
	private static final String[] a = { "hola", "mis", "queridos", "amigos", "¿cómo", "estáis?" };

	public static void main(String[] args) {
		
		setVerPalabras(a);

	}

	public static void setVerPalabras(String[] args) {
		for (int j = 0; j < a.length; j++) {
			if (a[j].length() < 5) {
				for (int x = 0; x < 5; x++) {
					System.out.print(a[j] + "❓");
				}
				System.out.println("");
			}
		}
		System.out.println("----------------");

		for (int i = 0; i < a.length; i++) {
			if (a[i].length() >= 5) {
				for (int xx = 0; xx < 2; xx++) {
					System.out.print(a[i] + "❗");
				}
				System.out.println("");
			}
		}
		System.out.println("----------------");
	}
}
