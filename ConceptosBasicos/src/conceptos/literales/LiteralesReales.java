package conceptos.literales;

/**
 * Literales : Valores que almacenan las variables : "elementos a la izquierda
 * del igual"
 * 
 * @author RVS
 * @time 17 may 2022 - 18:53:04
 *
 */
public class LiteralesReales {

	public static void main(String[] args) {

		System.out.println("--- • Real Double --- • ");
//                        VALOR LITERAL
//		                     ↓
		double basico1d = 1.23D;
		double basico2d = 3.456;
		double basico3d = -2.0d;
// 	 				          E = Anotación cientifica
//  						  ↑
		double basico4d = 3.25E+12;
// 						     e = Anotación cientifica
//  						 ↑
		double basico5d = 2.7e-5;

		System.out.println("real double : " + basico1d);
		System.out.println("real double : " + basico2d);
		System.out.println("real double : " + basico3d);
		System.out.println("real double : " + basico4d);
		System.out.println("real double : " + basico5d);

		System.out.println("--- • Real Float --- • ");

		float basico1f = 2.75f;
		float basico2f = -4.567f;
		float basico3f = 2.0F;
//                      Anotación cientifica
//		                     ↑
		float basico4f = 6.73e+2f;

// A partir de la version 1.7 
		float basico5f = 1234_5678_9012_3456L;

		System.out.println("real float 2.75f : " + basico1f);
		System.out.println("real float -4.567f : " + basico2f);
		System.out.println("real float 2.0F : " + basico3f);
		System.out.println("real float 6.73e+2f : " + basico4f);
		System.out.println("real float 1234_5678_9012_3456L : " + basico5f);

	}
}
