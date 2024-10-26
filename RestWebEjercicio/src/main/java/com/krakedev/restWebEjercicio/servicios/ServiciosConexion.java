package com.krakedev.restWebEjercicio.servicios;

import java.sql.Connection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.krakedev.restWebEjercicio.excepciones.KrakeExcepcion;
import com.krakedev.restWebEjercicio.utils.ConexionBDD;

@Path("bases")
public class ServiciosConexion {
	@Path("probarConexion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void ProbarConn() {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			System.out.println("Conexion exitisa " + con);
		} catch (KrakeExcepcion e) {
			e.printStackTrace();
		}
	}

	@Path("mensaje")
	@GET
	public String mensaje(String mensaje) {
		return "Hola postman";
	}

}
