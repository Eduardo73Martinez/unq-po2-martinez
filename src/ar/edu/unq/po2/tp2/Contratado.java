package ar.edu.unq.po2.tp2;

public class Contratado extends Empleado {
	public int numeroDeContrato;
	public int medioDePago;

	@Override
	double sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico();
	}

	@Override
	double retenciones() {
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

	public Contratado(String nombre, String direccion, boolean soltero, int fechaDeNacimiento, double sueldoBasico,
			int numeroDeContrato, int medioDePago) {
		super(nombre, direccion, soltero, fechaDeNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}

}
