package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.juegos.entidades.Personas;
import com.krakedev.juegos.excpciones.KrakeException;
import com.krakedev.juegos.persistencia.HistorialBDD;

@Path("funciones")
public class ServiciosPersonas {
	@Path("insertarPersona")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertarPersona(Personas persona) {
		HistorialBDD his = new HistorialBDD();
		try {
			his.insertarPersonas(persona);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("actualizarPersona")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizarPersona(Personas persona) {
		HistorialBDD his = new HistorialBDD();
		if (persona.getCedula() == null) {
			return Response.status(Response.Status.BAD_REQUEST).entity("La cédula proporcionada es inválida").build();
		}
		try {
			his.actualizarPersona(persona);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("buscarPorCedula/{paramCedula}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorCedula(@PathParam("paramCedula") String cedula) {
		HistorialBDD his = new HistorialBDD();
		Personas persona = null;

		try {
			persona = his.buscarPorCedula(cedula);
			if (persona == null) {
				return Response.status(Response.Status.NOT_FOUND).entity("Cedula no encontrada " + cedula).build();
			}
			return Response.ok(persona).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("buscarTodos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarTodos() {
		ArrayList<Personas> persona = null;
		HistorialBDD his = new HistorialBDD();
		try {
			persona = his.buscarPersonas();
			return Response.ok(persona).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}
