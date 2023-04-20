package edu.org.unq.tp1;

public class Producto {
	private String producto;
	private double precio;
	
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Producto(String producto, double precio) {
		super();
		this.producto = producto;
		this.precio = precio;
	}
	public double precioMasiva() {
		return this.getPrecio()*1.21;
	}
	
	
}
