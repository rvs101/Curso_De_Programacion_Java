package pag326.ej12.testeando.metodo.cuadrado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * 
 * @author Robot
 * @date 19 jun 2022 18:25:23
 */
@ExtendWith(MockitoExtension.class)
class CalculadoraCuadradaTest {

	/**
	 * 
	 */
	@Mock
	CalculadoraCuadrada cc;

	/**
	 * 
	 */
	@Test
	void testCuadrado() {
		Mockito.when(CalculadoraCuadrada.cuadrado(4)).thenReturn(16);

		int num1 = CalculadoraCuadrada.cuadrado(4);
		assertEquals(16, num1);

		Mockito.when(CalculadoraCuadrada.cuadrado(-4)).thenReturn(16);
		int num2 = CalculadoraCuadrada.cuadrado(4);
		assertEquals(16, num2);
	}

	/**
	 * 
	 */
	@Test
	void testCuadradoPositivo() {
		int res = CalculadoraCuadrada.cuadrado(2);
		assertEquals(4, res);
	}

	/**
	 * 
	 */
	@Test
	void testCuadradoNegativa() {
		int res = CalculadoraCuadrada.cuadrado(-2);
		assertEquals(4, res);
	}

}
