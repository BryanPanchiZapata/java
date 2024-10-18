package com.krakedev.herencia;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona = new Persona("172678987", "Juan");
		Persona persona1 = new Persona("1726010987", "Pablo");

		System.out.println(persona); //persona.toString
		
		System.out.println(persona1);
	}

}
