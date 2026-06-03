package Modelo;

import java.time.LocalDate;

public abstract class Empleado {
	//Atributos
	protected int idEmpleado;
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaNacimiento;
	protected String dni;
	protected int antiguedad;

	
	
		//Constructor
		public Empleado(int idEmpleado, String nombre, String apellido, LocalDate fechaNacimiento, String dni,
			int antiguedad) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.antiguedad = antiguedad;
	}
		public Empleado() {
			}
	
		// Getters & Setters
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
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
		//Funciones
}
