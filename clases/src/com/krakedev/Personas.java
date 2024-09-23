package com.krakedev;

public class Personas {
	private String nombre;
	private int edad;
	private double estatura;

	// constructor
	public Personas() {
		System.out.println("Soy un constructor");
	}

	public Personas(String nombre) {
		this.nombre = nombre;
	}

	public Personas(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	// Get obtener el valor
	public String getNombre() {
		return nombre;
	}

	// Set modificar el valor
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Get obtine
	public int getEdad() {
		return edad;
	}

	// Set modifica
	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Get Obtine
	public double getEstatura() {
		return estatura;
	}

	// Set
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
}
