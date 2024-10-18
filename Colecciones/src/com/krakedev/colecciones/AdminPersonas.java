package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> agregarPersona;

	public AdminPersonas() {
		agregarPersona = new ArrayList<Persona>();
	}

	public void agregar(Persona persona) {
		agregarPersona.add(persona);
	}

	public void imprimir() {
		for (int i = 0; i < agregarPersona.size(); i++) {
			Persona elementoPersona = agregarPersona.get(i);
			System.out.println(elementoPersona.getNombre() + " " + elementoPersona.getApellido() + " "
					+ elementoPersona.getEdad());
		}
	}

	public Persona personaEncontrada(String nombre) {
		Persona personaEncontrada = null;
		Persona elementoPersona = null;
		for (int i = 0; i < agregarPersona.size(); i++) {
			elementoPersona = agregarPersona.get(i);
			if (nombre.equals(elementoPersona.getNombre())) {
				personaEncontrada = elementoPersona;
			}
		}
		return personaEncontrada;
	}

	public ArrayList<Persona> buscarMayor(int edad) {
		ArrayList<Persona> mayores = new ArrayList<>();
		Persona elementoEncontrado = null;
		for (int i = 0; i < agregarPersona.size(); i++) {
			elementoEncontrado = agregarPersona.get(i);
			if(elementoEncontrado.getEdad()>edad) {
				mayores.add(elementoEncontrado);
			}
		}
		return mayores;

	}
}
