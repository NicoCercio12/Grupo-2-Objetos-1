package Modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class UnidadDeVenta {

	private int idUnidad;
	private String nombreComercial;
	private Empleado empleado;
	private double superficie;
	private String codigo;
	private List<Plato> lstPlatos;
	private List<Empleado> lstEmpleados;

	public UnidadDeVenta(int idUnidad, String nombreComercial, Empleado empleado, double superficie,
			String codigo) throws Exception {
		super();
		this.idUnidad = idUnidad;
		this.nombreComercial = nombreComercial;
		this.empleado = empleado;
		this.superficie = superficie;
		setCodigo(codigo);
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

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleadoResponsable(Empleado empleado) {
		this.empleado = empleado;
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

	public void setCodigo(String codigo) throws Exception {
		if (codigo == null || codigo.length() != Constantes.LONGITUD_CODIGO) {
			throw new Exception("ERROR: El código debe tener exactamente 10 caracteres");
		}
		this.codigo = codigo;
	}

	public List<Plato> getLstPlatos() {
		return lstPlatos;
	}

	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}

	public boolean equals(UnidadDeVenta unidad) {
		return this.codigo.equalsIgnoreCase(unidad.getCodigo());
	}

	// CASO DE USO 28, RESPONSABLE: Maximo Magrassi

	public abstract double calcularCanon();


	// CASO DE USO 29, RESPONSABLE: Leonardo Haron

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

	// CASO DE USO 30, RESPONSABLE: Leonardo Haron

	public boolean agregarEmpleado(Empleado empleado) {
		boolean resultado = false;
		if (empleado != null && !lstEmpleados.contains(empleado)) {
			lstEmpleados.add(empleado);
			resultado = true;
		}

		return resultado;
	}

	//CASO DE USO 31, RESPONSABLE: Maximo Magrassi

	public double liquidarHaberesTotal() {
		
		double total = 0.0;

		for (Empleado e : lstEmpleados) {
			total += e.liquidarHaberes();
		}
		return total;
	}

	
	@Override
	public String toString() {
		return "UnidadesDeVenta [idUnidad=" + idUnidad + ", nombreComercial=" + nombreComercial
				+ ", empleado=" + empleado + ", superficie=" + superficie + ", codigo=" + codigo
				+ ", lstPlatos=" + lstPlatos + ", lstEmpleados=" + lstEmpleados + "]";
	}

}
