package com.krakedev.juegos.entidades;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class VideoJuegos {
	private String id;
	private String cedula_persona;
	private String nombre;
	private BigDecimal precio;
	private Timestamp fecha_compra;

	public VideoJuegos(String id, String cedula_persona, String nombre, BigDecimal precio, Timestamp fecha_compra) {
		super();
		this.id = id;
		this.cedula_persona = cedula_persona;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha_compra = fecha_compra;
	}

	public VideoJuegos() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCedula_persona() {
		return cedula_persona;
	}

	public void setCedula_persona(String cedula_persona) {
		this.cedula_persona = cedula_persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Timestamp getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Timestamp fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	@Override
	public String toString() {
		return "VideoJuegos [id=" + id + ", cedula_persona=" + cedula_persona + ", nombre=" + nombre + ", precio="
				+ precio + ", fecha_compra=" + fecha_compra + "]";
	}

}
