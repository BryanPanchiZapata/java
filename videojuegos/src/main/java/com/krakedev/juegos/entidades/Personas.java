package com.krakedev.juegos.entidades;

public class Personas {
	private String cedula;
	private String nombre;
	private String apellido;
	private int edad;

	public Personas(String cedula, String nombre, String apellido, int edad) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Personas() {
		super();
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Personas [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

}
