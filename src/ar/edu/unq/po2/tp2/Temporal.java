package ar.edu.unq.po2.tp2;

public class Temporal extends Empleado {
	private int fechaIngreso;
	private int cantHorasExtra;
	private double precioPorHoraExtra = 40;

	public double correspondePorHorasExtra() {
		return this.getPrecioPorHoraExtra() * this.getCantHorasExtra();
	}

	public double obraSocial() {
		return (10 * this.sueldoBruto() / 100) + this.cantidadSiSuperaLos50Años();
	}

	public double aportesJubilatorios() {
		return (10 * this.sueldoBruto() / 100) + 5 * this.getCantHorasExtra();
	}

	public double cantidadSiSuperaLos50Años() {
		if(  this.getAntiguedad()>50) {
			return 25;
		} else {
			return 0;}
	}

	@Override
	double sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() + this.correspondePorHorasExtra();
	}

	@Override
	double retenciones() {
		// TODO Auto-generated method stub
		return this.obraSocial() + this.aportesJubilatorios();
	}

	public int getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(int ingreso) {
		fechaIngreso = ingreso;
	}

	public int getCantHorasExtra() {
		return cantHorasExtra;
	}

	public void setCantHorasExtra(int cantHorasExtra) {
		this.cantHorasExtra = cantHorasExtra;
	}

	public double getPrecioPorHoraExtra() {
		return precioPorHoraExtra;
	}

	public void setPrecioPorHoraExtra(float precioPorHoraExtra) {
		this.precioPorHoraExtra = precioPorHoraExtra;
	}
	public int getAntiguedad() {
		return 2023 -this.getFechaIngreso();
	}

	public Temporal(String nombre, String direccion, boolean soltero, int fechaDeNacimiento, double sueldoBasico,
			int fechaIngreso, int cantHorasExtra, double precioPorHoraExtra) {
		super(nombre, direccion, soltero, fechaDeNacimiento, sueldoBasico);
		this.fechaIngreso = fechaIngreso;
		this.cantHorasExtra = cantHorasExtra;
		this.precioPorHoraExtra = precioPorHoraExtra;
	}

	
	

}
