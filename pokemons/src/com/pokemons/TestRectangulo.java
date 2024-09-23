package com.pokemons;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo a = new Rectangulo();// instancio el objeto Rectangulo y lo referencio en la variable a
		double resultadoArea;// Defino la variable para guardo el retorno

		// Modificar valores
		a.altura = 10;
		a.base = 5;

		// Llamo al metodo area y lo guado en una variable
		resultadoArea = a.area();
		
		//Mostrar en consola;
		System.out.println("Área del rectangulo: " + resultadoArea);
	}

}

