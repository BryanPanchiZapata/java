package com.krakedev.servicios;

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

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.persistencia.ClientesBDD;

@Path("clientes")
public class ServicioCliente {
	@Path("m1")
	@GET
	public String saludar() {
		return "Hola Mundo Rest Web Service";
	}

	@Path("mbuscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente buscar() {
		Cliente cliente = new Cliente("172676567", "Mario", 2);
		return cliente;
	}

	// Método POST
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Cliente cliente) {
		System.out.println(">>>>> " + cliente);
		ClientesBDD cli = new ClientesBDD();
		try {
			cli.insertarCliente(cliente);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	// Método PUT
	@Path("act")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(Cliente cliente) {
		System.out.println("Actualizando cliente>>>>> " + cliente);
		ClientesBDD cli = new ClientesBDD();
		try {
			cli.actualizarCliente(cliente);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}

	}

	@Path("all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerClientes() {
		ClientesBDD cli = new ClientesBDD();
		ArrayList<Cliente> clientes = null;
		try {
			clientes = cli.recuperarTodos();
			return Response.ok(clientes).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}

	}

	// Método buscar por clave primaria es decir cedula
	@Path("buscarPorCedula/{cedulaParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorCedula(@PathParam("cedulaParam") String cedula) {
		ClientesBDD cli = new ClientesBDD();
		Cliente cliente = null;
		System.out.println("INGRESA>>>>" + cedula);
		try {
			cliente = cli.buscarPorPK(cedula);
			return Response.ok(cliente).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}

	}
	
	// Método buscar por numeroHijos
	@Path("buscarPorNumeroHijos/{hijosParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorNumeroHijos(@PathParam("hijosParam") int numeroHijos) {
		ClientesBDD cli = new ClientesBDD();
		ArrayList<Cliente> clientes = null;
		System.out.println("INGRESA>>>>" + numeroHijos);
		try {
			clientes = cli.buscarNumeroHijos(numeroHijos);
			return Response.ok(clientes).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}

	}
}
