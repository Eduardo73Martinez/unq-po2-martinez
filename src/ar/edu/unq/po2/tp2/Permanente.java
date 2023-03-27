package ar.edu.unq.po2.tp2;

public class Permanente extends Empleado {
	private int cantidadHijos;
	private int antiguedad;
	private float asignacionPorHijo;
	private float asignacionPorConyugue;

	public float salarioFamiliar() {
		return this.corresPondePorConyugue() + this.correspondePorHijo();
	}

	public float correspondePorHijo() {
		return this.getAsignacionPorHijo() * this.getCantidadHijos();
	}

	public float corresPondePorConyugue() {
		return this.getAsignacionPorConyugue() * this.cienSitieneConyugueCeroSiNo();
	}

	public float cienSitieneConyugueCeroSiNo() {
		return if( !this.getSoltero()) {100} else {0};
	}

	public float cantidadPorAntiguedad() {
		return 50 * this.getAntiguedad();
	}

	@Override
	float sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() + this.salarioFamiliar() + this.getAntiguedad();
	}

	@Override
	float retenciones() {
		// TODO Auto-generated method stub
		return this.obraSocial() + this.aportesJubilatorios();
	}

	public float obraSocial() {
		return (10 * this.sueldoBruto() / 100) + this.cantidadParaObraSocialPorHijo();
	}

	public float cantidadParaObraSocialPorHijo() {
		return 25 * this.getCantidadHijos();
	}

	public float aportesJubilatorios() {
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

	public float getAsignacionPorHijo() {
		return asignacionPorHijo;
	}

	public void setAsignacionPorHijo(float asignacionPorHijo) {
		this.asignacionPorHijo = asignacionPorHijo;
	}

	public float getAsignacionPorConyugue() {
		return asignacionPorConyugue;
	}

	public void setAsignacionPorConyugue(float asignacionPorConyugue) {
		this.asignacionPorConyugue = asignacionPorConyugue;
	}

}
