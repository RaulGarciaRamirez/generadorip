import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIpTest {

	@Test
	void testGenerarNumero() {
		for(int i = 0; i <= 1000; i++) {
			assertEquals(Generadorip.generarNumero(i, i), i);
		}
	}

	@Test
	void testGenerarIp() {
		assertEquals(Generadorip.generarIp(), null);
	}

}
