package t15.pag383.test.soluciones;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 
 * @date 13 oct 2022 17:41:00
 * 
 * @author RVS
 *
 */
public class T15Test4Valores {

	public static void main(String[] args) {

		int x = 3;
		RoundingMode y = RoundingMode.HALF_UP;
		BigDecimal setScale = BigDecimal.valueOf(12.3456789).setScale(x, y);
		System.out.println("Valor: " + setScale);

	}
}
