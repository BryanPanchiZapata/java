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

import com.krakedev.juegos.entidades.VideoJuegos;
import com.krakedev.juegos.excpciones.KrakeException;
import com.krakedev.juegos.persistencia.HistorialBDDV;

@Path("videojuego")
public class ServiciosVideojuegos {
	@Path("probarInsetar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertarVideojuego(VideoJuegos juegos) {
		HistorialBDDV his = new HistorialBDDV();
		try {
			his.insertarVideojuego(juegos);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("actualizarJuego")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizarJuego(VideoJuegos juego) {
		HistorialBDDV his = new HistorialBDDV();
		try {
			his.actualizarJuego(juego);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("buscarPorId/{paramId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorId(@PathParam("paramId") String idJuego) {
		HistorialBDDV his = new HistorialBDDV();
		VideoJuegos juegos = null;

		try {
			juegos = his.BuscarPorIdJuego(idJuego);
			if (juegos == null) {
				return Response.status(Response.Status.BAD_REQUEST).entity("Error al buscar el videoJuego: " + idJuego)
						.build();
			}
			return Response.ok(juegos).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("buscarTodos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarTodos() {
		ArrayList<VideoJuegos> juegos = null;
		HistorialBDDV his = new HistorialBDDV();

		try {
			juegos = his.buscarTodos();
			return Response.ok(juegos).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}
