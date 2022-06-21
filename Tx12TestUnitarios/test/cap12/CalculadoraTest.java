package cap12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author RVS
 * @time 16 jun 2022 - 14:48:10
 *
 */
class CalculadoraTest {

	@Test
	void testSuma() {
		int res = Calculadora.suma(2, 3);
		assertEquals(5, res);
	}

	@Test
	void testRestar() {
		int res = Calculadora.restar(8, 3);
		assertEquals(5, res);
	}

}
