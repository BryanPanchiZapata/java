package com.pokemons.test;

import com.pokemons.Direccion;
import com.pokemons.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Direccion dir1 = new Direccion();
		Persona p2 = new Persona();


		// setter datos p1
		p1.setNombre("Guarura");

		// setter datos dir1
		dir1.setCallePrincipal("Av. Americas");
		dir1.setCalleSecundaria("Av. Siempre viva");
		dir1.setNumeroCasa("E6-123");
		
		// instanciar el objeto dir2
		Direccion dir2 = new Direccion("Av Shirys", "Av Belgica", "UY678");
		p2.setDireccion(dir2);
		p2.setNombre("Yeanky");
		p2.setApellido("Clavijo");
		
		//Instanciar una persona p3
		Persona p3 = new Persona();
		//Intanciar la direccion
		p3.setDireccion(new Direccion("90898", "fghjk", "ghjk"));

		// Imprimir valores en consola
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();

	}

}
