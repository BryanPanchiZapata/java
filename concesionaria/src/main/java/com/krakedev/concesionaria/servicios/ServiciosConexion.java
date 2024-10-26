package com.krakedev.concesionaria.servicios;

import java.sql.Connection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.krakedev.concesionaria.excepciones.KrakeException;
import com.krakedev.concesionaria.utils.ConexionBDD;

@Path("bases")
public class ServiciosConexion {

	@Path("probarConexion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void ProbarConn() {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			System.out.println("Conexion exitosa " + con);
		} catch (KrakeException e) {
			e.printStackTrace();
			System.out.println("Error al conectar " + e.getMessage());
		}
	}

	@Path("mensaje")
	@GET
	public String mensaje() {
		return "Hola Mundo";
	}
}
