package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class testPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Direccion d1 = new Direccion();
		Direccion d2 = new Direccion("Av. Colon", "Av. Conquistador", "E787");

		// Setter modificar valores del objeto Persona
		p1.setNombre("Mario");
		p1.setApellido("Cardenas");
		p1.setDireccion(d1);

		// Setter modificar valores del objeto Direccion
		d1.setCallePrincipal("Av siempre viva");
		d1.setCalleSecundaria("Calle Rio");
		d1.setNumero("N-454");

		// Getter recuperar los valores
		String nombre = p1.getNombre();
		Direccion direccion = p1.getDireccion();

		System.out.println("Nombre: " + nombre);
		System.out.println("Calle: " + direccion.getCallePrincipal());

		p1.imprimir();

		// Setter el nombre e invocar al meotdo imprimir
		p2.setNombre("Maria");
		p2.setDireccion(d2);
		p2.imprimir();

		// Crear un objeto de clase Persona y llamo al constructor de Direccion
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("xxxx", "xxxx", "567"));
		//llamo al método imprimir
		p3.imprimir();

	}

}
