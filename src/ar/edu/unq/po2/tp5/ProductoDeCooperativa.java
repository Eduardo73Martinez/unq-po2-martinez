package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends ProductoTradicional {
	
	public	double descuento() {
		return this.getPrecioBase() * 0.1;
	}

	public ProductoDeCooperativa(double precioBase) {
		super(precioBase);
		// TODO Auto-generated constructor stub
	}

	
}
