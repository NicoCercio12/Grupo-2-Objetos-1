package Modelo;

import java.time.LocalDate;

public class Pedido {
	//Atributos
	private int idPedido;
	private LocalDate fecha;
	private Festival festival;
	private UnidadesDeVenta unidadDeVenta;

	
		//Constructor
			public Pedido(int idPedido, LocalDate fecha, Festival festival, UnidadesDeVenta unidadDeVenta) {
		super();
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.festival = festival;
		this.unidadDeVenta = unidadDeVenta;
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


			public UnidadesDeVenta getUnidadDeVenta() {
				return unidadDeVenta;
			}


			public void setUnidadDeVenta(UnidadesDeVenta unidadDeVenta) {
				this.unidadDeVenta = unidadDeVenta;
			}
	
	
		//Funciones
}
