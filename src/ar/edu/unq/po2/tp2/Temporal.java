package ar.edu.unq.po2.tp2;

public class Temporal extends Empleado {
	private int FechaIngreso;
	private int cantHorasExtra;
	private float precioPorHoraExtra = 40;

	public float correspondePorHorasExtra() {
		return this.getPrecioPorHoraExtra() * this.getCantHorasExtra();
	}

	public float obraSocial() {
		return (10 * this.sueldoBruto() / 100) + this.cantidadSiSuperaLos50Años();
	}

	public float aportesJubilatorios() {
		return (10 * this.sueldoBruto() / 100) + 5 * this.getCantHorasExtra();
	}

	public float cantidadSiSuperaLos50Años() {
		return if(  this.getAntiguedad()>50) {25} else {0};
	}

	@Override
	float sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() + this.correspondePorHorasExtra();
	}

	@Override
	float retenciones() {
		// TODO Auto-generated method stub
		return this.obraSocial() + this.aportesJubilatorios();
	}

	public int getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(int fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	public int getCantHorasExtra() {
		return cantHorasExtra;
	}

	public void setCantHorasExtra(int cantHorasExtra) {
		this.cantHorasExtra = cantHorasExtra;
	}

	public float getPrecioPorHoraExtra() {
		return precioPorHoraExtra;
	}

	public void setPrecioPorHoraExtra(float precioPorHoraExtra) {
		this.precioPorHoraExtra = precioPorHoraExtra;
	}

}
