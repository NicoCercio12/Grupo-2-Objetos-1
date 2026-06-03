package Modelo;

public class Plato {
	
	//Atributos
	private int idPlato;
	private String nombre;
	private double costoProduccion;
	private double costoVenta;
	//Constructor
	public Plato(int idPlato, String nombre, double costoProduccion, double costoVenta) {
		super();
		this.idPlato = idPlato;
		this.nombre = nombre;
		this.costoProduccion = costoProduccion;
		this.costoVenta = costoVenta;
	}
	
	// Getters & Setters
	public int getIdPlato() {
		return idPlato;
	}
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCostoProduccion() {
		return costoProduccion;
	}
	public void setCostoProduccion(double costoProduccion) {
		this.costoProduccion = costoProduccion;
	}
	public double getCostoVenta() {
		return costoVenta;
	}
	public void setCostoVenta(double costoVenta) {
		this.costoVenta = costoVenta;
	}


	
	//Funciones
	
	
}
