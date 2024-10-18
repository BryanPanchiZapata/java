package com.krakedev.arreglo;

import java.util.ArrayList;

public class TestAdminPersona {

	public static void main(String[] args) {
		AdminPersona admin = new AdminPersona();

		admin.agregar(new Persona("Guarura", "Locquito", 1.80));
		admin.agregar(new Persona("Lukas", "Urkijo", 1.70));
		admin.agregar(new Persona("Carlitos", "El macho", 1.60));

		admin.imprimirPersona();

		Persona personaEncontrada = admin.buscarPersona("kuarura");

		if (personaEncontrada != null) {
			System.out.println("ENCONTRADO: " + personaEncontrada.getApellido());
		} else {
			System.out.println("Persona no encontrada");

		}

		ArrayList<Persona> mayorEstatura = admin.mayorEstatura(1.80);
		
		System.out.println("Personas con más estatura: "+mayorEstatura.size());

	}

}
