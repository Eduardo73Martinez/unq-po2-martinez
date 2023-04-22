package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

import ar.edu.unq.po2.entes.Nombrable;

public class Caja implements Agencia{
	private double montoAPagar;
	private ArrayList<ProductoTradicional> tradicional;

	
	public void registrar(ProductoTradicional p) {
		montoAPagar += p.precio();
		//tradicional.remove(p);
	}
	
	public void agregar(ProductoTradicional p) {
		tradicional.add(p);
	}


	public double getMontoAPagar() {
		return montoAPagar;
	}

	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}

	public ArrayList<ProductoTradicional> getTradicional() {
		return tradicional;
	}

	public void setTradicional(ArrayList<ProductoTradicional> tradicional) {
		this.tradicional = tradicional;
	}

	public Caja(double montoAPagar, ArrayList<ProductoTradicional> tradicional) {
		super();
		this.montoAPagar = montoAPagar;
		this.tradicional = tradicional;
	}

	@Override
	public void registrarPago(Factura factura) {
		montoAPagar += factura.precio();
		
	}

}
