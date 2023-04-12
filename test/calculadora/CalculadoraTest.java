package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	 
	Calculadora calcu = new Calculadora ( 12 , 10);
	int suma = calcu.suma();
	int resta = calcu.resta();
	int mult = calcu.multiplica();
	

	@Test
	void testSuma() {
		assertEquals(suma, 22);
	}

	@Test
	void testResta() {
		assertEquals(resta, 2);
	}

	@Test
	void testMultiplica() {
		assertEquals(mult, 120);
	}

}
