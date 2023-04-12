package ar.edu.unq.po2.tp2;

public class Permanente extends Empleado {
	private int cantidadHijos;
	private int antiguedad;
	private double asignacionPorHijo;
	private double asignacionPorConyugue;

	public double salarioFamiliar() {
		return this.corresPondePorConyugue() + this.correspondePorHijo();
	}

	public double correspondePorHijo() {
		return this.getAsignacionPorHijo() * this.getCantidadHijos();
	}

	public double corresPondePorConyugue() {
		return this.getAsignacionPorConyugue() * this.cienSitieneConyugueCeroSiNo();
	}

	public double cienSitieneConyugueCeroSiNo() {
		 if( !this.getSoltero()) {
			return 100;
			} else {
			return 0;
			}
	}

	public double cantidadPorAntiguedad() {
		return 50 * this.getAntiguedad();
	}

	@Override
	double sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() + this.salarioFamiliar() + this.getAntiguedad();
	}

	@Override
	double retenciones() {
		// TODO Auto-generated method stub
		return this.obraSocial() + this.aportesJubilatorios();
	}

	public double obraSocial() {
		return (10 * this.sueldoBruto() / 100) + this.cantidadParaObraSocialPorHijo();
	}

	public double cantidadParaObraSocialPorHijo() {
		return 25 * this.getCantidadHijos();
	}

	public double aportesJubilatorios() {
		return (15 * this.sueldoBruto() / 100);
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getAsignacionPorHijo() {
		return asignacionPorHijo;
	}

	public void setAsignacionPorHijo(float asignacionPorHijo) {
		this.asignacionPorHijo = asignacionPorHijo;
	}

	public double getAsignacionPorConyugue() {
		return asignacionPorConyugue;
	}

	public void setAsignacionPorConyugue(float asignacionPorConyugue) {
		this.asignacionPorConyugue = asignacionPorConyugue;
	}

	public Permanente(String nombre, String direccion, boolean soltero, int fechaDeNacimiento, double sueldoBasico,
			int cantidadHijos, int antiguedad, double asignacionPorHijo, double asignacionPorConyugue) {
		super(nombre, direccion, soltero, fechaDeNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad = antiguedad;
		this.asignacionPorHijo = asignacionPorHijo;
		this.asignacionPorConyugue = asignacionPorConyugue;
	}
	

}
