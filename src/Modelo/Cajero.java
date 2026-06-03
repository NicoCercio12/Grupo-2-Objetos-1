package Modelo;

public class Cajero {

	
	//Atributos
	private String turno;
	private double sueldoBase;
		//Constructor
	public Cajero(String turno, double sueldoBase) {
		super();
		this.turno = turno;
		this.sueldoBase = sueldoBase;
	}
	// Getters & Setters
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
		

		
		//Funciones
}
