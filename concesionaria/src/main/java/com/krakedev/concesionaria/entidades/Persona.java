package com.krakedev.concesionaria.entidades;

import java.util.Date;

public class Persona {
	private String id;
	private String nombre;
	private String apellido;
	private Date fecha_nacimiento;
	private int edad;
	private Empresa empresa_id;

	public Persona(String id, String nombre, String apellido, Date fecha_nacimiento, int edad, Empresa empresa_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.edad = edad;
		this.empresa_id = empresa_id;
	}

	public Persona() {
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Empresa getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(Empresa empresa_id) {
		this.empresa_id = empresa_id;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento="
				+ fecha_nacimiento + ", edad=" + edad + ", empresa_id=" + empresa_id + "]";
	}

}
