package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	// Atributos
	private List<Festival> lstFestivales;
	private List<UnidadesDeVenta> lstUnidadesDeVenta;
	private List<Empleado> lstEmpleados;
	private List<Plato> lstPlatos;
	private List<Pedido> lstPedidos;

	public Sistema() {
		this.lstFestivales = new ArrayList<Festival>();
		this.lstUnidadesDeVenta = new ArrayList<UnidadesDeVenta>();
		this.lstEmpleados = new ArrayList<Empleado>();
		this.lstPlatos = new ArrayList<Plato>();
		this.lstPedidos = new ArrayList<Pedido>();
	}

	public List<UnidadesDeVenta> getLstUnidadesDeVenta() {
		return lstUnidadesDeVenta;
	}

	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}

	public List<Plato> getLstPlatos() {
		return lstPlatos;
	}

	public List<Pedido> getLstPedidos() {
		return lstPedidos;
	}

	public List<Festival> getLstFestivales() {
		return lstFestivales;
	}

	public Festival traerFestival(int idFestival) {
		int i = 0;
		Festival encontrado = null;

		while (i < lstFestivales.size() && encontrado == null) {

			Festival f = lstFestivales.get(i);

			if (f.getIdFestival() == (idFestival)) {
				encontrado = f;
			}
			i++;
		}
		return encontrado;
	}

	public UnidadesDeVenta traerUnidad(String codigo) {

		int i = 0;
		UnidadesDeVenta unidadDeVenta = null;

		while (i < lstUnidadesDeVenta.size() && unidadDeVenta == null) {

			UnidadesDeVenta u = lstUnidadesDeVenta.get(i);

			if (u.getCodigo().equalsIgnoreCase(codigo)) {

				unidadDeVenta = u;
			}

			i++;
		}

		return unidadDeVenta;
	}

	public List<Pedido> traerPedidos(LocalDate fecha) {

		List<Pedido> pedidos = new ArrayList<Pedido>();

		for (Pedido p : lstPedidos) {

			if (p.getFecha().equals(fecha)) {

				pedidos.add(p);
			}

		}

		return pedidos;
	}

	public boolean eliminarUnidad(String codigo) throws Exception {

		UnidadesDeVenta unidadEliminar = traerUnidad(codigo);

		if (unidadEliminar == null) {

			throw new Exception("ERROR: La unidad de venta no existe");
		}

		return lstUnidadesDeVenta.remove(unidadEliminar);

	}
	
	public Festival traerFestival(String nombre) {
		int i = 0;
		Festival encontrado = null;

		while (i < lstFestivales.size() && encontrado == null) {

			Festival f = lstFestivales.get(i);

			if (f.getNombre().equals(nombre)) {
				encontrado = f;
			}
			i++;
		}
		return encontrado;
	}

}
	

