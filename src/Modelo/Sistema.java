package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


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

	/* CU1 */
	public Festival traerFestival(String nombreFestival) {
		Festival festival = null;
		int i = 0;

		while (festival == null && i < lstFestivales.size()) {
			if (lstFestivales.get(i).getNombre().equals(nombreFestival)) {
				festival = lstFestivales.get(i);
			}
			i++;
		}
		return festival;
	}
	public Festival traerFestivalPorId(int festivalId) {
		Festival festival = null;
		int i = 0;

		while (festival == null && i < lstFestivales.size()) {
			if (lstFestivales.get(i).getIdFestival() == festivalId) {
				festival = lstFestivales.get(i);
			}
			i++;
		}
		return festival;
	}

	/* CU2 */
	public boolean agregarFestival(String nombre, String temporada, String tematica, LocalDate fechaInicio,
			LocalDate fechaFin) throws Exception {
		int id = 1;

		if (traerFestival(nombre) != null) {
			throw new Exception("El festival " + nombre + " ya existe");
		}

		if (!lstFestivales.isEmpty()) {
			id = (lstFestivales.get(lstFestivales.size() - 1).getIdFestival() + 1);
		}
		return lstFestivales.add(new Festival(id, nombre, temporada, tematica, fechaInicio, fechaFin));
	}

	/* CU3 */
	public boolean eliminarFestival(String NombreFestival) throws Exception {
		Festival festivalEliminar = traerFestival(NombreFestival);
		if (festivalEliminar == null) {
			throw new Exception("ERROR: el festival no existe");
		}
		return lstFestivales.remove(festivalEliminar);
	}

	/* CU4 */
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

	/* CU5 */
	public UnidadesDeVenta traerUnidadDeVenta(int idUnidad) {
		int i = 0;
		UnidadesDeVenta encontrada = null;

		while (i < lstUnidadesDeVenta.size() && encontrada == null) {

			UnidadesDeVenta u = lstUnidadesDeVenta.get(i);

			if (u.getIdUnidad() == idUnidad) {
				encontrada = u;
			}
			i++;
		}
		return encontrada;
	}

	/* CU6 */
	public boolean agregarFoodTruck(String nombreComercial, Empleado responsable, double superficie, String codigo,
			String patente, boolean usaElectricidad) throws Exception {

		if (traerUnidad(codigo) != null) {
			throw new Exception("ERROR: ya existe la unidad");
		}

		int id = 1;
		if (!lstUnidadesDeVenta.isEmpty()) {
			id = lstUnidadesDeVenta.get(lstUnidadesDeVenta.size() - 1).getIdUnidad() + 1;
		}

		UnidadesDeVenta agregar = new FoodTrack(id, nombreComercial, responsable, superficie, codigo, lstPlatos,
				lstEmpleados, patente, usaElectricidad);
		return lstUnidadesDeVenta.add(agregar);
	}
	/* CU7 */

	public boolean agregarPuestoDesarmable(String nombreComercial, Empleado responsable, double superficie,
			String codigo, int cantidadCarpas, int tiempoMontaje) throws Exception {
		int id = 1;
		if (traerUnidad(codigo) != null) {
			throw new Exception("Error ya existe la unidad:" + codigo);
		}
		if (!lstUnidadesDeVenta.isEmpty()) {
			id = lstUnidadesDeVenta.get(lstUnidadesDeVenta.size() - 1).getIdUnidad() + 1;
		}
		return lstUnidadesDeVenta.add(new PuestoDesarmable(id, nombreComercial, responsable, superficie, codigo,
				lstPlatos, lstEmpleados, cantidadCarpas, tiempoMontaje));
	}

	/* CU8 */
	public boolean eliminarUnidad(String codigo) throws Exception {

		UnidadesDeVenta unidadEliminar = traerUnidad(codigo);

		if (unidadEliminar == null) {

			throw new Exception("ERROR: La unidad de venta no existe");
		}

		return lstUnidadesDeVenta.remove(unidadEliminar);

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

	/* CU10 */
	/* CU11 */
	public boolean agregarCajero(String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, double sueldoBase, String turno) throws Exception {
		int id = 1;
		if (traerEmpleado(dni) != null) {
			throw new Exception("Error ya existe el empleado: " + dni);
		}
		if (!lstEmpleados.isEmpty()) {
			id = lstEmpleados.get(lstEmpleados.size() - 1).getIdEmpleado() + 1;
		}

		return lstEmpleados
				.add(new Cajero(id, nombre, apellido, fechaNacimiento, dni, sueldoBase, fechaIngreso, turno));
	}
	/* CU12 */
	/* CU13 */
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
	/* CU14 */
	/* CU15 */

	public List<Pedido> traerPedidos(){
		 List<Pedido> resultado = new ArrayList<>();
		    int i = 0;

		    while (i < lstPedidos.size()) {
		        Pedido p = lstPedidos.get(i);
		            resultado.add(p);
		        i++;
		    }
		    return resultado;

	}
	/* CU16 */
	public List<Pedido> traerPedidos(LocalDate fecha) {

		List<Pedido> pedidos = new ArrayList<Pedido>();

		for (Pedido p : lstPedidos) {

			if (p.getFecha().equals(fecha)) {

				pedidos.add(p);
			}

		}

		return pedidos;
	}

	public List<ReporteVenta> traerReporteRecaudacion(String nombre) {

		List<ReporteVenta> reporteRecaudacion = new ArrayList<ReporteVenta>();

		for (Pedido p : lstPedidos) {

			if (p.getFestival().getNombre().equalsIgnoreCase(nombre)) {

				double totalRecaudado = 0.0;

				for (DetalleVenta d : p.getLstDetalleVentas()) {

					totalRecaudado += d.getPlato().getCostoVenta() * d.getCantidad();
				}

				// No es una lista persistente, funciona como DTO. Por eso hago una agregar de
				// esta manera

				reporteRecaudacion.add(new ReporteVenta(p.getUnidadDeVenta(), totalRecaudado));
			}
		}

		return reporteRecaudacion;
	}
	
    
	/* CU19 */
    public boolean agregarPedidoValidado(LocalDate fecha, int idFestival, String codigoUnidad) throws Exception{
    	Festival festival = traerFestivalPorId(idFestival);
    	if(festival == null) {
    		throw new Exception("El festival con id "+ idFestival + " no existe");
    	}
    	
    	if(fecha.isBefore(festival.getFechaInicio()) || fecha.isAfter(festival.getFechaFin())) {
    		 throw new Exception("La fecha del pedido no corresponde al festival");
    	}
    	
    	UnidadesDeVenta unidad = traerUnidadDeVenta(idFestival);
    	if(unidad == null) {
    		 throw new Exception("La unidad de venta con código " + codigoUnidad + " no existe en el festival");
    	}
    	int id = 1;
    	

		if (!lstPedidos.isEmpty()) {
			id = (lstPedidos.get(lstPedidos.size() - 1).getIdPedido() + 1);
		}
		return lstPedidos.add(new Pedido(id, fecha, festival, unidad));
    }
    
	
	


	
	
	
}
	


