package Modelo;

import java.time.LocalDate;

public class Cajero extends Empleado {

	private String turno;
	private double sueldoBase;
	
	public Cajero(int idEmpleado, String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, String turno,double sueldoBase) {
		super(idEmpleado, nombre, apellido, dni, fechaNacimiento, fechaIngreso);
		this.turno = turno;
		this.sueldoBase = sueldoBase;
	}

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

	@Override
	public String toString() {
		return "Cajero [idEmpleado=" + idEmpleado + ", turno=" + turno + ",sueldoBase="+ sueldoBase +", nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + "]";
	}

	@Override
	public double liquidarHaberes(){
		double total = sueldoBase;

		if (turno.equalsIgnoreCase("Noche")){
			total+=10000; 
		}
		
		return total;
	}

}
