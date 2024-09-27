package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "12345", 987);
		Telefono telf2 = new Telefono("movi", "78345", 560);
		Telefono telf3 = new Telefono("movi", "09345", 174);
		Telefono telf4 = new Telefono("claro", "72345", 687);
		Telefono telf5 = new Telefono("movi", "78535", 520);
		Telefono telf6 = new Telefono("claro", "01045", 074);
		Telefono telf7 = new Telefono("movi", "00045", 104);

		AdminTelefono admin = new AdminTelefono();
		System.out.println("------OPERARA MOVI------");
		// Método contarMovi
		Telefono operadorMovi = admin.contarMovi(telf1, telf2, telf3);

		System.out.println("------OPERARA CLARO------");
		// Método contarClaro
		Telefono operadorClaro = admin.contarClaro(telf4, telf5, telf6, telf7);

		// Mostrar contarMovi
		if (operadorMovi == null) {
			System.out.println("Los otros telefonos NO son movi");
		}

		// Mostrar contarClaro
		if (operadorClaro == null) {
			System.out.println("Los otros telefonos NO son claro");
		}

	}

}
