package com.krakedev.concesionaria.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Empresa {
	private String id;
	private String nombre;
	private Date fecha_creacion;
	private String telefono;
	private BigDecimal precio;

	public Empresa(String id, String nombre, Date fecha_creacion, String telefono, BigDecimal precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
		this.telefono = telefono;
		this.precio = precio;
	}

	public Empresa() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", fecha_creacion=" + fecha_creacion + ", telefono="
				+ telefono + ", precio=" + precio + "]";
	}

}
