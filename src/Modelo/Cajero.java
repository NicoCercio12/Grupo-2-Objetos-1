package Modelo;

import java.time.LocalDate;

public class Cajero extends Empleado {

	private String turno;

	public Cajero(int idEmpleado, String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, String turno) {
		super(idEmpleado, nombre, apellido, dni, fechaNacimiento, fechaIngreso);
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
		return "Cajero [idEmpleado=" + idEmpleado + ", turno=" + turno + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + "]";
	}

}
