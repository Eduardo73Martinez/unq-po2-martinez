package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoDeCooperativaTest {
	ProductoDeCooperativa producto2= new ProductoDeCooperativa(350);

	@Test
	void testDescuento() {
		assertEquals(producto2.descuento(), 35);
	}


	@Test
	void testGetPrecioBase() {
		assertEquals(producto2.getPrecioBase(), 350);
	}

	@Test
	void testSetPrecioBase() {
		producto2.setPrecioBase(50);
		assertEquals(producto2.getPrecioBase(), 50);
	}

	@Test
	void testPrecio() {
		assertEquals(producto2.precio(), 315);
	}

}
