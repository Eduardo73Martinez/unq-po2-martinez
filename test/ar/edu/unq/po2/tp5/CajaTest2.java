package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CajaTest2 {
	Caja caja1 = new Caja(0 ,new ArrayList<ProductoTradicional>());
	ProductoTradicional producto1 = new ProductoTradicional(500 );
	ProductoTradicional producto2 = new ProductoTradicional(500 );
	ProductoTradicional producto3 = new ProductoTradicional(500 );
	Factura facturaServicio = new Factura (10 ,80);

	@Test
	void testRegistrar() {
		fail("Not yet implemented");
	}

	@Test
	void testAgregar() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMontoAPagar() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMontoAPagar() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTradicional() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTradicional() {
		fail("Not yet implemented");
	}

	@Test
	void testCaja() {
		fail("Not yet implemented");
	}

	@Test
	void testRegistrarPago() {
		caja1.registrarPago(facturaServicio);
		assertEquals(caja1.getMontoAPagar(), 1300);
	}

}
