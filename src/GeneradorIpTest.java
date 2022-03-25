import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIpTest {

	@Test
	void testGenerarNumero() {
		for(int i = 0; i <= 1000; i++) {
			int numero = Generadorip.generarNumero(0, 254);
			assertTrue(numero <= 254 && numero >= 0);;
		}
	}

	@Test
	void testGenerarIp() {
		assertEquals(Generadorip.generarIp(), null);
	}

}
