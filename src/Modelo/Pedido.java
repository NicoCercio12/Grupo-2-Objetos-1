package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	// Atributos
	private int idPedido;
	private LocalDate fecha;
	private Festival festival;
	private UnidadDeVenta unidadDeVenta;
	private List<DetalleVenta> lstDetalleVentas;

	// Constructor
	public Pedido(int idPedido, LocalDate fecha, Festival festival, UnidadDeVenta unidadDeVenta) {
		super();
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.festival = festival;
		this.unidadDeVenta = unidadDeVenta;
		this.lstDetalleVentas = new ArrayList<DetalleVenta>();
	}

	// Getters & Setters

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Festival getFestival() {
		return festival;
	}

	public void setFestival(Festival festival) {
		this.festival = festival;
	}

	public UnidadDeVenta getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(UnidadDeVenta unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}

	public List<DetalleVenta> getLstDetalleVentas() {
		return lstDetalleVentas;
	}


	// CASO DE USO 27, RESPONSABLE: Nicolas Cerciosimo

	public boolean agregarDetalleVenta(Plato plato, int cantidad) {
		return lstDetalleVentas.add(new DetalleVenta(plato, cantidad));
	}

	// CASO DE USO 28, RESPONSABLE: Leonardo Haron

	public DetalleVenta traerDetalleVenta(Plato plato) {

		int i = 0;
		DetalleVenta encontrado = null;

		while (i < lstDetalleVentas.size() && encontrado == null) {

			DetalleVenta d = lstDetalleVentas.get(i);

			if (d.getPlato().equals(plato)) {
				encontrado = d;
			}

			i++;
		}

		return encontrado;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", festival=" + festival + ", unidadDeVenta="
				+ unidadDeVenta + ", lstDetalleVentas=" + lstDetalleVentas + "]";
	}

}
