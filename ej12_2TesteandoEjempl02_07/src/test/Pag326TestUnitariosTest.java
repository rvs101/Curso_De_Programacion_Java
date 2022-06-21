package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ej12.testeando.Pag326TestUnitarios;

/**
 * @author Robot
 * @date 19 jun 2022 18:37:10
 */
class Pag326TestUnitariosTest {

	@Test
	void testSiempreCierto() {
		assertTrue(Pag326TestUnitarios.siempreCierto());
	}

	@Test
	void testSiempreCiertoSolucion() {
		assertTrue(Pag326TestUnitarios.siempreCierto());
	}

	@Test
	void testSiempreFalso() {
		assertFalse(Pag326TestUnitarios.siempreFalso());
	}

	@Test
	void testSiempreFalsoSolucion() {
		assertFalse(Pag326TestUnitarios.siempreFalso());
	}

}
