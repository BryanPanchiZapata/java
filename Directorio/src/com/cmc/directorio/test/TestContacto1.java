package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi", "3456", 20);
		Contacto c = new Contacto("Mario", "Bros", telef, 0);

		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Telefono: " + telef.getNumero());
		System.out.println("Operadora: " + telef.getOperadora());
		System.out.println("Peso: " + c.getPeso());
	}

}
