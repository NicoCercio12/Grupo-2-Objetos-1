package Modelo;

import java.time.LocalDate;

public class Cocinero extends Empleado {

	private String especialidad;
	private double plusCategoria;

	public Cocinero(int idEmpleado, String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, double sueldoBase, String especialidad, double plusCategoria) {
		super(idEmpleado, nombre, apellido, dni, fechaNacimiento, fechaIngreso, sueldoBase);
		this.especialidad = especialidad;
		this.plusCategoria = plusCategoria;
	}

	public Cocinero(String especialidad, double plusCategoria) {
		this.especialidad = especialidad;
		this.plusCategoria = plusCategoria;
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

	@Override
	public double liquidarHaberes() {
		return sueldoBase + plusCategoria;
	}

	@Override
	public String toString() {
		return "Cocinero [idEmpleado=" + idEmpleado + ", especialidad=" + especialidad + ", nombre=" + nombre
				+ ", plusCategoria=" + plusCategoria + ", apellido=" + apellido + ", dni=" + dni + ", fechaNacimiento="
				+ fechaNacimiento + ", fechaIngreso=" + fechaIngreso + ", sueldoBase=" + sueldoBase + "]";
	}

}
