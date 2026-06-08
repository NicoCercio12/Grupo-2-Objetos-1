package Modelo;

import java.time.LocalDate;

public class Cocinero extends Empleado {

	private String especialidad;
	private double plusCategoria;
	private double sueldoBase;

	public Cocinero(int idEmpleado, String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, String especialidad, double plusCategoria, double sueldoBase) {
		super(idEmpleado, nombre, apellido, dni, fechaNacimiento, fechaIngreso);
		this.especialidad = especialidad;
		this.plusCategoria = plusCategoria;
		this.sueldoBase = sueldoBase;
	}

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

	@Override
	public double liquidarHaberes() {
		return sueldoBase + plusCategoria;
	}


	@Override
	public String toString() {
		return "Cocinero [idEmpleado=" + idEmpleado + ", especialidad=" + especialidad + ", nombre=" + nombre
				+ ", plusCategoria=" + plusCategoria + ", apellido=" + apellido + ", sueldoBase=" + sueldoBase
				+ ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + "]";
	}

	

}
