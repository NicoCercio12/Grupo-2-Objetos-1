package Modelo;

public class DetalleVenta {
	//Atributos
	private Plato plato;
	private int cantidad;
	
	//Constructor
	public DetalleVenta(Plato plato, int cantidad) {
		super();
		this.plato = plato;
		this.cantidad = cantidad;
	}
		
		// Getters & Setters
			public Plato getPlato() {
		return plato;
	}
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
		//Funciones
}
