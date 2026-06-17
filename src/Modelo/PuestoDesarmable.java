package Modelo;

public class PuestoDesarmable extends UnidadDeVenta {

	private int cantidadCarpas;
	private int tiempoMontajeMinutos;

	public PuestoDesarmable(int idUnidad, String nombreComercial, Empleado empleado, double superficie,
			String codigo, int cantidadCarpas, int tiempoMontajeMinutos) throws Exception {
		super(idUnidad, nombreComercial, empleado, superficie, codigo);
		this.cantidadCarpas = cantidadCarpas;
		this.tiempoMontajeMinutos = tiempoMontajeMinutos;
	}

	public int getCantidadCarpas() {
		return cantidadCarpas;
	}

	public void setCantidadCarpas(int cantidadCarpas) {
		this.cantidadCarpas = cantidadCarpas;
	}

	public int getTiempoMontajeMinutos() {
		return tiempoMontajeMinutos;
	}

	public void setTiempoMontajeMinutos(int tiempoMontajeMinutos) {
		this.tiempoMontajeMinutos = tiempoMontajeMinutos;
	}

	// CASO DE USO 28, RESPONSABLE: Maximo Magrassi

	@Override
	public double calcularCanon() {
		return (getSuperficie() * Constantes.COSTO_POR_SUPERFICIE)
				- (tiempoMontajeMinutos * Constantes.COSTO_POR_MONTAJE);
	}

	@Override
	public String toString() {
		return "PuestoDesarmable [cantidadCarpas=" + cantidadCarpas + ", tiempoMontajeMinutos=" + tiempoMontajeMinutos
				+ "]";
	}

}
