package Test;

import java.time.LocalDate;

import Modelo.*;

public class TestSistema {

        public static void main(String[] args) {

                Sistema sis = new Sistema();

                try {

                        // =====================================================
                        // 1) FESTIVALES
                        // =====================================================

                        System.out.println("\n1) Agregar Festivales");

                        sis.agregarFestival(
                                        "Epicentro Verano",
                                        "Verano",
                                        "Gastronomia",
                                        "La Rural",
                                        LocalDate.of(2026, 1, 1),
                                        LocalDate.of(2026, 1, 31));

                        sis.agregarFestival(
                                        "Epicentro Invierno",
                                        "Invierno",
                                        "Fusion",
                                        "Costa Salguero",
                                        LocalDate.of(2026, 7, 1),
                                        LocalDate.of(2026, 7, 31));

                        for (Festival f : sis.getLstFestivales()) {
                                System.out.println(f);
                        }

                        // =====================================================
                        // 2) PLATOS
                        // =====================================================

                        System.out.println("\n2) Agregar Platos");

                        sis.agregarPlato("Empanadas", 100, 250);
                        sis.agregarPlato("Hamburguesa", 200, 500);
                        sis.agregarPlato("Pizza", 150, 400);

                        for (Plato p : sis.getLstPlatos()) {
                                System.out.println(p);
                        }

                        // =====================================================
                        // 3) EMPLEADOS
                        // =====================================================

                        System.out.println("\n3) Agregar Empleados");

                        sis.agregarCocinero(
                                        "Juan",
                                        "Perez",
                                        "11111111",
                                        LocalDate.of(1990, 5, 10),
                                        LocalDate.of(2020, 1, 1),
                                        Constantes.SUELDO_BASE,
                                        "Italiana",
                                        5000);

                        sis.agregarCocinero(
                                        "Maria",
                                        "Lopez",
                                        "22222222",
                                        LocalDate.of(1985, 3, 20),
                                        LocalDate.of(2019, 6, 1),
                                        Constantes.SUELDO_BASE,
                                        "Japonesa",
                                        6000);

                        sis.agregarCajero(
                                        "Carlos",
                                        "Gomez",
                                        "33333333",
                                        LocalDate.of(1995, 8, 15),
                                        LocalDate.of(2022, 3, 1),
                                        Constantes.SUELDO_BASE,
                                        "Noche");

                        for (Empleado e : sis.getLstEmpleados()) {
                                System.out.println(e);
                        }

                        // =====================================================
                        // 4) UNIDADES
                        // =====================================================

                        System.out.println("\n4) Agregar Unidades");

                        sis.agregarFoodTruck(
                                        "El Truck",
                                        sis.traerEmpleado("11111111"),
                                        20,
                                        "FT00000001",
                                        "AB123CD",
                                        true);

                        sis.agregarFoodTruck(
                                        "La Rueda",
                                        sis.traerEmpleado("22222222"),
                                        15,
                                        "FT00000002",
                                        "XY456ZW",
                                        false);

                        sis.agregarPuestoDesarmable(
                                        "El Puesto",
                                        sis.traerEmpleado("33333333"),
                                        30,
                                        "PD00000001",
                                        3,
                                        60);

                        for (UnidadDeVenta u : sis.getLstUnidadDeVenta()) {
                                System.out.println(u);
                        }

                        // =====================================================
                        // 5) ASOCIAR UNIDADES AL FESTIVAL
                        // =====================================================

                        System.out.println("\n5) Asociar unidades al festival");

                        sis.traerFestival("Epicentro Verano")
                                        .agregarUnidadAlFestival(
                                                        sis.traerUnidad("FT00000001"));

                        sis.traerFestival("Epicentro Verano")
                                        .agregarUnidadAlFestival(
                                                        sis.traerUnidad("FT00000002"));

                        sis.traerFestival("Epicentro Verano")
                                        .agregarUnidadAlFestival(
                                                        sis.traerUnidad("PD00000001"));

                        for (UnidadDeVenta u : sis.traerFestival("Epicentro Verano").getLstUnidadDeVenta()) {

                                System.out.println(u);
                        }

                        // =====================================================
                        // 6) PLATOS A UNIDADES
                        // =====================================================

                        System.out.println("\n6) Agregar platos a unidades");

                        sis.traerUnidad("FT00000001")
                                        .agregarPlato(
                                                        sis.traerPlato("Empanadas"));

                        sis.traerUnidad("FT00000001")
                                        .agregarPlato(
                                                        sis.traerPlato("Hamburguesa"));

                        sis.traerUnidad("FT00000002")
                                        .agregarPlato(
                                                        sis.traerPlato("Pizza"));

                        sis.traerUnidad("PD00000001")
                                        .agregarPlato(
                                                        sis.traerPlato("Empanadas"));

                        // =====================================================
                        // 7) EMPLEADOS A UNIDADES
                        // =====================================================

                        System.out.println("\n7) Agregar empleados a unidades");

                        sis.traerUnidad("FT00000001")
                                        .agregarEmpleado(
                                                        sis.traerEmpleado("11111111"));

                        sis.traerUnidad("FT00000002")
                                        .agregarEmpleado(
                                                        sis.traerEmpleado("22222222"));

                        sis.traerUnidad("PD00000001")
                                        .agregarEmpleado(
                                                        sis.traerEmpleado("33333333"));

                        // =====================================================
                        // 8) PEDIDOS
                        // =====================================================

                        System.out.println("\n8) Agregar pedidos");

                        sis.agregarPedido(
                                        LocalDate.of(2026, 1, 10),
                                        "Epicentro Verano",
                                        "FT00000001");

                        sis.agregarPedido(
                                        LocalDate.of(2026, 1, 15),
                                        "Epicentro Verano",
                                        "FT00000002");

                        sis.agregarPedido(
                                        LocalDate.of(2026, 1, 20),
                                        "Epicentro Verano",
                                        "PD00000001");

                        for (Pedido p : sis.getLstPedidos()) {
                                System.out.println(p);
                        }

                        // =====================================================
                        // 9) DETALLES DE VENTA
                        // =====================================================

                        System.out.println("\n9) Agregar detalles");

                        sis.getLstPedidos().get(0)
                                        .agregarDetalleVenta(
                                                        sis.traerPlato("Empanadas"),
                                                        10);

                        sis.getLstPedidos().get(0)
                                        .agregarDetalleVenta(
                                                        sis.traerPlato("Hamburguesa"),
                                                        5);

                        sis.getLstPedidos().get(1)
                                        .agregarDetalleVenta(
                                                        sis.traerPlato("Pizza"),
                                                        8);

                        sis.getLstPedidos().get(2)
                                        .agregarDetalleVenta(
                                                        sis.traerPlato("Empanadas"),
                                                        3);

                        // =====================================================
                        // 10 AL 18
                        // =====================================================

                        System.out.println("\n10) Reporte Recaudacion");
                        System.out.println(
                                        sis.traerReporteRecaudacion(sis.traerFestival("Epicentro Verano")));

                        System.out.println("\n11) Ranking");
                        System.out.println(
                                        sis.traerRankingUnidades(sis.traerFestival("Epicentro Verano")));

                        System.out.println("\n12) Plato Estrella");
                        System.out.println(
                                        sis.traerPlatoEstrella(
                                                        sis.traerUnidad("FT00000001"),
                                                        sis.traerFestival("Epicentro Verano")));

                        System.out.println("\n13) Rentabilidad Neta");
                        System.out.println(
                                        sis.calcularRentabilidadNeta(
                                                        sis.traerUnidad("FT00000001")));

                        System.out.println("\n14) Rentabilidad Neta por Fechas");
                        System.out.println(
                                        sis.calcularRentabilidadNetaPorFechas(
                                                        sis.traerUnidad("FT00000001"),
                                                        LocalDate.of(2026, 1, 1),
                                                        LocalDate.of(2026, 1, 31)));

                        System.out.println("\n15) Personal Festival");
                        System.out.println(
                                        sis.traerPersonalFestival(sis.traerFestival("Epicentro Verano")));

                        System.out.println("\n16) Mayores Canon");
                        System.out.println(
                                        sis.traerMayoresCanon(sis.traerFestival("Epicentro Verano")));

                        System.out.println("\n17) Haberes");
                        for (Empleado e : sis.getLstEmpleados()) {
                                System.out.println(
                                                e.getNombre()
                                                                + " -> "
                                                                + e.liquidarHaberes());
                        }

                        System.out.println("\n18) Canon");
                        for (UnidadDeVenta u : sis.getLstUnidadDeVenta()) {

                                System.out.println(
                                                u.getNombreComercial()
                                                                + " -> "
                                                                + u.calcularCanon());
                        }

                } catch (

                Exception e) {

                        System.out.println(e.getMessage());
                }

                // =====================================================
                // PRUEBAS DE ERROR
                // =====================================================

                System.out.println("\n19) Intentar agregar festival duplicado");

                try {

                        sis.agregarFestival(
                                        "Epicentro Verano",
                                        "Verano",
                                        "Gastronomia",
                                        "La Rural",
                                        LocalDate.of(2026, 1, 1),
                                        LocalDate.of(2026, 1, 31));

                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                System.out.println("\n20) Intentar agregar unidad duplicada");

                try {

                        sis.agregarFoodTruck(
                                        "Otro Truck",
                                        sis.traerEmpleado("11111111"),
                                        10,
                                        "FT00000001",
                                        "ZZ999ZZ",
                                        false);

                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                System.out.println("\n21) Intentar agregar empleado duplicado");

                try {

                        sis.agregarCocinero(
                                        "Juan",
                                        "Perez",
                                        "11111111",
                                        LocalDate.of(1990, 5, 10),
                                        LocalDate.of(2020, 1, 1),
                                        Constantes.SUELDO_BASE,
                                        "Italiana",
                                        5000);

                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                System.out.println("\n22) Buscar festival inexistente");

                System.out.println(sis.traerFestival("Festival Fantasma"));

                System.out.println("\n23) Buscar unidad inexistente");

                System.out.println(sis.traerUnidad("XX99999999"));

                System.out.println("\n24) Buscar empleado inexistente");

                System.out.println(sis.traerEmpleado("99999999"));

                System.out.println("\n25) Buscar plato inexistente");

                System.out.println(sis.traerPlato("Milanesa"));

                System.out.println("\n26) Eliminar festival inexistente");

                try {

                        sis.eliminarFestival("Festival Fantasma");

                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                System.out.println("\n27) Eliminar unidad inexistente");

                try {

                        sis.eliminarUnidad("XX99999999");

                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                System.out.println("\n28) Eliminar empleado inexistente");

                try {

                        sis.eliminarEmpleado("99999999");

                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                System.out.println("\n29) Agregar pedido con festival inexistente");

                try {

                        sis.agregarPedido(
                                        LocalDate.now(),
                                        "Festival Fantasma",
                                        "FT00000001");

                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                System.out.println("\n30) Agregar pedido con unidad inexistente");

                try {

                        sis.agregarPedido(
                                        LocalDate.now(),
                                        "Epicentro Verano",
                                        "XX99999999");

                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                System.out.println("\n31) Buscar detalle inexistente");

                System.out.println(sis.getLstPedidos().get(0).traerDetalleVenta(sis.traerPlato("Pizza")));

                System.out.println("\n32) Eliminar Festival");

                try {
                        sis.eliminarFestival("Epicentro Invierno");
                } catch (Exception e) {

                        System.out.println(e.getMessage());
                        ;
                }

                for (Festival f : sis.getLstFestivales()) {
                        System.out.println(f);
                }

                System.out.println("\n33) Eliminar Unidad");

                try {
                        sis.eliminarUnidad("FT00000002");
                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                for (UnidadDeVenta u : sis.getLstUnidadDeVenta()) {
                        System.out.println(u);
                }

                System.out.println("\n33b) Unidades del festival despues de eliminar FT00000002");
                for (UnidadDeVenta u : sis.traerFestival("Epicentro Verano").getLstUnidadDeVenta()) {
                        System.out.println(u);
                }

                System.out.println("\n34) Eliminar Empleado");

                try {
                        sis.eliminarEmpleado("22222222");
                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                for (Empleado e : sis.getLstEmpleados()) {
                        System.out.println(e);
                }

                System.out.println("\n35) Unidad duplicada en festival");

                boolean agregado = sis.traerFestival("Epicentro Verano")
                                .agregarUnidadAlFestival(
                                                sis.traerUnidad("FT00000001"));

                System.out.println(agregado);

                System.out.println("\n36) Empleado menor de edad");

                try {

                        sis.agregarCajero(
                                        "Pedro",
                                        "Juarez",
                                        "44444444",
                                        LocalDate.now().minusYears(17),
                                        LocalDate.now(),
                                        Constantes.SUELDO_BASE,
                                        "Mañana");

                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

                System.out.println("\n37) Código inválido");

                try {

                        sis.agregarFoodTruck(
                                        "Truck Inválido",
                                        sis.traerEmpleado("11111111"),
                                        20,
                                        "ABC",
                                        "AA111AA",
                                        true);

                } catch (Exception e) {

                        System.out.println(e.getMessage());
                }

        }
}