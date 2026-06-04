package Modelo;

import java.util.List;

public class PuestoDesarmable extends UnidadesDeVenta {
	// Atributos
	private int cantidadCarpas;
	private int tiempoMontajeMinutos;

	// Constructor
	public PuestoDesarmable(int idUnidad, String nombreComercial, Empleado empleadoResponsable, double superficie,
			String codigo, List<Plato> lstPlatos, List<Empleado> lstEmpleados, int cantidadCarpas,
			int tiempoMontajeMinutos) {
		super(idUnidad, nombreComercial, empleadoResponsable, superficie, codigo, lstPlatos, lstEmpleados);
		this.cantidadCarpas = cantidadCarpas;
		this.tiempoMontajeMinutos = tiempoMontajeMinutos;
	}

	// Getters & Setters
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
		//Funciones
}
