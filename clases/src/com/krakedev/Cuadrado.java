package com.krakedev;

public class Cuadrado {
	private double lado;

	// Método calcularArea
	public double calcularArea() {
		double areaCuadrado;
		areaCuadrado = lado * lado;
		return areaCuadrado;
	}

	// Método calcularPerimetro
	public double calcularPerimetro() {
		double perimetroCuadrado;
		perimetroCuadrado = lado * 4;
		return perimetroCuadrado;
	}

	// Set modificando el valor
	public void setLado(double lado) {
		this.lado = lado;
	}

}
