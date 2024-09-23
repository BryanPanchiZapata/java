package com.pokemons;

public class TestPokemon {

	public static void main(String[] args) {
		Pokemon p; // creo una variable p de tipo pokemon que es la clase que se creo
		Pokemon p2 = new Pokemon("Chikorita", "Planta", 788); // creo otro objeto
		p = new Pokemon("Buizel"); // Instancio al objeto pokemon,y lo referencio con la variable creada p

		//Pobando los constructores
		System.out.println("nombre: " + p2.getNombre());
		System.out.println("tipo: " + p2.getTipo());
		System.out.println("poder: " + p2.getPoder());
		
		
		// Getter recuperar los valores
		System.out.println("nombre: " + p.getNombre());
		System.out.println("tipo: " + p.getTipo());
		System.out.println("poder: " + p.getPoder());

		System.out.println("------------------");
		// Setter modificar valores
		p.setNombre("Pikachu");
		p.setTipo("Electrico");
		p.setPoder(900);

		// Getter recuperar los valores
		System.out.println("nombre: " + p.getNombre());
		System.out.println("tipo: " + p.getTipo());
		System.out.println("poder: " + p.getPoder());

		// Setter Modificar valores del objeto p2
		p2.setNombre("Blastoide");
		p2.setTipo("Roca");
		p2.setPoder(300.9);

		System.out.println("--------------- objeto p2");
		// Getter recuperar los valores
		System.out.println("nombre: " + p2.getNombre());
		System.out.println("tipo: " + p2.getTipo());
		System.out.println("poder: " + p2.getPoder());

		System.out.println("------------------");

		// Getter Acceder a ambos objetos e imprimirlos
		System.out.println("p.nombre " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());
	}

}
