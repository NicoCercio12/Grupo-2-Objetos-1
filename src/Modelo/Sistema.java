package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import paquete.Habitacion;

public class Sistema {
	// Atributos
	private List<Festival> lstFestivales;
	private List<UnidadesDeVenta> lstUnidadesDeVenta;
	private List<Empleado> lstEmpleados;
	private List<Plato> lstPlatos;
	private List<Pedido> lstPedidos;

	public Sistema() {
		this.lstFestivales = new ArrayList<Festival>();
		this.lstUnidadesDeVenta = new ArrayList<UnidadesDeVenta>();
		this.lstEmpleados = new ArrayList<Empleado>();
		this.lstPlatos = new ArrayList<Plato>();
		this.lstPedidos = new ArrayList<Pedido>();
	}

	public List<UnidadesDeVenta> getLstUnidadesDeVenta() {
		return lstUnidadesDeVenta;
	}

	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}

	public List<Plato> getLstPlatos() {
		return lstPlatos;
	}

	public List<Pedido> getLstPedidos() {
		return lstPedidos;
	}

	public List<Festival> getLstFestivales() {
		return lstFestivales;
	}

	/*CU1*/
	public UnidadesDeVenta traerUnidad(String codigo) {

		int i = 0;
		UnidadesDeVenta unidadDeVenta = null;

		while (i < lstUnidadesDeVenta.size() && unidadDeVenta == null) {

			UnidadesDeVenta u = lstUnidadesDeVenta.get(i);

			if (u.getCodigo().equalsIgnoreCase(codigo)) {

				unidadDeVenta = u;
			}

			i++;
		}

		return unidadDeVenta;
	}

	public List<Pedido> traerPedidos(LocalDate fecha) {

		List<Pedido> pedidos = new ArrayList<Pedido>();

		for (Pedido p : lstPedidos) {

			if (p.getFecha().equals(fecha)) {

				pedidos.add(p);
			}

		}

		return pedidos;
	}

	public boolean eliminarUnidad(String codigo) throws Exception {

		UnidadesDeVenta unidadEliminar = traerUnidad(codigo);

		if (unidadEliminar == null) {

			throw new Exception("ERROR: La unidad de venta no existe");
		}

		return lstUnidadesDeVenta.remove(unidadEliminar);

	}

	public Festival traerFestival(String nombre) {
        int i = 0;
        Festival encontrado = null;

        while (i < lstFestivales.size() && encontrado == null) {

            Festival f = lstFestivales.get(i);

            if (f.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = f;
            }
            i++;
        }
        return encontrado;
    }

    public UnidadesDeVenta traerUnidadDeVenta(int idUnidad) {
        int i = 0;
        UnidadesDeVenta encontrada = null;

        while(i < lstUnidadesDeVenta.size() && encontrada == null) {

            UnidadesDeVenta u = lstUnidadesDeVenta.get(i);

            if (u.getIdUnidad() == idUnidad) {
                encontrada = u;
            }
            i++;
        }
        return encontrada;
    }

	public boolean agregarFestival(String nombre, String temporada, String tematica, LocalDate fechaInicio, LocalDate fechaFin)throws Exception{
		
		int id=1;
        if(!lstFestivales.isEmpty()) {
            id=lstFestivales.get(lstFestivales.size()-1).getIdFestival()+1;
        }
        
		if(traerFestival(nombre)!=null) {
	        throw new Exception("ERROR: el festival ya existe");
	    }

        Festival agregar= new Festival(id, nombre, temporada, tematica, fechaInicio, fechaFin);
        return lstFestivales.add(agregar);
    }
	
	public boolean agregarFoodTruck(String nombreComercial, Empleado responsable, double superficie, String codigo, String patente, boolean usaElectricidad)throws Exception{
		
		if(traerUnidad(codigo) != null){
			throw new Exception("ERROR: ya existe la unidad");
		}
		
		int id=1;
        if(!lstUnidadesDeVenta.isEmpty()) {
            id=lstUnidadesDeVenta.get(lstUnidadesDeVenta.size()-1).getIdUnidad()+1;
        }
		
        UnidadesDeVenta agregar = new FoodTrack(id, nombreComercial, responsable, superficie, codigo, lstPlatos, lstEmpleados, patente, usaElectricidad);
        return lstUnidadesDeVenta.add(agregar);
	}
	
	/* CU9 */

    public Empleado traerEmpleado(String dni) {

        int i = 0;
        Empleado encontrado = null;

        while (i < lstEmpleados.size() && encontrado == null) {

            Empleado e = lstEmpleados.get(i);

            if (e.getDni().equalsIgnoreCase(dni)) {
                encontrado = e;
            }
        }
        return encontrado;
    }
    
    /* CU13-A */
    
    public Plato traerPlato(String nombre) {

        int i = 0;
        Plato encontrado = null;

        while (i < lstPlatos.size() && encontrado == null) {

            Plato p = lstPlatos.get(i);

            if (p.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = p;
            }
        }
        return encontrado;
    }
    /* CU13-B */
	public boolean agregarPlato(String nombre, double costoProduccion, double costoVenta) {

		boolean agregado = false;

		if (traerPlato(nombre) == null) {
			int id = 1;

			if (!lstPlatos.isEmpty()) {
				id = lstPlatos.get(lstPlatos.size() - 1).getIdPlato() + 1;
			}
			agregado = lstPlatos.add(new Plato(id,nombre,costoProduccion,costoVenta));
		}
		return agregado;
	}
    
    
	public List<ReporteVenta> traerReporteRecaudacion(String nombre) {

		List<ReporteVenta> reporteRecaudacion = new ArrayList<ReporteVenta>();

		for (Pedido p : lstPedidos) {

			if (p.getFestival().getNombre().equalsIgnoreCase(nombre)) {

				double totalRecaudado = 0.0;

				for (DetalleVenta d : p.getLstDetalleVentas()) {

					totalRecaudado += d.getPlato().getCostoVenta() * d.getCantidad();
				}

				//No es una lista persistente, funciona como DTO. Por eso hago una agregar de esta manera

				reporteRecaudacion.add(new ReporteVenta(p.getUnidadDeVenta(), totalRecaudado));
			}
		}

		return reporteRecaudacion;
	}

	


	
	
	
}
	


