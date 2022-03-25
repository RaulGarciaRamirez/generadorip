import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIpTest {

	@Test
	void testGenerarNumero() {
		for (int i = 0; i <= 1000; i++) {
			int numero = Generadorip.generarNumero(0, 254);
			assertTrue(numero <= 254 && numero >= 0);
		}
	}

	@Test
	void testGenerarIp() {
		String ip = Generadorip.generarIp();
		String[] ipArray = ip.split("\\.");
		int primerNumero = Integer.parseInt(ipArray[0]);
		int ultimoNumero = Integer.parseInt(ipArray[3]);
		assertTrue(primerNumero <= 254 && primerNumero >= 0 && ultimoNumero <= 254 && ultimoNumero >= 0);
	}

}
