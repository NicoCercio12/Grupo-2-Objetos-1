package Modelo;

import java.util.List;

public class PuestoDesarmable extends UnidadesDeVenta {
	//Atributos
	private int cantidadCarpas;
	private int tiempoMontajeMinutos;
	
	public PuestoDesarmable(int idUnidad, String nombreComercial, Empleado empleadoResponsable, double superficie,
			String codigo, List<Plato> lstPlatos, List<Empleado> lstEmpleados, int cantidadCarpas,
			int tiempoMontajeMinutos) {
		super(idUnidad, nombreComercial, empleadoResponsable, superficie, codigo, lstPlatos, lstEmpleados);
		this.cantidadCarpas = cantidadCarpas;
		this.tiempoMontajeMinutos = tiempoMontajeMinutos;
	}

	public int getCantidadCarpas() {
		return cantidadCarpas;
	}

	public void setCantidadCarpas(int cantidadCarpas) {
		this.cantidadCarpas = cantidadCarpas;
	}

	public int getTiempoMontajeMinutos() {
		return tiempoMontajeMinutos;
	}

	public void setTiempoMontajeMinutos(int tiempoMontajeMinutos) {
		this.tiempoMontajeMinutos = tiempoMontajeMinutos;
	}

	@Override
	public String toString() {
		return "PuestoDesarmable [cantidadCarpas=" + cantidadCarpas + ", tiempoMontajeMinutos=" + tiempoMontajeMinutos
				+ ", getCantidadCarpas()=" + getCantidadCarpas() + ", getTiempoMontajeMinutos()="
				+ getTiempoMontajeMinutos() + ", getIdUnidad()=" + getIdUnidad() + ", getNombreComercial()="
				+ getNombreComercial() + ", getEmpleadoResponsable()=" + getEmpleadoResponsable() + ", getSuperficie()="
				+ getSuperficie() + ", getCodigo()=" + getCodigo() + ", getLstPlatos()=" + getLstPlatos()
				+ ", getLstEmpleados()=" + getLstEmpleados() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
		
}
