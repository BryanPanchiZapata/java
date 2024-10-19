package com.krakedev.juegos.persistencia;

import java.sql.Connection;

import com.krakedev.juegos.excpciones.KrakeException;
import com.krakedev.juegos.utils.ConexionBDD;

public class TestConexionBDD {
	public void probarConexion() {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			if (con != null) {
				System.out.println("Conexion exitosa");
			} else {
				System.out.println("Error al obtener conexión");
			}
		} catch (KrakeException e) {
			e.printStackTrace();
		}
	}
}
