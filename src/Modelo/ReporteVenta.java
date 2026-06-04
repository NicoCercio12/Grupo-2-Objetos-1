package Modelo;

public class ReporteVenta {

    private UnidadesDeVenta unidad;
    private double recaudacion;
    
    public ReporteVenta(UnidadesDeVenta unidad, double recaudacion) {
        this.unidad = unidad;
        this.recaudacion = recaudacion;
    }

    public UnidadesDeVenta getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadesDeVenta unidad) {
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
