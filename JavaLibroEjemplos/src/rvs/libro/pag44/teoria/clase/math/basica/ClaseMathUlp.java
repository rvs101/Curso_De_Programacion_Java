package rvs.libro.pag44.teoria.clase.math.basica;

/**
 * Clase ULP
 * 
 * 22 jul 2023 - 21:00:13
 *
 * @author RVS
 *
 */
public class ClaseMathUlp {

	public static void main(String[] args) {
//		El método `Math.ulp()` en Java devuelve el valor de la unidad 
//		en el último lugar (ULP) de un número double o float. 
		
//		La ULP de un número es la distancia entre el número dado 
//		y el siguiente valor representable más grande o más pequeño 
//		del mismo tipo y precisión.
		
//		El método `Math.ulp()` puede ser útil para comparar números 
//		con cierta precisión o para realizar cálculos numéricos que 
//		requieren una precisión específica.
		
//		En el caso de `Math.ulp(11.1)`, el método devuelve la ULP 
//		del número double `11.1`. El resultado sería `1.7763568394002505E-15`.
		
		System.out.println(Math.ulp(11.1));
		System.out.println(Math.ulp(1));
		System.out.println(Math.ulp(2));
		System.out.println(Math.ulp(10));

	}
}
