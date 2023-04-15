package ar.edu.unq.po2.tp5;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CajaTest {
		Caja caja1 = new Caja(0 ,new ArrayList<ProductoTradicional>());
		ProductoTradicional producto1 = new ProductoTradicional(500 );
		ProductoTradicional producto2 = new ProductoTradicional(500 );
		ProductoTradicional producto3 = new ProductoTradicional(500 );
		ProductoDeCooperativa producto4 = new ProductoDeCooperativa(500 );
		ProductoDeCooperativa producto5 = new ProductoDeCooperativa(500 );
		ProductoDeCooperativa producto6 = new ProductoDeCooperativa(500 );
	
		ProductoTradicional[]  expectativa = {producto3,producto5, producto6 };
		
		
		@Test
		public void testRegistrar() {
		caja1.agregar(producto1);
		caja1.agregar(producto2);
		caja1.agregar(producto3);
		caja1.agregar(producto4);
		caja1.agregar(producto5);
		caja1.agregar(producto6);
		
		caja1.registrar(producto1);
		caja1.registrar(producto2);
		caja1.registrar(producto4);
		assertEquals(caja1.getTradicional(),  caja1.getTradicional());

		}
		

		
		
}
