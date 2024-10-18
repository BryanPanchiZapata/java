package com.pokemons;

public class Direccion {
	private String callePrincipal;
	private String calleSecundaria;
	private String numeroCasa;
	private int longitud;

	public Direccion(String callePrincipal, String calleSecundaria, String numeroCasa) {
		super();
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
		this.numeroCasa = numeroCasa;
	}
	
	

	public Direccion() {
		super();
	}



	public String getCallePrincipal() {
		return callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public String getCalleSecundaria() {
		return calleSecundaria;
	}

	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

}
