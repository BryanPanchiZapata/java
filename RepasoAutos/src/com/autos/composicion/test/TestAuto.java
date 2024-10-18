package com.autos.composicion.test;

import com.autos.composicion.Auto;
import com.autos.composicion.Persona;

public class TestAuto {

	public static void main(String[] args) {
		Persona p1 = new Persona("Mario", "Balotteli", 20000);
		Persona p2 = new Persona("Carlitos", "Vigevanni", 10000);
		Persona p3 = new Persona("Guarura", "Veci", 34000);

		// setter y crear la instancia de Auto
		p1.setAuto(new Auto("El bandido", "Audi", "s3", 50000));
		p2.setAuto(new Auto("loco", "Mercedez", "C5", 90000));
		// Setter valores de p3

		// Mostrar valores en consola

		System.out.println("-------------Auto1");
		p1.imprimir();
		System.out.println("-------------Auto2");
		p2.imprimir();
		System.out.println("-------------Auto3");
		p3.imprimir();

	}

}
