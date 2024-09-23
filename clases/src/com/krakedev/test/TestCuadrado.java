package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado a1 = new Cuadrado();// instancio el objeto Cuadrado y referencio la variable
		Cuadrado a2 = new Cuadrado();
		Cuadrado p1 = new Cuadrado();

		double areaC1;
		double areaC2;
		double perimetroC1;

		// Modifico los atributos 
		a1.setLado(2); 

		// Modifico los atributos 
		a2.setLado(8);

		// Modifico los atributos 
		p1.setLado(4);

		// llamo al método calcularArea
		areaC1 = a1.calcularArea();

		// llamo al método calcularArea
		areaC2 = a2.calcularArea();

		// llamo al método calcularPerimetro
		perimetroC1 = p1.calcularPerimetro();

		// Acceder a los atributos y mostrar en consola
		System.out.println("El área del cuadrado C1 es: " + areaC1);
		System.out.println("El área del cuadrado C2 es: " + areaC2);

		// Accedor a los atributos del metodo calcularPerimetro y mostrar en consola
		System.out.println("El perímetro del cuadrado perimetroC1 es: " + perimetroC1);
	}

}
