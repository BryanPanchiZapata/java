package com.krakedev.educacion.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.educacion.entidades.Inscripciones;
import com.krakedev.educacion.excepciones.KrakeException;
import com.krakedev.educacion.persistencia.HistorialInscripcion;

@Path("inscripciones")
public class ServiciosInscripciones {
	@Path("probarInsertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Inscripciones inscripcion) {
		HistorialInscripcion his = new HistorialInscripcion();
		try {
			his.insertar(inscripcion);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("probarEliminar/{paramCedula}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Response eliminar(@PathParam("paramCedula") String cedula) {
		HistorialInscripcion his = new HistorialInscripcion();
		try {
			his.eliminar(cedula);
			return Response.ok("Inscripcion eliminada: " + cedula).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("probarActualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actulizar(Inscripciones inscripcion) {
		HistorialInscripcion his = new HistorialInscripcion();
		try {
			his.actulizar(inscripcion);
			return Response.ok("Inscripcion actualizada Correctamente").build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("probarBuscar/{paramCedula}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorId(@PathParam("paramCedula") String cedula) {
		HistorialInscripcion his = new HistorialInscripcion();
		Inscripciones inscripcion = null;
		try {
			inscripcion = his.buscarPorID(cedula);
			if (inscripcion == null) {
				return Response.status(Response.Status.NOT_FOUND).entity("Inscripcion no encontrada: " + cedula)
						.build();
			}
			return Response.ok(inscripcion).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("buscarTodos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarTodos() {
		ArrayList<Inscripciones> inscripciones = null;
		HistorialInscripcion his = new HistorialInscripcion();
		try {
			inscripciones = his.buscarTodos();
			return Response.ok(inscripciones).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

}
