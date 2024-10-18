package com.krakedev.evaluacion.persistencia;

import java.sql.Connection;
import java.sql.SQLException;

import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class TestConexionBDD {

	public void probarConexion() throws KrakeException {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			if (con != null) {
				System.out.println("Conexión exitosa");
			} else {
				System.out.println("Error al obtener conexiónsdsds");
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error al cerrar la conexión: " + e.getMessage());
			}
		}
	}
}
