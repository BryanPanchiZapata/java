package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersona {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();

		admin.agregar(new Persona("Carlitos", "Sandoval", 20));
		admin.agregar(new Persona("Likas", "Urkijo", 30));
		admin.agregar(new Persona("Yanki", "EEUU", 19));

		admin.imprimir();

		Persona perEncontrado = admin.personaEncontrada("Yanki");

		if (perEncontrado != null) {
			System.out.println("Persona Encontrada: " + perEncontrado.getApellido() + " " + perEncontrado.getEdad());
		} else {
			System.out.println("Persona no encontrada");
		}
		
		ArrayList<Persona> mayorEdad =admin.buscarMayor(90);
		
		System.out.println("Personas con mayor edad: " + mayorEdad.size());

	}

}
