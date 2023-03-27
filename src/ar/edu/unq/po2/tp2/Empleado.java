package ar.edu.unq.po2.tp2;

abstract class Empleado {
	private String nombre;
	private String direccion;
	public Boolean soltero;
	private int fechaDeNacimiento;
	private float sueldoBasico;

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public int edadEmpleado(int fechaActual) {
		return fechaActual - this.getFechaDeNacimiento();
	}

	public float sueldoNeto() {
		return this.sueldoBruto()-this.retenciones();
	}

	abstract float sueldoBruto();

	abstract float retenciones();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Boolean getSoltero() {
		return soltero;
	}

	public void setSoltero(Boolean soltero) {
		this.soltero = soltero;
	}

	public int getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(int fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

}
