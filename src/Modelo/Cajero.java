package Modelo;

import java.time.LocalDate;

public class Cajero extends Empleado {
	
	private String turno;

	public Cajero(int idEmpleado, String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate antiguedad, String turno) {
		super(idEmpleado, nombre, apellido, dni, fechaNacimiento, antiguedad);
		this.turno = turno;
	}

	public Cajero(String turno) {
		this.turno = turno;
	}

	public Cajero() {
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Cajero []";
	}

	
	

}
