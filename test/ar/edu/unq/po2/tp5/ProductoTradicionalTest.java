package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTradicionalTest {
	ProductoTradicional producto1 = new ProductoTradicional(500 );

	@Test
	void testGetPrecioBase() {
		assertEquals(producto1.getPrecioBase(), 500);
	}

	@Test
	void testSetPrecioBase() {
		producto1.setPrecioBase(30);
		assertEquals(producto1.getPrecioBase(), 30);
	}

	@Test
	void testPrecio() {
		assertEquals(producto1.precio(), 500);
	}

	@Test
	void testDescuento() {
		assertEquals(producto1.descuento(), 0);
	}

}
