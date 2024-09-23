package com.krakedev;

public class Calculadora {

	// Método sumar
	public int sumar(int valor1, int valor2) {
		int resultado; // Declaro la variable resultado de tipo entero
		resultado = valor1 + valor2;
		return resultado;
	}

	// Método restar
	public double restar(int valor1, int valor2) {
		double resultado; // Declaro una variable resultado de tipo decimal
		resultado = valor1 - valor2;
		return resultado;
	}

	// Método multiplicar
	public double multiplicar(double valor1, double valor2) {
		double resultadoMultiplicar; // Declaro una variable resultadoMultiplicar de tipo double
		resultadoMultiplicar = valor1 * valor2;
		return resultadoMultiplicar;
	}

	// Método dividir
	public double dividir(double dividendo, double divisor) {
		double cocienteDivision; // Declaro una variable cocienteDivision de tipo double
		cocienteDivision = dividendo / divisor;
		return cocienteDivision;
	}

	// Método promediar
	public double promediar(double valor1, double valor2, double valor3) {
		double resultadoPromedio; // Declaro una variable resultadoPromedio de tipo double
		resultadoPromedio = (valor1 + valor2 + valor3) / 3;
		return resultadoPromedio;
	}
	
	// Método mostrarResultado
	public void mostrarResultado () {
		System.out.println("Ahorita no joven, salí al almuerzo. Regreso en 15 minutos :)");
	}
	
	

}
