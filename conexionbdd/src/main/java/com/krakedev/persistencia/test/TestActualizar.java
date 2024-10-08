package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("C", "Casado");
		Persona p = new Persona("176543210", "Guarura", "Vigevani", ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2024/09/23");
			Date hora = Convertidor.convertirHora("15:50:08");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(hora);
			p.setCantidadAhorrada(new BigDecimal(100));
			p.setEstatura(1.90);
			p.setNumeroHijos(2);
			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}

	}

}
