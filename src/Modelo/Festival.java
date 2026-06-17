package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Festival {

	private int idFestival;
	private String nombre;
	private String temporada;
	private String tematica;
	private String lugar;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List<UnidadDeVenta> lstUnidadDeVenta;

	public Festival(int idFestival, String nombre, String temporada, String tematica, String lugar,
			LocalDate fechaInicio,
			LocalDate fechaFin) {
		super();
		this.idFestival = idFestival;
		this.nombre = nombre;
		this.temporada = temporada;
		this.tematica = tematica;
		this.lugar = lugar;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.lstUnidadDeVenta = new ArrayList<>();

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

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
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

	public List<UnidadDeVenta> getLstUnidadDeVenta() {
		return lstUnidadDeVenta;
	}


	public boolean equals(Festival festival) {
		return this.fechaInicio.equals(festival.getFechaInicio()) && this.fechaFin.equals(festival.getFechaFin()); 
	}

	//CASO DE USO 27, RESPONSABLE: Gian Franco Denaro

	public boolean agregarUnidadAlFestival(UnidadDeVenta unidad) {

		int i = 0;
		boolean existe = false;
		boolean agregado = false;

		while(i < lstUnidadDeVenta.size() && !existe) {

			UnidadDeVenta u = lstUnidadDeVenta.get(i);

			if(u.equals(unidad)){
				existe = true;
			}

			i++;
		}

		if(!existe) {
			agregado = lstUnidadDeVenta.add(unidad);
		}

		return agregado;
	}

	@Override
	public String toString() {
		return "Festival [idFestival=" + idFestival + ", nombre=" + nombre + ", temporada=" + temporada + ", tematica="
				+ tematica + ", lugar=" + lugar + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", lstUnidadDeVenta=" + lstUnidadDeVenta + "]";
	}

	

}
