package com.krakedev.conecesionaria.persistencia;

import java.sql.Connection;

import com.krakedev.concesionaria.excepciones.KrakeException;
import com.krakedev.concesionaria.utils.ConexionBDD;

public class TestConexionBDD {
	public void ObtenerConexion() throws KrakeException{
		Connection con = null;

		try {
			con = ConexionBDD.obtenerConexion();
			if (con != null) {
				System.out.println("Conexión exitosa");
			} else {
				System.out.println("Error al obtener conexion");
			}
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
