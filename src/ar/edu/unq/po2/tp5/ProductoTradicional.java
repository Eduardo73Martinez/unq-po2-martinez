package ar.edu.unq.po2.tp5;

public class ProductoTradicional {
	private double precioBase;
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double precio() {
		return this.getPrecioBase() - this.descuento();
	}
	public double descuento() {
		return 0;
	}

	public ProductoTradicional(double precioBase) {
		super();
		this.precioBase = precioBase;
	}
	
	
	
}
