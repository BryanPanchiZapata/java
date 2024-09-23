package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo p1 = new Rectangulo(); // instancio el objeto de Rectangulo y lo referencio en una variable
		int areaR1;
		int areaR2;
		double perimetro; // declaro la variable de tipo double

		// Setter modificar los valores
		r1.setBase(10);
		r1.setAltura(5);

		// Setter los valores de base y altura de ol objeto r2
		r2.setBase(8);
		r2.setAltura(3);

		// Setter Modifico los valores delo atributos
		p1.setBase(4);
		p1.setAltura(2);

		// Método calcularArea()
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();

		// llamo al metodo calcularPerimetro y lo guardo en la variable perimetro
		perimetro = p1.calcularPerimetro();

		System.out.println("Área del rectángulo R1: " + areaR1);
		System.out.println("Área del rectángulo R2: " + areaR2);

		// Accedo al atributo y lo muestro en consola
		System.out.println("Perímetro del rectángulo P1: " + perimetro);

	}

}
