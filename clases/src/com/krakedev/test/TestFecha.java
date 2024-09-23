package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha date = new Fecha(13, 06, 2024);// Instanciar el objeto

		// Set para asignar valores
		date.setDia(10);
		date.setMes(12);
		date.setAnio(2024);

		// Get para recuperar los valores
		System.out.println("Año: " + date.getAnio());
		System.out.println("Mes: " + date.getMes());
		System.out.println("Día: " + date.getDia());

	}

}
