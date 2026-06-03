package Modelo;

public class FoodTrack {
	//Atributos
	private String patente;
	private boolean usaElectricidad;
	

		//Constructor
		public FoodTrack(String patente, boolean usaElectricidad) {
		super();
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
