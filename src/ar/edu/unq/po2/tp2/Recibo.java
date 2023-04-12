package ar.edu.unq.po2.tp2;

public class Recibo {
	private String nombreEmpleado;
	private String direccion;
	private int fechaEmision;
	private double sueldoBruto;
	private double sueldoNeto;

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(int fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(Float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(Float sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

	public Recibo(String nombreEmpleado, String direccion, int fechaEmision, Float sueldoBruto, Float sueldoNeto) {
		super();
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
	}

}
