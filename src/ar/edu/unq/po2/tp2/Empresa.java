package ar.edu.unq.po2.tp2;
import java.util.ArrayList;
public class Empresa {
	private String nombre;
	private String cuit;
	public Recibo[] recibos;
	private ArrayList<Empleado> empleados ;
	private double montoParaSueldosBruto ;
	private double montoParaSueldosNeto;
	private double retenciones;

	public void montoParaSueldosNeto() {
		for (Empleado empleado: empleados){
			montoParaSueldosNeto = montoParaSueldosNeto + empleado.sueldoNeto();
		}
	}

	public void montoParaSueldosBruto() {
		for (Empleado empleado: empleados){
			montoParaSueldosBruto = montoParaSueldosBruto + empleado.sueldoBruto();
		}
	}

	public void montoRetenciones() {
		for (Empleado empleado: empleados){
			retenciones = retenciones + empleado.retenciones();
		}
	}

	public void generarReciboAEmpleado(Empleado x) {
		
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

//	public Empleado[] getEmpleados() {
//		return this.empleados();
//	}

	public Recibo[] getRecibos() {
		return recibos;
	}

//	public void addRecibos(Recibo recibo) {
//		recibos.addAll( recibo Collection);
}
