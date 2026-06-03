package Modelo;

public class PuestoDesarmable {
	//Atributos
	private int cantidadCarpas;
	private int tiempoMontajeMinutos;
	
	
	
	
		//Constructor
		public PuestoDesarmable(int cantidadCarpas, int tiempoMontajeMinutos) {
		super();
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
