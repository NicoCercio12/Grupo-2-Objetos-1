package Modelo;

public class Cocinero {
	//Atributos
	private String especialidad;
	private double plusCategoria;
	private double sueldoBase;
		//Constructor
	public Cocinero(String especialidad, double plusCategoria, double sueldoBase) {
		super();
		this.especialidad = especialidad;
		this.plusCategoria = plusCategoria;
		this.sueldoBase = sueldoBase;
	}
		// Getters & Setters
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public double getPlusCategoria() {
		return plusCategoria;
	}
	public void setPlusCategoria(double plusCategoria) {
		this.plusCategoria = plusCategoria;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
		//Funciones
}
