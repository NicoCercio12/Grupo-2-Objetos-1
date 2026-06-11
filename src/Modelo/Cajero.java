package Modelo;

import java.time.LocalDate;

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

	//CASO DE USO 34, RESPONSABLE: Maximo Magrassi

	@Override
	public double liquidarHaberes() {
		double total = sueldoBase;

		if (turno.equalsIgnoreCase("Noche")) {
			total += 10000;
		}

		return total;
	}

	@Override
	public String toString() {
		return "Cajero [idEmpleado=" + idEmpleado + ", turno=" + turno + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso
				+ ", sueldoBase=" + sueldoBase + "]";
	}

}
