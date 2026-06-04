package Modelo;

import java.time.LocalDate;

public class Cajero extends Empleado {

	// Atributos
	private String turno;

	public Cajero(int idEmpleado, String nombre, String apellido, LocalDate fechaNacimiento, String dni,
			double sueldoBase, LocalDate fechaIngreso, String turno) {
		super(idEmpleado, nombre, apellido, fechaNacimiento, dni, sueldoBase, fechaIngreso);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Cajero [turno=" + turno + ", idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", dni=" + dni + ", sueldoBase=" + sueldoBase
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}

		
		//Funciones
}
