package Modelo;

import java.util.List;

public class FoodTrack extends UnidadesDeVenta{
	//Atributos
	private String patente;
	private boolean usaElectricidad;
	

		//Constructor
	public FoodTrack(int idUnidad, String nombreComercial, Empleado empleadoResponsable, double superficie,
			String codigo, List<Plato> lstPlatos, List<Empleado> lstEmpleados, String patente,
			boolean usaElectricidad) {
		super(idUnidad, nombreComercial, empleadoResponsable, superficie, codigo, lstPlatos, lstEmpleados);
		this.patente = patente;
		this.usaElectricidad = usaElectricidad;
	}
		// Getters & Setters
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	public boolean isUsaElectricidad() {
		return usaElectricidad;
	}
	public void setUsaElectricidad(boolean usaElectricidad) {
		this.usaElectricidad = usaElectricidad;
	}
	
	
		//Funciones
}
