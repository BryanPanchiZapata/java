package com.pokemons;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora(); // instaciar el objeto Calculadora y referencio en la variable calc
		int resultadoSumar;
		int resultadoResta;
		double resultadoPromedio;

		// llamo al metodo sumar y lo guardo en la variable resultadoSumar
		resultadoSumar = calc.sumar(3, 10);

		// Llamo al metodo restar y lo guardo en la varible resultadoResta
		resultadoResta = calc.restar(10, 7);

		// Llamo al método promedio y lo guardo en la variable resultadoPromedio
		resultadoPromedio = calc.promedio(10, 8, 9);

		// imprimo el resultado en consola
		System.out.println("Resultado Suma: " + resultadoSumar);
		System.out.println("Resultado Resta: " + resultadoResta);
		System.out.println("Resultado Promedio: " + resultadoPromedio);
		// Método sin retorno y sin parametros
		calc.mensaje();
		// Método sin retorno y CON parametros
		calc.saludar("Marcos", "Cajas");
	}

}
