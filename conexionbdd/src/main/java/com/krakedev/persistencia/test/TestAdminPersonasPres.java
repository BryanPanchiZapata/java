package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.servicios.AdminPersonaPrestamo;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersonasPres {

	public static void main(String[] args) {

		Personas p = new Personas("176543210", "Julio", "Jaramillo");
		try {
			Date fechaNac = Convertidor.convertirFecha("2002/05/13");
			Date hora = Convertidor.convertirHora("13:30:98");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(hora);
			p.setCantidadAhorrada(new BigDecimal(5008.87));
			p.setNumeroHijos(8);
			AdminPersonaPrestamo.insertarPersona(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}

	}

}
