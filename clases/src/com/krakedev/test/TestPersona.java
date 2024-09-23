package com.krakedev.test;

import com.krakedev.Personas;

public class TestPersona {

	public static void main(String[] args) {
		Personas p; // 1.Declaro una variable llamada p de tipo persona
		Personas p2 = new Personas(); // Creo otro objeto p2
		p = new Personas(); // Instancio el objeto personas, y lo refenrencie en la variable p, que se creo
		// anteriormente
		Personas p3=new Personas("Pablo");	
		Personas p4 = new Personas("Carla", 27, 1.56);
		
		//Pobando los construtores
		System.out.println("Nombre: " + p4.getNombre());
		System.out.println("Edad: " + p4.getEdad());
		System.out.println("Estatura: " + p4.getEstatura());
		
		
		// 3. Get recuperar los valores
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());

		// 4. Setter modificar valores
		p.setNombre("Marcos");
		p.setEdad(29);
		p.setEstatura(1.90);

		System.out.println("------------------- Objeto p");

		// 5. Get recuperar valores
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());

		// Setter modificar valores
		p2.setNombre("Camila");
		p2.setEdad(23);
		p2.setEstatura(1.60);

		System.out.println("------------------- Objeto p2");

		// Getter recuperar valores
		System.out.println("Nombre: " + p2.getNombre());
		System.out.println("Edad: " + p2.getEdad());
		System.out.println("Estatura: " + p2.getEstatura());

		System.out.println("*********** Se imprime los 2 objetos creados");

		// Imprimir abmos objetos - Getter recuperar valores
		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());
	}

}
