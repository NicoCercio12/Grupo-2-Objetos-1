package Modelo;

import java.time.LocalDate;

public class Cocinero extends Empleado {
	// Atributos
	private String especialidad;
	private double plusCategoria;

	// Constructor
	public Cocinero(int idEmpleado, String nombre, String apellido, LocalDate fechaNacimiento, String dni,
			double sueldoBase, LocalDate fechaIngreso, String especialidad, double plusCategoria) {
		super(idEmpleado, nombre, apellido, fechaNacimiento, dni, sueldoBase, fechaIngreso);
		this.especialidad = especialidad;
		this.plusCategoria = plusCategoria;
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
