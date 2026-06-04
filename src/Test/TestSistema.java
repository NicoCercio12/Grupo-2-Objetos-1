package Test;

import java.time.LocalDate;


import Modelo.Sistema;

public class TestSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Sistema sistema = new Sistema();
		System.out.println("Caso de uso : 1");
		System.out.println(sistema.traerFestival("rock"));

		System.out.println("Caso de uso : 2");
		try {
			sistema.agregarFestival("rock", "2026", "Rock", LocalDate.of(2026, 02, 19), LocalDate.of(2026, 02, 24));
			System.out.println(sistema.getLstFestivales());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Caso de uso : 3");
		try {
			sistema.eliminarFestival("rock");
			System.out.println(sistema.getLstFestivales());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		/*
		System.out.println("Caso de uso : 4");

			sistema.
		
				try {
					sistema.agregarFoodTruck("Burger King", null, 0, null, null, false)
				sistema.agregarFoodTruck("Burger King","Gian", 10.0, "111", "1111", true);	
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		*/
		/*
		System.out.println("Caso de uso : ");
		
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
	}

}
