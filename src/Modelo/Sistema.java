package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	// Atributos
	private List<Festival> lstFestivales;
	private List<UnidadDeVenta> lstUnidadDeVenta;
	private List<Empleado> lstEmpleados;
	private List<Plato> lstPlatos;
	private List<Pedido> lstPedidos;

	public Sistema() {
		this.lstFestivales = new ArrayList<Festival>();
		this.lstUnidadDeVenta = new ArrayList<UnidadDeVenta>();
		this.lstEmpleados = new ArrayList<Empleado>();
		this.lstPlatos = new ArrayList<Plato>();
		this.lstPedidos = new ArrayList<Pedido>();
	}

	public List<UnidadDeVenta> getLstUnidadDeVenta() {
		return lstUnidadDeVenta;
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

	// CASO DE USO 1, RESPONSABLE: Leonardo Harón

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

	// CASO DE USO 2, RESPONSABLE: Maximo Magrassi

	public boolean agregarFestival(String nombre, String temporada, String tematica, LocalDate fechaInicio,
			LocalDate fechaFin) throws Exception {

		if (traerFestival(nombre) != null) {
			throw new Exception("ERROR: el festival ya existe");
		}

		int id = 1;
		if (!lstFestivales.isEmpty()) {
			id = lstFestivales.get(lstFestivales.size() - 1).getIdFestival() + 1;
		}

		Festival agregar = new Festival(id, nombre, temporada, tematica, fechaInicio, fechaFin);
		return lstFestivales.add(agregar);
	}

	// CASO DE USO 3, RESPONSABLE: Gian Franco Del Pero

	public boolean eliminarFestival(String NombreFestival) throws Exception {
		Festival festivalEliminar = traerFestival(NombreFestival);
		if (festivalEliminar == null) {
			throw new Exception("ERROR: el festival no existe");
		}
		return lstFestivales.remove(festivalEliminar);
	}

	// CASO DE USO 4, RESPONSABLE: Nicolás Cerciosimo

	public UnidadDeVenta traerUnidad(String codigo) {

		int i = 0;
		UnidadDeVenta unidadDeVenta = null;

		while (i < lstUnidadDeVenta.size() && unidadDeVenta == null) {

			UnidadDeVenta u = lstUnidadDeVenta.get(i);

			if (u.getCodigo().equalsIgnoreCase(codigo)) {

				unidadDeVenta = u;
			}

			i++;
		}

		return unidadDeVenta;
	}

	// CASO DE USO 5, RESPONSABLE: Maximo Magrassi

	public boolean agregarFoodTruck(String nombreComercial, Empleado responsable, double superficie, String codigo,
			String patente, boolean usaElectricidad) throws Exception {

		if (traerUnidad(codigo) != null) {
			throw new Exception("ERROR: ya existe la unidad");
		}

		int id = 1;
		if (!lstUnidadDeVenta.isEmpty()) {
			id = lstUnidadDeVenta.get(lstUnidadDeVenta.size() - 1).getIdUnidad() + 1;
		}

		UnidadDeVenta agregar = new FoodTruck(id, nombreComercial, responsable, superficie, codigo, patente,
				usaElectricidad);
		return lstUnidadDeVenta.add(agregar);
	}

	// CASO DE USO 6, RESPONSABLE: Gian Franco De Naro

	public boolean agregarPuestoDesarmable(String nombreComercial, Empleado responsable, double superficie,
			String codigo, int cantidadCarpas, int tiempoMontaje) throws Exception {

		int id = 1;
		if (traerUnidad(codigo) != null) {
			throw new Exception("ERROR: ya existe la unidad:" + codigo);
		}
		if (!lstUnidadDeVenta.isEmpty()) {
			id = lstUnidadDeVenta.get(lstUnidadDeVenta.size() - 1).getIdUnidad() + 1;
		}
		return lstUnidadDeVenta.add(new PuestoDesarmable(id, nombreComercial, responsable, superficie, codigo,
				cantidadCarpas, tiempoMontaje));
	}

	// CASO DE USO 7, RESPONSABLE: Nicolás Cerciosimo

	public boolean eliminarUnidad(String codigo) throws Exception {

		UnidadDeVenta unidadEliminar = traerUnidad(codigo);

		if (unidadEliminar == null) {

			throw new Exception("ERROR: La unidad de venta no existe");
		}

		return lstUnidadDeVenta.remove(unidadEliminar);

	}

	// CASO DE USO 8, RESPONSABLE: Leonardo Haron

	public Empleado traerEmpleado(String dni) {

		int i = 0;
		Empleado encontrado = null;

		while (i < lstEmpleados.size() && encontrado == null) {

			Empleado e = lstEmpleados.get(i);

			if (e.getDni().equalsIgnoreCase(dni)) {
				encontrado = e;
			}

			i++;
		}
		return encontrado;
	}

	// CASO DE USO 9, RESPONSABLE: Maximo Magrassi

	public boolean agregarCocinero(String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, double sueldoBase, String especialidad, double plusCategoria) throws Exception {

		if (traerEmpleado(dni) != null) {
			throw new Exception("ERROR: ya existe el empleado con dni : " + dni);
		}

		int id = 1;
		if (!lstEmpleados.isEmpty()) {
			id = lstEmpleados.get(lstEmpleados.size() - 1).getIdEmpleado() + 1;
		}

		Empleado agregar = new Cocinero(id, nombre, apellido, dni, fechaNacimiento, fechaIngreso, sueldoBase,
				especialidad,
				plusCategoria);

		return lstEmpleados.add(agregar);
	}

	// CASO DE USO 10, RESPONSABLE: Gian Franco De Naro

	public boolean agregarCajero(String nombre, String apellido, String dni, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, double sueldoBase, String turno) throws Exception {

		int id = 1;
		if (traerEmpleado(dni) != null) {
			throw new Exception("ERROR: ya existe el empleado con dni: " + dni);
		}
		if (!lstEmpleados.isEmpty()) {
			id = lstEmpleados.get(lstEmpleados.size() - 1).getIdEmpleado() + 1;
		}

		return lstEmpleados
				.add(new Cajero(id, nombre, apellido, dni, fechaNacimiento, fechaIngreso, sueldoBase, turno));
	}

	// CASO DE USO 11, RESPONSABLE: Nicolas Cerciosimo

	public boolean eliminarEmpleado(String dni) throws Exception {

		Empleado empleadoEliminar = traerEmpleado(dni);

		if (empleadoEliminar == null) {

			throw new Exception("ERROR: no existe el empleado con dni: " + dni);
		}

		return lstEmpleados.remove(empleadoEliminar);
	}

	// CASO DE USO 12, RESPONSABLE: Leonardo Haron

	public boolean agregarPlato(String nombre, double costoProduccion, double costoVenta) {

		boolean agregado = false;

		if (traerPlato(nombre) == null) {
			int id = 1;

			if (!lstPlatos.isEmpty()) {
				id = lstPlatos.get(lstPlatos.size() - 1).getIdPlato() + 1;
			}
			agregado = lstPlatos.add(new Plato(id, nombre, costoProduccion, costoVenta));
		}
		return agregado;
	}

	// CASO DE USO 13, RESPONSABLE: Maximo Magrassi

	public boolean agregarPedido(LocalDate fecha, Festival festival, UnidadDeVenta codigoUnidad) {

		int id = 1;
		if (!lstPedidos.isEmpty()) {
			id = lstPedidos.get(lstPedidos.size() - 1).getIdPedido() + 1;
		}

		Pedido agregar = new Pedido(id, fecha, festival, codigoUnidad);
		return lstPedidos.add(agregar);
	}

	// CASO DE USO 14, RESPONSABLE: Gian Franco De Naro

	public List<Pedido> traerPedidos() {

		List<Pedido> resultado = new ArrayList<>();

		for (Pedido p : lstPedidos) {

			resultado.add(p);

		}

		return resultado;
	}

	// CASO DE USO 15, RESPONSABLE: Nicolas Cerciosimo

	public List<Pedido> traerPedidos(LocalDate fecha) {

		List<Pedido> pedidos = new ArrayList<Pedido>();

		for (Pedido p : lstPedidos) {

			if (p.getFecha().equals(fecha)) {

				pedidos.add(p);
			}

		}

		return pedidos;
	}

	// CASO DE USO 17, RESPONSABLE: Maximo Magrassi

	public double liquidarHaberes(String dni) {
		Empleado empleado = traerEmpleado(dni);

		double sueldoLiquidado = 0;

		if (empleado instanceof Cocinero) {
			Cocinero co = (Cocinero) empleado;
			sueldoLiquidado = co.getSueldoBase() + co.getPlusCategoria();
		}

		if (empleado instanceof Cajero) {
			Cajero ca = (Cajero) empleado;
			sueldoLiquidado = ca.getSueldoBase();
			if (ca.getTurno() != null && ca.getTurno().equalsIgnoreCase("Noche")) {
				sueldoLiquidado += 10000;
			}
		}

		return sueldoLiquidado;
	}

	// CASO DE USO 18, RESPONSABLE: Gian Franco De Naro

	public boolean agregarPedidoValidado(LocalDate fecha, String nombre, String codigoUnidad) throws Exception {
		Festival festival = traerFestival(nombre);
		if (festival == null) {
			throw new Exception("ERROR: El festival con id " + nombre + " no existe");
		}

		if (fecha.isBefore(festival.getFechaInicio()) || fecha.isAfter(festival.getFechaFin())) {
			throw new Exception("La fecha del pedido no corresponde al festival");
		}

		UnidadDeVenta unidad = traerUnidad(codigoUnidad);
		if (unidad == null) {
			throw new Exception("ERROR: La unidad de venta con código " + codigoUnidad + " no existe en el festival");
		}
		int id = 1;

		if (!lstPedidos.isEmpty()) {
			id = (lstPedidos.get(lstPedidos.size() - 1).getIdPedido() + 1);
		}
		return lstPedidos.add(new Pedido(id, fecha, festival, unidad));
	}

	// CASO DE USO 19, RESPONSABLE: Nicolas Cerciosimo

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

	// CASO DE USO 20, RESPONSABLE: Leonardo Haron

	public List<Empleado> traerPersonalPorFecha(LocalDate fechaDesde, LocalDate fechaHasta) {

		List<Empleado> empleados = new ArrayList<Empleado>();

		for (Empleado e : lstEmpleados) {

			if (!e.getFechaIngreso().isBefore(fechaDesde) && !e.getFechaIngreso().isAfter(fechaHasta)) {

				empleados.add(e);
			}
		}

		return empleados;
	}

	// CASO DE USO 21, RESPONSABLE: Maximo Magrassi

	public double calcularRentabilidadNeta(String codigo) {

		UnidadDeVenta unidad = traerUnidad(codigo);

		double ingresos = 0.0;
		double costos = 0.0;

		for (Pedido p : lstPedidos) {

			if (p.getUnidadDeVenta().getCodigo().equalsIgnoreCase(codigo)) {

				for (DetalleVenta d : p.getLstDetalleVentas()) {
					ingresos += d.getPlato().getCostoVenta() * d.getCantidad();
					costos += d.getPlato().getCostoProduccion() * d.getCantidad();
				}
			}
		}

		double sueldos = 0.0;
		for (Empleado e : unidad.getLstEmpleados()) {
			sueldos += e.liquidarHaberes();
		}

		return ingresos - costos - sueldos - unidad.calcularCanon();
	}

	// CASO DE USO 22, RESPONSABLE: Gian Franco De Naro

	public double calcularRentabilidadNeta(String codigo, LocalDate fechaDesde, LocalDate fechaHasta) {

		UnidadDeVenta unidad = traerUnidad(codigo);

		double ingresos = 0.0;
		double costos = 0.0;

		for (Pedido p : lstPedidos) {

			if (p.getUnidadDeVenta().getCodigo().equalsIgnoreCase(codigo) &&
					!p.getFecha().isBefore(fechaDesde) && !p.getFecha().isAfter(fechaHasta)) {

				for (DetalleVenta d : p.getLstDetalleVentas()) {
					ingresos += d.getPlato().getCostoVenta() * d.getCantidad();
					costos += d.getPlato().getCostoProduccion() * d.getCantidad();
				}
			}
		}

		double sueldos = 0.0;
		for (Empleado e : unidad.getLstEmpleados()) {
			sueldos += e.liquidarHaberes();
		}

		return ingresos - costos - sueldos - unidad.calcularCanon();
	}

	// CASO DE USO 23, RESPONSABLE: Nicolas Cerciosimo

	public List<UnidadDeVenta> traerRankingUnidades(String nombreFestival) {

		Festival festival = traerFestival(nombreFestival);

		List<ReporteVenta> reporte = traerReporteRecaudacion(festival.getNombre());

		for (int i = 0; i < reporte.size() - 1; i++) {

			for (int j = 0; j < reporte.size() - 1 - i; j++) {

				if (reporte.get(j).getRecaudacion() < reporte.get(j + 1).getRecaudacion()) {
					ReporteVenta aux = reporte.get(j);
					reporte.set(j, reporte.get(j + 1));
					reporte.set(j + 1, aux);
				}
			}
		}

		List<UnidadDeVenta> ranking = new ArrayList<UnidadDeVenta>();

		for (ReporteVenta r : reporte) {
			ranking.add(r.getUnidad());
		}

		return ranking;
	}

	// CASO DE USO 24, RESPONSABLE: Leonardo Haron

	public Plato traerPlatoEstrella(String codigo, String nombreFestival) {
		Plato platoEstrella = null;
		int maxCantidad = 0;

		int i = 0;
		while (i < lstPlatos.size()) {
			Plato plato = lstPlatos.get(i);
			int cantidadTotal = 0;

			int j = 0;
			while (j < lstPedidos.size()) {
				Pedido pedido = lstPedidos.get(j);
				if (pedido.getFestival().getNombre().equalsIgnoreCase(nombreFestival)
						&& pedido.getUnidadDeVenta().getCodigo().equalsIgnoreCase(codigo)) {

					int k = 0;
					while (k < pedido.getLstDetalleVentas().size()) {
						DetalleVenta detalle = pedido.getLstDetalleVentas().get(k);
						if (detalle.getPlato().getIdPlato() == plato.getIdPlato()) {
							cantidadTotal += detalle.getCantidad();
						}
						k++;
					}
				}
				j++;
			}

			if (cantidadTotal > maxCantidad) {
				maxCantidad = cantidadTotal;
				platoEstrella = plato;
			}
			i++;
		}

		return platoEstrella;
	}

	// CASO DE USO 25, RESPONSABLE: Maximo Magrassi

	public List<Empleado> traerPersonalFestival(String nombreFestival) {
		List<Empleado> personalFestival = new ArrayList<Empleado>();

		int i = 0;
		while (i < lstPedidos.size()) {
			Pedido p = lstPedidos.get(i);
			if (p.getFestival().getNombre().equalsIgnoreCase(nombreFestival)) {
				UnidadDeVenta unidad = p.getUnidadDeVenta();

				int j = 0;
				List<Empleado> empleadosDeUnidad = unidad.getLstEmpleados();
				while (j < empleadosDeUnidad.size()) {
					Empleado e = empleadosDeUnidad.get(j);
					if (!personalFestival.contains(e)) {
						personalFestival.add(e);
					}
					j++;
				}
			}
			i++;
		}

		return personalFestival;
	}

	// CASO DE USO 26, RESPONSABLE: Gian Franco De Naro

	public List<ReporteMayoresCanon> traerMayoresCanon(String nombreFestival) {

		List<ReporteMayoresCanon> reporte = new ArrayList<ReporteMayoresCanon>();

		// Armar lista de unidades que participaron en el festival
		for (Pedido p : lstPedidos) {

			if (p.getFestival().getNombre().equalsIgnoreCase(nombreFestival)) {

				UnidadDeVenta u = p.getUnidadDeVenta();
				boolean yaEsta = false;

				int i = 0;
				while (i < reporte.size() && !yaEsta) {
					if (reporte.get(i).getCodigo().equalsIgnoreCase(u.getCodigo())) {
						yaEsta = true;
					}
					i++;
				}

				if (!yaEsta) {
					String tipo = (u instanceof FoodTruck) ? "FoodTruck" : "PuestoDesarmable";
					reporte.add(
							new ReporteMayoresCanon(u.getNombreComercial(), u.getCodigo(), tipo, u.calcularCanon()));
				}
			}
		}

		// Ordenar de mayor a menor por canon (burbuja)
		for (int i = 0; i < reporte.size() - 1; i++) {
			for (int j = 0; j < reporte.size() - 1 - i; j++) {
				if (reporte.get(j).getCanon() < reporte.get(j + 1).getCanon()) {
					ReporteMayoresCanon aux = reporte.get(j);
					reporte.set(j, reporte.get(j + 1));
					reporte.set(j + 1, aux);
				}
			}
		}

		// Retornar solo las 3 primeras
		List<ReporteMayoresCanon> top3 = new ArrayList<ReporteMayoresCanon>();
		int limite = Math.min(3, reporte.size());
		for (int i = 0; i < limite; i++) {
			top3.add(reporte.get(i));
		}

		return top3;
	}

	// CASO DE USO 27, RESPONSABLE: Nicolas Cerciosimo

	public List<Empleado> traerPersonalPorFechaDeNacimiento(LocalDate fechaDesde, LocalDate fechaHasta) {

		List<Empleado> empleados = new ArrayList<Empleado>();

		for (Empleado e : lstEmpleados) {

			if (!e.getFechaNacimiento().isBefore(fechaDesde) && !e.getFechaNacimiento().isAfter(fechaHasta)) {
				empleados.add(e);
			}
		}

		return empleados;
	}

	// CASO DE USO 35, RESPONSABLE: Gian Franco De Naro

	public Plato traerPlato(String nombre) {

		int i = 0;
		Plato encontrado = null;

		while (i < lstPlatos.size() && encontrado == null) {

			Plato p = lstPlatos.get(i);

			if (p.getNombre().equalsIgnoreCase(nombre)) {
				encontrado = p;
			}

			i++;
		}
		return encontrado;
	}

}
