package Modelo;

import java.util.ArrayList;
import java.util.List;

public class UnidadesDeVenta {
	//Atributos
	private int idUnidad;
	private String nombreComercial;
	private Empleado empleadoResponsable;
	private double superficie;
	private String codigo;
	private List<Plato> lstPlatos = new ArrayList<Plato>();
	private List<Empleado> lstEmpleados = new ArrayList<Empleado>();
	
	
	
	//Constructor
	
	public UnidadesDeVenta(int idUnidad, String nombreComercial, Empleado empleadoResponsable, double superficie,
			String codigo, List<Plato> lstPlatos, List<Empleado> lstEmpleados) {
		super();
		this.idUnidad = idUnidad;
		this.nombreComercial = nombreComercial;
		this.empleadoResponsable = empleadoResponsable;
		this.superficie = superficie;
		this.codigo = codigo;
		this.lstPlatos = lstPlatos;
		this.lstEmpleados = lstEmpleados;
	}
	
	
	
	
	
	// Getters & Setters
	public int getIdUnidad() {
		return idUnidad;
	}
	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public Empleado getEmpleadoResponsable() {
		return empleadoResponsable;
	}
	public void setEmpleadoResponsable(Empleado empleadoResponsable) {
		this.empleadoResponsable = empleadoResponsable;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<Plato> getLstPlatos() {
		return lstPlatos;
	}
	public void setLstPlatos(List<Plato> lstPlatos) {
		this.lstPlatos = lstPlatos;
	}
	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}
	public void setLstEmpleados(List<Empleado> lstEmpleados) {
		this.lstEmpleados = lstEmpleados;
	}
	
	
		
	
		
		//Funciones
}
