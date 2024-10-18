package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> cadenas;
		cadenas = new ArrayList<Persona>();

		cadenas.add(new Persona("Guarura", "Sandoval"));
		cadenas.add(new Persona("Yanki", "EEUU"));
		cadenas.add(new Persona("Carlitos", "Pan"));

		for (int i = 0; i < cadenas.size(); i++) {
			Persona elementoPersona = cadenas.get(i);
			System.out.println(elementoPersona.getNombre() + " " + elementoPersona.getApellido());
		}
	}

}
