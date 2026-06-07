package Modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class UnidadDeVenta {
	// Atributos
	private int idUnidad;
	private String nombreComercial;
	private Empleado empleadoResponsable;
	private double superficie;
	private String codigo;
	private List<Plato> lstPlatos = new ArrayList<Plato>();
	private List<Empleado> lstEmpleados = new ArrayList<Empleado>();

	// Constructor

	public UnidadDeVenta(int idUnidad, String nombreComercial, Empleado empleadoResponsable, double superficie,
			String codigo) {
		super();
		this.idUnidad = idUnidad;
		this.nombreComercial = nombreComercial;
		this.empleadoResponsable = empleadoResponsable;
		this.superficie = superficie;
		this.codigo = codigo;
		this.lstPlatos = new ArrayList<Plato>();
		this.lstEmpleados = new ArrayList<Empleado>();
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

	public boolean agregarPlato(Plato plato) {

		int i = 0;
		boolean existe = false;
		boolean agregado = false;

		while (i < lstPlatos.size() && !existe) {

			Plato p = lstPlatos.get(i);

			if (p.equals(plato)) {
				existe = true;
			}

			i++;
		}

		if (!existe) {
			agregado = lstPlatos.add(plato);
		}

		return agregado;
	}
	
	/* CU29 */
    public boolean agregarEmpleado(Empleado empleado) {
        boolean resultado = false;
        if (empleado != null && !lstEmpleados.contains(empleado)) {
            lstEmpleados.add(empleado);
            resultado = true;
        }
        return resultado;
    }

	@Override
	public String toString() {
		return "UnidadesDeVenta [idUnidad=" + idUnidad + ", nombreComercial=" + nombreComercial
				+ ", empleadoResponsable=" + empleadoResponsable + ", superficie=" + superficie + ", codigo=" + codigo
				+ ", lstPlatos=" + lstPlatos + ", lstEmpleados=" + lstEmpleados + "]";
	}

	
}
