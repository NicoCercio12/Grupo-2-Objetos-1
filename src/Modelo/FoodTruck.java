package Modelo;

public class FoodTruck extends UnidadDeVenta {

	private String patente;
	private boolean usaElectricidad;

	public FoodTruck(int idUnidad, String nombreComercial, Empleado empleadoResponsable, double superficie,
			String codigo, String patente, boolean usaElectricidad) {
		super(idUnidad, nombreComercial, empleadoResponsable, superficie, codigo);
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

	@Override
	public double calcularCanon() {
		double canonBase = getSuperficie() * 500;

		if (isUsaElectricidad()) {
			canonBase += 15000;
		}

		return canonBase;
	}

	@Override
	public String toString() {
		return "FoodTruck [patente=" + patente + ", usaElectricidad=" + usaElectricidad + "]";
	}

}
