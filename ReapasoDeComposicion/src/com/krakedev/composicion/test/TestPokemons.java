package com.krakedev.composicion.test;

import com.krakedev.composicion.Movimiento;
import com.krakedev.composicion.Pokemon;

public class TestPokemons {

	public static void main(String[] args) {
		Pokemon pok = new Pokemon(); // Instanciar un objeto de la clase Pokemon
		
		//setter
		pok.setNombre("Pikachu");
		pok.setTipo("Eléctrico");
		
		//Intanciar el objeto de tipo Movimiento
		Movimiento mov = new Movimiento();
		//Settero los valores de movimiento
		mov.setNombre("Fuerza");
		mov.setTipoMovimiento("Relampago");
		pok.setMovimiento(mov);

		// Getter recuperar valores
		String nombre = pok.getNombre();
		Movimiento movimiento = pok.getMovimiento();

		// Imprimir los valores
		System.out.println(nombre);
		// movimiento esta null y trato de invocar a un método con esta variable
		System.out.println(movimiento.getNombre());
		// null.tratodemavarunmetodo()

	}

}
