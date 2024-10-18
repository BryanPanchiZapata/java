package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {
	// Metodo POST
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertarProducto(Producto producto) {
		System.out.println(">>>>>>" + producto);
	}

	// Método PUT
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizarProducto(Producto producto) {
		System.out.println("Actualizando>>>> " + producto);
	}

	// Método GET
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> consultarProducto() {
		ArrayList<Producto> productos = new ArrayList<>();
		Categoria cat1 = new Categoria(1, "Snaks");
		Categoria cat2 = new Categoria(2, "Limpieza");
		Producto prod1 = new Producto("100", "Doritos", cat1, 0.90, 110);
		productos.add(prod1);
		Producto prod2 = new Producto("200", "Papas", cat1, 0.70, 70);
		productos.add(prod2);
		Producto prod3 = new Producto("300", "Desinfectante", cat2, 1.50, 90);
		productos.add(prod3);
		
		return productos;
	}
	
}
