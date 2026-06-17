package Modelo;

import java.time.LocalDate;
import java.time.Period;

public class Cajero extends Empleado {

	private String turno;

	public Cajero(int idEmpleado, String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, double sueldoBase, String turno) throws Exception {
		super(idEmpleado, nombre, apellido, dni, fechaNacimiento, fechaIngreso, sueldoBase);
		this.turno = turno;
	}

	public Cajero(String turno) {
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	// CASO DE USO 26, RESPONSABLE: Maximo Magrassi

	@Override
	public double liquidarHaberes() {
		int anios = Period.between(fechaIngreso, LocalDate.now()).getYears();
		return Constantes.SUELDO_BASE + (anios * Constantes.PLUS_ANTIGUEDAD);
	}

	@Override
	public String toString() {
		return "Cajero [idEmpleado=" + idEmpleado + ", turno=" + turno + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso
				+ ", sueldoBase=" + sueldoBase + "]";
	}

}
