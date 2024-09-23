package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora(); // instancio el objeto calculadora y referencio en la variable calc
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromedio;

		// Llamo al metodo sumar y lo guardo en la variable resultadoSuma
		resultadoSuma = calc.sumar(9, 6);

		// Llamo al metodo restar y lo guardo en la variable resultadoResta
		resultadoResta = calc.restar(10, 7);

		// Llamo al método multiplicar y lo guardo en la variable resultadoMultiplicar
		resultadoMultiplicar = calc.multiplicar(10, 5);

		// Llamo al método dividir y lo guardo en la variable resultadoDividir
		resultadoDividir = calc.dividir(10, 2);

		// Llamo al método promedio y lo guardo en la variable resultadoPromedio
		resultadoPromedio = calc.promediar(10, 8, 9);

		// imprimo el resultado en consola
		System.out.println("Resultado Suma: " + resultadoSuma);
		System.out.println("Resultado Resta: " + resultadoResta);
		System.out.println("Resultado Multiplicación: " + resultadoMultiplicar);
		System.out.println("Resultado División: " + resultadoDividir);
		System.out.println("Resultado Promedio: " + resultadoPromedio);

		// Invoco al método mostrarResultado
		calc.mostrarResultado();

	}

}
