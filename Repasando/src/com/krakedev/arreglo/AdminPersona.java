package com.krakedev.arreglo;

import java.util.ArrayList;

public class AdminPersona {
	private ArrayList<Persona> personas;

	public AdminPersona() {
		personas = new ArrayList<>();
	}

	public void agregar(Persona persona) {
		personas.add(persona);
	}

	public void imprimirPersona() {
		for (int i = 0; i < personas.size(); i++) {
			Persona elementoPersona = personas.get(i);
			System.out.println(elementoPersona.getNombre() + " " + elementoPersona.getApellido() + " "
					+ elementoPersona.getEstatura());
		}

	}

	public Persona buscarPersona(String nombre) {
		Persona personaEncontrada = null;
		Persona elementoEncontrado = null;
		for (int i = 0; i < personas.size(); i++) {
			elementoEncontrado = personas.get(i);
			if (nombre.equals(elementoEncontrado.getNombre())) {
				personaEncontrada = elementoEncontrado;
			}
		}
		return personaEncontrada;
	}

	public ArrayList<Persona> mayorEstatura(double estatura) {
		ArrayList<Persona> mayor = new ArrayList<>();
		Persona elementoEncontrado = null;
		for (int i = 0; i < personas.size(); i++) {
			elementoEncontrado = personas.get(i);
			if(elementoEncontrado.getEstatura()> estatura) {
				mayor.add(elementoEncontrado);
			}
		}
		return mayor;
	}

}
