package Modelo;

public class DetalleVenta {

	private Plato plato;
	private int cantidad;

	public DetalleVenta(Plato plato, int cantidad) {
		super();
		this.plato = plato;
		this.cantidad = cantidad;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "DetalleVenta [plato=" + plato + ", cantidad=" + cantidad + "]";
	}

	

}
