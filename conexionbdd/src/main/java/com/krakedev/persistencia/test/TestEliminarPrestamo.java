package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Prestamo;
import com.krakedev.persistencia.servicios.AdminPrestamo;

public class TestEliminarPrestamo {

	public static void main(String[] args) {
		Prestamo p = new Prestamo();
		try {
			p.setId_prestamo(100);
			AdminPrestamo.eliminarPrestamo(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}

	}

}
