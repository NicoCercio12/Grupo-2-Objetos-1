package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;





public class Festival {
	//Atributos
	private int idFestival;
	private String nombre;
	private String temporada;
	private String tematica;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List<UnidadesDeVenta> lstUnidadDeVenta = new ArrayList<UnidadesDeVenta>();
	
		//Constructor
		/*public Festival(int idFestival, String nombre, String temporada, String tematica, LocalDate fechaInicio,
			LocalDate fechaFin, List<UnidadesDeVenta> lstUnidadDeVenta) {
		super();
		this.idFestival = idFestival;
		this.nombre = nombre;
		this.temporada = temporada;
		this.tematica = tematica;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.lstUnidadDeVenta = lstUnidadDeVenta;
	}*/
		public Festival(int idFestival, String nombre, String temporada, String tematica, LocalDate fechaInicio,
				LocalDate fechaFin) {
			super();
			this.idFestival = idFestival;
			this.nombre = nombre;
			this.temporada = temporada;
			this.tematica = tematica;
			this.fechaInicio = fechaInicio;
			this.fechaFin = fechaFin;
			
		}
		public Festival() {
	
		}
		
		// Getters & Setters
		public int getIdFestival() {
			return idFestival;
		}

		public void setIdFestival(int idFestival) {
			this.idFestival = idFestival;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTemporada() {
			return temporada;
		}

		public void setTemporada(String temporada) {
			this.temporada = temporada;
		}

		public String getTematica() {
			return tematica;
		}

		public void setTematica(String tematica) {
			this.tematica = tematica;
		}

		public LocalDate getFechaInicio() {
			return fechaInicio;
		}

		public void setFechaInicio(LocalDate fechaInicio) {
			this.fechaInicio = fechaInicio;
		}

		public LocalDate getFechaFin() {
			return fechaFin;
		}

		public void setFechaFin(LocalDate fechaFin) {
			this.fechaFin = fechaFin;
		}

		public List<UnidadesDeVenta> getLstUnidadDeVenta() {
			return lstUnidadDeVenta;
		}

		public void setLstUnidadDeVenta(List<UnidadesDeVenta> lstUnidadDeVenta) {
			this.lstUnidadDeVenta = lstUnidadDeVenta;
		}
		@Override
		public String toString() {
			return "Festival [idFestival=" + idFestival + ", nombre=" + nombre + ", temporada=" + temporada
					+ ", tematica=" + tematica + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
		}
	

		
		//Funciones
}
