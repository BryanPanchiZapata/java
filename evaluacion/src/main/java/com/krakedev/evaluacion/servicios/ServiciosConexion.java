package com.krakedev.evaluacion.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

@Path("bases")
public class ServiciosConexion {
	@Path("probarConexion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void probarConn() {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			System.out.println("Conexion exitosa" + con);
		} catch (KrakeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	@Path("m1")
	@GET
	public String saludar() {
		return "Hola Mundo Rest Web Service";
	}

}
