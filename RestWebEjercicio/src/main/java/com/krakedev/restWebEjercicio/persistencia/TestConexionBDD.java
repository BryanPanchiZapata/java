package com.krakedev.restWebEjercicio.persistencia;

import java.sql.Connection;

import com.krakedev.restWebEjercicio.excepciones.KrakeExcepcion;
import com.krakedev.restWebEjercicio.utils.ConexionBDD;

public class TestConexionBDD {

	public void probarConexion() throws KrakeExcepcion {

		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			if (con != null) {
				System.out.println("Conexion exitosa");
			} else {
				System.out.println("Error al obtener conexion");
			}
		} catch (KrakeExcepcion e) {
			e.printStackTrace();
			throw new KrakeExcepcion("Error al conectarse. Detalle" + e.getMessage());
		}

	}
}
