package com.krakedev.restWebEjercicio.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.krakedev.restWebEjercicio.excepciones.KrakeExcepcion;

public class ConexionBDD {
	public static Connection obtenerConexion() throws KrakeExcepcion{
		Context ctx = null;
		DataSource ds = null;
		Connection con = null;
		try {
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/RestBDD");
			con = ds.getConnection();

		} catch (NamingException | SQLException e) {
			e.printStackTrace();
			throw new KrakeExcepcion("Error al obtener Conexion. Deatlle" + e.getMessage());
		}

		return con;
	}
}
