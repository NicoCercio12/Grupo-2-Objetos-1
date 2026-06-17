package Modelo;

import java.time.LocalDate;
import java.time.Period;


public abstract class Empleado {

	protected int idEmpleado;
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected LocalDate fechaNacimiento;
	protected LocalDate fechaIngreso;
	protected double sueldoBase;

	public Empleado(int idEmpleado, String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, double sueldoBase) throws Exception {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		setFechaNacimiento(fechaNacimiento);
		this.fechaIngreso = fechaIngreso;
		this.sueldoBase = sueldoBase;
	}

	public Empleado() {
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) throws Exception {
		int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
		if (edad < Constantes.EDAD_MINIMA) {
			throw new Exception("ERROR: El empleado debe ser mayor de edad");
		}
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public boolean equals(Empleado empleado) {
		return this.dni.equalsIgnoreCase(empleado.getDni());
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	// CASO DE USO 26, RESPONSABLE: Maximo Magrassi

	public abstract double liquidarHaberes();

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + "]";
	}

}
