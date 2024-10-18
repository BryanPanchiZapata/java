package com.krakedev.evaluacion.servicios;

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

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.persistencia.HistorialBDD;

@Path("funciones")
public class ServiciosCategoria {
	@Path("probarInsertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Categoria categoria) {
		HistorialBDD his = new HistorialBDD();
		try {
			his.insertar(categoria);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("m1")
	@GET
	public String mensaje() {
		return "Hola mundo";
	}

	// Método actualizar categoria
	@Path("probarActualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(Categoria categoria) {
		HistorialBDD his = new HistorialBDD();
		try {
			his.actualizar(categoria);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	// Método buscar por ID
	@Path("probarBuscar/{paramId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorId(@PathParam("paramId") String id) {
		HistorialBDD his = new HistorialBDD();
		Categoria categoria = null;
		try {
			categoria = his.buscarPorId(id);
			if (categoria == null) {
				return Response.status(Response.Status.NOT_FOUND).entity("Categoría no encontrada para el ID: " + id)
						.build();
			}
			return Response.ok(categoria).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	// Método buscar Todos GET
	@Path("probarRecuperar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response probarRecuperar() {
		ArrayList<Categoria> categoria = null;
		HistorialBDD his = new HistorialBDD();
		try {
			categoria = his.recuperarTodos();
			return Response.ok(categoria).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

}
