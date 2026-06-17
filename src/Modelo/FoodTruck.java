package Modelo;

public class FoodTruck extends UnidadDeVenta {

	private String patente;
	private boolean usaElectricidad;

	public FoodTruck(int idUnidad, String nombreComercial, Empleado empleado, double superficie,
			String codigo, String patente, boolean usaElectricidad) throws Exception {
		super(idUnidad, nombreComercial, empleado, superficie, codigo);
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

	// CASO DE USO 28, RESPONSABLE: Maximo Magrassi

	@Override
	public double calcularCanon() {
		double canon = getSuperficie() * Constantes.COSTO_POR_SUPERFICIE;
		if (usaElectricidad) {
			canon += Constantes.PLUS_ELECTRICIDAD;
		}
		return canon;
	}

	@Override
	public String toString() {
		return "FoodTruck [patente=" + patente + ", usaElectricidad=" + usaElectricidad + "]";
	}

}
