package ar.edu.unq.po2.tp2;

abstract class Empleado {
	private String nombre;
	private String direccion;
	public boolean soltero;
	private int fechaDeNacimiento;
	private double sueldoBasico;

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public int edadEmpleado(int fechaActual) {
		return fechaActual - this.getFechaDeNacimiento();
	}

	public double sueldoNeto() {
		return this.sueldoBruto()-this.retenciones();
	}

	abstract double sueldoBruto();

	abstract double retenciones();

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

	public Empleado(String nombre, String direccion, boolean soltero, int fechaDeNacimiento, double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.soltero = soltero;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	

}
