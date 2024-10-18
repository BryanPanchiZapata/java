package com.krakedev.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("pokemon")
public class Pokemon {
	@Path("saludar")
	@GET
	public String saludarPokemon() {
		return "Hola Pokemon en Rest Web Service";
	}
}
