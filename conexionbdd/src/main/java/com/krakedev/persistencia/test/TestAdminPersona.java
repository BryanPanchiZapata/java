package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("176543211", "Julio", "Jaramillo", ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2002/05/13");
			Date hora = Convertidor.convertirHora("13:30:98");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(hora);
			p.setCantidadAhorrada(new BigDecimal(5008.87));
			p.setNumeroHijos(8);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+ e.getMessage());
		}

	}

}
