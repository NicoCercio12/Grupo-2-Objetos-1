package Test;

import Modelo.*;
import java.time.LocalDate;
import java.util.List;

public class TestSistema {

    public static void main(String[] args) {

        Sistema sis = new Sistema();

        try {

            System.out.println("\n 1) Agregar Festivales");
            sis.agregarFestival("Epicentro Verano", "Verano", "Gastronomia", LocalDate.of(2024, 1, 1),
                    LocalDate.of(2024, 1, 31));
            sis.agregarFestival("Epicentro Invierno", "Invierno", "Fusion", LocalDate.of(2024, 7, 1),
                    LocalDate.of(2024, 7, 31));
            for (Festival f : sis.getLstFestivales()) {
                System.out.println(f);
            }

            System.out.println("\n 2) Agregar Platos");
            sis.agregarPlato("Empanadas", 100.0, 250.0);
            sis.agregarPlato("Hamburguesa", 200.0, 500.0);
            sis.agregarPlato("Pizza", 150.0, 400.0);
            for (Plato p : sis.getLstPlatos()) {
                System.out.println(p);
            }

            System.out.println("\n 3) Agregar Empleados");
            sis.agregarCocinero("Juan", "Perez", "11111111", LocalDate.of(1990, 5, 10), LocalDate.of(2020, 1, 1),
                    100000.0, "Italiana", 5000.0);
            sis.agregarCocinero("Maria", "Lopez", "22222222", LocalDate.of(1985, 3, 20), LocalDate.of(2019, 6, 1),
                    100000.0, "Japonesa", 6000.0);
            sis.agregarCajero("Carlos", "Gomez", "33333333", LocalDate.of(1995, 8, 15), LocalDate.of(2022, 3, 1),
                    100000.0, "Noche");
            for (Empleado e : sis.getLstEmpleados()) {
                System.out.println(e);
            }

            System.out.println("\n 4) Agregar Unidades de Venta");
            sis.agregarFoodTruck("El Truck", sis.traerEmpleado("11111111"), 20.0, "FT001", "AB123CD", true);
            sis.agregarFoodTruck("La Rueda", sis.traerEmpleado("22222222"), 15.0, "FT002", "XY456ZW", false);
            sis.agregarPuestoDesarmable("El Puesto", sis.traerEmpleado("33333333"), 30.0, "PD001", 3, 60);
            for (UnidadDeVenta u : sis.getLstUnidadDeVenta()) {
                System.out.println(u);
            }

            System.out.println("\n 5) Agregar Platos a Unidades");
            sis.traerUnidad("FT001").agregarPlato(sis.traerPlato("Empanadas"));
            sis.traerUnidad("FT001").agregarPlato(sis.traerPlato("Hamburguesa"));
            sis.traerUnidad("FT002").agregarPlato(sis.traerPlato("Pizza"));
            sis.traerUnidad("PD001").agregarPlato(sis.traerPlato("Empanadas"));
            System.out.println("Platos agregados correctamente");

            System.out.println("\n 6) Agregar Empleados a Unidades");
            sis.traerUnidad("FT001").agregarEmpleado(sis.traerEmpleado("11111111"));
            sis.traerUnidad("FT002").agregarEmpleado(sis.traerEmpleado("22222222"));
            sis.traerUnidad("PD001").agregarEmpleado(sis.traerEmpleado("33333333"));
            System.out.println("Empleados agregados correctamente");

            System.out.println("\n 7) Agregar Pedidos validados");
            sis.agregarPedidoValidado(LocalDate.of(2024, 1, 10), "Epicentro Verano", "FT001");
            sis.agregarPedidoValidado(LocalDate.of(2024, 1, 15), "Epicentro Verano", "FT002");
            sis.agregarPedidoValidado(LocalDate.of(2024, 1, 20), "Epicentro Verano", "PD001");
            for (Pedido p : sis.getLstPedidos()) {
                System.out.println(p);
            }

            System.out.println("\n 8) Agregar Detalles de Venta");
            sis.getLstPedidos().get(0).agregarDetalleVenta(sis.traerPlato("Empanadas"), 10);
            sis.getLstPedidos().get(0).agregarDetalleVenta(sis.traerPlato("Hamburguesa"), 5);
            sis.getLstPedidos().get(1).agregarDetalleVenta(sis.traerPlato("Pizza"), 8);
            sis.getLstPedidos().get(2).agregarDetalleVenta(sis.traerPlato("Empanadas"), 3);
            System.out.println("Detalles agregados correctamente");

            System.out.println("\n 9) Traer Detalles de Venta del pedido 1");
            for (DetalleVenta d : sis.getLstPedidos().get(0).getLstDetalleVentas()) {
                System.out.println(d);
            }

            System.out.println("\n 10) Traer Detalle especifico - buscar Empanadas en pedido 1");
            System.out.println(sis.getLstPedidos().get(0).traerDetalleVenta("Empanadas"));

            System.out.println("\n 11) Agregar Unidad al pedido 1");
            Pedido pedidoPrueba = new Pedido(99, LocalDate.of(2024, 1, 25), sis.traerFestival("Epicentro Verano"),
                    null);
            pedidoPrueba.agregarUnidad(sis.traerUnidad("FT001"));
            System.out.println(pedidoPrueba);

            System.out.println("\n 12) Traer Pedidos por fecha");
            for (Pedido p : sis.traerPedidos(LocalDate.of(2024, 1, 10))) {
                System.out.println(p);
            }

            System.out.println("\n 13) Reporte Recaudacion Epicentro Verano");
            for (ReporteVenta r : sis.traerReporteRecaudacion("Epicentro Verano")) {
                System.out.println(r);
            }

            System.out.println("\n 14) Ranking Unidades Epicentro Verano");
            for (UnidadDeVenta u : sis.traerRankingUnidades("Epicentro Verano")) {
                System.out.println(u);
            }

            System.out.println("\n 15) Plato Estrella FT001 en Epicentro Verano");
            System.out.println(sis.traerPlatoEstrella("FT001", "Epicentro Verano"));

            System.out.println("\n 16) Rentabilidad Neta FT001 sin fechas");
            System.out.println(sis.calcularRentabilidadNeta("FT001"));

            System.out.println("\n 17) Rentabilidad Neta FT001 con fechas");
            System.out.println(
                    sis.calcularRentabilidadNeta("FT001", LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31)));

            System.out.println("\n 18) Personal por fecha de ingreso");
            for (Empleado e : sis.traerPersonalPorFecha(LocalDate.of(2019, 1, 1), LocalDate.of(2022, 12, 31))) {
                System.out.println(e);
            }

            System.out.println("\n 19) Personal por fecha de nacimiento");
            for (Empleado e : sis.traerPersonalPorFechaDeNacimiento(LocalDate.of(1980, 1, 1),
                    LocalDate.of(1995, 12, 31))) {
                System.out.println(e);
            }

            System.out.println("\n 20) Liquidar haberes");
            System.out.println("Juan: " + sis.liquidarHaberes("11111111"));
            System.out.println("Maria: " + sis.liquidarHaberes("22222222"));
            System.out.println("Carlos: " + sis.liquidarHaberes("33333333"));

            System.out.println("\n 21) Calcular Canon");
            System.out.println("FT001: " + sis.traerUnidad("FT001").calcularCanon());
            System.out.println("FT002: " + sis.traerUnidad("FT002").calcularCanon());
            System.out.println("PD001: " + sis.traerUnidad("PD001").calcularCanon());

            System.out.println("\n 22) Personal Festival Epicentro Verano");
            for (Empleado e : sis.traerPersonalFestival("Epicentro Verano")) {
                System.out.println(e);
            }

            System.out.println("\n 23) Mayores Canon Epicentro Verano");
            for (ReporteMayoresCanon r : sis.traerMayoresCanon("Epicentro Verano")) {
                System.out.println(r);
            }

            System.out.println("\n 24) Eliminar Festival Epicentro Invierno");
            sis.eliminarFestival("Epicentro Invierno");
            for (Festival f : sis.getLstFestivales()) {
                System.out.println(f);
            }

            System.out.println("\n 25) Eliminar Unidad FT002");
            sis.eliminarUnidad("FT002");
            for (UnidadDeVenta u : sis.getLstUnidadDeVenta()) {
                System.out.println(u);
            }

            System.out.println("\n 26) Eliminar Empleado dni=22222222");
            sis.eliminarEmpleado("22222222");
            for (Empleado e : sis.getLstEmpleados()) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n 27) Intentar agregar festival duplicado");
        try {
            sis.agregarFestival("Epicentro Verano", "Verano", "Gastronomia", LocalDate.of(2024, 1, 1),
                    LocalDate.of(2024, 1, 31));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n 28) Intentar agregar unidad duplicada");
        try {
            sis.agregarFoodTruck("Otro Truck", sis.traerEmpleado("11111111"), 10.0, "FT001", "ZZ999ZZ", false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n 29) Intentar agregar empleado duplicado");
        try {
            sis.agregarCocinero("Juan", "Perez", "11111111", LocalDate.of(1990, 5, 10), LocalDate.of(2020, 1, 1),
                    100000.0, "Italiana", 5000.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n 30) Intentar agregar pedido fuera de fecha del festival");
        try {
            sis.agregarPedidoValidado(LocalDate.of(2024, 3, 1), "Epicentro Verano", "FT001");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n 31) Intentar eliminar empleado inexistente");
        try {
            sis.eliminarEmpleado("99999999");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n 32) Intentar buscar detalle inexistente en pedido 1");
        System.out.println(sis.getLstPedidos().get(0).traerDetalleVenta("Milanesa"));
    }
}