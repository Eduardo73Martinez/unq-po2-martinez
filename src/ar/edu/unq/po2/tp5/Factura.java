package ar.edu.unq.po2.tp5;

public class Factura {
	private double costoPorUnidad;
	private int unidades;

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double precio() {
		return this.getCostoPorUnidad() * unidades;
	}

	public Factura(double costoPorUnidad, int unidades) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.unidades = unidades;
	}
	

}
