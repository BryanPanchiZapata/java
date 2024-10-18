package com.krakedev.arreglo;

public class Persona {
	private String nombre;
	private String apellido;
	private double estatura;

	public Persona(String nombre, String apellido, double estatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
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

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

}
