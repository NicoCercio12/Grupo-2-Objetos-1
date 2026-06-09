package Modelo;

public class ReporteMayoresCanon {

    private String nombreComercial;
    private String codigo;
    private String tipoUnidad;
    private double canon;

    public ReporteMayoresCanon(String nombreComercial, String codigo, String tipoUnidad, double canon) {
        this.nombreComercial = nombreComercial;
        this.codigo = codigo;
        this.tipoUnidad = tipoUnidad;
        this.canon = canon;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipoUnidad() {
        return tipoUnidad;
    }

    public double getCanon() {
        return canon;
    }

    @Override
    public String toString() {
        return "ReporteMayoresCanon [nombreComercial=" + nombreComercial + ", codigo=" + codigo +
                ", tipoUnidad=" + tipoUnidad + ", canon=" + canon + "]";
    }
}