package com.pokemons;

public class Calculadora {
	public int sumar(int a, int b) {
		int resultado;
		resultado = a + b;
		return resultado;
	}

	public int restar(int valor1, int valor2) {
		int resultadoResta; // Declaro una variavle de tipo int
		resultadoResta = valor1 - valor2;
		return resultadoResta;
	}

	public double promedio(double valor1, double valor2, double valor3) {
		double resultadoPromedio;
		resultadoPromedio = (valor1 + valor2 + valor3) / 3;
		return resultadoPromedio;
	}

	// Método sin retorno
	public void mensaje() {
		System.out.println("Hola, este es un metodo sin retorno");
	}

	// Más ejemplos de método sin retorno

	public void saludar(String nombre, String apellido) {
		System.out.println("Hola Sr/Stra. " + nombre + " " + apellido);
	}
}
