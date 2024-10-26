package com.krakedev.concesionaria.entidades;

import java.math.BigDecimal;

public class Auto {
	private int id;
	private String modelo;
	private BigDecimal precio;
	private Persona persona_id;

	public Auto(int id, String modelo, BigDecimal precio, Persona persona_id) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.precio = precio;
		this.persona_id = persona_id;
	}

	public Auto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Persona getPersona_id() {
		return persona_id;
	}

	public void setPersona_id(Persona persona_id) {
		this.persona_id = persona_id;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", modelo=" + modelo + ", precio=" + precio + ", persona_id=" + persona_id + "]";
	}

}
