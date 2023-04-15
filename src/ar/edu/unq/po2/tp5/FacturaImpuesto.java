package ar.edu.unq.po2.tp5;

public class FacturaImpuesto extends Factura{
	

	private double tasa;

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	public double precio() {
		return this.getTasa();

	}

	public FacturaImpuesto(double costoPorUnidad, int unidades, double tasa) {
		super(costoPorUnidad, unidades);
		this.tasa = tasa;
	}
	

	
	

}
