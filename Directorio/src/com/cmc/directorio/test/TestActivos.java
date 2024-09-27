package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {

		Telefono telf = new Telefono("movi", "345678", 890);
		Contacto contact1 = new Contacto("Sebastian", "Albuja", telf, 60);

		AdminContactos ad = new AdminContactos();

		// setter modificar valor de Whatsapp;
		telf.setTieneWhatsapp(false);

		// invocar al metodo activarUsuario
		ad.activarUsuario(contact1);

		System.out.println(
				"Nombre: " + contact1.getNombre() + "\nTiene Whatsapp: " + contact1.getTelefono().isTieneWhatsapp());
		System.out.println("Activo: " + contact1.isActivo());

	}

}
