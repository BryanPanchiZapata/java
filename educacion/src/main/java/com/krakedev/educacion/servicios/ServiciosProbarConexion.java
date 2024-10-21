package com.krakedev.educacion.servicios;

import java.sql.Connection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.krakedev.educacion.excepciones.KrakeException;
import com.krakedev.educacion.utils.ConexionBDD;

@Path("base")
public class ServiciosProbarConexion {
	@Path("verificar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void probarConn() {
		Connection con = null;

		try {
			con = ConexionBDD.obtenerConexion();
			System.out.println("Conexion exitosa" + con);
		} catch (KrakeException e) {
			e.printStackTrace();
			System.out.println("Conexion fallida " + e.getMessage());
		}
	}
	
	@Path("mensaje")
	@GET
	public String mensaje(String mensaje) {
		return "Hola Postman";
	}
}
