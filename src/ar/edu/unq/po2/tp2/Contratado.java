package ar.edu.unq.po2.tp2;

public class Contratado extends Empleado {
	private int numeroDeContrato;
	private int medioDePago;

	@Override
	float sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico();
	}

	@Override
	float retenciones() {
		// TODO Auto-generated method stub
		return 50;
	}

	public int getNumeroDeContrato() {
		return numeroDeContrato;
	}

	public void setNumeroDeContrato(int numeroDeContrato) {
		this.numeroDeContrato = numeroDeContrato;
	}

	public int getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(int medioDePago) {
		this.medioDePago = medioDePago;
	}

}
