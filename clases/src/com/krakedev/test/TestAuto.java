package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Ferrari", 2020, 70000); // instancio el objeto Auto y la referencio en la variable auto1
		Auto auto2 = new Auto("Mazda", 2017, 14000); // instancio el objeto Auto y la referencio en la variable auto2

		// Modifico los valores del objeto auto1
		auto1.setMarca("Audi");
		auto1.setAnio(2022);
		auto1.setPrecio(25000);

		// Set para asignar valores
		auto2.setMarca("Mercedez");
		auto2.setAnio(2023);
		auto2.setPrecio(30000);

		// Usar el Get para recuperar los valores
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());

		System.out.println("----------------------Objeto-auto2");
		// Usar get para recuperar los valores
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());

	}

}
