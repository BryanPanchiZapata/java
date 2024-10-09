package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaCedula {

	public static void main(String[] args) {
		try {
			Persona cedula = AdminPersonas.buscarPorClave("1726789816");
			System.out.println(cedula);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
