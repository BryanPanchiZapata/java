package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "907400", 10);
		Telefono telf2 = new Telefono("claro", "110098", 20);
		Contacto contact1 = new Contacto("Marcos", "Canelo", telf1, 50);
		Contacto contact2 = new Contacto("Moises", "Caicedo", telf2, 90);

		AdminContactos ad = new AdminContactos();

		// Invocar método buscarMasPesado
		Contacto masPesado = ad.buscarMasPesado(contact1, contact2);

		// Getter recuperar valores
		System.out.println("Nombre: " + masPesado.getNombre());
		System.out.println("Apellido: " + masPesado.getApellido());
		System.out.println("Teléfono: " + masPesado.getTelefono().getNumero());
		System.out.println("Operadora: " + masPesado.getTelefono().getOperadora());
		System.out.println("Peso: " + masPesado.getPeso());
		
		System.out.println("--------------------------------");

		// Invocar método compararOperadoras
		boolean operadoras = ad.compararOperadoras(contact1, contact2);
		System.out.println("La operadora de: " + contact1.getNombre() + " es: " + contact1.getTelefono().getOperadora()
				+ " \n" + "La operadora de: " + contact2.getNombre() + " es: " + contact2.getTelefono().getOperadora()
				+ " \n" + "El resulatdo es: " + operadoras);

	}

}
