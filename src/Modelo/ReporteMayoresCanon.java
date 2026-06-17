package Modelo;

public class ReporteMayoresCanon {

    private UnidadDeVenta unidad;
    private double canon;

    public ReporteMayoresCanon(UnidadDeVenta unidad, double canon) {
        this.unidad = unidad;
        this.canon = canon;
    }

    public UnidadDeVenta getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDeVenta unidad) {
        this.unidad = unidad;
    }

    public double getCanon() {
        return canon;
    }

    public void setCanon(double canon) {
        this.canon = canon;
    }

    public boolean equals(ReporteMayoresCanon reporteMayoresCanon) {
        return this.unidad.equals(reporteMayoresCanon.unidad);
    }

    @Override
    public String toString() {
        return "ReporteMayoresCanon [unidad=" + unidad + ", canon=" + canon + "]";
    }
}