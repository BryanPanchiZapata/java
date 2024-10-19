package com.krakedev.juegos.servicios;

import java.sql.Connection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.juegos.excpciones.KrakeException;
import com.krakedev.juegos.utils.ConexionBDD;

@Path("bases")
public class ServiciosConexion {
	@Path("probarConexion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response probarConn() {
		try {
			Connection con = ConexionBDD.obtenerConexion();
			System.out.println("Conexión Exitosa " + con);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return Response.serverError().build();
		}
	}

	@Path("mensaje")
	@GET
	public String mensaje() {
		return "Hola postman";
	}
}
