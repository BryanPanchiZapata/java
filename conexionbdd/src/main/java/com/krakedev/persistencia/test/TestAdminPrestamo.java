package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.entidades.Prestamo;
import com.krakedev.persistencia.servicios.AdminPrestamo;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPrestamo {

	public static void main(String[] args) {
		Personas p = new Personas("176543210");
		Prestamo pres = new Prestamo(100, p);

		try {
			Date fechaPres = Convertidor.convertirFecha("2002/05/13");
			Date hora = Convertidor.convertirHora("13:30:98");
			pres.setFechaPrestamo(fechaPres);
			pres.setHoraPrestamo(hora);
			pres.setGarante("Maria Palomino");
			AdminPrestamo.insertarP(pres);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
