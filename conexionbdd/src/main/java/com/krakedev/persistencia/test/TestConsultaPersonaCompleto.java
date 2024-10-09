package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPersonaCompleto {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorNombreR("c");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
