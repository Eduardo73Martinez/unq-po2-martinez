package ar.edu.unq.po2.tp2;

public class Empresa {
	private String nombre;
	private String cuit;
	private Empleado[] empleados;
	public Recibo[] recibos;

	public float montoParaSueldosNeto() {
		for(Empleado[]:empleados) {
			
		}
	}

	public float montoParaSueldosBruto() {

	}

	public float montoRetenciones() {

	}

	public void generarReciboAEmpleado(Empleado x) {
	}

}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public Recibo[] getRecibos() {
		return recibos;
	}

	public void addRecibos(Recibo recibo) {
		recibos.addAll( recibo Collection);
}
