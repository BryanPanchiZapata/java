package com.krakedev.concesionaria.servicios;

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

import com.krakedev.concesionaria.entidades.Empresa;
import com.krakedev.concesionaria.excepciones.KrakeException;
import com.krakedev.conecesionaria.persistencia.HistorialBDD;

@Path("funciones")
public class ServiciosCategoria {

	@Path("probarInsertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Empresa empresa) {
		HistorialBDD his = new HistorialBDD();
		try {
			his.insertar(empresa);
			return Response.ok("Empresa Agregada").build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("probarActualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(Empresa empresa) {
		HistorialBDD his = new HistorialBDD();
		try {
			his.actualizar(empresa);
			if (empresa == null) {
				return Response.status(Response.Status.NOT_FOUND).entity("id incorrecto: " + empresa).build();
			}
			return Response.ok("Registro actualizado").build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("probarBuscar/{paramId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response probarBuscar(@PathParam("paramId") String id) {
		HistorialBDD his = new HistorialBDD();
		Empresa empresas = null;
		try {
			empresas = his.buscarPorId(id);
			if (empresas == null) {
				return Response.status(Response.Status.NOT_FOUND).entity("id incorrecto: " + id).build();
			}
			return Response.ok(empresas).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("buscarTodos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarTodos() {
		HistorialBDD his = new HistorialBDD();
		ArrayList<Empresa> empresas = null;

		try {
			empresas = his.buscarTodos();
			return Response.ok(empresas).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}
