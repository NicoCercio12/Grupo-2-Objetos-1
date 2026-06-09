package Modelo;

public class PuestoDesarmable extends UnidadDeVenta {

	private int cantidadCarpas;
	private int tiempoMontajeMinutos;

	public PuestoDesarmable(int idUnidad, String nombreComercial, Empleado empleadoResponsable, double superficie,
			String codigo, int cantidadCarpas, int tiempoMontajeMinutos) {
		super(idUnidad, nombreComercial, empleadoResponsable, superficie, codigo);
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

	@Override
	public double calcularCanon() {
		return (getSuperficie() * 500) - (tiempoMontajeMinutos * 10);
	}

	@Override
	public String toString() {
		return "PuestoDesarmable [cantidadCarpas=" + cantidadCarpas + ", tiempoMontajeMinutos=" + tiempoMontajeMinutos
				+ "]";
	}

}
