package Modelo;

import java.time.LocalDate;

public class Cocinero extends Empleado{
	//Atributos
	private String especialidad;
	private double plusCategoria;
	private double sueldoBase;
		//Constructor
	public Cocinero(int idEmpleado, String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate antiguedad, String especialidad, double plusCategoria, double sueldoBase) {
		super(idEmpleado, nombre, apellido,dni, fechaNacimiento, antiguedad);
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
	
}
