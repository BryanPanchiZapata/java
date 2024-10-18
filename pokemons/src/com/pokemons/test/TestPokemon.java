package com.pokemons.test;

import com.pokemons.Movimiento;
import com.pokemons.Pokemon;

public class TestPokemon {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		Movimiento movimiento = new Movimiento();

		// Setter Objeto Pokemon
		pokemon.setNombre("Pikachu");
		pokemon.setTipo("Electrico");
		pokemon.setPoder(987.3);
		pokemon.setMovimiento(movimiento);

		// Setter Objeto Movimiento
		movimiento.setNombreMov("Patada");

		// Getter
		Movimiento mv1 = pokemon.getMovimiento();

		System.out.println("Nombre: " + pokemon.getNombre());
		System.out.println("Tipo: " + pokemon.getTipo());
		System.out.println("Puntos Poder: " + pokemon.getPoder());
		System.out.println("Nombre movimiento: " + mv1.getNombreMov());
		System.out.println("Nombre movimiento: " + mv1.getPuntos());
		

	}

}
