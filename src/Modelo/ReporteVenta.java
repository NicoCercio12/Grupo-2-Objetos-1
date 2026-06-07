package Modelo;

public class ReporteVenta {

    private UnidadDeVenta unidad;
    private double recaudacion;
    
    public ReporteVenta(UnidadDeVenta unidad, double recaudacion) {
        this.unidad = unidad;
        this.recaudacion = recaudacion;
    }

    public UnidadDeVenta getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDeVenta unidad) {
        this.unidad = unidad;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    @Override
    public String toString() {
        return "ReporteVenta [unidad=" + unidad + ", recaudacion=" + recaudacion + ", toString()=" + super.toString()
                + "]";
    }

    
    
}
